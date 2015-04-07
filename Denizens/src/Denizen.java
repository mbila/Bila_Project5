

public class Denizen {
    private String name, color, size, weapon, armor, target, attack1, attack2;

    public Denizen() {
        this.name = "none";
        this.color = "none";
        this.size = "none";
        this.weapon = "none";
        this.armor = "none";
        this.target = "none";
        this.attack1 = "none";
        this.attack2 = "none";
    }

    public Denizen(String name, String color, String size, String weapon, String armor, String target, String attack1, String attack2) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.weapon = weapon;
        this.armor = armor;
        this.target = target;
        this.attack1 = attack1;
        this.attack2 = attack2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getAttack1() {
        return attack1;
    }

    public void setAttack1(String attack1) {
        this.attack1 = attack1;
    }

    public String getAttack2() {
        return attack2;
    }

    public void setAttack2(String attack2) {
        this.attack2 = attack2;
    }
}
