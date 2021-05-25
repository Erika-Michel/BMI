public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(56.7, 1.73);
        System.out.println("BMI:" + bmi);
    }
}
