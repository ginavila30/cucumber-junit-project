Feature: Calculator should work for simple math
  As a user I should be able to do simple math

Scenario Outline:  Should be able to add <firstNumber> and <secondNumber>

  Given Calculator is open
  When I add <firstNumber> with <secondNumber>
  Then I should get <finalNumber>

  Examples:
  |firstNumber|secondNumber|finalNumber|
  |2          |3           |5          |
  |10         |5           |15         |
  |20         |25          |45         |
  |11         |12          |23         |
  |2          |8           |10         |



  #Scenario: Should be able to add two numbers
    #Given Calculator is open
    #When I add 2 with 3
   # Then I should get 5

 # Scenario: Should be able to add two numbers 2
   # Given Calculator is open
    #When I add 10 with 5
    #Then I should get 15

 # Scenario: Should be able to add two numbers 3
  #  Given Calculator is open
   # When I add 20 with 25
    #Then I should get 45

