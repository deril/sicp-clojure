(defn make-center-persent [avr persent]
  (make-interval (- (* avr (/ persent 100) arv)) (+ (* avr (/ persent 100)))))
(defn percent [i]
   (* 100 (/ (- (upper-bound i) (lower-bound i)) (+ (upper-bound i) (lower-bound i)))))
