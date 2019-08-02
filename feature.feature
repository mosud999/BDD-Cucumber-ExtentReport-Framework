Feature: go to yahoo home page

Scenario Outline: go to yahoomail with credintail

Given open browser and navigate to yahoo
When give the <username> and <pass> 
Then it should sign in and login to the yahoo page

Examples: 
  |username|pass|
  |kallkjlkjl|00000000000|
  |jjjjjjjjj|11111111|