class Phone {
    String model;
    int storageGB;
    double price;

    Phone(String model, int storageGB, double price) {
        this.model = model;
        this.storageGB = storageGB;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("Nokia 3113 Classic", 512, 10000.00);

        System.out.println("Model: " + phone.model);
        System.out.println("Storage: " + phone.storageGB);
        System.err.println("Price: " + phone.price);
    }
}
