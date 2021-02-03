(ns ws.prepaid-test
  (:require [clojure.test :refer :all]
            [clojure.spec.test.alpha :as stest]
            [ws.prepaid :refer :all]))

(deftest a-test
  (testing "[stable] FIXME, I fail."
    (is (= 0 0))))

(deftest success-pay-ride
  (testing "success pay of 10 having a balance of 100"
    (is (= true
           (pay-ride (create-card 100) 10)))))

(deftest ^:unstable b-test
  (testing "[unstable] FIXME, I fail."
    (is (= 0 0))))

(deftest ^:unstable exercise-pay-ride
  (is (= {:total 1, :check-passed 1}
         (stest/summarize-results (stest/check `pay-ride)))))

