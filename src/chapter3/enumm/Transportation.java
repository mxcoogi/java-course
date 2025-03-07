package chapter3.enumm;

public enum Transportation {
    BUS(10){int fare(int distance){return this.BASIC_FARE * distance;}},
    TRAIN(150){int fare(int distance){return this.BASIC_FARE * distance;}},
    SHIP(100){int fare(int distance){return this.BASIC_FARE * distance;}},
    AIRPLANE(300){int fare(int distance){return this.BASIC_FARE * distance;}};

    protected final int BASIC_FARE;

    Transportation(int basicFare) {
        BASIC_FARE = basicFare;
    }

    public int getBASIC_FARE() {
        return BASIC_FARE;
    }

    abstract int fare(int distance);
}
