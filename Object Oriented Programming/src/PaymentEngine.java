class PaymentEngine {
    void accept(Payment payment) {
        System.out.println("Accepting payment: " + payment.getAmount());
    }
}

class BkashPayment implements Payment {
    @Override
    public long getAmount() {
        System.out.println("Taking Bkash Payment");
        return 100;
    }
}

class CashPayment implements Payment {
    @Override
    public long getAmount() {
        System.out.println("Taking Cash Payment");
        return 500;
    }
}

class PaymentEngineDemo {
    public static void main(String[] args) {
        PaymentEngine paymentEngine = new PaymentEngine();
        BkashPayment bkashPayment = new BkashPayment();

        paymentEngine.accept(bkashPayment);

        CashPayment cashPayment = new CashPayment();
        paymentEngine.accept(cashPayment);
    }
}