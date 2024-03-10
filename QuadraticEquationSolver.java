class QuadraticEquationsSolver {
    public double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public void solve(double a, double b, double c) {
        double d = discriminant(a, b, c);
        if (d < 0) {
            System.out.println("No roots");
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("x = " + ((-b) / (2.0 * a)));
        }
    }
}

public static void main(String[] args) {
    // Example usage
    QuadraticEquationsSolver solver = new QuadraticEquationsSolver();
    double a = 1.0; // Coefficient a
    double b = -3.0; // Coefficient b
    double c = 2.0; // Coefficient c

    solver.solve(a, b, c);
}
// the main runner right above this comment (1.0,-3.0,2.0) are the coefficients of a quadratic
//equation in the form of ax² + bx + c = 0. the roots are printed to the console.

/*
Output:
x1 = 2.0
  x2 = 1.0
  x² - 3x + 2 = 0

  The QuadraticEquationsSolver class has two methods: discriminant and solve.

The discriminant method calculates the discriminant of a quadratic equation, which is b² - 4ac.
The discriminant is used to determine the number and type of solutions (roots) the equation has.
The solve method uses the discriminant to find the roots of the quadratic equation.
If the discriminant is less than 0, the equation has no real roots. 
If it’s greater than 0, the equation has two distinct real roots. If it’s equal to 0, the equation has exactly one real root.
  */
