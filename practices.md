//practices.md
Practice 1 :

mkdir trydiff
git init
vim -p readme
git status 
//predict the status
git diff
//predict the diff
//if diff is ok :
git add
git diff head
git commit
vim -p readme > "type a new line"
git status
//predict the status
git diff
git add
git diff HEAD
git commit 
//repeat this cycle 3 more times


Practice 2 
always see the difference between the 2 points between which the file is travelling.

mkdir trydiff
git init
vim -p readme
git status 
//predict the status
git diff
//predict the diff
//if diff is ok :
git add
//many git adds and come here
git diff --cached
git commit
vim -p readme > "type a new line"
git status
//predict the status
git diff
git add
//many git adds and come here
git diff --cached
git commit 
//repeat this cycle 3 more times

