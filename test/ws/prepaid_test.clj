(ns ws.prepaid-test
  (:require [clojure.test :refer :all]
            [clojure.spec.test.alpha :as stest]
            [ws.prepaid :refer :all]))

(deftest a-test
  (testing "[stable] FIXME, I fail."
    (is (= 0 0))))

(deftest ^:unstable b-test
  (testing "[unstable] FIXME, I fail."
    (is (= 0 0))))

(deftest ^:unstable exercise-paid-ride
  (is (= {:total 1, :check-passed 1}
         (stest/summarize-results (stest/check `pay-ride)))))

