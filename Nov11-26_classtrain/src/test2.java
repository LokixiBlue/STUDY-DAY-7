public class test2 {
    public static void main(String[] args) {
        //a是公鸡，b是母鸡，c是小鸡
        //公鸡数量最多100/5只，因为只有100块，最多买20只
        for (int a = 0; a < 100 / 5; a++)//for 先判断后执行
        {
            //嵌套定义一个变量b，作用域接下来的循环
            int b=0;
            //母鸡数量最多100/3只，因为只有100块
            while (b < 100 / 3)//while 先判断后执行
            {
                //嵌套定义一个变量c，作用域接下来的循环
                int c=0;
                //小鸡数量最多100只
                do//do while 先执行后判断
                {
                    //a+b+c==100"公鸡母鸡小鸡加一起最多100只";5*a+3*b+c/3==100 一共的钱是100;c%3==0"c是3的倍数"
                    if (a + b + c == 100 && 5 * a + 3 * b + c / 3 == 100 && c % 3 == 0){
                        //最后输出公鸡 母鸡 小鸡的数量
                    System.out.println("公鸡数量：" + a + "，母鸡数量：" + b + "，小鸡数量：" + c);}
                    c++;
                    }while(c<=100);
                b++;
                }

            }
        }
    }

