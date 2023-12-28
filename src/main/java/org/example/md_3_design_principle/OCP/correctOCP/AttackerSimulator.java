package org.example.md_3_design_principle.OCP.correctOCP;

import java.util.ArrayList;
import java.util.List;

public class AttackerSimulator {
    public static void main(String[] args) {
        Attacker attacker=new Attacker();
        List<SuperHero> superHeroes=new ArrayList<>();
        superHeroes.add(new BatMan());
        superHeroes.add(new CaptainAmerica());
        superHeroes.add(new IronMan());
        superHeroes.add(new SuperMan());

        attacker.attackSuperHero(superHeroes);
    }
}
