package be.pxl.innerclasses.DemoSV.inner;

class OuterClass {
    int num;

    // inner class
    private class InnerClass {
        public void print() {
            System.out.println("This is an inner class");
        }
    }

    // Accessing he inner class from the method within
    void display_Inner() {
        InnerClass inner = new InnerClass();
        inner.print();
    }
}

class My_class {

    public static void main(String args[]) {
        // Instantiating the outer class
        OuterClass outer = new OuterClass();

        // Accessing the display_Inner() method.
        outer.display_Inner();
    }
}
