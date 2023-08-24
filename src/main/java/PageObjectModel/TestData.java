package PageObjectModel;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "loginData")
    public static Object[][] loginData() {
        return new Object[][]{
            {"user1@example.com", "password1"},
            {"user2@example.com", "password2"},
            {"user3@example.com", "password3"}
        };
        
        
    }
}

