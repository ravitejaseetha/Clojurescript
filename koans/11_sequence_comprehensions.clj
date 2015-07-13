(= '(0 1 2 3 4) (for [x (range 5)] x))

(= '(0 1 4 9 16) (map (fn [x] (* x x)) (for [x (range 5)] x) ))

(= '(1 3 5 7 9) (filter odd? (range 10)) (for [x (range 10) :when (odd? x)] x))


(= '(1 9 25 49 81) (map (fn [x] (* x x)) (filter odd? (range 10))) (for [x (range 10) :when (odd? x)] (* x x)))

(= [[:top :left] [:top :middle] [:top :right] [:middle :left] [:middle :middle] [:middle :right] [:bottom :left] [:bottom :middle] [:bottom :right]] (for [row [:top :middle :bottom] column [:left :middle :right]] [row column]))
