package demo2505;

import demo2505.music.*;
//import demo2505.music.Guitar;
//import demo2505.music.Instrument;

///
public class Main {

    public static void main(String[] args) {
        Instrument a = new Drum("Ivan");
        a.setName("Peter"); // сработает
        a.setName("I"); // не сработает
//        System.out.println(a.name);
        a.play("adfjhj");

        Guitar g = new Guitar("Petr");
        g.play("abcd");
    }
}
