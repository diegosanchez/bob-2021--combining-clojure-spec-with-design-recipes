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

### What are the results we do expect?

- Sharing a way of leveraging design recipes and Domain Driven Design (DDD) with `clojure.spec`.
<!-- Generación automatica datos de prueba para la ejercitación de funciones. -->
- Exercising functions using data generation based on the spec.
<!-- Detección de inconsistencias lógicas intra-entitarias e inter-entitarias del modelo durante el proceso de especificación de datos, evitando la propagación de errores. -->
- Detecting the logical incoherences inter/between entities from the model, during the specification process. It mitigates the errors propagation. 
<!-- Enforcing automático de las propiedades de las entidades durante el proceso de especificación. _(Las entidades son descriptas a través del modelo de datos.)_ -->
-  Enforcing the entities' properties automatically, during the specification process.
<!-- Verificación exhaustiva de parámetros inferidos pero no explicitados. Ej.: trx vs. ride-cost. -->
- Verifying comprehensively the inferring but not explicit entities' properties.
<!-- Evidencia relaciones implicitas entre entidades (ride-cost, trx) evitando la propagación de erroes que solo se detectan en la puesta en producción/staging. -->
- Revealing the entities' implicit relationships, which prevents the error propagation.

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
