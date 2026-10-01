\\Write a java program to use Static Inner Class

class Outer {

    static int num = 100;

    // Static Inner Class
    static class Inner {

        void show() {
            System.out.println("Value of num = " + num);
            System.out.println("Static Inner Class");
        }
    }
}

public class StaticInnerDemo {

    public static void main(String[] args) {

        // Creating object of Static Inner Class
        Outer.Inner obj = new Outer.Inner();

        // Calling method
        obj.show();
    }
}
