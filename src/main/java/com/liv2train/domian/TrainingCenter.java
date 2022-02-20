package com.liv2train.domian;


import com.liv2train.domian.Address;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TC")
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Size(min=1, max = 40,message="Center name cannot be grater then 40 letters")
    @NotNull(message="Center Name is Required")
    @NotEmpty(message="Center Name Cannot be blank")
    private String centerName;

    @Size(min=12, max = 12,message="center code should be of 12 charater long")
    @NotNull(message="Center Code is Required")
    @NotEmpty(message="Center Code Cannot be blank")
    private String centerCode;

    @Valid
    @Embedded
    @NotNull(message="Address is Required")
    private Address address;

    private Integer studentCapacity;
    @ElementCollection
    private List<String> coursesOffered;

    private long createOn;
    @Email(regexp = "(^$|^.*@.*\\..*$)",message="Invalid Email")
    private String contactEmail;

    @Size(min=10,max=10,message="Phone number should be 10 digit ong")
    @NotNull(message="Contact Phone number is Required")
    @NotEmpty(message="Phone field cannot be Empty")
    @Pattern(regexp="(^$|[0-9]{10})",message="Invalid phone number")
    private String contactPhone;

    public TrainingCenter(){}

    public TrainingCenter(String centerName, String centerCode, Address address, Integer studentCapacity, List<String> coursesOffered, long createOn, String contactEmail, String contactPhone) {
        this.centerName = centerName;
        this.centerCode = centerCode;
        this.address = address;
        this.studentCapacity = studentCapacity;
        this.coursesOffered = coursesOffered;
        this.createOn = createOn;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(Integer studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public long getCreateOn() {
        return createOn;
    }

    public void setCreateOn(long createOn) {
        this.createOn = createOn;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
