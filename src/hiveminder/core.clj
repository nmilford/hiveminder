(ns hiveminder.core
  (:use [clj-logging-config.log4j])
  (:use [clojure.tools.logging])
  (:use [clive.core])
  (:use [noir.core])
  (:require [noir.response :as response])
  (:require [noir.server :as server]))

(defn is-hive-up [server port]
  (try
    (let [foo (openclose server port (fetch-all "describe dwcl_click"))]
    (seq? foo))
  (catch Exception e (error e))))

(defpage "/" [] "Nothing to see here.")

(defpage "/hive-status" []
  (if (is-hive-up "10.10.65.91" 10010)
    (response/status 200 "Hive Thrift is up and responsive.")
    (response/status 503 "Hive Thrift is down or unresponsive.")))

(defn -main [& args]
  (server/start 8888))
