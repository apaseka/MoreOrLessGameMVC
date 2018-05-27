package org.itstep;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int minBar;
    private int maxBar;
private int secretValue;
    private List<Integer> yourWay = new ArrayList<>();

    @Override
    public String toString() {
        return "Model{" +
                "secretValue=" + secretValue +
                '}';
    }

    public boolean checkValue(int value) {
        yourWay.add(value);
        if (value == secretValue) {
            return true;
        } else if (value > secretValue) {
            maxBar = value;
        } else{ minBar = value;}
        return false;
    }

    public void setPrimeBar(int minBar, int maxBar) {
        this.maxBar = maxBar;
        this.minBar = minBar;
    }

    public int getMinBar() {
        return minBar;
    }

    public int getMaxBar() {
        return maxBar;
    }

    public void setSecretValue() {
        secretValue = (int) Math.ceil(Math.random() * (maxBar - minBar - 1) + minBar);

    }

    public int getSecretValue() {
        return secretValue;
    }

    public List<Integer> getYourWay() {
        return yourWay;
    }
}
