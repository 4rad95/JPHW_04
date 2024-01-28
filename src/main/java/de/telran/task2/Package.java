package de.telran.task2;

public class Package extends PostSend {
    public Package(String name, String address, String addressRecipient) {
        super(name, address, addressRecipient);
    }

    @Override
    public void sendPost() {
        System.out.println("Package send");
    }

    @Override
    public void getPost() {
        System.out.println("Package get");
    }
}
