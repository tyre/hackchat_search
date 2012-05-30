(ns search.views.welcome
  (:require [search.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to search"]))

(defpage "/hello_world" []
  (common/layout
    [:p "Fuck you Rails!"]))