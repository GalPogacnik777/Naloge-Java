import java.util.Scanner;
class Naloga3 {
    public static Scanner sc;
    public static void main(String[] args) {
        int side, i, j;
        sc = new Scanner(System.in);
        System.out.print("Vnesi velikost: ");
        side = sc.nextInt();
        for(i = 1;i <= side;i++) {
            for(j = 1;j <= side;j++) {
                System.out.print("-");
            }
            System.out.print("\n");
        }
    }
} 