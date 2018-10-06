package com.frc3322;

public class AClass {
    public int val = 1;
    private int privateVal = 2;

    public AClass() {}

    public AClass(int i) {
        privateVal = i;
    }

    public int getPrivateVal() {
        return privateVal;
    }
}
