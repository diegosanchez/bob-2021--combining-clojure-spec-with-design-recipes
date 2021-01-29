![CI status](https://github.com/diegosanchez/bob-combining-clojure-spec-with-design-recipes/workflows/tools.deps-builder/badge.svg)

# Combining clojure.spec with design recipes 

## IMPORTANT

**_Please, you should not fork the repository until the day of the workshop._**

## Index

- [Context](#context)
- [Workshop](#workshop)
  - [Prerequisites](#prerequisites)
  - [Working with the code](#working-with-the-code)
    - [Getting the code](#getting-the-code)
    - [Setting up the development environment](#setting-up-the-development-environment)
  - [Expected Results](#expected-results)
  - [Concepts to Explore](#concepts-to-explore)
  - [Agenda](#agenda)

## Context

[Combining clojure.spec with design recipes][external-bob]

## Workshop

### Prerequisites

- An [github][external-github] account.
- [Git][external-git] installed.
- [Clojure 1.10.2 + the Clojure CLI tools][external-clojure-installation] installed.
- Desire IDE already set up. [Editor as IDE][external-clojure-editor-as-ide].

### Agenda (placeholder)

1. (**5 min.**) - Problem statement
2. (**? min.**) - Playing with the code
3. (**2 min.**) - New feature statement 
2. (**? min.**) - Playing with the code
3. (**remaining time**) - Retrospective 

#### Get ready for the activity

0. Fork this repository. ([Forking][external-github-fork]).

1. Clone the forked repository

```bash
git clone git@github.com:<github-user>/bob-combining-clojure-spec-with-design-recipes.git
```

2. Run test

```bash
clojure -M:test/runner
```

Expected output:

```
Running tests in #{"test"}

Testing ws.prepaid-test

Ran 1 tests containing 1 assertions.
0 failures, 0 errors.
```

3. Invoke library 

```bash
clojure -X ws.prepaid/use-case :a 1 :b '"two"'
```

Expected output:

```
{:a 1, :b "two"} "Hello, World!"
```

### Helpful tasks

Some common tasks below.

| Task           | Command                                 | Configuration      |
|----------------|-----------------------------------------|--------------------|
| Run tests      | clojure -M:test/runner                  | User/Project alias |
| Invoke library | clojure -X ws.prepaid/use-case [<args>] | Built-in           |


### Expected Results

[Read more...](EXPECTED_RESULTS.md)

### Concepts to Explore

[Read more...](CONCEPTS_TO_EXPLORE.md)

## Misc

- [What are the Clojure Tools (clojure, clj, etc.)?][external-clojure-toolbox]

[external-clojure-installation]: https://clojure.org/guides/getting_started
[external-clojure-editor-as-ide]: https://clojure.org/community/tools
[external-clojure-toolbox]: https://betweentwoparens.com/what-are-the-clojure-tools
[external-git]: https://git-scm.com/doc
[external-github]: https://github.com/
[external-github-fork]: https://guides.github.com/activities/forking/
[external-bob]: https://bobkonf.de/2021/sanchez-doctors.html
