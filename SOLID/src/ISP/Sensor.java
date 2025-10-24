package ISP;

import java.util.Random;

public class Sensor {
    public void register(ProximitySensitive proximitySensitiveObject) {
        while (true) {
            if (isPersonClose()) {
                proximitySensitiveObject.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }
}