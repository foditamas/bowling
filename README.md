# Bowling dojo
Demo solution can be found on the “demo_solution” branch.

### Source: http://approvaltests.sourceforge.net/?q=node/5 and https://codingdojo.org/kata/Bowling/

### Technology
 - Java 8
 - Maven 3

## Introduction
When you create your solution you should run the tests often!
To resolve this dojo tasks you will need to create and implement a toString() method on the Bowling class. 
The output format has to be the same as tests asserts.

Imagine, that you play bowling game. You have 2 rolling opportunity in every turn 
and there are 10 turns only. After all your rolls you want to calculate your scores 
from turn by turn. To resolve the calculation you will need to create and implement 
the toString() method on the Bowling class. 

We can briefly summarize the scoring for this form of bowling:
- Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
- In each frame, the bowler gets up to two tries to knock down all the pins.
- If in two tries, he fails to knock them all down, his score for that frame is 
the total number of pins knocked down in his two tries.
- If in two tries he knocks them all down, this is called a “spare” and his score for 
the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
- If on his first try in the frame he knocks down all the pins, this is called a “strike”. 
His turn is over, and his score for the frame is ten plus the simple total of the pins 
knocked down in his next two rolls (not turns, just rolls!).
- If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one 
or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. 
If the bonus throws knock down all the pins, the process does not repeat: 
the bonus throws are only used to calculate the score of the final frame.
- The game score is the total of all frame scores.

More info on the rules at: 
https://en.wikipedia.org/wiki/Ten-pin_bowling#Traditional_scoring


## Example
```
Input: 
5, 3, 6, 4, 2, 7, 10, 4, 5, 3, 7, 10, 10, 8, 1, 10, 10, 10

Output:
1) 5, 3 [8] => 8 
2) 6, 4 [12] => 20 
3) 2, 7 [9] => 29 
4) 10 [19] => 48 
5) 4, 5 [9] => 57 
6) 3, 7 [20] => 77 
7) 10 [28] => 105 
8) 10 [19] => 124 
9) 8, 1 [9] => 133 
10) 10, 10, 10 [30] => 163 
```

## Extras
```
Things to notice:
 - How good was your feedback?
 - What was your test to code ratio?
 - Were failing tests informative?
 - Did you know when you were done?
 - Did you know what to do next?
 - What was test coverage?
```
## TODO
```
tasks:
 - class Round: roll1, roll2 ; strike(), spare()
 - class FinalRound: Round + roll3
 - szekvenciális feldolgozás, strike check -> next
```