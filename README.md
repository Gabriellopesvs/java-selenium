# Java Selenium Automation Project

[![Build Status](https://travis-ci.org/your-username/java-selenium.svg?branch=master)](https://travis-ci.org/your-username/java-selenium "Travis CI")
[![codecov](https://codecov.io/gh/your-username/java-selenium/branch/master/graph/badge.svg)](https://codecov.io/gh/your-username/java-selenium)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.your-username/automation.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.your-username%22%20AND%20a:%22automation%22)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## Overview:

This project is a test automation framework in Java using Selenium WebDriver, focusing on testing the login flow, product selection, and checkout process of a web application. It utilizes **Spring Boot** for dependency injection and easy project management.

## Problem Statement:
- Automating tests for web applications that involve complex processes such as login, navigation, and checkout.
- Automating interaction with pages that have input fields and multiple buttons.

## Solution:
This project can be easily added to your Java Selenium test automation framework, providing methods and a modular structure to manage actions on page elements.

## Features:

- **Automatic Login**: Automatically fills the username and password fields.
- **Product Selection**: Simulates adding products to a shopping cart.
- **Checkout Process**: Automates the customer information filling and proceeds to the payment screen.

## Methods:
  `WebElement fill(String selector, String text, String actionPage)`: Fills an input field based on the provided CSS selector and value.
  
  `WebElement click(String selector, String actionPage)`: Clicks on a page element based on the CSS selector.
  
  `WebDriver initPage(String path)`: Initializes the test page by loading the URL configured in the `config.properties` file.
  
  `void quitDriver()`: Closes the WebDriver after test execution.

## How It Works:

### Test Example:

```java
@Test
public void Open() throws IOException, InterruptedException {
    methods.initPage("url");

    methods.fill(selectorPage.USER, "standard_user", "Filling in the Username field");
    methods.fill(selectorPage.PASSWORD, "secret_sauce", "Filling in the Password field");
    methods.click(selectorPage.LOGIN, "Click on the login button");
    methods.click(selectorPage.PRODUCT1, "Sauce Labs Backpack product selected");
    methods.click(selectorPage.PRODUCT2, "Sauce Labs Bike Light product selected");
    methods.click(selectorPage.SHOPPING, "Click on Shopping");
    methods.click(selectorPage.CHECKOUT, "Click on Checkout");
    methods.fill(selectorPage.FIRSTNAME, "Gabriel", "Filling in the first name");
    methods.fill(selectorPage.LASTNAME, "Lopes", "Filling in the Last name field");
    methods.fill(selectorPage.POSTALCODE, "11111111", "Filling in the Postal Code field");
    methods.click(selectorPage.BUTTONCONTIN, "Click on the Continue button");
}
```

# What's New?

This automation now supports the following technologies:
- Java 11
- Selenium 4.x
- Spring Boot to manage dependency injection.

# How to Use This Project:

To use this project, simply add the Maven dependency or download the source code from the GitHub repository.

### Maven:
```xml
<dependency>
    <groupId>com.your-username</groupId>
    <artifactId>java-selenium</artifactId>
    <version>1.0.0</version>
</dependency>
```
### Gradle:
```xml
implementation 'com.your-username:java-selenium:1.0.0'
```

# Configuration:

You can define the URL and other configuration parameters in the src/main/resources/config.properties file.

# CSS Selector Example:
 
Here are some examples of how to use selectors to find and interact with elements on the page.

## Example of an HTML tag:

```html
<input id="username" type="text" placeholder="Username">
```
## You can use the following selector in your test:

- Method to fill in field
In the example, pass the attribute and the text with the action that will occur

```java
methods.fill("#username", "Filling in the Username field");
```

- Click method
In the example, pass the attribute and the text with the action that will occur

```java
methods.click("#button", "Click on the login button");
```

