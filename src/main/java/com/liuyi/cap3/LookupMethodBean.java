package com.liuyi.cap3;

public abstract class LookupMethodBean {

    public void showSex() {
        getPeople().showSex();
    }

    public abstract People getPeople();

    public static abstract class People {

        public abstract void showSex();
    }

    public static class Woman extends People {

        @Override
        public void showSex() {
            System.out.println("I am a woman...");
        }
    }
}
