(ns meetup-clojure-third.entities.core
  (:refer-clojure :exclude [update])
  (:require [korma.core :refer :all])
  (:require [meetup-clojure-third.db.core :refer [db]]))

(defentity users)
