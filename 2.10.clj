(defn div-interval [x y]
  (if (<= (* (lower-bound y) (upper-bound y)) 0)
    (throw (Exception. "Division by interval that spans zero")))
  (mul-interval x
                (make-interval (/ 1.0 (upper-bound y))
                               (/ 1.0 (lower-bound y)))))
