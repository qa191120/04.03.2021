package com.example;

public class Superman extends Humanoid implements IFireLaser {

    protected long m_flight_speed;

    public Superman(String m_name, long m_flight_speed) {
        super(m_name);
        this.m_flight_speed = m_flight_speed;
    }

    @Override
    public void activePowers() {
        System.out.println("Superman is flying (super power)");
    }

    @Override
    public void fireLaser() {
        System.out.println("Superman fires his laser beam");
    }
}
