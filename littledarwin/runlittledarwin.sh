#!/bin/bash

cd "$(dirname "$0")"
git status
touch testfile
git add testfile
git commit -a -m "travis"
git push

#pypy ./LittleDarwin.py -m -b -t ../ -p ../src/main/ --timeout=180 -c mvn,test

