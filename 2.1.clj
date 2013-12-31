(defn abs [n]
  (if (< n 0)
    (- n)
    n))
(defn gcd [a b]
  (if (= b 0)
    a
    (gcd b (rem a b))))
(defn make-rat [n d]
  (let [g (abs (gcd n d))]
    (if (< d 0)
      (list (* -1 (/ n g)) (* -1 (/ d g)))
      (list (/ n g) (/ d g)))))
