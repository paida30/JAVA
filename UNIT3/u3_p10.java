\\Write a java program to use simple inner class in your program

class Outer {

    int number = 10;

    // Inner class
    class Inner {

        void display() {
            System.out.println("Number = " + number);
            System.out.println("This is an Inner Class.");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {

        // Create object of outer class
        Outer obj = new Outer();

        // Create object of inner class
        Outer.Inner innerObj = obj.new Inner();

        // Call inner class method
        innerObj.display();
    }
}
