(= [true false true] (let [not-a-symbol? (complement symbol?)] (map not-a-symbol? [:a 'b "c"]) ))
