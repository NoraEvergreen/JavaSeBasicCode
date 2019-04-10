package cn.magicdu.algorithm;

public class CircleNumber {
    public static void main(String[] args) {
        for(int i=10;i<10000;i++){
            if(isCircleNumber(i)){
                System.out.println(i);
            }
        }
    }

    /**
     * 判断是否是回文数字
     * @param num
     * @return
     */
    private static boolean isCircleNumber(int num) {
        int oldValue=num;
        int newValue=0;
        while(num>0){
            newValue=newValue*10+num%10; //得到一位数字
            num/=10;//num减少一位
        }
        return oldValue==newValue;
    }
}
