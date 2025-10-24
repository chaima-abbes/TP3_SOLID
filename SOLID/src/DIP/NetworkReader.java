package DIP;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReader implements Reader {
    private String protocol;
    private String host;
    private String path;
    
    public NetworkReader(String protocol, String host, String path) {
        this.protocol = protocol;
        this.host = host;
        this.path = path;
    }
    
    @Override
    public String read() throws IOException {
        URL url = new URL(protocol, host, path);
        StringBuilder inputString = new StringBuilder();
        try (InputStream in = url.openStream();
             InputStreamReader reader = new InputStreamReader(in)) {
            int c;
            while ((c = reader.read()) != -1) {
                inputString.append((char) c);
            }
        }
        return inputString.toString();
    }
}