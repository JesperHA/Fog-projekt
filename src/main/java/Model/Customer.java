package Model;

public class Customer {

int customer_id;
String name;
String email;
String password;
String phone;
String adress;
String zipcode;
String city;

    public Customer(int customer_id, String name, String email, String password, String phone, String adress, String zipcode, String city) {
        this.customer_id = customer_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.adress = adress;
        this.zipcode = zipcode;
        this.city = city;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {return password;}

    public String getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }
}
