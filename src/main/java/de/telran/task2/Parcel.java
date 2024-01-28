package de.telran.task2;

public class Parcel extends PostSend {

    public Parcel(String name, String address, String addressRecipient) {
        super(name, address, addressRecipient);
    }

    @Override
    public void sendPost() {
        System.out.println("Parsel send");
    }

    @Override
    public void getPost() {
        System.out.println("Parsel get");
    }
}
