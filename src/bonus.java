import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        System.out.print("Enter your salary to find bonus : ");
        Scanner input = new Scanner(System.in);

        int salary = input.nextInt();

        if (salary > 10000){
            salary +=2000;
        }
        else{
            salary +=1000;
        }
        System.out.println("Your salary with bonus : "+ salary);
    }
}
