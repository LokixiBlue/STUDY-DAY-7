public class test3 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 9; i++) {
            //用一行来做排版，没有这一行，就会变成一长条
            System.out.println("\t");
            for (j = 1; j <= i; j++) {
                
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
        }
    }
}
