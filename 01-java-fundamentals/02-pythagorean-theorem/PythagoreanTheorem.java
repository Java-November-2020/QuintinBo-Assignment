public class PythagoreanTheorem {
    public static void main(String[] args) {
        calculateHypotenuse(3.0, 4.0);
        calculateHypotenuse(7.0, 8.0);

    }

    public static double calculateHypotenuse (Double sideA, Double sideB) {
            Double Hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
            System.out.println("The Hypotenuse for this triangle is " + Hypotenuse);
             return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        }


}