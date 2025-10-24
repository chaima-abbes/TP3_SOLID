package DIP;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements Database {
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    @Override
    public int write(String inputString) {
        _data.put(++_count, inputString);
        System.out.println("Data written to database: " + inputString);
        return _count;
    }
}