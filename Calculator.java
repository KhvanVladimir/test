import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input expression: ");
        String incomeInfo = in.nextLine();
        String data = incomeInfo.replace(" ", "");

        Char chars = new Char();
        chars.str = data;
        String[] operators = chars.findChar();
        if (operators[0].equals("")){
            System.out.println("Incorrect expression. Please, enter correct expression and use next signs: +, -, *, /");
            return;
        }

        int[] myDigits;

        try {
        Digit digits = new Digit();
        digits.str = data;
        myDigits = digits.getDigits(operators);
        }
        catch(NumberFormatException ex){
            System.out.println("Incorrect expression. Please, check the number of digits and use only digits");
            return;
        }
        catch(Exception ex){
            System.out.println("Please, use only next digits: 1 - 10");
            return;
        }

        Operation operation = new Operation();
        int result = operation.makeOperation(operators, myDigits);

        System.out.println(result);
    }
}
