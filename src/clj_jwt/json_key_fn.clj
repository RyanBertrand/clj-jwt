(ns clj-jwt.json-key-fn
  (:require
    [clojure.string :as str]))

(defn write-key
  [x]
  (cond
    (string? x) (str "\"" x "\"")
    (instance? java.util.UUID x) (str x)
    :else (name x)))

(defn read-key
  [x]
  (if-let [y (re-seq #"^\"(.*)\"$" x)]
    (-> y first second)
    (keyword x)))

(defn write-value
  [k v]
  (cond
    (instance? java.util.UUID v) (str v)
    (nil? v) nil
    (keyword? v) (name v)
    :else v))