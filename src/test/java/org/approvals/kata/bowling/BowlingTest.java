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
  public void testBowlingGame() throws Exception
  {
    Bowling bowling = new Bowling();
    bowling.rolls(5, 3, 6, 4, 2, 7, 10, 4, 5, 3, 7, 10, 10, 8, 1, 10, 10, 10);
    Approvals.verify(bowling.toString());
  }
}
