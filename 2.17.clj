(defn last-pair [l]
  (if (nil? (seq (rest l)))
    (first l)
    (last-pair (rest l))))
; alternative
(defn last-pair [l] (last l))
