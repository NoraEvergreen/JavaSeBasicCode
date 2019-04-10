package bigjava;

public class MathRandom {

    public static void main(String[] args) {

        System.out.println("欢迎来到抽奖环节");

        double a=Math.random();       //创建一个随机数,默认生成大于等于0.0且小于1.0的double型随机数
        System.out.println("你随机为："+a);

        if (a==0.5){
            System.out.println("恭喜你,中奖了");
        }else{
            System.out.println("欢迎下次光临");
        }

        int  b=(int)(Math.random()*100);       //创建一个整型的随机数,大于等于0且小于100的随机整数
        System.out.println("你随机为："+b);

        if (b==40){
            System.out.println("恭喜你,中奖了");
        }else{
            System.out.println("欢迎下次光临");
        }
    }
}
