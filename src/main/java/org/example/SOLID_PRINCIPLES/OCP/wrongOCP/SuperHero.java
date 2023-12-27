package org.example.SOLID_PRINCIPLES.OCP.wrongOCP;

public enum SuperHero {
    CAPTAIN_AMERICA,
    BAT_MAN,
    IRON_MAN;

    public void attackWithCaptainAmerica(){
        System.out.println("Captain America is attacking........");
    }

    public void attackWithBatMan(){
        System.out.println("BatMan is attacking............");
    }

    public void attackWithIronMan(){
        System.out.println("Iron Man is attacking...........");
    }
}
