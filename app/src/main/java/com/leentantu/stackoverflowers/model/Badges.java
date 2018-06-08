package com.leentantu.stackoverflowers.model;

import java.util.Objects;

public class Badges {

    private int bronze;
    private int gold;
    private int silver;

    public int getBronze() {
        return this.bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }
    public int getSilver() {
        return this.silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }
    public int getGold() {
        return this.gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Badges)) return false;
        Badges badges = (Badges) o;
        return getBronze() == badges.getBronze() &&
                getGold() == badges.getGold() &&
                getSilver() == badges.getSilver();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBronze(), getGold(), getSilver());
    }
}