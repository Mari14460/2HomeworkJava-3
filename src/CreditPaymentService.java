public class CreditPaymentService {
    public double calculate(double credit, int years, double percent) {
        double months = years * 12;
        percent = percent / 100 / months;

        double monthlyPayments = credit * ((percent * Math.pow((1 + percent), months)) // Math.pow(2, 3) 2^ 3
                / (Math.pow((1 + percent), months) - 1));

        return monthlyPayments;
    }
}
