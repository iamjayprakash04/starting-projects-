import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res = 0;
        while (true){
            System.out.print("enter any operator : ");
            char op = in.next().trim().charAt(0);

            if ( op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("enter two numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if ( op == '+'){
                    res = num1 + num2;
                }
                if ( op == '-'){
                    res = num1 - num2;
                }
                if ( op == '*'){
                    res = num1 * num2;
                }
                if ( op == '/'){
                    if ( num2 != 0)
                    res = num1 + num2;
                }
                if ( op == '/'){
                    res = num1 + num2;
                }

                if ( op == '%'){
                    res = num1 % num2;
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("terminated");
            }
            System.out.println("result : " + res);

        }
//%


    }
}
