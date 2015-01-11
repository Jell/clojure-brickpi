(ns brickpi.core
  (:require
   [gloss.core :refer :all]
   [gloss.io :refer :all]
   [serial-port :refer :all]))


(System/setProperty "gnu.io.rxtx.SerialPorts" "/dev/ttyAMA0")

(def port (open "/dev/ttyAMA0" 500000))

(def msg-frame
  (bit-map :type 8,
           :offset1 1,
           :offset2 1,

           :m1-speed 8
           :m1-direction 1
           :m1-running? 1

           :m2-speed 8
           :m2-direction 1
           :m2-running? 1

           :padding 2
           ))

(defn doit []
  (->> (encode msg-frame
               {:type 3
                :offset1 false
                :offset2 false
                :m1-speed 255
                :m1-direction true
                :m1-running? true
                :m2-speed 255
                :m2-direction true
                :m2-running? true
                :padding 0})
       (write port)))
