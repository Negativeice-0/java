public class Boolean {
    public static void main (String[] args) {
/*        byte b = 0;
        short s = 10;
        int i = 250;
        long l = 1_000_000L;
        float f = 3.14742f;
        double d = 3.1472364;
        char c = 'c';
    String all = b + "" + s + i + l + f + d + c;
    System.out.println(all);
    */
    boolean isRight = false ;    // declare and assign value
    int hour, minute = 60;         // hour just declared
    hour = 24;                    // hour assigned value
    System.out.println("isRight? " + isRight);
    System.out.println("hour = " + hour);
    System.out.println("minute = " + minute);
}
}

// The output is as follows below:
/*
labex:project/ $ javac variableTest.java
labex:project/ $ java variableTest
isRight? false
hour = 24
minute = 60
*/
