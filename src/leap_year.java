import java.util.Scanner;

public class leap_year {
    public static void main (String[] args){
        System.out.print("enter any year to find leap or not : ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year % 4 == 0){
            System.out.println("Leap year : " + year);
        }
        else{
            System.out.println("not leap year : " + year);
        }

    }
}
