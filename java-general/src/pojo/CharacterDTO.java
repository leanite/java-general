package pojo;

/*
    POJO (Plain Old Java Object) is the acronym to define objects used to carry data.
    They usually have only instance variables, a constructor and getters and setters.
    We often call them Data Transfer Object (DTO), Bean or JavaBean or Entity.
 */
public class CharacterDTO {
    private String id;
    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int defense;
    private int magic;
    private int magicDefense;

    public CharacterDTO(String id, String name, int hp, int mp, int attack, int defense, int magic, int magicDefense) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.defense = defense;
        this.magic = magic;
        this.magicDefense = magicDefense;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }

    @Override
    public String toString() {
        return "CharacterDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", magic=" + magic +
                ", magicDefense=" + magicDefense +
                '}';
    }
}
