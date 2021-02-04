(ns ws.prepaid-test
  (:require [clojure.test :refer :all]
            [clojure.spec.test.alpha :as stest]
            [ws.prepaid :refer :all]))

(deftest a-test
  (testing "[stable] FIXME, I fail."
    (is (= 0 0))))

(deftest success-pay-ride
  (testing "success pay of 10 having a balance of 100"
    (is
     (:status (pay-ride (card-create 100) 10))))
  (testing "success pay of 10 having a balance of 90 after paing a ride of 20"
    (is
     (:status (pay-ride (card-create 100 -20) 10)))))

(deftest failing-pay-ride
  (testing "failing pay of 110 having a balance of 100"
    (is (not
         (:status (pay-ride (card-create 100) 110)))))
  (testing "failing pay of 10 having a balance of 100 after paing a ride of 95"
    (is (not
         (:status (pay-ride (card-create 100 -95) 10))))))

(deftest ^:unstable b-test
  (testing "[unstable] FIXME, I fail."
    (is (= 0 0))))

(deftest ^:unstable exercise-pay-ride
  (is (= {:total 1, :check-passed 1}
         (stest/summarize-results (stest/check `pay-ride)))))

