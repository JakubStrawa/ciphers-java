Current poject status:
Done:
- all algorithms
- basic unit tests for model classes
- GUI
- EnigmaTable and PolybiusTable
- MVC
- "about cipher" section
- all algorithms diplay in one window
- Save result, Read input from .txt file, Copy result to clipboard

To Do:
- Step by step mode
- comments fixes and documentation
- further GUI development

About project:
Ciphers is a simple testing environment for 4 encyption algorithms:
Caesar Cipher, Polybius Square, Enigma and Blowfish.
Project wrritten in Java with Swing library.

Instalation process (Maven necessary):
1. Clone current master branch.
2. Use: "mvn clean install" command.
3. Use: "java -jar target/cipher-ver.jar" command where ver is current build version.
4. Enjoy.

How to use "Open" and "Save" features?
- input.txt contains String that will be copied as algorithm input
- output.txt contains short information about input, output and algorithm used