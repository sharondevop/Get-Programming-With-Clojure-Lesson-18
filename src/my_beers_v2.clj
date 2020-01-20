(ns my_beers_v2)

;; Number -> Number
;; american
(defn cans->ml [x]
  (* x 591))

;; Number -> Number
;; english
(defn pints->ml [x]
  (* x 473))

;; Number -> Number
;; french
(defn demis->ml [x]
  (* x 500))


;; Number,Number,Number -> String
(defn most-beer [cans pints demis]
  (cond
    (> (cans->ml cans) (max (pints->ml pints) (demis->ml demis)))
    "american"
    (> (pints->ml pints) (max (cans->ml cans) (demis->ml demis)))
    "english"
    (> (demis->ml demis) (max (cans->ml cans) (pints->ml pints)))
    "french"))

;; String,Number -> String
(defn winner-string [nationality milliliters]
  (str "The winner is " nationality ", he drank " milliliters " ml."))


;; Number,Number,Number -> String
(defn most-beer-and-quantity [cans pints demis]
  (case (most-beer cans pints demis)
    "american" (winner-string "american" (cans->ml cans))
    "english" (winner-string "english" (pints->ml pints))
    "french"  (winner-string "french" (demis->ml demis))
    "No-match"))


(defn display [mode cans pints demis]
    (case mode
      "most-drunk"  (println (most-beer cans pints demis))
      "winner-and-quantity" (println (most-beer-and-quantity cans pints demis))
      (println (str "Error: The mode " mode " is not supported."))))


;; String,String,String,String -> String
(defn -main [mode cans-str pints-str demis-str]
    (display mode
             (read-string cans-str)
             (read-string pints-str)
             (read-string demis-str)))
