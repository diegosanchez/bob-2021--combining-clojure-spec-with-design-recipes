(ns ws.prepaid)


;; We will design the function that represents the use-case: Paid a ride.

;; The delivery mechanism invokes the function `paid-ride` using the arguments
;; described by the alias `use-case` at the `deps.edn` file.

;; If you need to add extrea arguments for the `paid-ride` function the we need
;; to update the file `delivery.clj` to map the keys to function arguments.

;; For the shake of simplicity let's write our whole code in this file `prepaid.clj`.



;; Write your code here!



(defn paid-ride
  [arg1 arg2]
  (prn arg1 arg2))
  
