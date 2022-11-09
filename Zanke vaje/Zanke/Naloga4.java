import java.util.Scanner;
class Naloga4{
    public static void main(String[] args);
    Scanner sc = new Scanner (System.in);
    int x = sc.next.Int();
    if(x<3){
        System.out.println("Napaka");
        System.exit(0);
    }

    String s="*";

    for(int i = 1; i <= x; i++){
        System.out.println(s);
        s +="*";

    }
    sc.close();
}