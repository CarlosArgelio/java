public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890; 
        byte nB = 1;
        long nL = 12345678901L;

        double nD = 123.567894;
        float nF = 12.34F;

        var salary = 1000; // int
        // pension 3% 
        var pension = salary * 0.03; // double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);
    }
}