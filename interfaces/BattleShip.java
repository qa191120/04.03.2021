package com.example;

public class BattleShip implements IFireLaser {

    protected int m_number_of_cannons;

    public BattleShip(int m_number_of_cannons) {
        this.m_number_of_cannons = m_number_of_cannons;
    }

    @Override
    public void fireLaser() {
        System.out.println(String.format("Firing lasers from %d cannons",
                m_number_of_cannons));
    }
}
