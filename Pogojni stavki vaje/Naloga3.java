import java.util.Scanner;

class Naloga3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();

        if (stevilo < 10) {
            System.out.println("Stevilo je enostno");
        } else if (stevilo < 100) {
            System.out.println("Stevilo je dvomestno");
        } else if (stevilo < 1000) {
            System.out.println("Stevilo je trimestno");
        } else if (stevilo < 10000) {
            System.out.println("Stevilo je stirimestno");
        } else if (stevilo < 100000) {
            System.out.println("Stevilo je petmestno");
        } else if (stevilo < 1000000) {
            System.out.println("Stevilo je sestmestno");
        }
        }
        }
        
        
        
        

    
