public class variableTest {
    public static void main (String[] args) {
        byte b = 0;
        short s = 10;
        int i = 250;
        long l = 1_000_000L;
        float f = 3.14742f;
        double d = 3.1472364;
        char c = 'c';
    String all = b + "" + s + i + l + f + d + c;
    System.out.println(all);
    }
}

// output is as bellow:
/*
labex:project/ $ touch variableTest
labex:project/ $ rm variableTest
labex:project/ $ touch variableTest.java
labex:project/ $ javac variableTest.java
labex:project/ $ java variableTest
01025010000003.147423.1472364c                            
*/
