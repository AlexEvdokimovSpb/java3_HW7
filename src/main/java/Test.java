import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Test {
        String description() default "Без описания";

        /**
         * Определяет приоритет.
         * От 1 до 10.
         * 1 - наименьший, 10 наибольший.
         * @return
         */
        int priority();
//        int priority() default 1;
    }

