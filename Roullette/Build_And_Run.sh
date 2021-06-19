#!/bin/bash

echo "Compiling the .java files."
cd /home/jwuebbl/Roullete/Roullette/Roullette
javac -d ../Class\ Files/ *.java

cd ../Class\ Files/
java Main

