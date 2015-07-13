(defn exercise [term]
  (case term
    :a "Jogging"
    :b "Cycling"
    :c "Running"
    "It is not exercise"))

(= :a (if (false? (= 4 5)) :a :b))

(= [] (if (> 4 3) []))

(= nil (if (nil? 0) [:a :b :c]))

(= :glory (if (not (empty? ())) :doom :glory))

(let [x 5] (= :your-road (cond (= x 2) :road-not-taken (= x 3) :road-taken :else :your-road)))

(= :a (if-not (zero? 1) :a :b))

(= "Jogging" (exercise :a))
