(ns search.views.query
  (:require noir.response)
  (:use [noir.core :only [defpage]]
        [search.search]
        [hiccup.core :only [html]]
))

(def users (generate-users 20))

(use 'hiccup.form-helpers)

(defpage "/search" []
  (html (form-to [:post "/find"]
              (text-field "attr")
              (text-field "query")
              (submit-button "Search"))))
(defpage [:post "/find"] {:keys [attr query]}
  (noir.response/json (key-search attr query users)))

(defpage "/users" []
  (noir.response/json users))