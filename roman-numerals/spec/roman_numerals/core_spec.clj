(ns roman-numerals.core-spec
  (:require [speclj.core :refer :all]
            [roman-numerals.core :refer :all]))

(describe "Roman Numeral Converter"
  (it "converts 1 to I"
    (should= "I" (converts 1))))
