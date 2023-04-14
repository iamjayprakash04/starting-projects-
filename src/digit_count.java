import java.util.Scanner;

public class digit_count {
    public static void main(String[] args){

        System.out.print("enter any number : ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("enter any number to check occurance : ");
        int a = in.nextInt();

        int count =0;
        while (num > 0){

            int rem = num % 10;
        if (rem == a){
            count++;
        }
        num = num/10;
        }
        System.out.println(count);
    }
}
