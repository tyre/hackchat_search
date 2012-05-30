(ns search.views.query
  (:use noir.response)
  (:use [noir.core :only [defpage]]))

(defpage "/query" []
  (json ["Hello" "World" "I" "am" "an" "array!"]))