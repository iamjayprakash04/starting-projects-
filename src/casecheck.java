import java.util.Scanner;

public class casecheck {
        public static void main(String[] args){

            System.out.print("enter any character to check lowercase or uppercase : ");
            Scanner in = new Scanner(System.in);

            char ch = in.next().trim().charAt(0);

            if (ch >= 'a' && ch <= 'z') {
                System.out.println(ch  + " : lowercase" );
            }
            else if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch  + " : uppercase" );
            }
            else{
                System.out.println("unexpected : " + ch);
            }

        }
}
