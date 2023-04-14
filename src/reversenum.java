import java.util.Scanner;

public class reversenum {
    public static void main(String[] args){

        System.out.println("enter the number to reverse : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = 0;
        while (num > 0){
            int rem = num % 10 ;
            num = num/10;
         n= (n*10)+rem;
        }
        System.out.println(n);
    }

}
