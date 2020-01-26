(ns guestbook.routes.home
  (:require [compojure.core :refer :all]
            [guestbook.views.layout :as layout]))

(defn home []
  (layout/common [:h1 "Hello World!"]
                 [:p "Welcome to my guestbook"]
                 [:hr]
                 [:form]
                 [:p "Name:"]
                 [:input]
                 [:p "Message:"]
                 [:textarea { :row 10 :cols 40}]
                 ))

(defroutes home-routes
  (GET "/" [] (home)))
