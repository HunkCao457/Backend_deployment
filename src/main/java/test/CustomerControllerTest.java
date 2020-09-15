package test;

import controller.CustomerController;
import model.CustomerAccount;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Test class for CustomerController
 */
public class CustomerControllerTest {

    @Autowired
    private CustomerController customerController;

    @Test
    public void testSaveCustomer() {
        CustomerAccount account = new CustomerAccount();
		CustomerAccount result = customerController.saveCustomerAccount(account);
        Assert.assertEquals(account, result);
    }

    @Test
    public void testUpdateCustomer() {
        CustomerAccount account = new CustomerAccount();
		CustomerAccount result = customerController.saveCustomerAccount(account);
        Assert.assertEquals(account, result);
    }

    @Test
    public void testDeleteCustomer() {
        CustomerAccount account = new CustomerAccount();
        CustomerAccount mock = customerController.saveCustomerAccount(account);
        int result = customerController.deleteCustomerAccount(mock.getId());
        Assert.assertEquals(mock.getId(), result);
    }

    @Test
    public void testGetAllCustomers() {
        CustomerAccount account = new CustomerAccount();
        CustomerAccount result = customerController.saveCustomerAccount(account);
        Assert.assertEquals(account, customerController.getAllCustomerAccounts());
    }

    @Test
    public void testGetCustomerByID() {
        CustomerAccount account = new CustomerAccount();
        CustomerAccount result = customerController.saveCustomerAccount(account);
        Assert.assertEquals(result, customerController.getCustomerAccountByID(account.getId()));
    }
}
