import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ve hinh nhe!");
        System.out.println("nhập vào 1: vẽ hình chữ nhật");
        System.out.println("nhập vào 2: vẽ hình tma giác đứng");
        System.out.println("nhập vào 3: vẽ hình tam giác ngược");
        System.out.println("nhập vào 4: vẽ hình tam giác cân");
        System.out.println("nhập vào 5 để thoát ra");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int chieuDai;
        int chieuRong;
        int height;
        if (input == 1){
            System.out.println("nhập chiều dài");
            chieuDai = scanner.nextInt();
            System.out.println("nhập chiều rộng");
            chieuRong = scanner.nextInt();
            for (int i = 0; i < chieuRong; i++) {
                for (int j = 0; j < chieuDai; j++) {
                    System.out.print(" * ");
                }
                System.out.println(" ");
            }
        }
        if (input == 2){
            System.out.println("Nhập vào chiều cao tam giác");
            height = scanner.nextInt();
            for (int i = 1; i <= height; i++) {
                for (int j =1 ; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println(" ");
            }
        }
        if (input == 3){
            System.out.println("nhập vào chiều cao tam giác");
            height = scanner.nextInt();
            for (int i = height; i>=1 ; i--) {
                for (int j = i; j >=1 ; j--) {
                    System.out.print(" * ");
                }
                System.out.println(" ");
            }
        }
        if (input == 4){
            System.out.println("nhập vào chiều cao tam giác");
            height = scanner.nextInt();
            for (int i = 1; i <= height ; i++) {
                for (int j = 1; j <= height - i ; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2*i-1 ; k++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }

    }
}