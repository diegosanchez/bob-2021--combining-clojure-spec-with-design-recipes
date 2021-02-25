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
  (gen/sample (s/gen ::property-integer))
  ;; => (-1 0 0 -1 0 0 -4 -3 26 -1)

)
```

The instance generation as well as the sampling can be applied to every property specification (`s/def ...`).

### Defining a positive integer 

```clojure
(comment
  (require '[clojure.spec.alpha :as s])
  (require '[clojure.spec.gen.alpha :as gen])

  (s/def ::property-positive-integer
    pos-int?)

  (gen/sample (s/gen ::property-positive-integer))
  ;; => (2 1 1 4 1 7 2 1 16 65)

  )
```

### Defining a even integer 

```clojure
(comment
  (require '[clojure.spec.alpha :as s])

  (s/def ::property-even-integer 
    (s/and int? even?))

  (gen/generate (s/gen ::property-even-integer))
  ;; => 15753438
  
  )
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
  
  (gen/sample (s/gen ::property-integer-divisible-by-3))
  ;; => (3 3 396 3 1638909 6 276 21 6 2826)

  )
```

### Defining an integer from `min` to `max` value

```clojure
(comment
  (require '[clojure.spec.alpha :as s])

  (def min 5)
  (def max 10)
  (s/def ::property-integer-from-to
    (s/int-in min max))
  
  (gen/sample (s/gen ::property-integer-from-to))
  ;; => (5 5 5 6 5 5 9 8 8 8)

  )
```

#### Defining a collection of strings

```clojure
(comment
  (require '[clojure.spec.alpha :as s])

  (s/def ::element
    string?)
  
  (s/def ::property-list-of-strings
    (s/coll-of ::element))
  
  (gen/sample (s/gen ::property-list-of-strings))
  ;; => (["" "" "" "" "" "" "" "" "" ""]
  ;;     ["" "f" "" "j" "5" "n" "" "b" "X" "" "" "k" "" ""]
  ;;     ["" "1" "F" "9B" "" "XE"]
  ;;     ["3LF" "" "" "" "33" "n39" "k" "j" "" "" "" "" "" "H4j"]
  ;;     ["Y31" "zE" "2P" "QA2G" "W99p" "" "" "90" "y"]
  ;;     ["0L"]
  ;;     ["E1e01" "y2g4"]
  ;;     ["Q4KujQ8"
  ;;      "6Rk"
  ;;      "c94"
  ;;      ""
  ;;      "6"
  ;;      "ELD9f8"
  ;;      "k70dm"
  ;;      "FeOy29s"
  ;;      "3hRf778"
  ;;      ""
  ;;      "Q9"
  ;;      "K"
  ;;      "309"
  ;;      "C0DAYJ"
  ;;      "JyH5"
  ;;      "55"
  ;;      "T"]
  ;;     []
  ;;     ["2" "a76" "M" "oxJ8VZK" "x" "B80cf6rK" "2" "M"])

  )
```

#### Defining a map

```clojure
(comment
  (require '[clojure.spec.alpha :as s])

  (s/def ::key-first
    double?)

  (s/def ::key-second
    int?)

  (s/def ::key-shared
    string?)
  
  (s/def ::key-nested
    (s/keys
     :req-un [::key-shared]))
  
  (s/def ::property-map
    (s/keys
     :req-un [
              ::key-first
              ::key-second
              ::key-nested]))
  
  (gen/generate (s/gen ::property-map))
  ;; => {:key-first -10.545166015625,
  ;;     :key-second -2,
  ;;     :key-nested {:key-shared "bXrlH2o5ZirC9X2LoeL"}}
   
  (gen/sample (s/gen ::property-map)))
 ```
[external-spec-alpha]: https://clojure.github.io/spec.alpha/index.html
