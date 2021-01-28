# Combining clojure.spec with design recipes ![CI status](https://github.com/diegosanchez/bob-combining-clojure-spec-with-design-recipes/workflows/tools.deps-builder/badge.svg)

## Index

- [Context](#context)
- [Workshop](#workshop)
  - [Expected Results](#expected-results)
  - [Concepts to Explore](#concepts-to-explore)
  - [Agenda](#agenda)
  - [Prerequisites](#prerequisites)
    - [Getting the code](#getting-the-code)
    - [Setting up the development environment](#setting-up-the-development-environment)
  - [Working with the code](#working-with-the-code)

## Context

[Combining clojure.spec with design recipes](https://bobkonf.de/2021/sanchez-doctors.html)

This approach is based on combining the main ideas of two books:
- [How to Design Programs: An Introduction to Programming and Computing, 2nd Ed. (Felleisen, Findler, Flatt, & Krishnamurthi)](https://htdp.org/), and
- [Domain Modeling made Functional (Wlaschin)](https://fsharpforfunandprofit.com/books/).

## Workshop

<!-- ### What to Expect

### Obtained Benefits

### "Esto es lo que van a descubrir (pero sin decirlo)".

### Results to be Expected (Diego)

### Learning Objectives
 -->
### Expected Results

- Detection of underlying logical inconsistencies and incoherencies within our domain model (both within and across its entities) *during the data specification step*.
<!--
(The) Domain Model > The whole Set of Entities
 -->
-  Automated and comprehensive enforcing of properties across the whole domain model *during the specification process*.
- Comprehensive verification of inferred-but-not-explicit properties across the domain model. <!-- that would normally be detected only after the system has gone into staging/production --> _(E.g.: trx vs. ride-cost.)_
- Automated generation of test data for function exercising.

### Concepts to Explore

- Design Recipes
- Domain Driven Design (DDD)
  - Core domain (ex.: card, trx., overdraft, etc)
  - Application services (ex.: pay ride with the prepaid card)
  - Delivery mechanism
- Domain Model Specifications
- Functional Programming
  - Referential Transparency

### Agenda (placeholder)

1. Problem statement (5 min)
2. Coding (30 - 40 min)
3. Retrospective (until the rest)

### Prerequisites

- a Clojure development environment already setup (so you are able to work with the code)
- a copy of this repo (so you have the code to work with)
- an Internet connection (so you can ask questions)

#### Getting the code

0. Ask for permission to access the repo

1. Clone this repo

```shell
        git clone git@github.com:diegosanchez/bob-combining-clojure-spec-with-design-recipes.git
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
Run tests 	clojure -M:test/runner 	User/Project alias
Run the project 	clojure -M -m domain.main-namespace 	Built-in
