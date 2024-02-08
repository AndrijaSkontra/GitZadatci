package zadatak1;

public class FileParserFactory {
    public FileParser createParser(String fileType) {
        if (fileType == null) {
            return null;
        }
        if (fileType.equalsIgnoreCase("TXT")) {
            return new TxtFileParser();
        } else if (fileType.equalsIgnoreCase("CSV")) {
            return new CsvFileParser();
        } else if (fileType.equalsIgnoreCase("JSON")) {
            return new JsonFileParser();
        }
        return null;
    }
}