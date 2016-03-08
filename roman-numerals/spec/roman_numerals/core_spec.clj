(ns roman-numerals.core-spec
  (:require [speclj.core :refer :all]
            [roman-numerals.core :refer :all]))

(describe "Roman Numeral Converter"
          (it "convert 0 to empty string"
              (should= "" (convert 0)))

          (it "convert 1 to I"
              (should= "I" (convert 1)))

          (it "convert 2 to II"
              (should= "II" (convert 2)))

          (it "convert 3 to III"
              (should= "III" (convert 3)))

          (it "convert 4 to IV"
              (should= "IV" (convert 4)))

          (it "convert 5 to V"
              (should= "V" (convert 5)))

          (it "convert 6 to VI"
              (should= "VI" (convert 6)))

          (it "convert 9 to IX"
              (should= "IX" (convert 9)))

          (it "convert 10 to X"
              (should= "X" (convert 10)))

          (it "convert 50 to L"
              (should= "L" (convert 50)))

          (it "convert 90 to XC"
              (should= "XC" (convert 90)))

          (it "convert 100 to C"
              (should= "C" (convert 100)))

          (it "convert 900 to CM"
              (should= "CM" (convert 900)))

          (it "convert 1000 to M"
              (should= "M" (convert 1000)))

          (it "convert 3999 to MMMCMXCIX"
              (should= "MMMCMXCIX" (convert 3999)))
          )
