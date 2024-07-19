#!/bin/bash

docker_image="public.ecr.aws/l4q9w4c5/loanpro-calculator-cli"

# test cases
test_cases=(
    "add@positive integers@2@3@Result: 5"
    "add@negative integers@-2@-3@Result: -5"
    "add@mixed signs - negative B@2@-3@Result: -1"
    "add@mixed signs - negative A@-3@2@Result: -1"
    "add@decimal numbers@2.5@3.7@Result: 6.2"
    "add@zero and positive integer@0@5@Result: 5"
    "add@zero and negative integer@0@-5@Result: -5"
    "add@zero on both inputs@0@0@Result: 0"
    "add@non-numeric input A@a@3@Invalid argument. Must be a numeric value."
    "add@non-numeric input B@2@e@Invalid argument. Must be a numeric value."
    "add@sum is 42@99996@0@Result: 42"
    "add@big numbers@2147483647@-2147483647@Result: 0"
    "subtract@positive integers@5@2@Result: 3"
    "subtract@negative integers@-5@-2@Result: -3"
    "subtract@mixed signs - negative B@2@-3@Result: 5"
    "subtract@mixed signs - negative A@-3@2@Result: -5"
    "subtract@decimal numbers@5@2.5@Result: 2.5"
    "subtract@equal positive integers@5@5@Result: 0"
    "subtract@equal negative integers@-5@-5@Result: 0"
    "subtract@decimal numbers@2.5@3.7@Result: -1.2"
    "subtract@zero on both inputs@0@0@Result: 0"
    "subtract@non-numeric input A@a@3@Invalid argument. Must be a numeric value."
    "subtract@non-numeric input B@2@e@Invalid argument. Must be a numeric value."
    "multiply@positive integers@2@3@Result: 6"
    "multiply@negative integers@-2@-3@Result: 6"
    "multiply@mixed signs - negative B@2@-3@Result: -6"
    "multiply@mixed signs - negative A@-3@2@Result: -6"
    "multiply@decimal numbers@2.5@3.1@Result: 7.75"
    "multiply@zero and any integer@0@10@Result: 0"
    "multiply@any integer and zero@5@0@Result: 0"
    "multiply@zero on both inputs@0@0@Result: 0"
    "multiply@integer overflow input A@21474836472147483647@2@Result: 42949672944294967294"
    "multiply@integer overflow input B@2@21474836472147483647@Result: 42949672944294967294"
    "multiply@integer overflow both inputs@21474836472147483647123@21474836472147483647123@Result: 4.6116860151×10⁴⁴"
    "multiply@non-numeric input A@a@3@Invalid argument. Must be a numeric value."
    "multiply@non-numeric input B@2@e@Invalid argument. Must be a numeric value."
    "divide@positive integers@6@2@Result: 3"
    "divide@negative integers@-6@-2@Result: 3"
    "divide@mixed signs - negative B@6@-2@Result: -3"
    "divide@mixed signs - negative A@-6@2@Result: -3"
    "divide@decimal numbers@5.3@2.5@Result: 2.12"
    "divide@periodic decimal@1@3@Result: 0.33333333"
    "divide@divide by zero@5@0@Error: Cannot divide by zero"
    "divide@zero as numerator@0@5@Result: 0"
    "divide@non-numeric input A@a@3@Invalid argument. Must be a numeric value."
    "divide@non-numeric input B@2@e@Invalid argument. Must be a numeric value."
    "square_root@invalid operation@5@2@Error: Unknown operation: square_root"
)


# Run tests
has_failed=false

for test_case in "${test_cases[@]}"; do
    # Parse test case parameters
    IFS='@' read -ra params <<< "$test_case"
    operation="${params[0]}"
    case_name="${params[1]}"
    input_a=${params[2]}
    input_b=${params[3]}
    expected_result="${params[4]}"

    # Run command and capture output
    output=$(docker run --rm $docker_image $operation $input_a $input_b)

    # Compare output with expected result
    if [ "$output" == "$expected_result" ]; then
        echo "PASS: $operation $case_name ($input_a, $input_b) = $expected_result"
    else
        echo "FAIL: $operation $case_name ($input_a, $input_b)@ expected $expected_result, got $output"
        has_failed=true
    fi
done

if [ "$has_failed" = true ]; then
    exit 1
else
    exit 0
fi
