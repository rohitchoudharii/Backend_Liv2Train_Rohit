package com.liv2train.domian;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Embeddable()
public class Address {

    @NotNull
    @NotEmpty
    private String detailedAddress;
    @NotNull
    @NotEmpty
    private String city;
    @NotNull
    @NotEmpty
    private String state;
    @NotNull
    @NotEmpty
    private String pincode;

    public Address(String detailedAddress, String city, String state, String pincode) {
        this.detailedAddress = detailedAddress;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    public Address(){}

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
