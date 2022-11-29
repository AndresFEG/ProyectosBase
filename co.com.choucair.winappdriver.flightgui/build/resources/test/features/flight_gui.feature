Feature: I as a user want to buy  an air ticket in the flight gui desktop application
Scenario: Buy an air ticket
  Given That brandon wants to enter  the flight gui desktop application
  |user|password|
  |john|HP      |
  When He enters the data to buy the ticket
  |fromCity |toCity  |date        |classFlight |tickets |passengerName   |
  |Paris    |Sydney  |30/12/2019  |First       |2       |Brandon Quevedo |

  Then He verifies the purchase with the message completed