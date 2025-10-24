package DIP;


import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // Configuration 1: Fichier vers fichier
        EncodingModule fileEncoder = EncodingModule.createFileEncodingModule(
            "beforeEncryption.txt",
            "afterEncryption.txt"
        );
        fileEncoder.encode();
        
        // Configuration 2: Réseau vers base de données
        Database database = new MyDatabase();
        EncodingModule networkEncoder = EncodingModule.createNetworkToDatabaseModule(
            "http", "myfirstappwith.appspot.com", "/index.html", database
        );
        networkEncoder.encode();
        
        // Configuration 3: Nouvelle combinaison
        EncodingModule customEncoder = new EncodingModule(
            new NetworkReader("https", "api.example.com", "/data"),
            new FileWriter("output.txt")
        );
        customEncoder.encode();
    }
}
