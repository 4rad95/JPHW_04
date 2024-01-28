package de.telran.task2;

public class Letter extends PostSend {
    public Letter(String name, String address, String addressRecipient) {
        super(name, address, addressRecipient);
    }

    @Override
    public void sendPost() {
        System.out.println("Letter send ");
    }

    @Override
    public void getPost() {
        System.out.println("Letter get");
    }
}
