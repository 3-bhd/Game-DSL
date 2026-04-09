# Game DSL — Domain-Specific Language for Grid-Based Games

Custom programming language for modeling grid-based games · Parser, AST, and Eclipse-integrated editor

---

## Overview

A domain-specific language (DSL) designed for modeling and defining grid-based games such as Chess, Sudoku, and Tic-Tac-Toe. The language is built using the Xtext framework and includes a full grammar definition, automatic lexer and parser generation, AST construction, syntax validation, and an Eclipse-integrated editor with syntax highlighting and error annotations.

Built as part of a Concepts of Programming Languages course at The American University in Cairo.

---

## Features

- Custom grammar for defining grid-based games
- Automatic lexer and parser generation via Xtext
- Abstract Syntax Tree (AST) construction
- Syntax validation and error highlighting in Eclipse
- Content assistance and auto-completion
- Sample game programs included (Chess, Sudoku, Tic-Tac-Toe)
- Modular project structure with IDE, UI, and test modules

---

## Tech Stack

| Component | Technology |
|-----------|------------|
| Language | Xtext, Java |
| IDE Integration | Eclipse |
| Grammar | EBNF-style Xtext grammar |
| Testing | JUnit (Xtext test framework) |

---

## Repository Structure
```
├── edu.project.gamedsl/              # Core grammar and language definition
├── edu.project.gamedsl.ide/         # IDE integration (content assist, indexing)
├── edu.project.gamedsl.ui/          # Eclipse editor (syntax highlighting, annotations)
├── edu.project.gamedsl.tests/       # Language behaviour tests
├── edu.project.gamedsl.ui.tests/    # UI and editor tests
├── sample_games/                    # Sample .gamedsl programs
│   ├── chess.gamedsl
│   ├── sudoku.gamedsl
│   └── tictactoe.gamedsl
├── GameDSL.xtext                    # Main grammar file
└── README.md
```

---

## Getting Started

### Requirements
- Eclipse IDE for Java and DSL Developers
- Xtext framework

### Setup
1. Clone the repository
2. Open Eclipse and import all projects from the root folder
3. Run the Xtext artifact generator to produce lexer, parser, and AST classes
4. Launch a runtime Eclipse instance
5. Create a new project and add `.gamedsl` files to model your game

### Sample Programs
Load any file from `sample_games/` to see the language in action. Syntax errors are highlighted immediately in the editor.

---

## Supported Game Components

The DSL supports modeling:
- Board definition and grid dimensions
- Player declaration
- Pieces and symbols
- Move logic
- Rules and winning conditions

---

## Authors

- **Omar Abdelhady** — [@3-bhd](https://github.com/3-bhd)
- **Onil Carrion** 
- **Samar Ahmed**
- **Ebtsam Zyada**

The American University in Cairo — Concepts of Programming Languages Course
