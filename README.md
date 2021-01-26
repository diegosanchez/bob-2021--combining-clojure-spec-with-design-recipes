# Combining clojure.spec with design recipes

## Abstract

We share a method to systematically and comprehensively evolve a domain model, complementing use cases and “design recipes” with (clojure.spec-based) specifications. This approach facilitates finding inaccuracies at the edges of our in-growth domain, allowing us to: 1) supersede the de facto “tinker until it works” standard with a systematic “define-specify-verify (repeat)” cycle; and 2) complement the traditional mitigation of both internal and parameter validation errors.

Our approach combines the use of “design recipes”, use cases and “à la xDD” examples with (clojure.spec-based) specifications. The use of “design recipes” allows us to be systematic, while the usage of example-based use cases provide a comprehensive understanding of the domain. And when adding specifications to the mix, we end up empowered to verify compliance both at compile-time and at run-time.

This combination allows us to:

- move from a “tinker until it works” process to a “define-specify-verify (repeat)” cycle,
- find mistakes at the domain’s edge,
- count with specification-based generative tests, and
- automatic, specification-based documentation for the domain model

This approach is based on combining the main ideas of two books: [How to Design Programs][htdp] (Felleisen et. al.) , and [Domain Modeling made Functional][fsharpfor] (Wlaschin).

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


## Misc

### Useful Links

[What are the Clojure Tools (clojure, clj, etc.)?](https://betweentwoparens.com/what-are-the-clojure-tools)

[htdp]: https://htdp.org/
[fsharpfor]: https://fsharpforfunandprofit.com/books/
[bear-emacs]: https://www.gnu.org/software/emacs/download.html
[spacemac]: https://www.spacemacs.org/
[clojure-version]: https://clojure.org/guides/getting_started
[clojure-tool]: https://clojure.org/community/tools
