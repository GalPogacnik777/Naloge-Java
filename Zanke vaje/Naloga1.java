class Naloga1 {
    public static void main(String[] args) {
        int stevec = 5;
        while (stevec < 5) {
            System.out.println(stevec);
            stevec++;
        }
         System.out.println("-----------------------");

         do {
             System.out.println(stevec);
             stevec--;
         } while (stevec > 0);
         System.out.println("-----------------------");

         for (int i = 10; i <= 15; i++) {
             System.out.println(i);
         } 
    }
}