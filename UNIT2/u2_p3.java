\\Write a java program to use Local Inner Class

public class LocalInnerClassDemo {

    void display() {

        int number = 100;

        // Local Inner Class
        class Inner {

            void show() {
                System.out.println("Number = " + number);
                System.out.println("This is a Local Inner Class.");
            }
        }

        // Create object of local inner class
        Inner obj = new Inner();

        // Call method
        obj.show();
    }

    public static void main(String[] args) {

        LocalInnerClassDemo demo = new LocalInnerClassDemo();

        demo.display();
    }
}
