# Bowling dojo
Demo solution can be found on the “demo_solution” branch.

### Source: [ApprovalTests](http://approvaltests.sourceforge.net/?q=node/5)

### Technology
 - Java 8
 - Maven 3

## Introduction

```
For this bowling dojo try to get BowlingTest to pass using these simple rules:
1)  run BowlingTest test often
2)  don't write any other tests

Imagine, that you play bowling game. You have 2 rolling opportunity in every turn 
and there are 10 turns only. After all your rolls you want to calculate your scores 
from turn by turn. To resolve the calculation you will need to create and implement 
the toString() method on the Bowling class. The output format has to be the same as 
tests asserts.
When you create your solution you should run the tests often!

Bowling score rules: https://en.wikipedia.org/wiki/Ten-pin_bowling#Traditional_scoring

Things to notice:
 - How good was your feedback?
 - What was your test to code ratio?
 - Were failing tests informative?
 - Did you know when you were done?
 - Did you know what to do next?
 - What was test coverage?
```

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