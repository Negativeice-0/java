public class arithmeticOperatorTest
{
    public static void main(String[] args){
        int hour = 10, minute = 60;
        hour++;       // hour = 11
        minute--;     // minute = 59
        System.out.println("Number of minutes: " + (hour*60 + minute));
        System.out.println("Fraction of the hour that has passed: " + (minute / 60));
        System.out.println("The remainder of minute divided by hour: " + (minute % hour));
    }
}

//Output:
/*
Number of minutes: 719
Fraction of the hour that has passed: 0
The remainder of minute divided by hour: 4
  */
