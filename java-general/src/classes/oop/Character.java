package classes.oop;

public abstract class Character implements Attacker, Defender {
    public String name;
    public int hp;
    public int mp;
    public int attack;
    public int magic;
    public int defense;
    public int magicDefense;

    public Character(String name, int hp, int mp, int attack, int magic, int defense, int magicDefense) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.magic = magic;
        this.defense = defense;
        this.magicDefense = magicDefense;
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

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", attack=" + attack +
                ", magic=" + magic +
                ", defense=" + defense +
                ", magicDefense=" + magicDefense +
                '}';
    }
}
