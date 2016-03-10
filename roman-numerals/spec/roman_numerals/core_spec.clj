(ns roman-numerals.core-spec
  (:require [speclj.core :refer :all]
            [roman-numerals.core :refer :all]))

(describe "Roman Numeral Converter"
          (it "converts 0 to empty string"
              (should= "" (convert 0)))

          (it "converts 1 to I"
              (should= "I" (convert 1)))

          (it "converts 2 to II"
              (should= "II" (convert 2)))

          (it "converts 3 to III"
              (should= "III" (convert 3)))

          (it "converts 4 to IV"
              (should= "IV" (convert 4)))

          (it "converts 5 to V"
              (should= "V" (convert 5)))

          (it "converts 6 to VI"
              (should= "VI" (convert 6)))

          (it "converts 9 to IX"
              (should= "IX" (convert 9)))

          (it "converts 10 to X"
              (should= "X" (convert 10)))

          (it "converts 50 to L"
              (should= "L" (convert 50)))

          (it "converts 90 to XC"
              (should= "XC" (convert 90)))

          (it "converts 100 to C"
              (should= "C" (convert 100)))

          (it "converts 900 to CM"
              (should= "CM" (convert 900)))

          (it "converts 1000 to M"
              (should= "M" (convert 1000)))

          (it "converts 3999 to MMMCMXCIX"
              (should= "MMMCMXCIX" (convert 3999)))
          )
