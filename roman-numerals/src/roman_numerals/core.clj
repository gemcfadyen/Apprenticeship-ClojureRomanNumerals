(ns roman-numerals.core)

(def arabics [1000 900 100 90 50 10 9 5 4 1])
(def romans ["M" "CM" "C" "XC" "L" "X" "IX" "V" "IV" "I"])

(defn- calculate [result arabic romans arabics]

  (if (= 0 arabic)
    result

    ;; else
    ;; check the first entry in arabics
    ;; append the romans equiv to result
    ;; deduct arabic entry found in step 1 from 'arabic'
    ;; call calculate again result+roman, arabic - val, romans arabics

    ;; else
    ;; skip onto the next entry in arabics
    ;; call calculate result arabic tail-of romans, tail-of arabics

    (if (>= arabic (first arabics))
      (calculate (str result (first romans)) (- arabic (first arabics)) romans arabics)
      (calculate result arabic (rest romans) (rest arabics)))

    ))


(defn converts [arabic]
  (calculate "" arabic romans arabics)
  )


(defn xcalculate [tuple roman-result input]
  (if (>= input (key tuple))
    (conj roman-result (val tuple))
    (conj roman-result "")
    )
  )

(defn xconverts [arabic]
  (reduce
    (fn [roman-results decimal-val]
      (map
        (fn [a]
          (if (>= decimal-val (key a))
            (conj roman-results (val a))
            (conj roman-results "")
            ))) ) [""] [arabic])



  ;;  (cond
  ;;    (contains? romanNumerals arabic) (get romanNumerals arabic)
  ;;    (= arabic 2) "II"
  ;;    (= arabic 3) "III"
  ;;    (= arabic 6) "VI"
  ;;   )
  )


