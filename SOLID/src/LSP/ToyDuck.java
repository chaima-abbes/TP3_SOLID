package LSP;


public class ToyDuck implements Swimmable, Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak squeak!");
    }

    @Override
    public void swim() {
        System.out.println("Toy duck floating");
    }
}