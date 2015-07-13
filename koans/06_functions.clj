(defn multiply [x] (* 10 x))

(defn square [x] (* x x))

(= 81 (square 9))

(= 20 (multiply 2))

(= 20 ((fn [x] (* 10 x)) 2))

(= 30 (#(* 15 %) 2))

(= 18 (#(+ %1 %2 %3) 5 6 7))

(= 45 (#(* 15 %2) 2 3))

(= 9 ((fn [] ((fn [x y] (+ x y)) 4 5))))

(= 20 ((fn [f] (f 4 5)) *))

(= 25 ((fn [f] (f 5)) (fn [x] (* x x))))

(= 36 ((fn [f] (f 6)) square))
