import java.util.Scanner;

public class fibbonacci {
    public static void main( String[] args ){

        System.out.print("enter the number of terms : ");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print(a + " "+ b +" ");
        while ( count <= n ){
            int temp = b;
            b = b+a;
            a = temp;
            System.out.print(b + " ");
            count++;
        }
        System.out.println("the number present in that term : "+b);


    }
}
