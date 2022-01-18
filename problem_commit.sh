#!/bin/bash

currentDir=$(pwd)

cd $currentDir

git config --local core.excludesfile .gitignore

git add .
git commit -m "problem_record"

git push