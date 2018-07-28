git config user.name --global "John Doe"
git config user.email --global "john@doe.org"



    I finally found the solution.
    Go to: Control Panel -> User Accounts -> Manage your credentials -> Windows Credentials

    Under Generic Credentials there are some credentials related to Github,
    Click on them and click "Remove".


git commands to commit code

step1 :
git remote add origin https://github.com/shamanthaka/java-work.git



step 2:

git add .

git commit -m "init commit"

git push origin master

*****************************original config file ************************

[core]
	repositoryformatversion = 0
	filemode = false
	bare = false
	logallrefupdates = true
	symlinks = false
	ignorecase = true
[remote "origin"]
	url = https://shamanthaka@github.com/shamanthaka/java-work.git
	fetch = +refs/heads/*:refs/remotes/origin/*
[branch "master"]
	remote = origin
	merge = refs/heads/master






