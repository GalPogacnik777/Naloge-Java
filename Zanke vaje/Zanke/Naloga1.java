class Naloga1 {
    public static void main(String[] args){
        for(int a = 1; a<=10; a++){
            System.out.print(a + " ");
        }
        System.out.println();
        for(int b = 2; b<=10; b++){
            for(int c = 0; c<b-1; c++){
                System.out.print("  ");
            }
            System.out.println(b);
        }
    }
}