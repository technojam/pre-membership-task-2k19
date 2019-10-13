# In this you will setup your github

## Create new repositery on github

To start you need a Github profile. if you don't have one [create here](https://github.com/join?source=header-home)

Now on you github make a new repository, to make a new repository click on Plus Sign on top end.

![new repo button](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task3/image/New%20repo.PNG)

Then click on "New Repository".

![new repo](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task3/image/new%20repo2.PNG)

Give name to your repo. and leave all other as it is.

![name of repo](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task3/image/repo%20name.PNG)

Click on "Create repository" to create.

![create repo](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task3/image/create%20repo.PNG)

## To clone repositery on our local system

After clicking on create repo new page will open with HTTPS URL of your repo copy the URL.

![repo link](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task3/image/repo%20link.PNG)

Now create a folder on yore local system and open the "Git Bash" if you don't have Git [click here](https://git-scm.com/downloads)
after installing the Git.

Go to the folder where you have to put your project right click there and click on "Git Bash Here"

![git here](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task3/image/git%20bash%20here.PNG)

It will open the git terminal like

![git bash](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task3/image/git%20bash.PNG)

Now you are ready to clone your project to your local system.
In this terminal write the command to clone (git clone [with your repo URl which you have got from github]) like

![git clone](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task3/image/gitclone.PNG)

this will create one folder with your repo name go inside it where your project file will be there
[your repo have no file that is why your folder is empty].

![warning](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task3/image/repo%20message.PNG)

you will see warning like

## To create project on cloned repo

To start new project on android studio
click on "Start a new Android Project"

![start project on android studio](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task3/image/start%20new%20project.PNG)

Select Empty Activity and click on "Next"

Now on Configure your project section give the name of your project and give the save location of folder which you have clone like
for example your folder location is C:\User\UserName\Desktop\NewFolder\forexample
so you have to put your project name at the end of your folder location in save location C:\User\UserName\Desktop\NewFolder\forexample\projectName.

![save location](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task3/image/creating%20project2.PNG)

Now you have to select API 25.
and click on "Finish"

### Now You Are Ready to make your project [click here](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task2/Make_first_app.md) to know what you have to make

## How to Push your code

Fork the Pre-Membership-task repo from technojam.

clone the forked repo to your local system using [git clone].

## if you have already forked and clone then ignor the above steps

Now go to android task and then open submit your project folder.

Now create the new folder of your name and paste the project you have made inside your folder.

## after pasting

Go to your Pre-Membership-task folder open git bash and check status using [git status].

Now add your change using [git add . (use to add all files), git add file_name(use to add a file)].

Now commit your change using [git commit -m"commit comment"].

Now push the change using [git push origin master].

-----------------------------------------OR-----------------------------------------------

click on commit button in top left of android studio.

select the file you want to commit, enter the commit message and enter the auther(your github userid).
click on commit button.

now open terminal in android studio.

and enter the git command to push [git push origin master] and hit enter.

Now go to your github account and open the repo which you have forked from technojam and click on make pull requests to submit.

### You have Successfully completed Task 3

### [Previous Task](https://github.com/technojam/pre-membership-task/blob/master/Android%20Task/Task2/Make_first_app.md)
