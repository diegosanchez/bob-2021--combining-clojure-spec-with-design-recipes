(ns ws.delivery
  (:require [ws.prepaid :refer :all]))


(defn main
  [args]
  (println "Entry point for testing the use case from CLI...")
  (print "Args: ")
  (prn args)
  (println "Calling use case...")
  ;;
  ;; The arguments are described at the 'deps.edn' file under the 'use-case' alias.
  ;;
  (paid-ride
   (:key-simple args)
   (:key-map-value args)))
