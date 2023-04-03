package eShopTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Function2  extends BaseTest{



    @BeforeMethod
    public void catalog(){
        System.out.println("Переход в каталог");
    }
    @Test (description = "Этот тест пррверяет цену прдукта") // в отчёте показывает что этот тест делает
    public void test12(){

        System.out.println("Проверка цены продукта");
    }

    @Test (priority = 0)
    public void test22(){
        System.out.println("Проверка названия продукта");
    }
}
