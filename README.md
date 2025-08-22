Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Install the latest PowerShell for new features and improvements! https://aka.ms/PSWindows

PS C:\05A1> git config --global user.email "23h51a05a1@cmrcet.ac.in"
PS C:\05A1> git config --list
diff.astextplain.textconv=astextplain
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
http.sslbackend=schannel
core.autocrlf=true
core.fscache=true
core.symlinks=false
pull.rebase=false
credential.helper=manager
credential.https://dev.azure.com.usehttppath=true
init.defaultbranch=master
user.name=Vikas@2006
user.email=23h51a05a1@cmrcet.ac.in
user.mail=saibhavyasri24@gmail.com
core.repositoryformatversion=0
core.filemode=false
core.bare=false
core.logallrefupdates=true
core.symlinks=false
core.ignorecase=true
PS C:\05A1> git init
Reinitialized existing Git repository in C:/05A1/.git/
PS C:\05A1> cd week-3
PS C:\05A1\week-3> ls


    Directory: C:\05A1\week-3


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a----         8/22/2025  10:02 AM             28 readme.md


PS C:\05A1\week-3> git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ../Cap.webp
        ../cap2.webp
        ../week-1/

nothing added to commit but untracked files present (use "git add" to track)
PS C:\05A1\week-3> git add readme.md
PS C:\05A1\week-3> git commit
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ../Cap.webp
        ../cap2.webp
        ../week-1/

nothing added to commit but untracked files present (use "git add" to track)
PS C:\05A1\week-3> git commit -m "Initial commit: added readme"
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ../Cap.webp
        ../cap2.webp
        ../week-1/

nothing added to commit but untracked files present (use "git add" to track)
PS C:\05A1\week-3> git commit
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ../Cap.webp
        ../cap2.webp
        ../week-1/

nothing added to commit but untracked files present (use "git add" to track)
PS C:\05A1\week-3> git branch feature-
PS C:\05A1\week-3> git switch feature-
Switched to branch 'feature-'
PS C:\05A1\week-3> echo "Adding feature work"> readme.md
PS C:\05A1\week-3> git status
On branch feature-
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   readme.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ../Cap.webp
        ../cap2.webp
        ../week-1/

no changes added to commit (use "git add" and/or "git commit -a")
PS C:\05A1\week-3> git add .
PS C:\05A1\week-3> git add.
git: 'add.' is not a git command. See 'git --help'.

The most similar command is
        add
PS C:\05A1\week-3> git branch feature-1
PS C:\05A1\week-3> git switch feature-1
M       week-3/readme.md
Switched to branch 'feature-1'
PS C:\05A1\week-3> echo "Adding feature work"> readme.md
PS C:\05A1\week-3> git add .
PS C:\05A1\week-3> git commit -m "Featur Added: readme.md and updated readme.md"
[feature-1 e29d37b] Featur Added: readme.md and updated readme.md
 1 file changed, 0 insertions(+), 0 deletions(-)
PS C:\05A1\week-3> git status
On branch feature-1
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ../Cap.webp
        ../cap2.webp
        ../week-1/

nothing added to commit but untracked files present (use "git add" to track)
PS C:\05A1\week-3> git switch master
Switched to branch 'master'
PS C:\05A1\week-3> git merge feature-1
Updating f35b06d..e29d37b
Fast-forward
 week-3/readme.md | Bin 28 -> 44 bytes
 1 file changed, 0 insertions(+), 0 deletions(-)
PS C:\05A1\week-3>
