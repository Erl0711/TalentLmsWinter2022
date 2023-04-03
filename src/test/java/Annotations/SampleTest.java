package Annotations;

        import org.testng.Assert;
        import org.testng.annotations.*;

public class SampleTest {


    @Test (groups = "group1")
    public  void demoTest1(){
        System.out.println("Demo Test1");
        Assert.assertEquals(4,4);
    }

    @Test (groups = "group2")
    public  void demoTest2(){
        System.out.println("Demo Test2");
    }


    @BeforeMethod
    public  void demoTestBefore1(){
        System.out.println("Demo before");
    }

    @AfterMethod
    public  void demoAfter1(){
        System.out.println("Demo After");
    }


    @BeforeClass
    public  void demoBeforeClass(){
        System.out.println("Demo DemoBeforeClass");
    }

    @AfterClass
    public void demoAfterClass(){
        System.out.println("DemoAfterClass");
    }

    @BeforeTest
    public void demoBeforeTest(){
        System.out.println("DemoBeforeTest");
    }

    @AfterTest
    public void demoAfterTest(){
        System.out.println("DemoAfterTest");
    }

    @BeforeSuite
    public void  demoBeforeSuite(){
        System.out.println("DemoBeforeSuite");
    }

    @AfterSuite
    public void  demoAfterSuite(){
        System.out.println("DemoAfterSuite");
    }


    @BeforeGroups (groups = "group1")
    public void demoBeforeGroup(){
        System.out.println("demoBeforeGroup 1");
    }

    @AfterGroups (groups = "group1")
    public void demoAfterGroup(){
        System.out.println("demoAfterGroup 1");
    }

    @Test (enabled = false) // не прогоняется не запускается
    public void testEnabled(){
        System.out.println("Пропуск теста");
    }


    @Test (dependsOnMethods = "") //Зависимость от указанного Метода
    public void dependDemo(){
        System.out.println("Первый прошёл и второй пройдёт");
    }

//    @Test (timeOut = 1)
//    public void timeOutTest(){
//        System.out.println("Зависимость теста от времени выполнения,");
//    }



}
