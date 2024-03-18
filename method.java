class Parent {
    // Method Overloading
    public void display() {
        System.out.println("This is Parent class");
    }

    public void display(String message) {
        System.out.println("Message from Parent: " + message);
    }
}

class Child extends Parent {
    // Method Overriding
    @Override
    public void display() {
        System.out.println("This is Child class");
    }

    public static void main(String args[]) {
        Child child = new Child();
        child.display(); // Calls overridden method in Child class
        child.display("Hello"); // Calls overloaded method in Parent class
    }
}
