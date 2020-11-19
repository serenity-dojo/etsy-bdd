# Sample Screenplay Test Suite - Etsy

This repository contains exercises related to the [Serenity Dojo](https://www.serenity-dojo.com/) training programme.

## Exercise 1

Refactor the "Search by keyword" scenarion in [search_for_product.feature](src/test/resources/features/etsy/search_for_product.feature) so that it checks for "mask" and "watch", and not just "Mask".

## Exercise 2

Add a scenario to show that the shopping basket should be empty. Do this by creating a new feature file, `shopping_basket.feature`, with a scenario like the following:

```gherkin
Feature: Adding items to the shopping basket

  Scenario: The shopping basked is initially empty
    Given Sharon is looking for products on Esty
    When she views her shopping basket
    Then the basket should be empty
```

You can do this by completing the prepared step definition methods using the [Navigate](src/test/java/com/serenitydojo/etsy/navigation/Navigate.java) task class.

## Exercise 3

Complete the implementation of the "the correct details for the listed item should be displayed" step so that it checks not only the title but also the price. The `ListingCard` class now records the price on the search results page - add an assertion to make sure that this price appears somewhere in the price section of the details page.

## Executing the tests
To run the sample project, you can either just run the `CucumberTestSuite` test runner class, or run either `mvn verify` or `gradle test` from the command line.

By default, the tests will run using Chrome. You can run them in Firefox by overriding the `driver` system property, e.g.
```json
$ mvn clean verify -Ddriver=firefox
```
Or
```json
$ gradle clean test -Pdriver=firefox
```

The test results will be recorded in the `target/site/serenity` directory.

## Simplified WebDriver configuration and other Serenity extras
The sample projects both use some Serenity features which make configuring the tests easier. In particular, Serenity uses the `serenity.conf` file in the `src/test/resources` directory to configure test execution options.  
### Webdriver configuration
The WebDriver configuration is managed entirely from this file, as illustrated below:
```java
webdriver {
    driver = chrome
}
headless.mode = true

chrome.switches="""--start-maximized;--test-type;--no-sandbox;--ignore-certificate-errors;
                   --disable-popup-blocking;--disable-default-apps;--disable-extensions-file-access-check;
                   --incognito;--disable-infobars,--disable-gpu"""

```

Serenity uses WebDriverManager to download the WebDriver binaries automatically before the tests are executed.
