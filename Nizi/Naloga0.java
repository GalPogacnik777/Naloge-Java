class Naloga0 {
    public static void main(String[] args) {
        String niz = "vrednost";
        String niz2 = new String("vrednost2");
        String prazenNiz = null;

        // charAt
        String nizCharAt = "charAt";
        System.out.println(
            nizCharAt.charAt(2)
        );

        // compareTo
        String nizCompareTo = "compareTo";
        System.out.println(
            nizCompareTo.compareTo(nizCharAt)
        );

        // concat
        String nizConcat = "concat";
        System.out.println(
            nizConcat.concat(" nova vrednost")
        );
        System.out.println(
            nizConcat + " nova vrednost"
        );
        System.out.println(nizConcat);

        StringBuffer sb = new StringBuffer("niz");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);

        // contains
        String nizContains = "contains";
        System.out.println(
            nizContains.contains("ta")
        );

        //endsWith - startsWith
        String nizEndsWith = "endswith";
        System.out.println(
            nizEndsWith.endsWith("th")
        );
        System.out.println(
            nizEndsWith.endsWith("it")
        );

        // split
        String nizSplit = "split1 split2";
        // int stevilo = scanner.nextInt();
        // int nakljucno = random.nextInr();
        String[] vrednosti = nizSplit.split(" ");
        System.out.println(vrednost.length);
        System.out.println(vrednost[0]);
        System.out.println(vrednost[1]);

        // join
        System.out.println(
            String.join(" ", "split1", "split2")
        );

        // replace
        String nizReplace = "replace";
        System.out.println(
            nizReplace.replace('r', ' ')
        );
        System.out.println(
            nizReplace.replaceAll("re", "")
        );

        // trim
        String nizTrim = "trim     ";
        System.out.println(
            nizTrim.trim().concat("med")
        );
        
        // toUpperCase - toLowerCase
        String nizToUpperCase = "toUpperCase";
        System.out.println(
            nizToUpperCase.toUpperCase()
        );
        System.out.println(
            nizToLowerCase.toLowerCase()
        );
    }
}