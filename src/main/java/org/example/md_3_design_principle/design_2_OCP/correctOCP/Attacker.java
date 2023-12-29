package org.example.md_3_design_principle.design_2_OCP.correctOCP;

import java.util.List;

public class Attacker {
    public void attackSuperHero(List<SuperHero> superHeroes){
        for(int i=0;i<superHeroes.size();i++){
            SuperHero superHero=superHeroes.get(i);
            superHero.attack();
        }
    }
}
