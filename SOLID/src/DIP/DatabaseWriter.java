package DIP;

import java.io.IOException;

public class DatabaseWriter implements Writer {
    private Database database;
    
    public DatabaseWriter(Database database) {
        this.database = database;
    }
    
    @Override
    public void write(String content) throws IOException {
        database.write(content);
    }
}