package properties;

import java.io.*;
import java.util.Properties;

public class mainproperties {
    public static void main(String [] args)throws IOException {
        Properties properties = new Properties();
        File file = new File("/home/developer2/IdeaProjects/checkcard/src/properties/prova.properties");
        FileReader fileReader = new FileReader(file);
        properties.load(fileReader);
        System.out.println(properties.getProperty("città"));

    }
}
