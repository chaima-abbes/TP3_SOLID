package LSP;


public class ElectronicDuck implements Swimmable, Quackable {
    private boolean _on = false;
    private boolean _canFunction = true;

    @Override
    public void quack() {
        if (!_canFunction) {
            System.out.println("Electronic duck is broken - no quack");
            return;
        }
        
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Electronic duck is off - no quack");
        }
    }

    @Override
    public void swim() {
        if (!_canFunction) {
            System.out.println("Electronic duck is broken - no swim");
            return;
        }
        
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            System.out.println("Electronic duck is off - no swim");
        }
    }

    public void turnOn() {
        if (_canFunction) {
            _on = true;
            System.out.println("Electronic duck turned on");
        }
    }

    public void turnOff() {
        _on = false;
        System.out.println("Electronic duck turned off");
    }

    public void breakDuck() {
        _canFunction = false;
        _on = false;
        System.out.println("Electronic duck is now broken");
    }

    public void repair() {
        _canFunction = true;
        System.out.println("Electronic duck repaired");
    }

    public boolean isOn() {
        return _on;
    }

    public boolean isFunctional() {
        return _canFunction;
    }
}