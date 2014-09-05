(ns lisp-cast-bakery.core
  (:use bakery.core))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main []
  (println "hello, world"))
