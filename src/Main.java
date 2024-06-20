public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр оружия для босса
        Weapon bossWeapon = new Weapon(WeaponType.AXE, "Axe of Doom");

        Boss boss = new Boss("Evil Boss", 100, bossWeapon);

        System.out.println("=== Boss Info ===");
        boss.printInfo();

        System.out.println();

        Weapon skeletonWeapon1 = new Weapon(WeaponType.SWORD, "Bone Sword");
        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Longbow");

        Skeleton skeleton1 = new Skeleton("Skeleton Warrior", 50, skeletonWeapon1, 10);
        Skeleton skeleton2 = new Skeleton("Archer Skeleton", 40, skeletonWeapon2, 20);

        System.out.println("\n=== Skeleton 1 Info ===");
        skeleton1.printInfo();

        System.out.println("\n=== Skeleton 2 Info ===");
        skeleton2.printInfo();
    }
}