(defn key-search [attr query coll]
  (filter
    (fn [obj] (= (get obj attr) query)) 
  coll)) 

(defn generate-users [num]
  (flatten
    (if (> num 0)
      (list (generate-users (- num 1)) (create-user))
    )
  )
)

(def names ["Dodge" "Dive" "Dip" "Duck" "Dodge"])

(defn create-user []
  (hash-map
    :name (rand-nth names)
    :age (rand-int 40)
    :gender (rand-nth ["Male" "Female" "Other"]
    )
  )
)