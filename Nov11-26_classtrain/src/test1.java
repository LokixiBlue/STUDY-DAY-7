public class test1 {
    public static void main(String[] args) {
        //sum存储每一项和，a，b用于规律迭代，cup用来交换
        double sum = 0, a = 2, b = 1, cup = 0;
        int i = 0;
        /*while (i < 20) {
            //交换过程1
            sum += a / b;
            cup = a + b;
            b = a;
            a = cup;
            i++;
        }
        System.out.println("数列的前二十项只和为：" + sum);*/

        /*for (int i1 = 0; i1 < 20; i1++) {
            sum += a / b;
            cup = a + b;
            b = a;
            a = cup;

        }
        System.out.println("数列的前二十项只和为：" + sum);*/

        int i2 = 0;
        do {
            sum += a / b;
            cup = a + b;
            b = a;
            a = cup;
            i2++;

        } while (i2 < 20);
        System.out.println("数列的前二十项只和为：" + sum);
    }
}
