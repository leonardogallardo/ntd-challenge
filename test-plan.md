# Test Plan

## Introduction
The purpose of this test plan is to provide a detailed description of the testing process for the NTD cli-calculator developed by our team. The calculator is a basic arithmetic operations tool that performs addition, subtraction, multiplication, division, and square root operations.

## Scope
The scope of this test plan covers the functional and non-functional testing of the calculator. 
* The functional testing will include the testing of all the features and functionalities of the calculator to ensure that they are working as expected. 

## Objectives
The main objectives of this test plan are as follows:
- To ensure that the calculator meets the functional requirements specified in the requirements document.
- To ensure that the calculator meets the non-functional requirements specified in the requirements document.
- To identify and report any defects or issues found during the testing process.
- To ensure that the calculator is ready for release to the public.

The test subject is the follow one: public.ecr.aws/l4q9w4c5/loanpro-calculator-cli

## Test Strategy
The test strategy for this calculator will include the following:
- Black-box testing to validate the functionality of the calculator.

## Test Environment
The test environment for this calculator will include the following:
- Operating System: Windows, MacOS, and Linux
- Test Management Tool: (Spreadsheet)[test_cases_with_results.xlsx]

## Test Tools
The following test tools will be used for testing the calculator:
- Docker
- Shell

## Resources
The following resources will be required for the testing process:
- Docker: for running integration tests
- (VineFlower)[https://github.com/Vineflower/vineflower] - for decompile jar
- Shell - for running tests

# Test Cases

The following table lists all the test cases that will be executed during the testing process:

| Test Case ID | Description | Input 1 | Input 2 | Expected Output |
|--------------|-------------|---------|---------|-----------------|
| TC001 | add positive integers | 2 | 3 | Result: 5 |
| TC002 | add negative integers | -2 | -3 | Result: -5 |
| TC003 | add mixed signs - negative B | 2 | -3 | Result: -1 |
| TC004 | add mixed signs - negative A | -3 | 2 | Result: -1 |
| TC005 | add decimal numbers | 2.5 | 3.7 | Result: 6.2 |
| TC006 | add zero and positive integer | 0 | 5 | Result: 5 |
| TC007 | add zero and negative integer | 0 | -5 | Result: -5 |
| TC008 | add zero on both inputs | 0 | 0 | Result: 0 |
| TC009 | add non-numeric input A | a | 3 | Invalid argument. Must be a numeric value. |
| TC010 | add non-numeric input B | 2 | e | Invalid argument. Must be a numeric value. |
| TC011 | add sum is 42 | 99996 | 0 | Result: 42 |
| TC012 | add big numbers | 2147483647 | -2147483647 | Result: 0 |
| TC013 | subtract positive integers | 5 | 2 | Result: 3 |
| TC014 | subtract negative integers | -5 | -2 | Result: -3 |
| TC015 | subtract mixed signs - negative B | 2 | -3 | Result: 5 |
| TC016 | subtract mixed signs - negative A | -3 | 2 | Result: -5 |
| TC017 | subtract decimal numbers | 5 | 2.5 | Result: 2.5 |
| TC018 | subtract equal positive integers | 5 | 5 | Result: 0 |
| TC019 | subtract equal negative integers | -5 | -5 | Result: 0 |
| TC020 | subtract decimal numbers | 2.5 | 3.7 | Result: -1.2 |
| TC021 | subtract zero on both inputs | 0 | 0 | Result: 0 |
| TC022 | subtract non-numeric input A | a | 3 | Invalid argument. Must be a numeric value. |
| TC023 | subtract non-numeric input B | 2 | e | Invalid argument. Must be a numeric value. |
| TC024 | multiply positive integers | 2 | 3 | Result: 6 |
| TC025 | multiply negative integers | -2 | -3 | Result: 6 |
| TC026 | multiply mixed signs - negative B | 2 | -3 | Result: -6 |
| TC027 | multiply mixed signs - negative A | -3 | 2 | Result: -6 |
| TC028 | multiply decimal numbers | 2.5 | 3.1 | Result: 7.75 |
| TC029 | multiply zero and any integer | 0 | 10 | Result: 0 |
| TC030 | multiply any integer and zero | 5 | 0 | Result: 0 |
| TC031 | multiply zero on both inputs | 0 | 0 | Result: 0 |
| TC032 | multiply integer overflow input A | 21474836472147483647 | 2 | Result: 42949672944294967294 |
| TC033 | multiply integer overflow input B | 2 | 21474836472147483647 | Result: 42949672944294967294 |
| TC034 | multiply integer overflow both inputs | 21474836472147483647123 | 21474836472147483647123 | Result: 4.6116860151×10⁴⁴ |
| TC035 | multiply non-numeric input A | a | 3 | Invalid argument. Must be a numeric value. |
| TC036 | multiply non-numeric input B | 2 | e | Invalid argument. Must be a numeric value. |
| TC037 | divide positive integers | 6 | 2 | Result: 3 |
| TC038 | divide negative integers | -6 | -2 | Result: 3 |
| TC039 | divide mixed signs - negative B | 6 | -2 | Result: -3 |
| TC040 | divide mixed signs - negative A | -6 | 2 | Result: -3 |
| TC041 | divide decimal numbers | 5.3 | 2.5 | Result: 2.12 |
| TC042 | divide periodic decimal | 1 | 3 | Result: 0.33333333 |
| TC043 | divide divide by zero | 5 | 0 | Error: Cannot divide by zero |
| TC044 | divide zero as numerator | 0 | 5 | Result: 0 |
| TC045 | divide non-numeric input A | a | 3 | Invalid argument. Must be a numeric value. |
| TC046 | divide non-numeric input B | 2 | e | Invalid argument. Must be a numeric value. |
| TC047 | square_root invalid operation | 5 | 2 | Error: Unknown operation: square_root |