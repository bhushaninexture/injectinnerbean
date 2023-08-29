package org.example;

public class Student {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("setting the student city");
        this.address = address;
    }

    public  void fetchAddressDetails(){
        address.currentCity();
    }
}
