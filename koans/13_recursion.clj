(defn is-even? [n] (if (= n 0) true (not (is-even? (dec n)))))

(defn is-even-bigint? [n] (loop [n n acc true] (if (= n 0) acc (recur (dec n) (not acc))) ))


(defn recursive-rev [coll] (loop [coll coll reversed ()] (if (= () coll) reversed (recur (rest coll) (cons (first coll) reversed))) ))

(= '(5 4 3 2 1) (recursive-rev [1 2 3 4 5]))

(defn fact [n] (loop [n n acc 1] (if (= n 0) acc (recur (dec n) (* n acc)))))

(= 120 (fact 5))
