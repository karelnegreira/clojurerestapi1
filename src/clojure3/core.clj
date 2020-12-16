(ns clojure3.core
    (:use compojure.core)
    (:require [compojure.route :as route]
      [clojure3.view :as view]))

(defn foo [x] (str "Hello, " x))

(defroutes my_routes
           (GET "/" [] (view/index-page))
           (route/resources "/"))

