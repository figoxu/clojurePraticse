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

(defn show-guests []
  (:ul.guests
    (for [{:keys [message name timestamp]}
          [{:message "Howdy" :name "Bod" :timestamp nil}
           {:message "Hello" :name "Bob" :timestamp nil}]]
          [:li
            [:blockquote message]
           [:p "-" [:cite name]]
           ]
      )))


(defroutes home-routes
           (GET "/" [] (home)))
