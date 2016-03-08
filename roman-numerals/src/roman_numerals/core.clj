(ns roman-numerals.core)
(def arabics [1000 900 100 90 50 10 9 5 4 1])
(def romans ["M" "CM" "C" "XC" "L" "X" "IX" "V" "IV" "I"])

(defn- calculate [result arabic romans arabics]
  (if (= 0 arabic)
    result

    (if (>= arabic (first arabics))
      (calculate (str result (first romans)) (- arabic (first arabics)) romans arabics)
      (calculate result arabic (rest romans) (rest arabics)))))

(defn convert [arabic]
  (calculate "" arabic romans arabics))
