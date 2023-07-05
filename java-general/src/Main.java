// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int underscoreNum = 4_500_678; //improves visibility with _
        long longValue = 2_147_483_647_234L; //L is mandatory when the number exceeds INTEGER.MAX_VALUE
        byte firstByte = 1, secondByte = 2;
        double doubleValue = 0.00000000003; //double is the default type for any decimal/real number
        //0.00000000003 = 3.0E-11 = 3 * 10^-11
        float flotValue = 0.005F; //F is mandatory to explicitly say we're using a float number

        System.out.println(underscoreNum);
        System.out.println(doubleValue);
    }
}