import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainTest {
    public static void main(String[] args) {

        Class classForTest = ClassForTest.class;
        start(classForTest);

        Class classForTest2 = ClassForTest2.class;
        start(classForTest2);// тут должен быть RuntimeException

    }

    public static void start(Class testClass) {

        Method[] methods = testClass.getDeclaredMethods();
        int numberBeforeSuite = 0;
        int numberAfterSuite = 0;

        for (Method m : methods) {

            if (m.isAnnotationPresent(BeforeSuite.class)) {
                numberBeforeSuite++;
                if (numberBeforeSuite>1){
                    System.out.println("@BeforeSuite больше одной");
                    throw new RuntimeException();
                }

                System.out.println("Описание: " + m.getAnnotation(BeforeSuite.class).description());
                try {
                    m.invoke(null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        }

        for (int i = 10; i >=0; i--) {

            for (Method m : methods) {

                if (m.isAnnotationPresent(Test.class)) {
                    if (m.getAnnotation(Test.class).priority()==i) {
                    System.out.println("Описание: " + m.getAnnotation(Test.class).description());
                    try {
                        m.invoke(null);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    }
                }
            }
        }

        for (Method m : methods) {

            if (m.isAnnotationPresent(AfterSuite.class)) {

                numberAfterSuite++;
                if (numberAfterSuite>1){
                    System.out.println("@AfterSuite больше одной");
                    throw new RuntimeException();
                }

                System.out.println("Описание: " + m.getAnnotation(AfterSuite.class).description());
                try {
                    m.invoke(null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}