package jp.ac.uryukyu.ie.pair24;

public class ExDice extends Dice {
    private int minValue;
    private int maxValue;
    
    public ExDice(int minValue, int maxValue){
	this.minValue = minValue;
	this.maxValue = maxValue;
	play();
    }

    public void play(){
	setValue((int)(Math.random()*(maxValue - minValue +1))+minValue);
    }
}

