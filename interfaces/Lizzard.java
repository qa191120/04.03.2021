package com.example;

public class Lizzard implements IClimb {

    String m_color;

    public Lizzard(String m_color) {
        this.m_color = m_color;
    }

    @Override
    public void climb() {
        System.out.println("Lizzrad is climbing...");
    }
}
