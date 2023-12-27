package org.example.SOLID_PRINCIPLES.OCP.wrongOCP;

import java.util.Arrays;
import java.util.Collections;

public class TesterSuperHero {
    public static void main(String[] args) {
        Attacker attacker=new Attacker();
        System.out.println(attacker.attackWithSuperHeros(Arrays.asList(SuperHero.BAT_MAN,SuperHero.CAPTAIN_AMERICA,SuperHero.IRON_MAN)));
    }
}
