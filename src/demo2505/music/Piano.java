package demo2505.music;

public class Piano extends Instrument {

    public Piano(String name) {
        super(name);
    }

    @Override
    protected void playNote(char note) {
        System.out.println("p:"+note);
    }
}
