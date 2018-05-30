package demo2505.logic;

public class Employee {
    public void calcSalary(String name, double... salary) {
        System.out.print(name + " ");
        double sum = 0;
        for (double v : salary) {
            sum += v;
        }
        System.out.println(sum);
    }
}
