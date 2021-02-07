![CI status](https://github.com/diegosanchez/bob-combining-clojure-spec-with-design-recipes/workflows/tools.deps-builder/badge.svg)

# Combining clojure.spec with design recipes 

## IMPORTANT

**_Please, you should not fork the repository until the day of the workshop._**

## Index

- [Context](#context)
- [Agenda](#agenda)
- [Workshop](#workshop)
  - [Prerequisites](#prerequisites)
  - [Get ready for the activity](#get-ready-for-the-activity)
  - [The Problem Statement](#the-problem-statement)
- [Expected Results](#expected-results)
- [Concepts to Explore](#concepts-to-explore)

## Agenda (placeholder)

1. (**10 min**) - Presentation
10. (**5 min.**) - Problem statement
20. (**? min.**) - Playing with the code
30. (**2 min.**) - New feature statement
40. (**? min.**) - Playing with the code
50. (**5 min.**) - Retrospective

## Context

[Combining clojure.spec with design recipes][external-bob]

## Workshop

### Prerequisites

- An [github][external-github] account.
- [Git][external-git] installed.
- [Clojure 1.10.2 + the Clojure CLI tools][external-clojure-installation] installed.
- Your favourite IDE already set up. [Editor as IDE][external-clojure-editor-as-ide].

### Get ready for the activity

#### Fork this repository. 

In order to fork the repository, you could follow the following instructions: [Forking][external-github-fork].

#### Clone the forked repository

```bash
git clone git@github.com:<github-user>/bob-combining-clojure-spec-with-design-recipes.git
```

#### Run test (verification)

```bash
clojure -M:test:runner
```

Expected output:

```
Running tests in #{"test"}

Testing ws.prepaid-test

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.
```

#### Invoke library (verification)

```bash
    clojure -X:use-case
```

Expected output:

```
Entry point for testing the use case from CLI...
Args: {:key-simple 1, :key-map-value {:v1 "a", :v2 "b"}}
Calling use case...
1 {:v1 "a", :v2 "b"}
```

### Helpful tasks

Some common tasks below.

| Task               | Command                                         |
|--------------------|-------------------------------------------------|
| Run all tests      | `clojure -M:test:runner`                        |
| Run unstable tests | `clojure -M:test:runner -i, --include unstable` |
| Run stable tests   | `clojure -M:test:runner -e, --exclude unstable` |


### The Problem Statement

It's common to see the usage of a prepaid card to pay for a public transport ride. This prepaid card allows users to pay for a public transport ride. 

When a user first buys a prepaid card she/he pays an initial amount of money named _initial-balance_. Every time a user pays for a ride, her/him consumes money from the prepaid card. A user can increase the card balance by depositing money.

The card can be used in two different modes:

- Standard: If the card balance is `B` and the user has to pay `R`, the payment successes whether `R <= B`.

<!--- The new requirement it's hidden on purpose 

- Overdraft: If the card balance is `B` and the user has to pay `R` the payment successes whether `R <= B + D`, being `D` the overdraft amount.

-->

Finally, every transaction has to be record into the contactless card.

#### Some considerations:

For the shake of simplicity:
- The unity of money is an integer.
- The transaction records only have an amount.


---

As a guideness, some of the usecases could be:

- [ ] The user has to pay 10, and its card balance is 100 then the payment is accomplished. Then the card has a new record with -10 and the balance is 90.

- [ ] The user has to pay 20, and its card balance is 10 then the payment is not accomplished. There is neither new record nor the balance changed. 

<!--- The new requirement it's hidden on purpose 

- [ ] The user has to pay 27, and its card balance is 20 with and overdraft amount of 10 then the payment is accomplished. Then the card has a new record with -27 and the balance is -7.

-->

## Expected Results

[Read more...](EXPECTED_RESULTS.md)

## Concepts to Explore

[Read more...](CONCEPTS_TO_EXPLORE.md)

## Misc

- [What are the Clojure Tools (clojure, clj, etc.)?][external-clojure-toolbox]
- [Test runner][external-test-runner]

[external-clojure-installation]: https://clojure.org/guides/getting_started
[external-clojure-editor-as-ide]: https://clojure.org/community/tools
[external-clojure-toolbox]: https://betweentwoparens.com/what-are-the-clojure-tools
[external-git]: https://git-scm.com/doc
[external-github]: https://github.com/
[external-github-fork]: https://guides.github.com/activities/forking/
[external-bob]: https://bobkonf.de/2021/sanchez-doctors.html
[external-test-runner]: https://github.com/cognitect-labs/test-runner
