public class logicalOperatorTest
{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
      System.out.println("a && a = " + (a&&a));
        System.out.println("a || b = " + (a||b));
      System.out.println("a || a = " + (a||b);
      System.out.println("!(a && b) = " + !(a && b));
        System.out.println("!(a && b) = " + !(a && b));
    }
}

/*
This is a simple Java program that demonstrates the use of logical operators. Here's what it does:

- It declares two boolean variables, `a` and `b`, with `a` being `true` and `b` being `false`.
- It then prints the result of `a && b` (logical AND), which is `false` because `b` is `false`.
- It prints the result of `a || b` (logical OR), which is `true` because `a` is `true`.
- Finally, it prints the result of `!(a && b)` (logical NOT), which is `true` because `a && b` is 
`false`.

So, the output of this program would be:

```
a && b = false
a || b = true
!(a && b) = true
```

This program is a good way to understand how logical operators work in Java.
They are fundamental to creating conditions in your code. 😊
*/
