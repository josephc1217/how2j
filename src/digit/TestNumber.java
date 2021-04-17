package digit;

public class TestNumber {
    public static void main(String[] args){
        int year = 2019;

        System.out.printf("%d%n",year);
        System.out.printf("%8d%n",year);
        System.out.printf("%-8d%n",year);
        System.out.printf("%08d%n",year);
        System.out.printf("%,8d%n",year*1000);
        System.out.printf("%.2f%n", Math.PI);

    }
}
