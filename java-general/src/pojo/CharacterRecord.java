package pojo;
/*
    Record is a representation of a strict and immutable POJO/DTO used to reduce boilerplate code
    Records have a header instead of a constructor
    For each field in the header, Java generates:
        a private and final field with the same name and type (also sometimes called 'component field')
        a public accessor method (getter) for each component field with the same name of the component, without any prefix
        a toString() method that prints out each field in a formatted String

 */
public record CharacterRecord(String id, String name, int hp, int mp,
                              int attack, int defense,
                              int magic, int magicDefense) {
}
