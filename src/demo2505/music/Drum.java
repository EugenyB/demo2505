package demo2505.music;

public class Drum extends Instrument {

    public Drum(String name) {
        super(name);
    }

    @Override
    final protected void playNote(char note) {
        System.out.println("d:"+note);
    }
}
