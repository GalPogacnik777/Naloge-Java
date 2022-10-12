import java.util.Scanner;

class Naloga2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();

         if (stevilo < 10) {
            System.out.println("Stevilo je enomestno");
         } else if (stevilo > 10) {
            System.out.println("Stevilo je vecmestno");
         }
    }
}

        

    


