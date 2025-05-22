import java.util.Scanner;

class ConditionalOddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        for (int i = 1; i <= (a % 2 == 0 ? a - 1 : a) * 2 - 1; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}