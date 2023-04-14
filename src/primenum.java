import java.util.Scanner;

public class primenum {
    public static void main (String[] args){

        System.out.print("enter any numbe to find prime or not : ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int lable = 0;
        for (int i =2; i<num ; i++){

            if (num % i == 0){
                lable = 1;

            }
        }
    if (lable !=1 ){
        System.out.println("Prime number : " + num);
    }
    else{
        System.out.println("Not prime number : " + num);
    }

    }
}
