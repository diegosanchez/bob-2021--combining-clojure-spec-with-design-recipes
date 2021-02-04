# Combining clojure.spec with design recipes

_(Note: Each `####` marks the beginning of one slide.)_

## Why are we here?

- To try gaining some insights from combining an approach (DDD), a technique (SSD), and a tooling library (clojure.spec).
  Nothing more, nothing less.

## Disclaimer

- Please take this tutorial with a grain of salt. We are not dogmatic/orthodox.
- Avoid focusing on the language or the tools we use: there are other combinations to achieve similar results.
_(There are clojure.spec ports to other languages (Ruby, Python, JavaScript...) with varying degree of maturity.)__
- This is **not** a clojure.spec tutorial (we are not clojure.spec experts). There may be a few glitches in our code. Please, bear with us.

## Background

### Systematic Software Design

#### How could we Approach Programming?

- "Tinker Until It Works"
(What we usually do.)

1. (While True): Tinker
2. (When it works):
 - "It WORKS!!"
3. GOTO 1.

_(Does this actually work? Not really...)_

_("Is there any other way?")_

#### _Systematic_ Software Design

#### _Systematic_ Software Design?

#### _Systematic_ Software Design!

- systematic thought, planning, and understanding.
- from the very beginning, at every stage, and for every step.

#### Systematic Software Design

- Design Recipes (The Scope of this Tutorial)
- Iterative Refinement (Out of the Scope of this Tutorial)

#### Design Recipes

- Many Recipes
  - Programs
    - Interactive (GUI/TUI)
    - Batch (Input --> Output)
  - Functions
- One Common Design Process

(What's New here? --> **Intermediate products** for beginner-level programs)

#### Design Recipes: (Generic) Steps

1. Problem Analysis --> Data Definitions
2. Signature, Purpose Statement, Header
3. Examples
4. Template
5. Definition (Code)
6. Testing

#### Designing a Function in Clojure

(Example taken from HTDP, Section 3.1)

0. Problem statement

Compute the area of a square.

1. Problem Analysis --> Data Definitions

```clojure
    ;; We will use numbers to represent the square's side length.
```

2. Signature, Purpose Statement, Header

```clojure
;; Number --> Number
;; Compute the area of a square with side len.
(defn area-of-square
  [len]
  ...)
```

3. Examples

```clojure
;; given: 2, expect: 4
;; given: 7, expect: 49
```

4. Template

```clojure
(defn area-of-square
  [len]
  (... len ...))
```

5. Definition (Code)

```clojure
(defn area-of-square
  [len]
  "compute the area of a square of side `len`."
  (* len len))
```

6. Testing

```clojure
(is (= 4 (area-of-square 2)) "A square of side 2 should have an area of 4.")
(is (= 49 (area-of-square 7)) "A square of side 7 should have an area of 49.")
```

### Domain-Driven Design (Domain Modeling made Functional)

### Software Specification (clojure.spec)

#### Designing a Function in Clojure, revisited (with clojure.spec)

0. Problem statement (no changes)

Compute the area of a square.

1. Problem Analysis --> Data Definitions (no changes)

```clojure
    ;; We will use numbers to represent the square's side length.
```

2. Signature, Purpose Statement, Header (changes significantly!)

```clojure
;; Number --> Number

(s/def ::lenght
  nat-int?)

(s/fdef area-of-square
  :args :len ::lenght
  :ret ::lenght
  :fn (= :ret (* :len :len)))

;; Compute the area of a square with side len.

(defn area-of-square
  [len]
  ...)
```

3. Examples (no changes)

```clojure
;; given: 2, expect: 4
;; given: 7, expect: 49
```

4. Template (no changes)

```clojure
(defn area-of-square
  [len]
  (... len ...))
```

5. Definition (Code - no changes)

```clojure
(defn area-of-square
  [len]
  "compute the area of a square of side `len`."
  (* len len))
```

6. Testing (TODO: use generative testing)

## Our Problem

## Solving the Problem

### What have we learned so far?

## Our Problem, Revisited

### What have we learned today?

## Conclusions

## References

## More Information
