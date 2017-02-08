#!/bin/bash

javafile="$1"
basefilename=${javafile::-5}
classname=$basefilename.class

javac -cp .:karel.jar:acm.jar $javafile
java -cp .:karel.jar:acm.jar:$basefilename.class stanford.karel.Karel code=$basefilename
