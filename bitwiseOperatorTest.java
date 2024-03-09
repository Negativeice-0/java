public class bitwiseOperatorTest
{
    public static void main(String[] args){
        int a = 0b00111100, b = 0b00001101;     // a is 60, b is 13
        System.out.println("a & b: " + (a&b));  // 00001100(in tens:12)
        System.out.println("a | b: " + (a|b));  // 00111101(in tens:61)
        System.out.println("a ^ b: " + (a^b));  // 00110001(in tens:49)
        System.out.println("~ b: " + (~b));     // 11110010(in tens:-14)
    }
}

//output:
/*
labex:project/ $ touch bitwiseOperatorTest.java
labex:project/ $ javac  bitwiseOperatorTest.java
labex:project/ $ java bitwiseOperatorTest     
a & b: 12
a | b: 61
a ^ b: 49
~ b: -14
*/
