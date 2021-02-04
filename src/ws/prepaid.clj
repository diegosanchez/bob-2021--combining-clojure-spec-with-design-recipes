(ns ws.prepaid
  (:require [clojure.spec.alpha :as s]))


;; We will design the function that represents the use-case: Paid a ride.

;; The delivery mechanism invokes the function `pay-ride` using the arguments
;; described by the alias `use-case` at the `deps.edn` file.

;; If you need to add extrea arguments for the `pay-ride` function the we need
;; to update the file `delivery.clj` to map the keys to function arguments.

;; For the shake of simplicity let's write our whole code in this file `prepaid.clj`.



;; Write your code here!

;;
;; Quote from HdP - 3.1 Designing Functions:
;;
;; "The Design Process: Once you understand how to represent input information as data and
;; to interpret output data as information, the design of an individual function proceeds
;; according to a straightforward process:"
;;
;; Step 0: After analysis we decide to implement the function `pay-ride`
;; 

;;
;; Quote from HdP - 3.1 Designing Functions:
;;
;; "Express how you wish to represent information as data. A one-line comment suffices:
;;
;;    'We use numbers to represent centimeters.'
;;
;; Formulate data definitions, like the one for Temperature, for the classes of data you consider critical for the success of your program."
;;
;; Step 1:
;;  - What is the purpose of the function?
;;    The function responses `true` if there is enough money to pay the ride (balance)
;;  - Which arguments the function  receives?
;;    Entities come up: card, ride-cost, trx
;;  - What is the result or the returned value?
;;    Entity: result
;;

(s/def ::overdraft
  pos-int?)

(def trx-min-value 500)
(def trx-max-value 5000)

;;
;; Iteraction 2
;;
;; (s/def ::ride-cost
;;   pos-int?)
(s/def ::ride-cost
  (s/int-in 0 trx-min-value))

;;
;; A way to exercise your definition. The same code snippet can be applied for each `s/def`.
;;
(comment
  (require '[clojure.spec.gen.alpha :as gen])
  (require '[clojure.spec.alpha :as s])

  (gen/sample (s/gen ::ride-cost)))

;;
;; Iteration 1:
;;
;; (s/def ::trx
;;   int?)

;;
;; Iteration 2:
;;
(s/def ::trx
  ;; int?
  (s/int-in (- trx-min-value) trx-max-value))

(s/def ::transactions
  (s/coll-of ::trx))

(s/def ::card
  (s/keys
   :req-un [::overdraft ::transactions]))

(comment
  (require '[clojure.spec.gen.alpha :as gen])
  (require '[clojure.spec.alpha :as s])

  (gen/sample (s/gen ::card)))

(s/def ::status
  boolean?)

(s/def ::result
  (s/keys
   :req-un [::card ::status]))

;;
;; Quote from HdP - 3.1 Designing Functions:
;;
;; "Write down a signature, a statement of purpose, and a function header."
;;
;; Step 2:
;;  - Whay is the function signature?
;;  - What does the function compute?
;;
;; (defn pay-ride
;;   "Returns true if the card's balance is equal or bigger than the ride-cost"
;;   [card ride-cost]
;;   false)
;;

;;
;; Quote from HdP - 3.1 Designing Functions:
;;
;; "Illustrate the signature and the purpose statement with some functional examples. To construct a functional example, pick one piece of data from each input class from the signature and determine what you expect back"
;;
;; Step 3:
;;  Example 1
;;   - card.transactions: [100]
;;   - raid-cost: 10
;;   - result: true
;;
;; NOTE: You optionally could write a test for this scenario. Please, be patient... We will do it at Step 6.
;;

;;
;; Quote from HdP - 3.1 Designing Functions:
;;
;; "The next step is to take inventory, to understand what are the givens and what we need to compute. For the simple functions we are considering right now, we know that they are given data via parameters. While parameters are placeholders for values that we don’t know yet, we do know that it is from this unknown data that the function must compute its result. To remind ourselves of this fact, we replace the function’s body with a template.""
;;
;; Step 4:
;;
;; (defn pay-raid
;;   [card raid-cost]
;;   (... card ... raid-cost...))
;;

;;
;; Quote from HdP - 3.1 Designing Functions:
;;
;; "It is now time to code. In general, to code means to program, though often in the narrowest possible way, namely, to write executable expressions and function definitions."
;;
;; Step 5: Yeah! Let's Code
;;
;;

;;
;; Quote from HdP - 3.1 Designing Functions:
;;
;; "The last step of a proper design is to test the function on the examples that you worked out before..."
;;
;; Step 6:
;;  - What happend with the tests?
;;  - Are there failing tests? Which one?
;;
;; NOTE: Write a tests for the cases depicted at the stage 3
;;

(defn trx-create
  [value]
  value)

(defn trx-create-lst
  [values]
  (map trx-create values))

(defn card-create-with-overdraft
  [initial-balance overdraft & trxs]
  {:overdraft overdraft
   :transactions (trx-create-lst
                  (concat [initial-balance] trxs))})

(defn card-create
  [initial-balance & trxs]
  {:overdraft 0
   :transactions (trx-create-lst
                  (concat [initial-balance] trxs))})

(defn card-consume-credit
  [card amount]
  {:overdraft (:overdraft card)
   :transactions
   (concat [(- amount)] (:transactions card))})

(defn card-balance
  [card]
  (reduce + (:transactions card)))

(defn card-ride-is-affordable?
  [card ride-cost]
  (< ride-cost
     (+ (card-balance card)
        (:overdraft card))))

(defn pay-ride
  [card ride-cost]
  {:card (card-consume-credit card ride-cost)
   :status (card-ride-is-affordable? card ride-cost)})

(s/fdef pay-ride
  :args (s/cat :card ::card
               :ride-cost ::ride-cost)
  :ret ::result)

(comment
  (require '[clojure.spec.test.alpha :as stest])

  (stest/abbrev-result (first (stest/check `pay-ride)))
  ;; => {:sym ws.prepaid/pay-ride}

  (stest/check `pay-ride)
  ;; => ({:spec
  ;;      #object[clojure.spec.alpha$fspec_impl$reify__2524 0x1c3549d "clojure.spec.alpha$fspec_impl$reify__2524@1c3549d"],
  ;;      :clojure.spec.test.check/ret
  ;;      {:result true,
  ;;       :pass? true,
  ;;       :num-tests 1000,
  ;;       :time-elapsed-ms 79,
  ;;       :seed 1612384926073},
  ;;      :sym ws.prepaid/pay-ride}))

  (stest/summarize-results (stest/check `pay-ride))
  ;; => {:total 1, :check-passed 1}
  )

 
