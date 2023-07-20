import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.*;

public class TextReader {
    private String path;

    private static Logger logger = Logger.getLogger(TextReader.class.getName());

    private static final String START = "START";
    private static final String END = "END";

    private TextReader(String path) {
        this.path = path;
    }

    private void execute() {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                int value = Integer.parseInt(line);
                System.out.println(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        logger.info(START);
        if (args.length > 0) {
            new TextReader(args[0]).execute();
        } else {
            System.out.println("Usage: java TextReader <file_path>");
        }
        logger.info(END);
    }
}
