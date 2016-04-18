(defproject meetup-clojure-third "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [migratus "0.8.13"]
                 [org.postgresql/postgresql "9.4-1206-jdbc4"]]
  :main ^:skip-aot meetup-clojure-third.core
  :target-path "target/%s"
  :plugins [[migratus-lein "0.2.6"]]
  :migratus {:store :database}
  :profiles
  {:uberjar {:aot :all}
   :dev [:profiles/dev]
   :profiles/dev {}
   })
