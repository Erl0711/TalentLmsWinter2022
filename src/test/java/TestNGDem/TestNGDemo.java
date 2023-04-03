package TestNGDem;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {




    @Test
    public void createNewUserTest(){
        User firstuser = new User("John",30);
        Assert.assertNotNull(firstuser);
    }

    @Test(dependsOnMethods = "createNewUserTest")
    public void loginTest() {
        Assert.assertTrue(true);
    }

    @DataProvider(name = "inputValues")
    public Object[][] getInputValues(){
        return new Object[][] {
                {"john@gmail.com","validPass"},
                {"johngmail.com","validPass"},
                {"john@gmail.com","invalidPass"}
        };
    }

    @Test(dataProvider = "inputValues")
    public void testLoginFun(String userName, String password){
        System.out.println(userName + " " + password);
    }


}

