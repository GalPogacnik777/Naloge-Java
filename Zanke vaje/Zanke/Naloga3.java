import java.util.Scanner;

class Naloga3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        int zmnozek = 1;
        double total = 0;
        int i = 0;
        for (; i< 10; i++); {
            x = sc.nextInt();
            total +=x;
            zmnozek*=x;
        }
        System.out.println("Zmnozek: " + zmnozek);
        System.out.println("Vsota: " + total);
        System.out.println("Povprecje: " + total/i);
    }

    }
 




