/**
 * Created by mbila on 4/6/15.
 */
public class Ghoul extends Denizen {
    private static final String DENIZENTYPE = "Ghoul";
    private String transparency;
    private int powerLvl, numAllies;

    public Ghoul() {
        super();
        transparency = "none";
        powerLvl = 0;
        numAllies = 0;
    }

    public Ghoul(String name, String color, String size, String weapon, String armor, String target, String attack1, String attack2, String transparency, int powerLvl, int numAllies) {
        super(name, color, size, weapon, armor, target, attack1, attack2);
        this.transparency = transparency;
        this.powerLvl = powerLvl;
        this.numAllies = numAllies;
    }

    @Override
    public String toString() {
        return "Ghoul{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", weapon='" + getWeapon() + '\'' +
                ", armor='" + getArmor() + '\'' +
                ", target='" + getTarget() + '\'' +
                ", attack1='" + getAttack1() + '\'' +
                ", attack2='" + getAttack2() + '\'' +
                "transparency='" + transparency + '\'' +
                ", powerLvl=" + powerLvl +
                ", numAllies=" + numAllies +
                '}';
    }

    public static String getDenizentype() {
        return DENIZENTYPE;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public int getPowerLvl() {
        return powerLvl;
    }

    public void setPowerLvl(int powerLvl) {
        this.powerLvl = powerLvl;
    }

    public int getNumAllies() {
        return numAllies;
    }

    public void setNumAllies(int numAllies) {
        this.numAllies = numAllies;
    }
}
