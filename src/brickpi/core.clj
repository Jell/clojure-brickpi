(ns brickpi.core
  (:require
   [gloss.core :refer [bit-map]]
   [serial-port :refer [open write]]))


(System/setProperty "gnu.io.rxtx.SerialPorts" "/dev/ttyAMA0")

(def port (open "/dev/ttyAMA0" 500000))

(def msg-frame
  (bit-map :type 8,

           :offset-1 1,
           :bits-needed-1 5,

           :offset-2 1,

           :m1-speed 8
           :m1-direction 1
           :m1-running? 1

           :m2-speed 8
           :m2-direction 1
           :m2-running? 1

           :padding 3
           ))

(defn doit []
  (->> (encode msg-frame
               {:type 1

                :offset-1 true

                :offset-2 true

                :m1-speed 255
                :m1-direction true
                :m1-running? true

                :m2-speed 255
                :m2-direction true
                :m2-running? true

                :padding 0})
       contiguous
       .array
       vec
       ;;(write port)
       ))

(comment
  ;; this moves forward:
  (write port (byte-array (map unchecked-byte [1,218,4,3,132,28,50])))
  )
