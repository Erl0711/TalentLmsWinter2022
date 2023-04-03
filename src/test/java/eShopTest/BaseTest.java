package eShopTest;

import org.testng.annotations.*;

public class BaseTest {




    @BeforeSuite
    public void setup(){
        System.out.println("Настройка Chrome");
    }

    @BeforeTest
    public void openSite(){
        System.out.println("Открытие сайта");
    }


    @AfterTest (alwaysRun = true)
    public void close(){
        System.out.println("Закрыть сайт");
    }
}
