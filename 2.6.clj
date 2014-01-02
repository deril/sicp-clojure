(def one
  (fn [f] (fn [x] (f x))))
(def two
  (fn [f] (fn [x] (f (f x)))))
(defn + [a b]
  (fn [f] (fn [x] (f ((a f) ((b f) x))))))
