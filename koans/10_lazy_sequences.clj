(= '(1 2 3 4) (range 1 5))

(= '(0 1 2 3 4) (range 5))

(= [0 1 2 3 4 5 6 7 8 9] (take 10 (range 100)))

(= [95 96 97 98 99] (drop 95 (range 100)))

(= [1 2 3 4 5 6 7 8 9 10 11] (take 11 (iterate inc 1)))

(= [:a :a :a :a :a] (repeat 5 :a))

(= (repeat 10 :hello) (take 10 (iterate identity :hello)))
