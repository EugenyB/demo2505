package demo2505;

public class Instrument {

    private String name;

    Instrument(String name) {
        this.name = name;
    }

    Instrument() {
    }

    void playNote(char note) {
        System.out.println(note);
    }

    void play(String melody) {
        System.out.println(name);
        for (int i = 0; i < melody.length(); i++) {
            playNote(melody.charAt(i));
//            this.playNote(melody.charAt(i));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>1) {
            this.name = name;
        }
    }
}
