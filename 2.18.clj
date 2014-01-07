(defn reverse-my [l]
  (defn reverse-my-iter [l rl]
    (if (nil? (seq l))
      rl
      (reverse-my-iter (rest l) (cons (first l) rl))))
  (reverse-my-iter l '()))
