(ns roman-numerals.core)

(def romanNumerals {1 "I" 5 "V" 10 "X"})

(defn converts [arabic]
  (cond
    (contains? romanNumerals arabic) (get romanNumerals arabic)
    (= arabic 2) "II"
    (= arabic 3) "III"
    )
  )
