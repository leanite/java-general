public class Strings {
    public static void main(String[] args) {
        String name = "Leandro";
        String surname = "Carneiro Leite";
        //name = name + surname; //inefficient because Strings are immutable

        StringBuilder stringBuilder = new StringBuilder(name); //mutable and efficient
        stringBuilder.append(' ');
        stringBuilder.append(surname);
        String fullName = stringBuilder.toString();

        System.out.println(fullName);
    }
}
