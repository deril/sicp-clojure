(defn for-each [proc items]
  (proc (first items))
  (if (empty? items)
    true
    (for-each proc (rest items))))
