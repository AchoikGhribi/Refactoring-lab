# Refactoring Lab

## Description
This lab demonstrates two essential refactoring techniques:
1. Rename Variables/Methods - Improving code readability with meaningful names
2. Extract Method - Breaking down long methods into smaller, reusable ones

---

## Refactoring Techniques Applied

### 1. Rename Variables/Methods (Calculator Class)

#### Before Refactoring:
```java
public class Calculator {
    public double calc(double a, double b) {
        double x = a + b;
        double y = a * b;
        return x / y;
    }
    public void prtRes(double res) {
        System.out.println("Result: " + res);
    }
}

After Refactoring:

public class Calculator {
    public double calculateSumProductRatio(double firstNumber, double secondNumber) {
        double sum = firstNumber + secondNumber;
        double product = firstNumber * secondNumber;
        return sum / product;
    }
    public void printResult(double result) {
        System.out.println("Result: " + result);
    }
}

2. Extract Method (OrderProcessor Class)

Methods extracted:

 1 calculateTotalPrice() - Calculates sum of all items
 2 applyDiscount() - Applies 10% discount for members
 3 printOrderDetails() - Prints order header and total
 4 printItems() - Prints each item in the order

Running Tests
./gradlew test

Expected output:
BUILD SUCCESSFUL in 4s
3 tests completed, 0 failed

Project Structure
RefactoringLab/
├── src/main/java/
│   ├── Calculator.java
│   ├── Customer.java
│   ├── Item.java
│   ├── Order.java
│   └── OrderProcessor.java
├── src/test/java/
│   ├── CalculatorTest.java
│   └── OrderProcessorTest.java
├── build.gradle
└── README.md

Repository :
https://github.com/AchoikGhribi/Refactoring-lab.git

Author :
GHRIBI ACHOIK G2
