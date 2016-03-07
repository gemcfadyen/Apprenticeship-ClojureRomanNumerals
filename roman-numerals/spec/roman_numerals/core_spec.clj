(ns roman-numerals.core-spec
  (:require [speclj.core :refer :all]
            [roman-numerals.core :refer :all]))

(describe "Roman Numeral Converter"
          (it "converts 1 to I"
              (should= "I" (converts 1)))

          (it "converts 5 to V"
              (should= "V" (converts 5)))

          (it "converts 10 to X"
              (should= "X" (converts 10)))
          )
