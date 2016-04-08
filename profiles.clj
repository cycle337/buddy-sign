{:dev
 {:aliases {"test-all" ["with-profile" "dev,1.7:dev,1.6:dev,1.5:dev" "test"]}
  :dependencies [[com.nimbusds/nimbus-jose-jwt "4.13.1"]]

  :codeina {:sources ["src"]
            :reader :clojure
            :target "doc/dist/latest/api"
            :src-uri "http://github.com/funcool/buddy-core/blob/master/"
            :src-uri-prefix "#L"}
  :plugins [[funcool/codeina "0.3.0"]
            [lein-ancient "0.6.7"]]}
 :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
 :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
 :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}}
