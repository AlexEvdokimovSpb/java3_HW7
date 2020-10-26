public class ClassForTest {

    @Test(description = "Запускаем тест 1", priority = 6)
    public static void test1(){
            System.out.println("test1");
    }

    @Test(description = "Запускаем тест 4", priority = 1)
    public static void test4(){
        System.out.println("test4");
    }

    @Test(description = "Запускаем тест 3", priority = 3)
    public static void test3(){
        System.out.println("test3");
    }

    @Test(description = "Запускаем тест 2", priority = 4)
    public static void test2(){
        System.out.println("test2");
    }

    @Test(description = "Запускаем тест 41", priority = 1)
    public static void test41(){
        System.out.println("test41");
    }

    @BeforeSuite(description = "Начало тестирования ClassForTest")
    public static void testBefore(){
            System.out.println("testBefore");
    }

    @AfterSuite(description = "Завершение тестирования ClassForTest")
    public static void testAfter(){
            System.out.println("testAfter");
            System.out.println(" ");
    }

}

