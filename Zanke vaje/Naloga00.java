class Naloga00 {
    public static void main(String[] args){

       int a = 1;
       int b = 10;
       for (;;) {
           b -= 2;
           if (b <= 10) {
               break;
           }
           b *=4;
           System.out.println("b = " + b);
       } 
       System.out.println(a);
       System.out.println(b);
    }
}