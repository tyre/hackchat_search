(ns search.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "search"]
               (include-css "/css/reset.css")]
              [:body
               [:h1 "Clojure + Noir"]
               [:div#wrapper
                content]]))
