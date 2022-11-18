import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int seri;
        int num1 = 0;
        int num2 = 1, num3 = 0;

        System.out.print("Serideki Eleman Sayısını Giriniz :");
        seri = input.nextInt();

        for (int i = 1; i <= seri; i++) {
            num3 = num1 + num2;
            System.out.print(num1 + " ");
            num1 = num2;
            num2 = num3;
        }


    }
}
