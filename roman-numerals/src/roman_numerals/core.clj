(ns roman-numerals.core)

(defn converts [arabic]
  (if (= 1 arabic)
    "I"
    "V")
  )
