package Test;

import java.util.Arrays;
import java.util.Collections;

public class HelloWorld {
    public static void main(String[] args){
        int[] a;
        a = new int[5];
        System.out.println("数组长度是 " + a.length);

        for (int i=0; i<a.length; i++){
            a[i] = (int)(Math.random()*100);
            System.out.println(a[i]);
        }

        System.out.println("本练习的目的是找出最小的一位");
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }

        System.out.println("最小值是：" + min);

    }
}
