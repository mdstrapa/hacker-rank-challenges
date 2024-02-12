package com.marcosoft;

import java.util.ArrayList;
import java.util.List;

public class MediumJavaStack {

    List<Operation> operationStack = new ArrayList<>();

    public boolean isBalanced(String value){

        operationStack.clear();

        // first we test the length of the string.
        // if it is odd, we return false
        if(value.length() % 2 != 0) return false;

        for(char c:value.toCharArray()){
            if(c == '{' || c == '[' || c == '(') operationStack.add(new Operation(String.valueOf(c),OperationState.OPENED));
            else if(c == '}' || c == ']' || c == ')'){

                if(operationStack.stream().noneMatch(o -> o.getState().equals(OperationState.OPENED))) return false;

                for(int i = operationStack.size();i > 0;i--){

                    if(operationStack.get(i - 1).state.equals(OperationState.OPENED)) {

                        Operation lastOpenedOperation = operationStack.get(i - 1);

                        if(c == '}' && !lastOpenedOperation.getExpression().equals("{")) return false;
                        else if (c == ']' && !lastOpenedOperation.getExpression().equals("[")) return false;
                        else if (c == ')' && !lastOpenedOperation.getExpression().equals("(")) return false;

                        lastOpenedOperation.setExpression(lastOpenedOperation.getExpression() + c);
                        lastOpenedOperation.setState(OperationState.CLOSED);
                        break;
                    }
                }
            }
        }
        if(!value.isEmpty() && operationStack.isEmpty()) return false;
        return operationStack.stream().noneMatch(o -> o.getState().equals(OperationState.OPENED));
    }

    class Operation{
        String expression;
        OperationState state;

        public Operation(String expression, OperationState state) {
            this.expression = expression;
            this.state = state;
        }

        public String getExpression() {
            return expression;
        }

        public OperationState getState() {
            return state;
        }

        public void setExpression(String expression) {
            this.expression = expression;
        }

        public void setState(OperationState state) {
            this.state = state;
        }
    }

    enum OperationState{
        OPENED,CLOSED
    }

}
