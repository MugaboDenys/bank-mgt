/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Dao;
import Entiity.Customer;
import java.time.LocalDate;

/**
 *
 * @author Denys
 */
public class Test {
    public static void main(String[] args) {
        Customer cust = new Customer();
        Dao<Customer> dao = new Dao<>(Customer.class);
        cust.setName("Denys");
        cust.setGender("Male");
        cust.setDob(null);
        dao.create(cust);
    }
}
