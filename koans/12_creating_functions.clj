(= [true false true] (let [not-a-symbol? (complement symbol?)] (map not-a-symbol? [:a 'b "c"]) ))

(= ["wheat" :wheat 'wheat] (let [not-nil? (complement nil?)] (filter not-nil? [nil "wheat" nil :wheat nil nil 'wheat])))

(= 20 (let [multiply-5 (partial * 5)] (multiply-5 4)))

(= [:c :d :a :b] (let [ab-adder (partial concat [:c :d])] (ab-adder [:a :b])) )

(defn square [x] (* x x))
(= 25 (let [inc-square (comp square inc)] (inc-square 4)))

(= 8 (let [double-dec (comp dec dec)] (double-dec 10)))

(= 99 (let [square-dec (comp dec square)] (square-dec 10)))
