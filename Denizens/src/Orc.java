/**
 * Created by mbila on 4/6/15.
 */
public class Orc extends Denizen {
    private static final String DENIZENTYPE = "Orc";
    private String army, hairColor;
    private int numHorns;

    public Orc() {
        super();
        army = "none";
        numHorns = 0;
        hairColor = "none";
    }

    public Orc(String name, String color, String size, String weapon, String armor, String target, String attack1, String attack2, String army, int numhorns, String hairColor) {
        super(name, color, size, weapon, armor, target, attack1, attack2);
        this.army = army;
        this.numHorns = numHorns;
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", weapon='" + getWeapon() + '\'' +
                ", armor='" + getArmor() + '\'' +
                ", target='" + getTarget() + '\'' +
                ", attack1='" + getAttack1() + '\'' +
                ", attack2='" + getAttack2() + '\'' +
                "army='" + army + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", numHorns=" + numHorns +

                '}';
    }

    public static String getDenizentype() {
        return DENIZENTYPE;
    }

    public String getArmy() {
        return army;
    }

    public void setArmy(String army) {
        this.army = army;
    }

    public int getNumHorns() {
        return numHorns;
    }

    public void setNumHorns(int numHorns) {
        this.numHorns = numHorns;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
