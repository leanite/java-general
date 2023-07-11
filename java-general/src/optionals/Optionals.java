package optionals;

import java.util.Optional;

/*
    Optionals Best Practices:
        - Don't use Optionals as parameters, only as return types to convey that a method may or may not return a value
        - Don't use nulls and Optionals together, meaning you shouldn't check if an optional is null
        - Don't use ifPresent() and then get()
        - Optional value should only be accessed after calling isPresent()
        - Avoid using Optional as property in Java Bean/DTOs because it doesn't implement Serializable
        -

 */
public class Optionals {
    public static void main(String[] args) {
        FakeService service = new FakeService();
        service.printTitleOfId(4);

        String str = null;
        processPrint(str);

        Optional<String> optString = Optional.ofNullable("Hello");
        optString.
    }

    public static void processPrint(String string) {
        Optional<String> optString = Optional.ofNullable(string);

        //optString.ifPresent(value -> System.out.println(value));
        optString.ifPresentOrElse(
                value ->
                        System.out.println(value),
                () -> System.out.println("null"));
    }
}
