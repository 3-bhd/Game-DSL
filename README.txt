README – GameDSL Implementation
===============================
Overview:
---------
This project implements a Domain-Specific Language (DSL) for defining and modeling grid-based games such as Chess, Sudoku, and Tic-Tac-Toe. The DSL is built using the Xtext framework and allows users to define games in a readable, structured format using .gamedsl files.

--------------------------------------------------------------------------------
How to Use:
-----------
1. Install Eclipse IDE for Java and DSL Developers
   - Download from: https://www.eclipse.org/Xtext/download.html
   - Choose the "Eclipse IDE for Java and DSL Developers" package.

2. Import the Project into Eclipse
   - Open Eclipse and select a workspace.
   - Go to `File > Import > General > Existing Projects into Workspace`.
   - Select the extracted folder containing the projects:
     - edu.project.gamedsl
     - edu.project.gamedsl.ide
     - edu.project.gamedsl.tests 
     - edu.project.gamedsl.ui
     - edu.project.gamedsl.ui.tests

3. Generate Xtext Artifacts
   - Open `GameDSL.xtext`
   - Right-click inside the editor and select:
     `Run As > Generate Xtext Artifacts`

4. Run the DSL Editor
   - Go to `Run > Run Configurations...`
   - Select `Eclipse Application` and click `Run`
   - A new Eclipse runtime instance will open

5. Create and Test `.gamedsl` Files
   - In the new Eclipse window:
     - Go to `File > New > Project > General > Project` and name it for ex `DSLTest`
     - Right-click the project > `New > File`, name it for ex `example.gamedsl`
     - Paste the sample DSL code (see below)
     - Syntax highlighting and error checking will work automatically

--------------------------------------------------------------------------------
Sample `.gamedsl` File (chess.gamedsl):
---------------------------------------

board 8 x 8
player "white"
player "black"
turn_order ["white", "black"]
piece "pawn" symbol "p" owner "white" x 8
piece "pawn" symbol "p" owner "black" x 8
place pawn at [2,1] - [2,8] for "white"
place pawn at [7,1] - [7,8] for "black"
move pawn direction "forward" 1 if "not blocked"
win_condition if "king is_checkmated" then winner = "opponent"

--------------------------------------------------------------------------------
Additional Sample Files:
------------------------
- sudoku.gamedsl
- tictactoe.gamedsl

(See sample_games/ folder for these examples)

--------------------------------------------------------------------------------
Folder Structure:
-----------------
/DSLImplementation/
edu.project.gamedsl/
edu.project.gamedsl.ide/
edu.project.gamedsl.tests/    
edu.project.gamedsl.ui/
edu.project.gamedsl.ui.tests/    
sample_games/
     chess.gamedsl
     sudoku.gamedsl
     tictactoe.gamedsl
GameDSL.xtext
README.txt

--------------------------------------------------------------------------------
Notes:
------
- This part of the project focuses on the design and implementation of the DSL grammar, parser, and editor tooling.
- The DSL editor supports syntax highlighting, validation, and error reporting.
--------------------------------------------------------------------------------
