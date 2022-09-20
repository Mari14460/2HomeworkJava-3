public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // MyClass copyName = new MyClass();

        double credit = 1000000;
        int years = 1;
        double percent = 9.99;

        double monthlyPayment = service.calculate(credit, years, percent);
        System.out.println(monthlyPayment);

        credit = 1000000;
        years = 2;
        percent = 9.99;

        monthlyPayment = service.calculate(credit, years, percent);
        System.out.println(monthlyPayment);

        credit = 1000000;
        years = 3;
        percent = 9.99;

        monthlyPayment = service.calculate(credit, years, percent);
        System.out.println(monthlyPayment);
    }
}