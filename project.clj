(defproject hiveminder "0.0.1-SNAPSHOT"
  :description "Hiveminder, checks the status of a Hive-Thrift service and returns an HTTP status code."
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [noir "1.2.2"]
                 [clive "0.1.0-SNAPSHOT"]
                 [log4j/log4j "1.2.16"]
                 [clj-logging-config "1.9.7"]
                 [org.slf4j/slf4j-log4j12 "1.6.4"]
                 [org.clojure/tools.logging "0.2.3"]]
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"
            :distribution :repo}
  :url "https://github.com/nmilford/hiveminder"
  :main hiveminder.core)
