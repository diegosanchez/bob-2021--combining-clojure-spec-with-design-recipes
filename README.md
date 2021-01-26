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

### Concepts to be explored during the activity

- How to design programs
  - Recipes
- Domain driven design (DDD)
  - Core domain (ex.: card, trx., overdraft, etc)
  - Application services (ex.: pay ride with the prepaid card)
  - Delivery mechanism 
- Functional programming
  - Referential transparency

### Perceived benefits of adopting property-based specification and testing (for us :)

In general, we were able to improve the quality of our feedback loop. It could start sooner (at the data specification stage), and we could get new explicit, specific and actionable feedback. All this results in less error propagation to later stages in the development process. 

In some cases, the errors prevented in this way would normally be detected only after the system has gone into staging/production.

More specifically:

- Automatic Generation of Test Data for excercising Functions during development.
- Detection of underlying Logical Inconsitencies and Incoherences within our Model (both within and across its Entities) *during the data specification step*.
-  Automatic Enforcing of properties (not only of the Entities, but also of the Data Model) *during the specification process.*
- Comprehensive Verification of inferred-but-not-explicitated properties of the Entities. This can also result in the revelation of implicit relationships across Entities that would normally be detected only after the system has gone into staging/production.__(E.g.: trx vs. ride-cost.)_


### Toolbox

| Tools   | Version  | Installation                    |
| --:     | :------: | ----------------                |
| clojure | 1.10.1   | [Clojure docs][clojure-version] |
| IDE     | dna      | [Clojure tools][clojure-tool]   |


## Misc

### Helpful links

[What are the Clojure Tools (clojure, clj, etc.)?](https://betweentwoparens.com/what-are-the-clojure-tools)

[htdp]: https://htdp.org/
[fsharpfor]: https://fsharpforfunandprofit.com/books/
[bear-emacs]: https://www.gnu.org/software/emacs/download.html
[spacemac]: https://www.spacemacs.org/
[clojure-version]: https://clojure.org/guides/getting_started
[clojure-tool]: https://clojure.org/community/tools
