package org.approvals.kata.bowling;

public class Round {

    protected Integer roll1;
    protected Integer roll2;

    protected Integer nextRoll;
    protected Integer nextNextRoll;

    public Round(Integer roll1, Integer roll2) {
        this.roll1 = roll1;
        this.roll2 = roll2;
        this.nextRoll = null;
        this.nextNextRoll = null;
    }

    public Round(Integer roll1, Integer roll2, Integer nextRoll, Integer nextNextRoll) {
        this.roll1 = roll1;
        this.roll2 = roll2;
        this.nextRoll = nextRoll;
        this.nextNextRoll = nextNextRoll;
    }

    public boolean isStrike() {
        return roll1 == 10;
    }

    public boolean isSpare() {
        return roll1 + roll2 == 10;
    }

    public Integer getRoll1() {
        return roll1;
    }

    public Integer getRoll2() {
        return roll2;
    }

    public int getSum() {
        int sum = 0;
        if(roll1 != null) {
            sum += roll1;
        }
        if(roll2 != null) {
            sum += roll2;
        }
        return sum;
    }

    public int getAll(){
        if(isStrike()){
            return 10 + nextRoll + nextNextRoll;
        }
        if(isSpare()){
            return 10 + nextRoll;
        }
        return getSum();
    }

}