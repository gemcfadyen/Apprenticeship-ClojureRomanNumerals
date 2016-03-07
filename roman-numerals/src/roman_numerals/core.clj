(ns roman-numerals.core)

(def roman-numerals {10 "X" 5 "V" 1 "I"})

(defn converts [arabic]
  (apply str (map
   (fn [a]
    (if (>= arabic (key a))
      (val a)
      ""
      )) roman-numerals))

  ;;  (cond
  ;;    (contains? romanNumerals arabic) (get romanNumerals arabic)
  ;;    (= arabic 2) "II"
  ;;    (= arabic 3) "III"
  ;;    (= arabic 6) "VI"
  ;;   )
  )
