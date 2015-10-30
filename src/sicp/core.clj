(ns sicp.core)

;;; Exercise 1.1
;;; Below is a sequence of expressions.
;;; What is the result printed by the interpreter in response to each expression?
;;; Assume that the sequence is to be evaluated in the order in which it is presented.

10 ;; 10
(+ 5 3 4) ;; 12
(- 9 1) ;; 8
(/ 6 2) ;; 3
(+ (* 2 4) (- 4 6)) ;; 6
(def a 3) ;; #'sicp.core/a
(def b (+ a 1)) ;; #'sicp.core/b
(+ a b (* a b)) ;; 19
(= a b) ;; false
(if (and (> b a) (< b (* a b)))
  b
  a) ;; 4
(cond (= a 4) 6
      (= b 4) (+ 6 7 a)
      :else 25) ;; 16
(+ 2 (if (> b a) b a)) ;; 6
(* (cond (> a b) a
         (< a b) b
         "else" -1)
   (+ a 1)) ;; 16


;;; Exercise 1.2
;;; Translate the following expression into prefix form
(/ (+ 4 5 (- 2 (- 3 (+ 6 (/ 4 5)))))
   (* 3 (- 6 2) (- 2 7))) ;; -37/150


;;; Exercise 1.3
;;; Define a function that takes three numbers as arguments
;;; and returns the sum of the squares of the two larger numbers.
(defn sum-sq-lrgst [x y z]
  (reduce + (map #(* % %)
                 [(first (reverse (sort [x y z])))
                  (first (rest (reverse (sort [x y z]))))])))
