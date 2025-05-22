public class Main {
    
    static class PaymentMethod {
        public void processPayment(double amount) {
            System.out.println("Bayar " + amount + " (default)");
        }

        public void processPayment(double amount, String currency) {
            System.out.println("Bayar " + amount + " pakai mata uang " + currency);
        }
    }

    static class CreditCard extends PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("Kartu Kredit: " + amount);
        }

        @Override
        public void processPayment(double amount, String currency) {
            System.out.println("Kartu Kredit: " + amount + " (" + currency + ")");
        }
    }

    static class EWallet extends PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("Dompet Digital: " + amount);
        }

        @Override
        public void processPayment(double amount, String currency) {
            System.out.println("Dompet Digital: " + amount + " dalam " + currency);
        }
    }

    static class BankTransfer extends PaymentMethod {
        @Override
        public void processPayment(double amount) {
            System.out.println("Transfer Bank: " + amount);
        }

        @Override
        public void processPayment(double amount, String currency) {
            System.out.println("Transfer Bank: " + amount + " (" + currency + ")");
        }
    }

    public static void main(String[] args) {
        PaymentMethod[] metode = new PaymentMethod[3];
        metode[0] = new CreditCard();
        metode[1] = new EWallet();
        metode[2] = new BankTransfer();

        for (int i = 0; i < metode.length; i++) {
            metode[i].processPayment(50000);
            metode[i].processPayment(100000, "USD");
            System.out.println("------------");
        }
    }
}
