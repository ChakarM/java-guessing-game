# Java Number Guessing Game

A simple console-based number guessing game written in Java where players try to guess a randomly generated number between 1 and 10.

## Features

- Random number generation between 1-10
- Three attempts to guess correctly
- Input validation for numbers and play again responses
- Option to replay the game after finishing
- Clear feedback on whether guesses are too high or too low

## How to Run

1. Ensure you have Java installed on your system
2. Compile the Java file: `javac Main.java`
3. Run the compiled program: `java Main`


## Gameplay

1. The program generates a random number between 1 and 10
2. You have three attempts to guess the number
3. After each guess, you'll be told if your guess was too high or too low
4. If you guess correctly within three attempts, you win!
5. After each game, you can choose to play again or exit

## Code Structure

The program consists of two main methods:
- `main()`: Handles the game loop and replay functionality
- `StartGame()`: Contains the core game logic for a single round

## Technologies Used

- Java
- Java Scanner class for input handling
- Java Math.random() for number generation