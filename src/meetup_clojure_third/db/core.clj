(ns meetup-clojure-third.db.core
  (:require [korma.db :refer :all]))

(defdb db (postgres {:db "meetup-clojure-db"
                     :user "meetup"
                     :password "clojure"}))
