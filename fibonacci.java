import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = n.nextInt();
        System.out.print("Enter the first number: ");
        int first = n.nextInt();
        System.out.print("Enter the second number: ");
        int second = n.nextInt();
        System.out.println("the number of terms are:" + terms);
        System.out.println("the first term is: " + first);
        for (int i = 1; i <= terms; i++) {
            System.out.println("Term " + i + ": " + first);
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
