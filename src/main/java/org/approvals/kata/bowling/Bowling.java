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
  }

  public String toString() {
    //AT THE DOJO YOU HAVE TO IMPLEMENT THIS FUNCTION!
    return "";
  }
}
