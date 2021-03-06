![CI status](https://github.com/diegosanchez/bob-combining-clojure-spec-with-design-recipes/workflows/tools.deps-builder/badge.svg)

# Combining clojure.spec with design recipes 

## Index

- [Context](#context)
- [Agenda](#agenda)
- [Workshop](#workshop)
  - [Prerequisites](#prerequisites)
  - [Get ready for the activity](#get-ready-for-the-activity)
  - [The Problem Statement](#the-problem-statement)
- [Expected Results](#expected-results)
- [Concepts to Explore](#concepts-to-explore)
- [Misc](#misc)
- [License](#license)

## Agenda for the activity

1. (**10 min**) - Presentation
10. (**5 min.**) - Problem statement
20. (**40 min.**) - Playing with the code
30. (**2 min.**) - New feature statement
40. (**20 min.**) - Playing with the code
50. (**13 min.**) - Retrospective

## Context

[Combining clojure.spec with design recipes][external-bob]

[Presentation PDF with closed-captioned](/doc/bob.2021--combining-clojure.spec-with-design-recipes--closed-captioned.pdf)

[Presentation video](https://youtu.be/qHMXpsVIysQ)

## Workshop

## IMPORTANT

- **The ``main` branch may suffer changes after publication day, until just before the beginning of the workshop. In that case, you will havo to perform a `git pull -r`. We let you know about this at the beginning of the workshop.**

### Prerequisites

- An [github][external-github] account.
- [Git][external-git] installed.
- [Clojure 1.10.2 + the Clojure CLI tools][external-clojure-installation] installed.
- Your favourite IDE already set up. [Editor as IDE][external-clojure-editor-as-ide].

### Get ready for the activity

#### Clone the repository

```bash
git clone git@github.com:diegosanchez/bob-2021--combining-clojure-spec-with-design-recipes.git bob-2021
```

#### Change directory

```bash
cd bob-2021
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

For the sake of simplicity:
- Money amounts are represented as integers.
- the Transaction record can only have one amount per transaction.
- we have published a plausible solution (definitely, not the only possible one!) on branch`solution/aPossibleOne`.

---

Possible use cases include:

- [ ] If the user has to pay 10, and his/her card balance is 100, then the payment is accomplished. Then, the card has a new record with -10 and the balance is 90.

- [ ] If the user has to pay 20, and his/her card balance is 10, then the payment is not accomplished. There is neither a new record nor a balance change. 

<!--- The new requirement it's hidden on purpose 

- [ ] If the user has to pay 27, and his/her card balance is 20 with a possible overdraft of 10, then the payment is accomplished. Then, the card has a new record with -27 and the balance is -7.

-->

### Helpful tasks

Some common tasks below.

| Task               | Command                                         |
|--------------------|-------------------------------------------------|
| Run all tests      | `clojure -M:test:runner`                        |
| Run unstable tests | `clojure -M:test:runner -i, --include unstable` |
| Run stable tests   | `clojure -M:test:runner -e, --exclude unstable` |
| Run the use case   | `clojure -X:use-case`                           |

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

## License

Copyright © 2021, Diego Sánchez and Leandro Doctors.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.

Additional permission under GNU AGPL version 3 section 7:

If you modify this Program, or any covered work, by linking or combining
it with Clojure (or a modified version of that library), containing parts
covered under the same terms as Clojure (currently, the Eclipse Public
License version 1.0), the licensors of this Program grant you additional
permission to convey the resulting work. Corresponding Source for a
non-source form of such a combination shall include the source code for
the parts of Clojure used as well as that of the covered work.
