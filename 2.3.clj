(defn abs [n] (if (< n 0) (- n) n))
(defn x-point [point]
  (first point))
(defn y-point [point]
  (first (rest point)))
; перше представлення
(defn make-rect [topleft bottomright]
  (list topleft bottomright))
(defn topleft [rect]
  (first rect))
(defn bottomright [rect]
  (first (rest rect)))
(defn length-rect [rect]
  (abs (- (x-point (topleft rect))
          (x-point (bottomright rect)))))
(defn width-rect [rect]
  (abs (- (y-point (topleft rect))
          (y-point (bottomright rect)))))
; друге представлення
(defn make-rect [topleft length width]
  (list topleft length width))
(defn length-rect [rect] (first (rest rect)))
(defn width-rect [rect] (first (rest (rest rect))))

(defn perimeter [rect]
  (* 2 (+ (length-rect rect) (width-rect rect))))
(defn area [rect]
  (* (length-rect rect) (width-rect (rect))))
