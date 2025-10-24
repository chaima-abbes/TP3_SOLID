package LSP;


public class Pool {
    public void run() {
        Swimmable[] swimmers = getSwimmers();
        Quackable[] quackers = getQuackers();
        
        makeThemSwim(swimmers);
        makeThemQuack(quackers);
        
        testLSPCompliance();
    }

    private Swimmable[] getSwimmers() {
        return new Swimmable[] {
            new Duck(),
            new ElectronicDuck(),
            new ToyDuck()
        };
    }

    private Quackable[] getQuackers() {
        return new Quackable[] {
            new Duck(),
            new ElectronicDuck(),
            new ToyDuck()
        };
    }

    private void makeThemSwim(Swimmable[] swimmers) {
        System.out.println("\n=== Swimming Time ===");
        for (Swimmable swimmer : swimmers) {
            swimmer.swim();
        }
    }

    private void makeThemQuack(Quackable[] quackers) {
        System.out.println("\n=== Quacking Time ===");
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }

    private void testLSPCompliance() {
        System.out.println("\n=== LSP Compliance Test ===");
        
        Swimmable electronicDuckAsSwimmer = new ElectronicDuck();
        electronicDuckAsSwimmer.swim();
        
        Quackable electronicDuckAsQuacker = new ElectronicDuck();
        electronicDuckAsQuacker.quack();
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}