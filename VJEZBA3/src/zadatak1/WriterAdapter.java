package zadatak1;

public class WriterAdapter implements WriterInt{

    private JapaneseNovel japaneseNovel;

    public WriterAdapter(JapaneseNovel japaneseNovel) {
        this.japaneseNovel = japaneseNovel;
    }

    @Override
    public void writeNovel(int type) {
        japaneseNovel.writeJapaneseNovel();
    }
}
