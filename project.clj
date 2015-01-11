(defproject brickpi "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [serial-port "1.1.2"]
                 [lamina "0.5.2"]   ; needed by gloss
                 [potemkin "0.3.4"] ; needed by gloss
                 [gloss "0.2.2"]]
  :repl-options {:timeout 300000})
