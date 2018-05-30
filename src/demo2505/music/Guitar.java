package demo2505.music;

public class Guitar extends Instrument {
    public Guitar(String name) {
        super(name);
    }

    public Guitar() {
        super("noname");
    }

    @Override
    protected void playNote(char note) {
        System.out.println("g:"+note);
    }
}
