public class main {

    public static void main(String[] args) {

        Employee lokman = new Employee("lokman günay",5000.00,45,2015);
        lokman.raiseSalary();
        lokman.bonus();
        lokman.tax();

        System.out.println(lokman);
    }
}
