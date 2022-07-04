Feature: Order form submission

  User Story: As a user I should be able to fill out and process and order so that I can see the order info in view all orders.

  @smart_bear
  Scenario Outline: User fills out and submits the order form, so that user can see order info in the

    Given User is logged into SmartBear Tester account and on Order page
    When User clicks on order
    And User selects "<Product Name>" from product dropdown
    And User enters "<Quantity>" to quantity
    And User enters "<Costumer Name>" to costumer name
    And User enters "<Street>" to street
    And User enters "<City>" to city
    And User enters "<State>" to state
    And User enters "<Zipcode>" to zipcode
    And User selects "<CardType>" as card type
    And User enters "<Card Number>" to card number
    And User enters "<Date>" to expiration date
    And User clicks process button
    Then User verifies "<Costumer Name>" is in the list
    Examples:
      | Product Name | Quantity | Costumer Name | Street     | City      | State | Zipcode | CardType         | Card Number      | Date  |
      | MyMoney      | 5        | Mary Jones    | Rain Ave   | Arlington | FL    | 22530   | MasterCard       | 1111222233334444 | 12/25 |
      | FamilyAlbum  | 4        | John Wick     | Kinzie Ave | Chicago   | IL    | 60056   | Visa             | 1111222233334444 | 12/22 |
      | ScreenSaver  | 6        | Max Thompson  | Apple Ave  | Mclean    | VA    | 55349   | American Express | 1111222233334444 | 12/23 |
