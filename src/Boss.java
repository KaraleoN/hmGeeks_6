public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss Name: " + getName());
        System.out.println("Boss Health: " + getHealth());
        System.out.println("Boss Weapon Type: " + weapon.getType());
        System.out.println("Boss Weapon Name: " + weapon.getName());
    }
}