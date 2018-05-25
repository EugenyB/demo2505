package demo2505;
///
public class Main {

    public static void main(String[] args) {
        Instrument a = new Instrument("Ivan");
        a.setName("Peter"); // сработает
        a.setName("I"); // не сработает
//        System.out.println(a.name);
        a.play("adfjhj");

        Instrument b = new Instrument("Ы");
        b.setName(""); // ничего не сделает

//        System.out.println(b.name);
        b.play("acde");
        b.playNote('a');
    }
}
