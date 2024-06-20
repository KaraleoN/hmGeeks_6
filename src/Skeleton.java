public class Skeleton extends Boss {
    private int arrowCount;

    public Skeleton(String name, int health, Weapon weapon, int arrowCount) {
        super(name, health, weapon);
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public void printInfo() {
        System.out.println("Skeleton Name: " + getName());
        System.out.println("Skeleton Health: " + getHealth());
        System.out.println("Skeleton Weapon Type: " + getWeapon().getType());
        System.out.println("Skeleton Weapon Name: " + getWeapon().getName());
        System.out.println("Skeleton Arrow Count: " + arrowCount);
    }
}