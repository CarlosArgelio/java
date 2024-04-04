public class UpdatingVars {
    public static void main(String[] args) {
        int salary = 1000;

        // bono $200
        salary = salary + 200;
        System.out.println(salary);

        // pension: $50 descuento
        salary = salary - 50;
        System.out.println(salary);
    }
}