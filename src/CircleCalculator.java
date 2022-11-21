public class CircleCalculator {
    public static void main(String[] args) {
        //this calculator will calculate cycleDiameter and area of cycle
        // declare cycleRadius and Pi
        double cycleRadius =12.0;
        double Pi =3.14;
        double circumference = 2 * Pi * cycleRadius;
        double area = Pi * cycleRadius;

        System.out.println("circumference of cycle is : " + circumference);
        System.out.println("Area of cycle is : " + area);

    }
}
