package Test;

import java.util.Arrays;
import java.util.Collections;

public class HelloWorld {
    public static void main(String[] args){
        int[] a = new int[]{18, 62, 68, 82, 65, 9 };
        int[] c = new int[]{18, 62, 68, 82, 65, 8 };
        int[] b = Arrays.copyOfRange(a,0,3);

        for(int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }

        System.out.println("a数组排序之前：");
        String content = Arrays.toString(a);
        System.out.println(content);

        System.out.println("a数组排序之后：");
        Arrays.sort(a);
        content = Arrays.toString(a);
        System.out.println(content);

        System.out.println("数字62出现的位置" + Arrays.binarySearch(a,62));
        System.out.println("a数组和c输出是否相同？" + Arrays.equals(a,c));

    }
}
