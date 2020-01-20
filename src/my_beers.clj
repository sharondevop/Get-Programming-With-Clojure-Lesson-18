(ns my-beers)

;; Number,Number,Number -> String
(defn most-beer [american brit frenchman]
  (cond
    (and (> american brit) (> american frenchman)) (str "American")
    (and (> brit american) (> brit frenchman)) (str "Brit")
    (and (> frenchman american) (> frenchman brit)) (str "Frenchman")))

;; String,Number,Number,Number -> String
(defn most-beer-and-quantity [nationality x y z]
  (cond
    (= nationality "American") (str "The winner is American, he drank " x " ml.")
    (= nationality "Brit") (str "The winner is Brit, he drank " y " ml.")
    (= nationality "Frenchman") (str "The winner is Frenchman, he drank " z " ml.")))

;; String,Number,Number,Number -> String
(defn display [mode x y z]
  (cond
    (= mode "most-drunk") (println (most-beer x y z))
    (= mode "winner-and-quantity") (println (most-beer-and-quantity (most-beer x y z) x y z))
    true (println (str "Error: The mode " mode " is not supported."))))


;; String,String,String,String -> String
(defn -main [mode cans pints demis]
  (display mode (* 591 (read-string cans)) (* 473 (read-string pints))
           (* 500 (read-string demis))))

