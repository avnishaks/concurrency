package org.example.md_3_design_principle.design_2_OCP.wrongOCP;

import java.util.List;

public class Attacker {

    public boolean attackWithSuperHeros(List<SuperHero> superHeroes){
        for(int i=0;i<superHeroes.size();i++){
            SuperHero superhero=superHeroes.get(i);
            switch (superhero){
                case CAPTAIN_AMERICA:
                    superhero.attackWithCaptainAmerica();
                    break;
                case BAT_MAN:
                    superhero.attackWithBatMan();
                    break;
                case IRON_MAN:
                    superhero.attackWithIronMan();
                    break;
            }
        }
        return false;
    }
}
