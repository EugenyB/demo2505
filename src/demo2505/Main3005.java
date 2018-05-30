package demo2505;

import demo2505.logic.Computer;

public class Main3005 {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
        }

        for (int i = 0; i < computers.length; i++) {
            computers[i].setPrice((i+1)*100);
        }

        // Для каждого компьютера из массива computers выполнить ...
        for (Computer computer : computers) {
            double v = computer.getPrice()*1.1;
            computer.setPrice(v);
        }

        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
