package exp;

public class PlayGame {
    public static void main(String[] args) {

        People solider = new People("战士");
        People enemy = new People("敌人");

        Supple anodyne = new Supple("止痛药", 10);
        Supple energydrink = new Supple("能量饮料", 20);

        solider.takeSupple(anodyne);
        solider.eatSupple();

        enemy.takeSupple(energydrink);
        enemy.eatSupple();

        Gun pistol = new Gun("手枪");
        Gun sniper = new Gun("狙击枪");

        Bullet pistolbullet = new Bullet(8,10);
        Bullet sniperbullet = new Bullet(10,20);

        solider.takeGun(sniper);
        solider.takeBullet(sniperbullet);
        solider.loadBullet();
        solider.shootGun(enemy);

        System.out.println("---------------");
        enemy.takeSupple(energydrink);
        enemy.eatSupple();


        enemy.takeGun(pistol);
        enemy.takeGun(sniper);
//        enemy.loadBullet();

//        enemy.shootGun(solider);
//        enemy.shootGun(solider);
//        enemy.shootGun(solider);
//        enemy.shootGun(solider);
//        enemy.shootGun(solider);
    }
}
