import java.util.Scanner;
public class sum_diff {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First digit: ");
        int i = scanner.nextInt();
        System.out.print("Enter second digit: ");
        int j = scanner.nextInt();
        int sum = i + j;
        System.out.println("The sum of " + i + " plus " + j + " = " + sum);
    }
}
