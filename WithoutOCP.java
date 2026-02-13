package DesignPrinciple;

class PaymentService {

    public void processPayment(String type) {
        if (type.equalsIgnoreCase("CreditCard")) {
            System.out.println("Processing credit card payment");
        } else if (type.equalsIgnoreCase("UPI")) {
            System.out.println("Processing UPI payment");
        }
    }
}

public class WithoutOCP {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.processPayment("CreditCard");
    }
}

