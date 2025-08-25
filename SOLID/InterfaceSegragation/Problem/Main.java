package SOLID.InterfaceSegragation.Problem;


// Problems with heavy inheritance : 
// Tight coupling – Child classes depend too much on parent logic. Any change in the parent might break many children.
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying fast");
    }
}

// Problem: Penguin is a Bird, but it can't fly
class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        bird1.fly(); // ✅ works fine

        Bird bird2 = new Penguin();
        bird2.fly(); // ❌ runtime error → violates LSP
    }
}
