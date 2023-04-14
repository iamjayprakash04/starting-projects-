import java.util.Scanner;

public class numoccurance {
        public static void main(String[] args){
            System.out.print("enter a number : ");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            System.out.println("enter the number which occurance to be conunted : ");
            int a = in.nextInt();
            int count =0;

            while (num > 0){

                int rem = num % 10;
                num = num/10;
                if (rem == a){
                    count++;
                }

            }
            System.out.println(count);
    }

}
