# GayTester
Welcome to **GayTester**! This is a simple and humorous game created
using java inbuild GUI (Graphical User Interface) library (javax.swing).
The game asks a series of funny questionsto determine a "gay level"
based on user responses.

### Important Note
This game is meant for entertainment purposes only
and should not be taken seriously. It is a humorous take
on GUI programming and should be enjoyed with a lighthearted mindset.

## Contents
1. [Installation and Execution](#installation-and-execution)
2. [Instructions](#instructions)
3. [Author](#author)
---
## Installation and Execution
## `Windows`
1. Ensure Java is installed.
- Use `java --version` to verify. If the java isn't installed, download
the [JRE](https://www.ibm.com/topics/jre) (Java Runtime Environment) or
[JDK](https://www.geeksforgeeks.org/jdk-in-java/) (Java Developemnt Kit)
from the [Oracle Website](https://www.oracle.com/java/technologies/downloads/)

2. Navigate to JAR file loaction.
- Open command prompt(`cmd`)
- use `cd` to navigate to the targeted directory.
```sh
cd C:\path\to\the\JAR_file
```
3. Run JAR File.
- Execute using the command `java -jar`.
> replace the `jarFileName.jar` with the actual JAR file name.
```sh
java -jar jarFileName.jar
```

- ### Linux (Debian)
1. Ensure Java is Installed.
- open terminal and type `java --version`.
If java isn't installed you can install it from
[Oracle Website](https://www.oracle.com/java/technologies/downloads/)
using your [distributions package manager](https://www.linode.com/docs/guides/linux-package-management-overview/)

> for debian base ditros you can use.
```sh
sudo apt update // update the packages
sudo apt install default-jre // installing JRE - java runtime environment.
```
2. Navigate to JAR file loaction.
- Open terminal. (or use the one which is already open)
- use `cd` to navigate to the targeted directory.
```sh
cd /path/to/the/JAR_file
```
3. Run JAR File.
- Execute using the command `java -jar`.
> replace the `jarFileName.jar` with the actual JAR file name.
```sh
java -jar jarFileName.jar
```

- ### MacOS

1. Ensure Java is Installed.
- open terminal and type `java --version`.
If java isn't installed you can install it from
[Oracle Website](https://www.oracle.com/java/technologies/downloads/)
or by using `brew`
> for debian base ditros you can use.
```sh
brew install openjdk
```
2. Navigate to JAR file loaction.
- Open terminal. (or use the one which is already open)
- use `cd` to navigate to the targeted directory.
```sh
cd /path/to/the/JAR_file
```
3. Run JAR File.
- Execute using the command `java -jar`.
> replace the `jarFileName.jar` with the actual JAR file name.
```sh
java -jar jarFileName.jar
```

## Instructions
- The game uses Java's `JOptionPane` for GUI interaction.
- The questions and answers are both defined in the same file `qna.txt`.
- User responses determine the "gay level,"
leading to different humorous outcomes.
- Have fun and don't take the results too seriously—it's all in good humor!

## Author
- [124k3](https://github.com/124k3)

## Version
- Version 2.0

## License
This project is licensed under the [MIT License](LICENSE).
