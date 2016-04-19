# AllrecipeKillerApp

CLICK THIS LINK TO SEE THIS README WITH PROPER WORD FORMATTING FOR EASIER READING:

VERY IMPORTANT READ TWICE
IF ANDROID STUDIO ASKS IF YOU WANT TO ADD A .IDEA\VCS.XML FILE TO GIT WHILE WORKING ON THE PROJECT
SELECT NO AND TO NOT ASK AGAIN. .IDEA\VCS.XML FILES ARE IDE DEPENDENT AND ADDING THEM TO GITHUB WILL CAUSE FILE CONFLICTS.

I ADDED A .gitignore FILE TO EXCLUDE THESE BUT JUST IN CASE YOU NEVER WANT TO COMMIT THESE FILES/DIRECTORIES TO GIT
*.iml
.gradle
/local.properties
/.idea/workspace.xml
/.idea/libraries
.DS_Store
/build
/captures


MAKE SURE YOUR ANDROID STUDIO ENVIRONMENT IS ALL SET UP WITH EVERYTHING UPDATED IN THE SDK MANAGER. CHECK THESE THREE LINKS
BELOW TO SEE EXACTLY HOW THE ENVIRONMENT WAS SET UP WHILE INITIALLY CREATING THIS PROJECT.
https://www.dropbox.com/s/p7is7hniwwx7jnq/SDK%20Manager%20Main%20Screen.png?dl=0
https://www.dropbox.com/s/7rh9l97wjp89zgw/SDK%20Standalone%201.png?dl=0
https://www.dropbox.com/s/wg1287qimcttfgg/SDK%20Standalone%202.png?dl=0

TO BEGIN COLLABORATING AND MAKING CHANGES TO THIS PROJECT:
1. Download Git from https://git-scm.com/
2. Open Android Studio
3. Check out project from Version Control
4. Select Github
5. Enter https://github.com/dr-p/AllrecipeKillerApp.git for the "Git Repository URL"
6. Choose a parent directory for the cloned project (Preferably a separate folder from your main AndroidStudio project
directory folder such as AndroidStudioGithub for example)
7. Clone and open project
8. If it throws errors of "cannot load modules" click the error details and remove the selected two .iml files, ignore
   messages about an "unregistered vcs root." Link below for details on missing modules error: https://www.dropbox.com/s/6v6joohbib386pj/Error%20cannot%20load%20modules.png?dl=0
9. In your left project window view, the app files should now be available.
10. IF ANDROID STUDIO ASKS IF YOU WANT TO ADD A .IDEA\VCS.XML FILE TO GIT WHILE WORKING ON THE PROJECT
SELECT NO AND TO NOT ASK AGAIN. .IDEA\VCS.XML FILES ARE IDE DEPENDENT AND ADDING THEM TO GITHUB WILL CAUSE FILE CONFLICTS.

TO MAKE FIRST TEST COMMMIT
1. ALWAYS SELECT VCS -> UPDATE PROJECT BEFORE BEGINNING WORK ON CODE AS WELL AS BEFORE MAKING A COMMIT TO AVOID CODE CONFLICTS
2. ALWAYS SELECT VCS -> UPDATE PROJECT BEFORE BEGINNING WORK ON CODE AS WELL AS BEFORE MAKING A COMMIT TO AVOID CODE CONFLICTS
3. ALWAYS SELECT VCS -> UPDATE PROJECT BEFORE BEGINNING WORK ON CODE AS WELL AS BEFORE MAKING A COMMIT TO AVOID CODE CONFLICTS
4. Right click on app in project window and select "Git" -> "+ Add"
5. Open MainActivity.java in app->java->com.killer.recipes.allrecipekillerapp (the first one, not androidTest or Test)
6. Make a random commmit such as a //comment in the file somewhere that won't drastically effect the code
7. Select VCS from the top menu bar and choose Commit Changes
8. Enter a commit message detailing a summary of what you did to the project
9. Hover mouse over the Commit button and select "Commit and Push"
10. Choose Commit ignoring warnings (only worry if there are errors)
11. Select push leaving everything as is
