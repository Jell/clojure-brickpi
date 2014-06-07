# BrickPi for Clojure

Clojure driver for BrickPi (RaspberryPi + Lego Mindstorms) platform.

## Installation

On the pi:

    sudo apt-get install librxtx-java

You might need to add the lib path to the java library path. In your
~/.bashrc:

    export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/usr/lib/jni

Start an headless REPL:

    lein repl :headless

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
