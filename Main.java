import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many peoples are there?");
        int num = scanner.nextInt();
        System.out.print("NAME                              MAIL-ID                          EMPLOYEE-CODE                           PHONE\n");

        for (int i = 1; i <= num; i++) {
            // System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            // System.out.print("Enter your email: ");
            String mail = scanner.nextLine();
            // System.out.print("Enter your employee code: ");
            String code = scanner.nextLine();
            // System.out.print("Enter your phone: ");
            String phone = scanner.nextLine();
            System.out.println(name + "\t\t" + mail + "               " + code + "                " + phone);
        }

       /**
        for (int i = 1; i <= 5; i++)
        {


            System.out.println("i = " + i);
        }*/
    }
}