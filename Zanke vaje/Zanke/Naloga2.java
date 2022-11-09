import java.util.Scanner;
class Naloga2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if(input >= 10 && in input>=1000){
           int sestevek = 0;
           for(int i = 1; i<=input; i++){
               sestevek += i;
           } 
            System.out.println(sestevek);
        } else{
            System.out.println("Napaka");
        }
               
    }
}