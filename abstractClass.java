abstract class abstractClass {
    abstract void someMethod(String string1, String string2, String string3);

    void exampleMethod(boolean condition) {
        if (condition) {
            System.err.println("Begin of the work");
            someMethod("first string", "This is a long string that you can select for refactoring", "third string");
            System.err.println("End of the work");
        }
    }
}
