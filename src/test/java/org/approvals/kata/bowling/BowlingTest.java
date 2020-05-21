package org.approvals.kata.bowling;

import junit.framework.TestCase;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.UseReporter;

@UseReporter(org.approvaltests.reporters.JunitReporter.class)
public class BowlingTest extends TestCase
{
  /**
    * For this bowling kata, try to get this test to pass using these simple rules:
    * 
    * 1)  run this test often
    * 2)  don't write any other tests
    * 
    * note: you will need to create a toString() method on the Bowling class
    * 
    * How To Score Bowling : http://en.wikipedia.org/wiki/Ten-pin_bowling#Scoring_2
    * 
    * Things to notice
    * *   how good was your feedback ?
    * *   what was your test to code ratio?
    * *   were failing tests informative?
    * *   did you know when you were done?
    * *   did you know what to do next?
    * *   what was test coverage?
    * 
    */
  public void testBowlingGameLastStrike()
  {
    Bowling bowling = new Bowling();
    bowling.rolls(5, 3, 6, 4, 2, 7, 10, 4, 5, 3, 7, 10, 10, 8, 1, 10, 10, 10);
    assertEquals("1) 5, 3 [8] => 8 \n" +
            "2) 6, 4 [12] => 20 \n" +
            "3) 2, 7 [9] => 29 \n" +
            "4) 10 [19] => 48 \n" +
            "5) 4, 5 [9] => 57 \n" +
            "6) 3, 7 [20] => 77 \n" +
            "7) 10 [28] => 105 \n" +
            "8) 10 [19] => 124 \n" +
            "9) 8, 1 [9] => 133 \n" +
            "10) 10, 10, 10 [30] => 163 \n",
            bowling.toString());
  }

  public void testBowlingLastSpare()
  {
    Bowling bowling = new Bowling();
    bowling.rolls(2,5,3,4,3,6,4,6,4,6,5,4,3,2,4,6,4,3,4,6,10);
    assertEquals (
            "1) 2, 5 [7] => 7 \n" +
                    "2) 3, 4 [7] => 14 \n" +
                    "3) 3, 6 [9] => 23 \n" +
                    "4) 4, 6 [14] => 37 \n" +
                    "5) 4, 6 [15] => 52 \n" +
                    "6) 5, 4 [9] => 61 \n" +
                    "7) 3, 2 [5] => 66 \n" +
                    "8) 4, 6 [14] => 80 \n" +
                    "9) 4, 3 [7] => 87 \n" +
                    "10) 4, 6, 10 [20] => 107 \n",
            bowling.toString());
  }

  public void testBowlingLastNormal()
  {
    Bowling bowling = new Bowling();
    bowling.rolls(2,5,3,4,3,6,4,6,4,6,5,4,3,2,4,6,4,3,4,2);
    assertEquals (
            "1) 2, 5 [7] => 7 \n" +
                    "2) 3, 4 [7] => 14 \n" +
                    "3) 3, 6 [9] => 23 \n" +
                    "4) 4, 6 [14] => 37 \n" +
                    "5) 4, 6 [15] => 52 \n" +
                    "6) 5, 4 [9] => 61 \n" +
                    "7) 3, 2 [5] => 66 \n" +
                    "8) 4, 6 [14] => 80 \n" +
                    "9) 4, 3 [7] => 87 \n" +
                    "10) 4, 2 [6] => 93 \n",
            bowling.toString());
  }
}
