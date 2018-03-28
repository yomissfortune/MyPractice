package eazy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/1/3.
 */
public class SelfDividingNumbers728 {
    public static void main(String args[]){
        selfDividingNumbers(1,22);
    }


    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = left ; i <= right ; i ++){
            boolean isTrue = true;
            if(i %10 ==0){
                isTrue=false;
            }else{
                int tmp = i;
                int yushu = tmp % 10;
                if(yushu != 0){
                    while(isTrue){
                        if(i % yushu !=0){
                            isTrue = false;
                        }
                        if(tmp >0 &&tmp < 10){
                            //终点
                            break;
                        }
                        else{
                            tmp = tmp / 10;
                            if(tmp % 10 ==0){
                                isTrue = false;
                            }else{
                                yushu = tmp %10 ;
                            }
                        }
                    }
                }else{
                    isTrue =false;
                }
            }
            if(isTrue){
                list.add(i);
            }

        }
        return list;
    }
}
