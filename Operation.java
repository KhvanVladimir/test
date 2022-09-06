public class Operation {
    public int makeOperation(String[] operators, int[] myDigits){

        if (operators[1] == null){
            return result(myDigits[0], myDigits[1], operators[0]);
        }
        else if (operators[1] == "/" || operators[1] == "*"){
            int interResult = result(myDigits[1], myDigits[2], operators[1]);
            return result(myDigits[0], interResult, operators[0]);
        }
        else {
            int interResult = result(myDigits[0], myDigits[1], operators[0]);
            return result(interResult, myDigits[2], operators[1]);
        }

    }
    public int result(int first, int second, String operation){
        int res = 0;

        if (operation == "+"){
            res = first + second;
        }
        else if (operation == "-"){
            res = first - second;
        }
        else if (operation == "*"){
            res = first * second;
        }
        else if (operation == "/"){
            res = first / second;
        }

        return res;
    }
}

