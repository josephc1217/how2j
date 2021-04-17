package digit;

public class TestNumber {
    public static void main(String[] args){

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        byte b1;
        Byte b2 = 11;
        Integer it = 12;
        b1 = (byte)it.intValue();
        b1 = b2.byteValue();

        short s1;
        Short s2 = 123;
        s1 = s2.shortValue();

    }
}
