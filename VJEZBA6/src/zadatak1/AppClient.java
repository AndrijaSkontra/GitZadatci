package zadatak1;

public class AppClient {
    public static void main(String[] args) {
        FileParserFactory fileParserFactory = new FileParserFactory();

        FileParser parser = fileParserFactory.createParser("TXT");
        parser.parse();

        parser = fileParserFactory.createParser("CSV");
        parser.parse();

        parser = fileParserFactory.createParser("JSON");
        parser.parse();
    }
}