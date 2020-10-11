public class ClassForTest2 {

    @Test(description = "Запускаем тест 1", priority = 2)
    public static void test1(){
            System.out.println("test1");
    }

    @Test(description = "Запускаем тест 2", priority = 1)
    public static void test2(){
        System.out.println("test2");
    }

    @BeforeSuite(description = "Начало тестирования ClassForTest2")
    public static void testBefore(){
            System.out.println("testBefore");
    }

    @BeforeSuite(description = "Начало тестирования ClassForTest2")
    public static void testBefore2(){
        System.out.println("testBefore2");
    }

    @AfterSuite(description = "Завершение тестирования ClassForTest2")
    public static void testAfter(){
            System.out.println("testAfter");
    }

}

