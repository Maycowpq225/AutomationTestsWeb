#language:en
# encoding UTF-8

@prime
Feature: Amazon Music

  @primeTest
  Scenario: Access prime Music
    Given that i am on the website "https://www.galp.com/corp/pt/governo-societario"
    When I accept the cookies
    Then I validate the screen galp Governo societario