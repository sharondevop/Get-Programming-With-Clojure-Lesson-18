(defproject capstone-project "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "https://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url "https://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.10.0"]]
            :main ^:skip-aot capstone-project.my-beers
            :target-path "target/%s"
            :profiles {:uberjar {:aot :all}})