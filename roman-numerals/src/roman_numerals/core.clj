(ns roman-numerals.core)
(def arabics [1000 900 100 90 50 10 9 5 4 1])
(def romans ["M" "CM" "C" "XC" "L" "X" "IX" "V" "IV" "I"])

(defn- calculate [result arabic romans arabics]
  (let [[roman-head & roman-tail] romans
        [arabic-head & arabic-tail] arabics]

    (if (= 0 arabic)
      result

      (if (>= arabic arabic-head)
        (calculate (str result roman-head) (- arabic arabic-head) romans arabics)
        (calculate result arabic roman-tail arabic-tail)))))

(defn convert [arabic]
  (calculate "" arabic romans arabics))
