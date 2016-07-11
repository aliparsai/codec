#!/bin/bash

cd "$(dirname "$0")"
pypy ./LittleDarwin.py -m -b -t ../ -p ../src/main/ --timeout=180 -c mvn,test

