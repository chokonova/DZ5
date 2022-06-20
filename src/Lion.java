public class Lion {
    int health;
    int damage;
    String superpower;

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getSuperpower() {
        return superpower;
    }

    public Lion(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Lion() {
    }

    public Lion(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }

}

