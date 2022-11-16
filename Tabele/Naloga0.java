class Naloga0{
    public static void main(String[] args) {
        int st = 1;
        int[] tt = new int[3];  // 1, 2, 3, => velikost 3

        // prvi element
        tt[0] = 1;

        // drugi element
        tt[1] = 2;

        // tretji element
        tt[2] = 3;

        // izpis elementov tabele
        for (int i = 0; i < tt.length; i++) {
            System.out.println(i + ": " + tt[i]);
        }
    }
}