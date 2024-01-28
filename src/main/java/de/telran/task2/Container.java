package de.telran.task2;

public class Container extends PostSend {
    public Container(String name, String address, String addressRecipient) {
        super(name, address, addressRecipient);
    }

    @Override
    public void sendPost() {
        System.out.println("Container send");
    }

    @Override
    public void getPost() {
        System.out.println("Container get");
    }
}
