import java.util.Locale;

public class CompoundOperator {
    public static void main(String[] args) {
        int number = 10;
        number += 5;

        System.out.println(number); //prints 15

        number += 5.5;

        System.out.println(number); //prints "wrong" result 20

        /*
            x += y is actually x = (type of x)(x + y)
            when 2 variables have the same type, compound operators work just fine
            but when we have two variables with different types, the type casting may affect the final result
         */
    }
}
