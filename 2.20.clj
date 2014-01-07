(defn same-parity [& args]
  (defn parity-iter [filt l res]
    (cond (empty? l) res
          (filt (first l)) (recur filt (rest l) (cons (first l) res))
          :else (recur filt (rest l) res)))
  (if (even? (first args))
    (parity-iter even? args '())
    (parity-iter odd? args '())))
