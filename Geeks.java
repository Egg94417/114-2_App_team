abstract class GeeksHelp {
    abstract void check(String name); // Abstract method
}

class Test {
    static void hello() {
        System.out.println("Hello");
    }
}

public class Geeks extends GeeksHelp
{
    void hello() {
        System.out.println("This is a user-defined method.");
    }

    @Override
    void check(String name) {
        System.out.println(name);
    }
    // An example method
    public void printMessage() {
        System.out.println("Hello, Geeks!");
    }
    
    public static void main(String[] args) {
        
        // Create an instance of the class
        // containing the method
        Geeks obj = new Geeks();
        
        // Calling the method
        obj.printMessage();
        obj.hello(); 
        obj.check("Egg94417");
        System.err.println(obj.hashCode());
        Test.hello(); 
    }
}