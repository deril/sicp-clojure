(defn square-list [items]
  (if (empty? items)
    nil
    (cons (* 2 (first items))
          (square-list (rest items)))))
(defn square-list [items]
  (map #(* % %) items))
