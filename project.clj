(defproject ryanbertrand/clj-jwt "0.1.5"
  :description  "Clojure library for JSON Web Token(JWT)"
  :url          "https://github.com/RyanBertrand/clj-jwt"
  :license      {:name "Eclipse Public License"
                 :url "http://www.eclipse.org/legal/epl-v10.html"}
  :deploy-repositories [["clojars" {:sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/data.codec "0.1.0"]
                 [org.bouncycastle/bcpkix-jdk15on "1.52"]
                 [crypto-equality "1.0.0"]
                 [clj-time "0.11.0"]]
  :profiles {:dev {:dependencies [[midje "1.7.0"  :exclusions [org.clojure/clojure]]]}}
  :plugins  [[lein-midje "3.1.3"]])
