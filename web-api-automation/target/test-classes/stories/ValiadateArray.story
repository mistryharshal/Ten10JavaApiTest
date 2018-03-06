Scenario: Validate array

Given an unordered array of integers as [input]
When user program calculates lenght of longest order
Then user get the length of ordered subsequence which equals to [output]

Examples:
|input					|output|
|1 4 1 4 2 1 3 5 6 2 3 7|4|
|3 1 4 1 5 9 2 6 5 3 5	|3|
|2 7 1 8 2 8 1			|2|