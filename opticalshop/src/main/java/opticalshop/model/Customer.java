package opticalshop.model;

public class Customer {
    private String name;
    private String phone;
    private String prescription;

    public Customer() {}

    public Customer(String name, String phone, String prescription) {
        this.name = name;
        this.phone = phone;
        this.prescription = prescription;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getPrescription() { return prescription; }

    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setPrescription(String prescription) { this.prescription = prescription; }
}