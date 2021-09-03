package org.approvals.kata.bowling;

import java.util.ArrayList;
import java.util.List;

public class Bowling
{
  public List<Integer> rolls = new ArrayList<>();

  public void rolls(int... rolls)
  {
    for(int roll : rolls){
      this.rolls.add(roll);
    }
    List<Round> rounds = new ArrayList();
    int roundCounter = 1;
    int i = 0;
    while(i < rolls.length){
      if(roundCounter == 10 ){
        FinalRound finalRound = new FinalRound(Integer.valueOf(rolls[i]), Integer.valueOf(rolls[++i]), null);
        if(i<rolls.length){
            finalRound.setRoll3(Integer.valueOf(rolls[++i]));
        }
        rounds.add(finalRound);
      }
      if (rolls[i] == 10) {
         int j = i;
        rounds.add(new Round(Integer.valueOf(rolls[i]), null, Integer.valueOf(rolls[++j]), Integer.valueOf(rolls[++j])));
        roundCounter++;
        i++;
      } else {
        int j = i;
        rounds.add(new Round(Integer.valueOf(rolls[i]), Integer.valueOf(rolls[++j]), Integer.valueOf(rolls[++j]),Integer.valueOf(rolls[++j])));
        i++;
        roundCounter++;
      }
    }

    StringBuilder builder = new StringBuilder();
    for(int k = 0, k<rounds.size(); k++){
      
    }

  }

  public String toString() {
    return "";
  }
}
