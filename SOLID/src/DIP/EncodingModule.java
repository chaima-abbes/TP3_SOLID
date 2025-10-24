package DIP;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private final Reader reader;
    private final Writer writer;
    
    public EncodingModule(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    public void encode() throws IOException {
        String content = reader.read();
        String encodedContent = Base64.getEncoder().encodeToString(content.getBytes());
        writer.write(encodedContent);
    }
    
    public static EncodingModule createFileEncodingModule(String inputFile, String outputFile) {
        return new EncodingModule(new FileReader(inputFile), new FileWriter(outputFile));
    }
    
    public static EncodingModule createNetworkToDatabaseModule(String protocol, String host, String path, Database database) {
        return new EncodingModule(
            new NetworkReader(protocol, host, path), 
            new DatabaseWriter(database)
        );
    }
}