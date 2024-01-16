package zadatak1;

public class NovelWriter implements WriterInt {

    @Override
    public void writeNovel(int type) {
        switch (type) {
            case 1:
                System.out.println("Writing a novel in English");
                break;
            case 2:
                System.out.println("Writing a novel in German");
                break;
            case 3:
                System.out.println("Writing a novel in French");
                break;
            default:
                System.out.println("Writing a novel in Croatian");
                break;
        }
    }
}
