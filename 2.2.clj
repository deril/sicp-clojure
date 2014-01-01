(defn make-point [x-point y-point]
  (list x-point y-point))
(defn make-segment [start-segment end-segment]
  (list start-segment end-segment))
(defn x-point [point]
  (first point))
(defn y-point [point]
  (first (rest point)))
(defn start-segment [segment]
  (first segment))
(defn end-segment [segment]
  (first (rest segment)))
(defn midpoint-segment [segment]
  (let [start-seg (start-segment segment)
        end-seg (end-segment segment)]
    (make-point 
      (/ (+ (x-point start-seg) (x-point end-seg)) 2.0)
      (/ (+ (y-point start-seg) (y-point end-seg)) 2.0))))
