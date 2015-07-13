(= true true)

(= 2 (+ 1 1))

(= (+ 3 4) 7 (+ 2 5))

(= true (= 2 2/1))

(= false (= 2 2.0))

(= true (== 2 2.0))

(= true (not (= 1 nil)))

(= false (= "hi" :hi 'hi))

(= :hi (keyword 'hi))

(not= 'hii (symbol "hi"))

(not= :fill-in-the-blank "hi")
