(ns roman-numerals.core)

(def arabics [10 5 4 1 ])
(def romans ["X" "V" "IV" "I"])

(defn- calculate [result arabic romans arabics]

  (if (= 0 arabic)
    result

    ;; first each entry in arabics, find entry >= 'arabic'
    ;; append the romans equiv to result
    ;; deduct arabic entry found in step 1 from 'arabic'
    ;; call calculate again result+roman, arabic - val, romans arabics
    (if (>= arabic (first arabics))
      (calculate (str result (first romans)) (- arabic (first arabics)) romans arabics)
      (calculate result arabic (rest romans) (rest arabics)))

    ;; else
    ;; skip onto the next entry in arabics
    ;; call calculate result arabic tail-of romans, tail-of arabics
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


