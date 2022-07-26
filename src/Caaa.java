import java.util.Scanner;

public class Caaa {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("3. Print a isosceles triangle: ");
        System.out.println("input height");
       int height= scanner.nextInt();
        for(int i = 1; i <= height; ++i) {
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
