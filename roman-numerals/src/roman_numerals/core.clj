(ns roman-numerals.core)

(def romanNumerals {1 "I" 5 "V" 10 "X"})

(defn converts [arabic]
  (get romanNumerals arabic)
)
