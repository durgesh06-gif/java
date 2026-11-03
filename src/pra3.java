import java.util.Scanner;

public class pra3 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = s.nextInt();

        for (int i=1;i<=n;i++){
            for (int j = 1; j <= 10; j++) {
                System.out.print(" " +i*j);
            }
            System.out.println(" ");
        }
    }

}
