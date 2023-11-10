package exp00;

import exp00.Bullet;

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

    public void eatSupplt() {
        if(this.supple != null && this.blood>0) {
            System.out.println(this.name + "吃了" + this.supple.name);
            this.blood += this.supple.energy;
        }
        System.out.println(this.name + "的血量是" + this.blood);
    }

    public void takeGun(Gun gun) {
        this.name = name;
        System.out.println(this.name + "捡到了" + gun.name);
    }

    public void takeBullet(Bullet bullet) {
        this.bullet = bullet;
        System.out.println(this.name + "捡到" + bullet.num + "颗");
    }

    public void loadBullet() {
        this.gun.bullet += this.bullet.num;
        System.out.println(this.name + "给" + gun.name + "装子弹，现在" + gun.name + "里有");
    }

    public void ShootGun(People enemy) {
        if(this.gun.bullet<=0) {
            System.out.println("危险！枪没有子弹了");
        } else {
            this.gun.bullet -= 1;
            enemy.blood -= this.bullet.damage;
            System.out.println(this.name + "向" +enemy.name + "开枪");
            System.out.println(enemy.name + "中枪，血量剩下" + enemy.blood);
        }
        enemy.blood = enemy.blood < 0 ? 0 : enemy.blood;
        if ( enemy.blood <= 0) {
            System.out.println(enemy.name + "死了");
        }
    }
}
