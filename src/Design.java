import java.awt.*;
import java.util.Scanner;

public class Design {
    public static void main(String[] args) {
        int choice = 10;
        Scanner input = new Scanner(System.in);
        while (choice!= 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle 1");
            System.out.println("2. Draw the triangle 2");
            System.out.println("3. Draw the triangle 3");
            System.out.println("4. Draw the triangle 4");
            System.out.println("5. Draw the triangle 5");
            System.out.println("6. Draw the square");
            System.out.println("7. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle 1");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the triangle 2");
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("* *");
                    System.out.println("*  *");
                    System.out.println("*   *");
                    System.out.println("*    *");
                    System.out.println("*     *");
                    System.out.println("*      *");
                    System.out.println("*       *");
                    System.out.println("**********");
                    break;
                case 3:
                    System.out.println("Draw the triangle 3");
                    System.out.println("*********");
                    System.out.println(" *******");
                    System.out.println("  *****");
                    System.out.println("   ***");
                    System.out.println("    *");
                    System.out.println("   ***");
                    System.out.println("  *****");
                    System.out.println(" *******");
                    System.out.println("*********");
                    break;
                case 4:
                    System.out.println("Draw the triangle 4");
                    System.out.println("    1");
                    System.out.println("   333");
                    System.out.println("  55555");
                    System.out.println(" 7777777");
                    System.out.println("999999999");
                    break;
                case 5:
                    System.out.println("**********");
                    System.out.println("****  ****");
                    System.out.println("***    ***");
                    System.out.println("**      **");
                    System.out.println("*        *");
                    break;
                case 6:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    break;
                case 7:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("*         *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
