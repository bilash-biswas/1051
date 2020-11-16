import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double c,b,a;
    a = input.nextDouble();
    if(a >= 0.00 && a <= 2000.00)
    {
        System.out.printf("Isento\n");
    }
    if(a >= 2000.01 && a <= 3000.00)
    {
        b = a - 2000;
        c = b * 0.08;
        System.out.printf("R$ %.2f\n", c);
    }
    if(a >= 3000.01 && a <= 4500.00)
    {
        b = a - 3000;
        c = b * 0.18 + 1000 * 0.08;
        System.out.printf("R$ %.2f\n", c);
    }
    if(a > 4500.00)
    {
        b = a - 4500;
        c = b * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        System.out.printf("R$ %.2f\n", c);
    }
  }
}
