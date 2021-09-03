package org.approvals.kata.bowling;

public class FinalRound extends Round {

    private Integer roll3;

    public FinalRound(Integer roll1, Integer roll2, Integer roll3) {
        super(roll1, roll2);
        this.roll3 = roll3;
    }

    public Integer getRoll3() {
        return roll3;
    }

    public void setRoll3(Integer roll3){
        this.roll3 = roll3;
    }

    public int getSum() {
        int sum = 0;
        if(roll1 != null) {
            sum += roll1;
        }
        if(roll2 != null) {
            sum += roll2;
        }
        if(roll3 != null) {
            sum += roll3;
        }
        return sum;
    }

    public int getAll(){
        getSum();
    }
}