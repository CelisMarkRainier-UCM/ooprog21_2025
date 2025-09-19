public class DemoGrossPay {

    public static void main(String[] args) {
        calculateGross(10);
        calculateGross(25);
        calculateGross(37.5);
    }

    public static void calculateGross(double hoursWorked) {
        double hourlyRate = 22.75;
        double grossPay = hoursWorked * hourlyRate;

        System.out.println(hoursWorked + " hours at $" + hourlyRate + " per hour is $" + grossPay);
    }
}
