package zadatak1;

public class AppClient {

    public static void main(String[] args) {

        WriterInt novelWriter = new NovelWriter();

        novelWriter.writeNovel(1);
        novelWriter.writeNovel(2);

        WriterInt writerAdapter = new WriterAdapter(new JapaneseNovel());
        writerAdapter.writeNovel(3);
    }
}
