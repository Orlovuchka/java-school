package ru.rzn.sbt.javaschool.basics;

import java.util.Objects;

public class LethalWeapon {
    public String color;
    private int roundsLeft;
    private Double power;

    private Double getPower() {
        return power;
    }

    private void setPower(Double power) {
        this.power = power;
    }

    public void reload(int col) {
        roundsLeft += col;
    }

    public void pewPew() {
        roundsLeft -= 2;
    }

    public LethalWeapon() {
    }

    public LethalWeapon(String color, Double power, int roundsLeft) {
        this.color = color;
        this.power = power;
        this.roundsLeft = roundsLeft;
    }

    private static long nextSerial=0;
    private final long serial=2;

    public long getSerial(){
        return serial;
    }

    @Override
    public boolean equals(Object obj) {
        LethalWeapon ob = (LethalWeapon) obj;
        return Objects.equals(color, ob.color) && Objects.equals(power, ob.getPower()) && (ob.roundsLeft == roundsLeft) ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(color, power, roundsLeft);
    }

}

