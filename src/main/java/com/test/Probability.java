package com.test;

public class Probability {

    private final double probabilityOfObject;
    public Probability(double probabilityOfObject){
        this.probabilityOfObject = probabilityOfObject;
    }

    public boolean equals(Object object)
    {
        if(this == object){
            return true;
        }
        if(this.getClass() != object.getClass()){
            return false;
        }
        Probability probabilityObj = (Probability) object;
        return probabilityObj.probabilityOfObject == this.probabilityOfObject;
    }

    public Probability findTogetherOccurring(Probability probabilityOfHeadToss) {
        return new Probability(this.probabilityOfObject*probabilityOfHeadToss.probabilityOfObject);
    }

    public Probability complement() {
        return new Probability(1 - this.probabilityOfObject);
    }
}
