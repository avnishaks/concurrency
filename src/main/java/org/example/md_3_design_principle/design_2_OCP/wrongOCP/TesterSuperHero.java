package org.example.md_3_design_principle.design_2_OCP.wrongOCP;

import java.util.Arrays;

public class TesterSuperHero {
    public static void main(String[] args) {
        Attacker attacker=new Attacker();
        System.out.println(attacker.attackWithSuperHeros(Arrays.asList(SuperHero.BAT_MAN,SuperHero.CAPTAIN_AMERICA,SuperHero.IRON_MAN)));
    }
}
