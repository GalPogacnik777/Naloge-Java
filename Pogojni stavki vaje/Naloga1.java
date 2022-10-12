import java.until.Scanner;

class Naloga1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextlnt();
        
        if (stevilo > 5) {
            System.out.prinln("Stevilo je vecje od 5.");
        } else if (stevilo > 3) {
            System.out.println("Stevilo je manjse od 3.");
        } else {
             System.out.println("Stevilo je manjse od 3 in 5.");
         }
    }
}