# Jeopardy Application

A Jeopardy-style quiz game built with a Java Swing GUI. Choose from four prize buttons with increasing difficulty. Answers must match exactly; correct answers add the prize money to your score, and incorrect answers do not change the score.

Buttons are disabled after you click them so questions can’t be repeated.

## Technologies Used
- Java
- Java Swing (GUI): `JFrame`, `JPanel`, `JButton`, `JLabel`, `JOptionPane`
- AWT Event Handling: `ActionListener`, `ActionEvent`
- Layout Managers: `BorderLayout`, `GridLayout`, `BoxLayout`

## Features
- 4 question buttons: **$100, $200, $300, $400**
- Difficulty increases with prize value
- Pop-up question + answer input using `JOptionPane`
- Score display updates after each question
- Buttons disable after use to prevent repeating questions

## The Process
1. Built the window and layout using `JFrame` + `JPanel` with Swing layout managers.
2. Created the question buttons and attached an `ActionListener` to handle clicks.
3. Used `actionPerformed()` to detect which button was pressed and ask the matching question.
4. Implemented scoring logic: add prize money only when the user’s input exactly matches the correct answer.
5. Updated the score label after each question and disabled the used button.

## What I Learned
- How event-driven programming works in Java Swing (`ActionListener`)
- Managing simple application state (score + button availability)
- Building GUI layouts using different layout managers
- Using dialog boxes for fast prototyping of UI interactions

## How It Can Be Improved
- **Handle cancel safely:** if the user cancels the input dialog, `answer` becomes `null` and can cause errors.
- **Make answers more flexible:** trim whitespace and allow case-insensitive matching.
- **Better feedback:** show “Correct/Incorrect” and display the correct answer when wrong.
- **Refactor question storage:** move questions/answers/prizes into a data structure instead of multiple `if/else` blocks.
- **UI upgrade:** display questions in the main window instead of pop-ups.
- **Score display dialog:** the program currently shows the score using an input dialog (`showInputDialog`) instead of a message dialog.

## How to Run the Project
### Make sure Java is installed:
   ```bash
   java -version
   javac Jeopardy.java
   java Jeopardy
```

[![Demo video](./demo.mp4)]

---
## Contributing

This was a culminating assignment. Suggestions and improvements are welcome via issues or pull requests.

## License

* **Code:** MIT License.

## Contact

* **Email:** [lisanguyen.tech@yahoo.com](mailto:lisanguyen.tech@yahoo.com)
* **LinkedIn:** [https://www.linkedin.com/in/lisa-vo-nguyen/](https://www.linkedin.com/in/lisa-vo-nguyen/)
