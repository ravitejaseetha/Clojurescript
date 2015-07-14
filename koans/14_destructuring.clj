(def test-address
  {:street-address "123 Test Lane"
   :city "Testerville"
   :state "TX"})

( = ":bar:foo" ((fn [[a b]] (str b a)) [:foo :bar]))


(= (str "An oxford comma list of apples, " "oranges, " "and pears.") ((fn [[a b c]] (str "An oxford comma list of " a ", " b ", " c)) ["apples" "oranges" "and pears."]))

(= "Rich Hickey aka The Clojure aka Go Time aka Lambda Guru" (let [[first last & aliases] (list "Rich" "Hickey" "The Clojure" "Go Time" "Lambda Guru")] (str first " " last (apply str (map #(str " aka " %) aliases)))))


(= {:original-parts ["Stephen" "Hawking"] :named-parts {:first "Stephen" :last "Hawking"}} (let [[first-name last-name :as full-name] ["Stephen" "Hawking"]] {:original-parts full-name :named-parts {:first first-name :last last-name}}))

(= "123 Test Lane, Testerville, TX" (let [{street-address :street-address, city :city, state :state} test-address] (str street-address ", " city ", "  state)))

(= "123 Test Lane, Testerville, TX" (let [{:keys [street-address city state] } test-address] (str street-address ", " city ", " state)))

(= "Test Testerson, 123 Test Lane, Testerville, TX" ((fn [[first-name last-name] {:keys [street-address city state]}] (str first-name " " last-name ", " street-address ", " city ", " state)) ["Test" "Testerson"] test-address))
