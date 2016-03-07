(ns roman-numerals.core)

(defn converts [arabic]
  (cond
    (= 1 arabic) "I"
    (= 5 arabic) "V"
    (= 10 arabic) "X"
    )
  )
