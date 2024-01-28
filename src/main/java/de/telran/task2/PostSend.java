package de.telran.task2;

public abstract class PostSend {
    private String name;
    private String address;
    private String addressRecipient;

    public PostSend(String name, String address, String addressRecipient) {
        this.name = name;
        this.address = address;
        this.addressRecipient = addressRecipient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressRecipient() {
        return addressRecipient;
    }

    public void setAddressRecipient(String addressRecipient) {
        this.addressRecipient = addressRecipient;
    }

    public abstract void sendPost();
    public abstract void getPost();

}
