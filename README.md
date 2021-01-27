[![ci status](https://circleci.com/gh/diegosanchez/bob-combining-clojure-spec-with-design-recipes.svg?style=shield)](https://app.circleci.com/pipelines/github/diegosanchez/bob-combining-clojure-spec-with-design-recipes)

# Combining clojure.spec with design recipes

## Index 

- [Context](#context)
- [Workshop](#workshop)
  - [Expected Results](#expected-results)
  - [Concepts to Explore](#concepts-to-explore)
  - [Toolbox](#toolbok)
- [Misc](#misc)
  - [Useful Links](#useful-linksn)

## Context

[Combining clojure.spec with design recipes](https://bobkonf.de/2021/sanchez-doctors.html)

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

### Toolbox

| Tools   | Version  | Installation                    |
| --:     | :------: | ----------------                |
| clojure | 1.10.1   | [Clojure docs][clojure-version] |
| IDE     | dna      | [Clojure tools][clojure-tool]   |
| git     | 2.20.0   | [Git docs][git-docs]            |


## Misc

### Useful Links

[What are the Clojure Tools (clojure, clj, etc.)?](https://betweentwoparens.com/what-are-the-clojure-tools)

[htdp]: https://htdp.org/
[fsharpfor]: https://fsharpforfunandprofit.com/books/
[bear-emacs]: https://www.gnu.org/software/emacs/download.html
[spacemac]: https://www.spacemacs.org/
[clojure-version]: https://clojure.org/guides/getting_started
[clojure-tool]: https://clojure.org/community/tools
[git-docs]: https://git-scm.com/doc
