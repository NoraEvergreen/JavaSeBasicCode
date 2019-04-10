package bigjava;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {

        try{                                            //try语句中包含可能出现异常的程序代码
            Scanner input=new Scanner(System.in);
            int[] age=new int[3];

            for (int i = 0; i <age.length+1; i++) {
                System.out.print("请输第"+(i+1)+"的年龄：");
                age[i]=input.nextInt();
            }
        }catch(Exception ex){                      //catch语句块用来获取异常信息
            System.out.println("发生异常错误");
            ex.printStackTrace();               //输出异常性质
        }finally {
            System.out.println("已成功显示年龄信息");
        }
    }
}
