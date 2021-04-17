package digit;

public class TestNumber {
    public static void main(String[] args){
        int i = 5;
        String str = String.valueOf(i);

        Integer it = i;
        String str2 = it.toString();

        String str3 = "999";
        int j = Integer.parseInt(str3);
        System.out.println("j的值为： "+j);

        float pai = (float)3.14;

        System.out.println(Float.toString(pai));
        String str4  = Float.toString(pai);
        float f1 = Float.parseFloat(str4);


    }
}
