(ns meetup-clojure-third.entities.core
  (:refer-clojure :exclude [update])
  (:require [korma.core :refer :all]
            [meetup-clojure-third.db.core :refer [db]]
            [clojure.string :as str]))

(defentity users)

(defn user-name
  "retunrs user name"
  []
  (:name (first (select users))))
