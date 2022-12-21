import java.util.Scanner;
import java.util.Arrays;

class Poprava{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vpisite stevilo prebivalcev:");
        String input = sc.nextLine();
        Integer stPrebivalcev;
        stPrebivalcev = Integer.parseInt(input);
        if(stPrebivalcev < 4){
            System.out.println("Napacen vhodni podatek!");
            System.exit(1);
        }
        input = sc.next();
        System.out.println(input);
        String[] podatki = input.split(",");
        if(podatki.length != stPrebivalcev){
            System.out.println("Napacen vhodni podatek!");
            System.exit(1);
        }
        boolean[] spoli = new boolean[stPrebivalcev];
        double[] place = new double[stPrebivalcev];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double avg = 0;
        for(int i = 0; i < stPrebivalcev; i++){
            String podatek = podatki[i].trim();
            if(podatki.startsWith("MA")){
                spoli[i] = true;
            }else if(podatek.startsWith("FE")){
                spoli[i] = false;
            }else{
                System.out.println("Napaka pri vnosu!");
                System.exit(1);
            }
            String znesek = podatek.substring(2);
            place[i] = Double.parseDouble(znesek);
        }
        for(int i = 0; i < stPrebivalcev; i++){
            String spol;
            if(spoli[i]){
                spol = "Moski";
            }else{
                spol = "Zenski";
            }
            double bruto = place[i];
            double davek = 0.45;
            if(bruto > 7000);{
                davek = 0.75;
            }
            double neto = bruto - bruto*davek;
            System.out.println(spol + " | Bruto: " + bruto + " | Neto: " );
        }
    }
}