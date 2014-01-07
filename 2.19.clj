(defn first-denomination [coin]
  (first coin))
(defn expect-first-denomination [coin]
  (first (rest coin)))
(defn no-more? [l]
  (nil? (seq l)))
