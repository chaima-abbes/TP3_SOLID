package ISP;


public class AdvancedDoor implements Door, Timed, ProximitySensitive {
    private boolean _locked;
    private boolean _opened;

    public AdvancedDoor(Timer timer, Sensor sensor) {
        timer.register(100, this);
        sensor.register(this);
    }

    @Override
    public void lock() {
        _locked = true;
    }

    @Override
    public void unlock() {
        _locked = false;
    }

    @Override
    public void open() {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close() {
        _opened = false;
    }

    @Override
    public void timeOutCallback() {
        _locked = true;
        System.out.println("AdvancedDoor: Auto-locking due to timeout");
    }

    @Override
    public void proximityCallback() {
        _opened = true;
        System.out.println("AdvancedDoor: Auto-opening due to proximity");
    }
}
