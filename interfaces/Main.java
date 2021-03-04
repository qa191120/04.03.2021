package com.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Superman superman = new Superman("Clark Kent", 100000000);
        superman.activePowers();
        superman.fireLaser();

        Spiderman spiderman = new Spiderman("Peter Parker", 1200.44);
        spiderman.activePowers();
        spiderman.climb();

        Lizzard myLizzard = new Lizzard("green");
        climbEmpireStateBuilding(myLizzard);
        climbEmpireStateBuilding(spiderman);
        //IClimb climber = (IClimb)superman; // crash!
        //climbEmpireStateBuilding(superman);

        BattleShip ship = new BattleShip(4);
        fireLaser(ship);
        fireLaser(superman);
        //IFireLaser fire = (IFireLaser)spiderman; // CRASH!
        //fireLaser(spiderman);
    }

    static void climbEmpireStateBuilding(IClimb climber)
    {
        if (climber instanceof Lizzard)
        {
            Lizzard lizzard = (Lizzard)climber;
            //lizzard.m_color
        }
        climber.climb();
    }

    static void fireLaser(IFireLaser instanceCanFireLaser)
    {
        instanceCanFireLaser.fireLaser();
    }

}
