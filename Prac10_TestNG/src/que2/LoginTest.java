package que2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	// DataProvider method supplying multiple sets of username/password
    @DataProvider(name = "loginData")
    public Object[][] provideData() {
        return new Object[][] {
            {"admin", "admin123"},    // valid credentials
            {"ABC", "ABC"},       // invalid credentials
            {"XYZ", "XYZ"},    // invalid credentials
            {"ABC", "XYZ"}    // invalid password
        };
    }

    // Test method that consumes data from DataProvider
    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        System.out.println("Attempting login with: Username = " + username + ", Password = " + password);

        // Define valid credentials (for simulation)
        String validUsername = "admin";
        String validPassword = "admin123";

        // Check credentials
        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login successful for user: " + username);
            Assert.assertTrue(true, "Login successful!");
        } else {
            System.out.println("Login failed for user: " + username);
            Assert.assertFalse(true, "Invalid username or password!");
        }

        System.out.println("-------------------------------------------------");
    }
}
