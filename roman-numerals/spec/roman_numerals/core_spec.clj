(ns roman-numerals.core-spec
  (:require [speclj.core :refer :all]
            [roman-numerals.core :refer :all]))

(describe "Roman Numeral Converter"
          (it "converts 0 to empty string"
              (should= "" (converts 0)))

          (it "converts 1 to I"
              (should= "I" (converts 1)))

          (it "converts 2 to II"
              (should= "II" (converts 2)))

          (it "converts 3 to III"
              (should= "III" (converts 3)))

          (it "converts 4 to IV"
              (should= "IV" (converts 4)))

          (it "converts 5 to V"
              (should= "V" (converts 5)))

          (it "converts 6 to VI"
              (should= "VI" (converts 6)))

          (it "converts 9 to IX"
              (should= "IX" (converts 9)))

          (it "converts 10 to X"
              (should= "X" (converts 10)))

          (it "converts 50 to L"
              (should= "L" (converts 50)))

          (it "converts 90 to XC"
              (should= "XC" (converts 90)))

          (it "converts 100 to C"
              (should= "C" (converts 100)))

          (it "converts 900 to CM"
              (should= "CM" (converts 900)))

          (it "converts 1000 to M"
              (should= "M" (converts 1000)))

          (it "converts 3999 to MMMCMXCIX"
              (should= "MMMCMXCIX" (converts 3999)))
          )
