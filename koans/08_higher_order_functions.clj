(= [10 15 20] (map (fn [x] (* x 5)) [2 3 4]))

(= [1 4 9 16 25] (map (fn [x] (* x x)) [1 2 3 4 5]))

(= [false false true false false] (map nil? [:a :b nil :c :d]))

(= '() (filter (fn [x] false) '(:hi :bye :hello)))

(= '(:hi :bye :hello) (filter (fn [x] true) '(:hi :bye :hello)))

(= [10 20 30]  (filter (fn [x] (< x 40)) [10 20 30 40 50 60]))

(= [10 20 30] (map (fn [x] (* x 10)) (filter (fn [x] (< x 4)) [1 2 3 4 5 6] ) ))

(= 24 (reduce (fn [x y] (* x y )) [1 2 3 4]))

(= 2400 (reduce (fn [x y] (* x y)) 100 [1 2 3 4]))

(= "longest" (reduce (fn [x y] (if (< (count x) (count y)) y x)) ["world" "is" "longest"]))
