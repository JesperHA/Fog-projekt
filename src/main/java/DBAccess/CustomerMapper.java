package DBAccess;

import Model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerMapper {

    public static ArrayList<Customer> getCustomerList() {

        ArrayList<Customer> customerList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        String sqlQuery = "SELECT * FROM customers";

        try {
            connection = Connector.connection();
            ps = connection.prepareStatement(sqlQuery);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int customer_id = resultSet.getInt("customer_id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                String phone = resultSet.getString("phone");
                String address = resultSet.getString("address");
                String zipcode = resultSet.getString("zipcode");
                String city = resultSet.getString("city");

                Customer customer = new Customer(customer_id, name, email, password, phone, address, zipcode, city);
                customerList.add(customer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return customerList;

    }
}
