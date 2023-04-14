import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        System.out.println("enter the number to find multiplication table : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(num +" * " + i+ " = " + (num*i));
        }
    }
}
