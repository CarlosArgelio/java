public class Functions {

    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        System.out.println(area);
        
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }
}
