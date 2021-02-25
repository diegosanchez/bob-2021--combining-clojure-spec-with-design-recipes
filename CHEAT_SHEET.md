# Clojure cheat sheet for this workshop

The list of code snippets listed bellow were trimmed for the purpouse of this workshop. The exhaustive list of clojure.spec predicates can be found [spec.alpha][external-spec-alpha].

## Code snippets for REPL

IMPORTANT: The pieces of code are intended to be run at the REPL.

### Defining integer property

```clojure
(comment
  (require '[clojure.spec.alpha :as s])

  (s/def ::property-integer
    int?)

  ;; Having the specification of a property we can turn it into a generator...
  (s/gen ::property-integer)

  ;; After that we can get some samples...
  (require '[clojure.spec.gen.alpha :as gen])

  ;; Single instance
  (gen/generate (s/gen ::property-positive-integer))

  ;; Sampling
  (gen/sample (s/gen ::property-integer)))
```

The instance generation as well as the sampling can be applied to every property specification (`s/def ...`).

### Defining a positive integer 

```clojure
(comment
  (require '[clojure.spec.alpha :as s])
  (require '[clojure.spec.gen.alpha :as gen])

  (s/def ::property-positive-integer
    pos-int?)

  (gen/generate (s/gen ::property-positive-integer)))
```

### Defining a even integer 

```clojure
(comment
  (require '[clojure.spec.alpha :as s])

  (s/def ::property-even-integer 
    (s/and int? even?))

  (gen/generate (s/gen ::property-positive-integer)))


```

### Defining a divisible-by integer 

```clojure
(comment
  (require '[clojure.spec.alpha :as s])
  
  (defn divisible-by [n] #(zero? (mod % n)))

  (s/def ::property-integer-divisible-by-3
    (s/and int?
           #(> % 0)
           (divisible-by 3)))
  
  (gen/sample (s/gen ::property-integer-divisible-by-3)))
```

### Defining an integer from `min` to `max` value

```clojure
(comment
  (require '[clojure.spec.alpha :as s])

  (def min 5)
  (def max 10)
  
  (s/def ::property-integer-from-to
    (s/int-in min max))
  
  (gen/sample (s/gen ::property-integer-from-to)))
```

[external-spec-alpha]: https://clojure.github.io/spec.alpha/index.html
