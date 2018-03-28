package eazy;

/**
 * Created by Administrator on 2018/1/3.
 */
//求反码
public class NumberComponent476 {
    public static int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int length = s.length()-1;
        int total = 0;
        char one = '1';
        for( int i =0;i<=length;i++){
            if(s.charAt(i)!=one){
                total = total + (int)Math.pow(2,length -i);
            }
        }
        return total;
    }
    public static void main(String args[]){
        System.out.println(findComplement(-1));
    }
}
