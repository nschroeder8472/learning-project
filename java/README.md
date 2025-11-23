# Java Learning Exercises

## Setup

### First Time Setup

If you don't have the Gradle wrapper yet, generate it with:

```bash
# If you have Gradle installed:
gradle wrapper --gradle-version 8.5

# If you don't have Gradle, install it first:
# Windows (with Chocolatey): choco install gradle
# Mac (with Homebrew): brew install gradle
# Linux: Use your package manager or download from https://gradle.org
```

Once the wrapper is generated, you can use `./gradlew` (or `gradlew.bat` on Windows) for all commands.

### Building and Testing

```bash
# Build the project
./gradlew build

# Run all tests
./gradlew test

# Run specific test class
./gradlew test --tests FindMaxElementTest

# Clean build artifacts
./gradlew clean
```

### IDE Setup

This project works with any Java IDE:
- **IntelliJ IDEA**: Open the `java` folder as a Gradle project
- **Eclipse**: Import as Gradle project
- **VS Code**: Install Java Extension Pack and Gradle extension

## Project Structure

```
java/
├── src/
│   ├── main/java/com/learning/
│   │   ├── datastructures/
│   │   │   ├── arrays/
│   │   │   ├── linkedlists/
│   │   │   ├── trees/
│   │   │   └── hashtables/
│   │   └── algorithms/
│   │       ├── sorting/
│   │       ├── searching/
│   │       ├── dynamicprogramming/
│   │       └── graphtraversal/
│   └── test/java/com/learning/
│       └── (mirrors main structure)
├── build.gradle
└── settings.gradle
```

## Tips

- Start with the Arrays exercises in `datastructures/arrays/`
- Each exercise has a corresponding test file
- Run tests frequently to verify your solutions
- Check the README.md files in each topic folder for hints
