# Combining clojure.spec with design recipes ![CI status](https://github.com/diegosanchez/bob-combining-clojure-spec-with-design-recipes/workflows/tools.deps-builder/badge.svg)

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

[Combining clojure.spec with design recipes](https://bobkonf.de/2021/sanchez-doctors.html)

## Workshop

<!-- ### What to Expect

### Obtained Benefits

### "Esto es lo que van a descubrir (pero sin decirlo)".

### Results to be Expected (Diego)

### Learning Objectives
 -->
### Prerequisites

- Installed [Clojure 1.10.2 + the Clojure CLI tools][external-clojure-installation]
- Set up your favourite IDE for clojure. [Editor as IDE][external-clojure-editor-as-ide]

### Agenda (placeholder)

1. (**5 min.**) - Problem statement
2. (**? min.**) - Playing with the code
3. (**2 min.**) - New feature statement
2. (**? min.**) - Playing with the code
3. (**remaining time**) - Retrospective

#### Getting the code

0. Fork this repository ([Forking](https://guides.github.com/activities/forking/))

1. Clone this repo

```shell
        git clone git@github.com:<github-user>/bob-combining-clojure-spec-with-design-recipes.git
```

2. Checkout the branch `start-here`

```shell
        git branch start-here
```

#### Setting up the development environment

Our project is as tool-agnostic as possible. The only actual requirement is [Clojure 1.10.2 + the Clojure CLI tools](https://clojure.org/guides/getting_started). [What are the Clojure Tools (clojure, clj, etc.)?](https://betweentwoparens.com/what-are-the-clojure-tools)


Clojure requires a minimal Java development environment. We use and recommend the libre [OpenJDK](https://openjdk.java.net/). Depending on your OS, you may already have it installed.

- On GNU/Linux:
  - Debian-based distributions: `[sudo] apt install default-jdk`
  - Fedora-based distributions: `[sudo] dnf install java-11-openjdk-devel.x86_64`
- On FreeBSD: `pkg install openjdk11`
- On MacOS: (pending)
- On MS Windows: (pending)

You will also need [a Clojure-enabled text editor or IDE](https://clojure.org/community/tools).

#### Working with the code.

The project includes a `deps.edn` with all the necessary setup.
You can also use the model from https://github.com/practicalli/clojure-deps-edn

Some common tasks below.

| Task     | Command     | Configuration      |
|----------|-------------|--------------------|
Run tests |	clojure -M:test/runner |	User/Project alias
Run the project  |	clojure -M -m domain.main-namespace |	Built-in

### Expected Results

[doc](EXPECTED_RESULTS.md)

### Concepts to Explore

[doc](CONCEPTS_TO_EXPLORE.md)

## Misc

- [What are the Clojure Tools (clojure, clj, etc.)?][external-clojure-toolbox]

[external-clojure-installation]: https://clojure.org/guides/getting_started
[external-clojure-editor-as-ide]: https://clojure.org/community/tools
[external-clojure-toolbox]: https://betweentwoparens.com/what-are-the-clojure-tools
