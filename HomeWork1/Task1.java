package HomeWork1;

public class Task1 {
    public static void main(String[] args) {
        byte a = 42; //00101010
        byte b = 15; //00001111

        System.out.println(~a); //~00101010 = 11010101
        System.out.println(~b); //~00001111 = 11110000
        System.out.println(a&b);// 00101010 & 00001111 = 00001010
        System.out.println(a|b); //00101010 | 00001111 = 00101111
        System.out.println(a^b); //00101010 ^ 00001111 = 00100101
        System.out.println(a<<1); //00101010 << 1 = 01010100
        System.out.println(b<<1); //00001111 << 1 = 00011110
        System.out.println(a>>1); //00101010 >> 1 = 00010101
        System.out.println(b>>1); //00001111 >> 1 = 00000111
        System.out.println(a >>> 1); // 00101010 >>> 1 = 00010101
        System.out.println(b >>>1); //00001111 >>> 1 = 00000111
        System.out.println(a<<=1); //00101010 <<= 1 = 01010100
        a = 42;
        System.out.println(b<<=1); //00001111 <<= 1 = 00011110
        b = 15;
        System.out.println(a|=b); //00101010 |= 00001111 = 00101111

        byte x = -42; //11010110
        byte z = -15; //11110001

        System.out.println(~x); //~11010110 = 00101001
        System.out.println(~z); //~11110001 = 00001110
        System.out.println(x&z); //11010110 & 11110001 = 11010000
        System.out.println(x|z); //11010110 | 11110001 = 11110111
        System.out.println(x^z); //11010110 ^ 11110001 = 00100111
        System.out.println(x<<1); //11010110 << 1 = 10101100
        System.out.println(z<<1); //11110001 << 1 = 11100010
        System.out.println(x>>1); //11010110 >> 1 = 11101011
        System.out.println(z>>1); //11110001 >> 1 = 11111000
        System.out.println(x>>>1); //11010110 >>> 1 = 11101011
        System.out.println(z>>>1); //11110001 >>> 1 = 11111000
        System.out.println(x<<=1); //11010110 <<= 1 = 10101100
        x = -42;
        System.out.println(z<<=1); //11110001 <<= 1 = 11100010
        z = -15;
        System.out.println(x|z); //11010110 |= 11110001 = 11011111

        double g = 42.5;//Побитовые операции невозможно выполнить с дробным числом.
        //System.out.println(~g);
        //System.out.println(g<<1);
        //System.out.println(Integer.toBinaryString()); Можно использовать для перевода из десятичной в двоичную.
    }
}
