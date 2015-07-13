(= {:a 1 :b 2} (hash-map :a 1 :b 2))

(= {:a 1} (hash-map :a 1))

(= 2 (count {:a 1 :b 2}))

(= 2 (get {:a 1 :b 2} :b))

(= 1 ({:a 1 :b 2} :a))


(= "mumbai" ({2010 "hyderabad" 2012 "mumbai" 2013 "delhi"} 2012))


(= nil (get {:a 1 :b 2} :c))

(= :not-found (get {:a 1 :b 2} :c :not-found))

(= false (contains? {:a nil :b nil} :c))

(= {1 "jan" 2 "Feb"} (assoc {1 "jan"} 2 "Feb"))

(= {1 "jan"} (dissoc {1 "jan" 2 "feb"} 2))

(= (list 10 11 12) (sort (keys {10 "mum" 11 "kol" 12 "hyd"})))

(= (list "abc" "cde") (sort (vals {11 "abc" 12 "cde"})))
