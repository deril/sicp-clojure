(defn pow [base exp]
  (defn pow-iter [base counter product]
    (if (= counter 0)
      product
      (pow-iter base (- counter 1) (* base product))))
  (pow-iter base exp 1))
(defn factor [base value]
  (defn factor-iter [value counter]
    (if (= (rem value base) 0)
      (factor-iter (/ value base) (+ counter 1))
      counter))
  (factor-iter value 0))
(defn cons [a b]
  (* (pow 2 a) (pow 3 b)))
(defn car [z]
  (factor 2 z))
(defn cdr [z]
  (factor 3 z))
