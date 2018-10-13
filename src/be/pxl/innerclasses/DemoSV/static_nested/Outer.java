package be.pxl.innerclasses.DemoSV.static_nested;

public class Outer {
    private static class Nested_Demo {
        public void my_method() {
            System.out.println("This is my nested class");
        }
    }

    public static void main(String args[]) {
        Outer.Nested_Demo nested = new Outer.Nested_Demo();
        nested.my_method();
    }
}