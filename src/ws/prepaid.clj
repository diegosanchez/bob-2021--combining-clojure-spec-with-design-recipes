(ns ws.prepaid)


;; We will design the function that represents the use-case: Paid a ride.

;; The delivery mechanism invokes the function `paid-ride` using the arguments
;; described by the alias `use-case` at the `deps.edn` file.

;; If you need to add extrea arguments for the `paid-ride` function the we need
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
;; Step 0: After analysis we decide to implement the function `paid-ride`
;; 

(defn paid-ride
  [arg1 arg2]
  (prn arg1 arg2))
  
