# NTD CLI calculator challenge
This repository aims to provide test and results for the CLI calculator for the NTD challenge.

- [Test Plan](test-plan.md)
- [Test cases with results](test_cases_with_results.xlsx)
- [Bug Report](bug-report.pdf)

## Running integration tests
Execute the command:
```sh
sh integration_tests.sh
```

## Inspecting Code

## Retrieving .jar file from docker image
Execute the following command:
```sh
docker cp public.ecr.aws/l4q9w4c5/loanpro-calculator-cli:latest:/app/cli-calculator.jar - > ./
```

### Preparing Vineflower
- Access https://github.com/Vineflower/vineflower/releases
- Search for the most recent release
- Download `-slim.jar` file
- Rename the file to `vineflower.jar`
- Move the `vineflower.jar` to the root of this project (same location as the jar file)

### Decompiling calculator jar file
Execute the following command:
```sh
java -jar ./vineflower.jar -dgs=1 ./cli-calculator.jar ./
```

The code will be available at `./cli_calculator`

## Development
1. This project uses [Conventional Commits](https://www.conventionalcommits.org/) as pattern.
`The Conventional Commits specification is a lightweight convention on top of commit messages. It provides an easy set of rules for creating an explicit commit history; which makes it easier to write automated tools on top of. This convention dovetails with SemVer, by describing the features, fixes, and breaking changes made in commit messages.`
