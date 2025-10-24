package LSP;


public class Duck implements Swimmable, Quackable {
    public void quack() {
        System.out.println("Quack...");
    }

    public void swim() {
        System.out.println("Swim...");
    }
}