package LAB_PBO_A.PT7_Polymorphism.Study_Case;

class Fighter {
    int HP;
    int attackPower;

    public Fighter(int hP, int attackPower) {
        HP = hP;
        this.attackPower = attackPower;
    }

    void attack(Fighter fighter) {
        System.out.println(fighter.HP -= this.HP);
    }

    void attck(Defender defender) {
        System.out.println(defender.HP -= (1/2 * this.HP));
    }
}

class Defender {
    int HP;
    int attackPower;

    public Defender(int hP, int attackPower) {
        HP = hP;
        this.attackPower = attackPower;
    }

    void defend(Fighter fighter) {
        System.out.println(this.HP -= (1/2 * fighter.HP));
    }

    void defend(Defender defender) {
        System.out.println(this.HP -= defender.HP);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Fighter f1 = new Fighter(100, 100);
        Fighter f2 = new Fighter(200, 200);
    
        Defender d1 = new Defender(100, 100);
        Defender d2 = new Defender(200, 200);
    
        f1.attack(f2);
        f1.attck(d2);

        d1.defend(f1);
        d1.defend(d2);
    }
}
