import java.util.Scanner;

class Naloga2 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vnesite stevilo med 10 in 1000: ");
        int stevilo = in.nextInt();
        int a = 0;
        // for(;;) {
        if (stevilo < 10) {
            System.out.println("Napacen vhodni podatek");
            //break;
        }
        else if (stevilo > 1000) {
            System.out.println ("Napacen vhodni podatek");
            //break;
        }   
         for (int i = 1; i <= stevilo; i++) {
             a = i + a;
         }
         System.out.println(a);
        //}
     }
        
}