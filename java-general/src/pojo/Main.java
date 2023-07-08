package pojo;

public class Main {
    public static void main(String[] args) {
        CharacterDTO charDTO = new CharacterDTO("001", "Cloud",
                150,80,15,15,5,7);
        CharacterRecord charRecord = new CharacterRecord("001", "Cloud",
                150,80,15,15,5,7);

        System.out.println(charDTO.getName());
        System.out.println(charDTO);

        System.out.println(charRecord.name());
        System.out.println(charRecord);
    }
}
