public class Functions {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        System.out.println(area);        
    }

    /**
     * Descripcion: Retorna el area de un circulo
     * 
     * @param r Radio del circulo
     * @return valor de tipo double del area del circulo
     */
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }
}
