(defn hello ([] "hello world") ([a] (str "hello, you silly" a ".")) ([a & more] (str "hello to this group" (apply str (interpose ", " (cons a more))) "!")))


(defmulti diet (fn [x] (:eater x)))
(defmethod diet :herbivore [a] (str (:name a) "eats veggies"))
(defmethod diet :carnivore [a] (str (:name a) "eats animals"))
(defmethod diet :default [a] (str "i dont no what" (:name a) "eats"))

(= "bambieats veggies" (diet {:species "deer" :name "bambi" :age 1 :eater :herbivore}))

(= "i dont no whatstereats" (diet {:name "ster"}))
