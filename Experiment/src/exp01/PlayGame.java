package exp01;

public class PlayGame {
    public static void main(String[] args) {
        People solider = new People("战士");
        People enemy = new People("敌人");

        Bullet smallgunbullet = new Bullet("手枪子弹", 5, 10);
        Bullet penzibullet = new Bullet("喷子子弹", 5, 50);

        Gun smallgun = new Gun("手枪");
        Gun penzi = new Gun("喷子");

        Supple redbull = new Supple("红牛", 50);
        Supple kfc = new Supple("全家桶", 100);

        solider.takeGun(smallgun);
        enemy.takeGun(penzi);
        solider.takeBullet(smallgunbullet);
        enemy.takeBullet(penzibullet);
        solider.loadBullet();
        enemy.loadBullet();
        solider.takeBullet(kfc);

    }
}
