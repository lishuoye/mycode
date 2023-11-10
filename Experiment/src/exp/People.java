package exp;

public class People {
    public String name;
    public int blood = 100;

    public Gun gun;
    public Bullet bullet;
    public Supple supple;

    public People(String name) {
        this.name = name;
    }

    public void takeSupple(Supple supple) {
        this.supple = supple;
        System.out.println(this.name + "捡到了" + supple.name);
    }

    public void eatSupple() {
        if(this.blood > 0) {
            System.out.println(this.name + "吃了" + supple.name);
            this.blood += this.supple.energy;
        }
        System.out.println(this.name + "的血是" + this.blood);
    }

    public void takeGun(Gun gun) {
        this.gun = gun;
        System.out.println(this.name + "捡到了" + gun.name);
    }

    public void takeBullet(Bullet bullet) {
        this.bullet = bullet;
        System.out.println(this.name + "捡到了" + bullet.num + "颗子弹");
    }

    public void loadBullet() {
        this.gun.bullet += this.bullet.num;
        System.out.println(this.name + "装子弹，枪现在有子弹了");
    }

    public void shootGun(People enemy) {
        if(this.gun.bullet <= 0) {
            System.out.println("危险！枪没有子弹了！");
        } else {
            this.gun.bullet -= 1;
            enemy.blood -= this.bullet.damage;
            System.out.println(this.name + "向" + enemy.name + "开枪");
            System.out.println(enemy.name + "中枪，血剩下" + enemy.blood);
        }
    }
}
