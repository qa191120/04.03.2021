package com.example;

public abstract class Humanoid implements IActivePowers {

    protected String m_name;

    public Humanoid(String m_name) {
        this.m_name = m_name;
    }
}
