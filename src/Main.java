public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(90);
        boss.setHealth(77);
        boss.setProtectiontypr("dagger");

        System.out.println(boss);
        System.out.println(boss.damage + " " + boss.health + " " + boss.protectiontypr);
    }
}
