# FASTuml

**FASTuml** is a tool that allows users to generate UML class diagrams and the corresponding initial implementation code structure using a single syntax. This eliminates redundancy, reduces the potential for errors, and ensures proper documentation. FASTuml supports code generation for Java and Python, producing initial structures identical to the UML diagram, which is also saved as a `.png` file.

The program operates via a simple command-line interface and does not require an internet connection.

For the complete syntax documentation, check the file "Documentazione Utente".
This repository also contains the full compiler of the FASTuml custom language.


## Example 
Input file: 

```
class ClasseA {
	constructor {
		(int a);
	}
	
    attribute {
    	public List int a = 10;
    	private String name = "ciao";
    	protected List int numbers;
    }
    
	operation {
		public void methodA();
		public void methodE();
		protected int methodB(int x, String y);
	}
}

...


relations {
     ClasseB inherits ClasseA;
     ClasseC inherits ClasseA;
     ClasseD 1,1 > ClasseC 1,*;
     ClasseD 1,1 shared ClasseA 1,*;
}
```

Generated Class Diagram PNG: 

![image](https://github.com/user-attachments/assets/b1bc647a-8dcc-4835-8783-e2e09010a726)

Generated Java Code: 
```java
class ClasseA {

	ClasseA(int a) {
		// TODO: implement
	}
	public List<Integer> a = new ArrayList<>(Arrays.asList(10));
	private String name = "ciao";
	protected List<Integer> numbers = new ArrayList<>();

	public void methodA() {
		// TODO: implement
	}

	public void methodE() {
		// TODO: implement
	}

	protected int methodB(int x, String y) {
		// TODO: implement
	}
}

class ClasseB extends ClasseA {

	ClasseB(int a) {
		super();
		// TODO: implement
	}
	public List<Integer> a = new ArrayList<>(Arrays.asList(10));
	private float ma = 1.5;
	private String name = "pepe";
	protected List<Integer> numbers = new ArrayList<>();

	public void methodA() {
		// TODO: implement
	}

	protected int methodB(int x, String y) {
		// TODO: implement
	}
}

...
```


Generated Python Code: 

```python
class ClasseA:
    def __init__(self, a:int):
        pass
    a: int = None
    __name: str = None
    _numbers: int = None
    def methodA(self):
        pass
    def methodE(self):
        pass
    def _methodB(self, x:int, y:str) -> int:
        pass


class ClasseB(ClasseA):
    def __init__(self, a:int):
        pass
    a: int = None
    __ma: float = None
    __name: str = None
    _numbers: int = None
    def methodA(self):
        pass
    def _methodB(self, x:int, y:str) -> int:
        pass

...
```







## System Requirements

### Supported Operating Systems
- **Windows**: Windows Server 2008 R2 SP1 (64-bit) or later, Windows Vista SP2 or later.
- **Mac**: macOS X 10.8.3 or later.
- **Linux**: Ubuntu Linux 5.5+.


### Hardware Requirements
- **RAM**: 128 MB.
- **Storage**: 22 MB.

### Java Requirements
- Install the latest version of the **Java JDK**.
- Ensure that Java is included in the system's PATH environment variable.


## Installation

1. Download the `codeGeneration.jar` executable and place it in the desired folder.
2. Ensure Java is correctly set up in the environment variables:
   - Add a `JAVA_HOME` variable pointing to the Java installation directory (e.g., `C:\Program Files\Java\jdk1.8.0_241`).
   - Append the `bin` directory of Java to the PATH variable.

   **To Verify:**
   - Run the command `set JAVA_HOME` in the terminal to confirm the setup.


## Program Execution

To execute the program:

1. Open the terminal and navigate to the folder where `codeGeneration.jar` has been downloaded (on a Windows terminal, use the command:  
   `cd <folder_name>`).

2. Run the following command:  
   `java -jar codeGeneration.jar --input-file <path-to-input-file> --language <generated-language-option> --output-folder <path-to-output-destination>`

# Available Options

The following options are also available:

- Generate only the Java file:  
  `java -jar codeGeneration.jar --input-file path/to/input.file --language java`

- Generate only the Python file:  
  `java -jar codeGeneration.jar --input-file path/to/input.file --language python`

- Generate both Java and Python files:  
  `java -jar codeGeneration.jar --input-file path/to/input.file --language both`

- Specify the output folder (only for Java and Python files):  
  `java -jar codeGeneration.jar --input-file path/to/input.file --output-folder path/to/output`

- Custom file names (only for Java and Python files):  
  `java -jar codeGeneration.jar --input-file path/to/input.file --java-file MyJavaFile.java --python-file MyPythonFile.py`

## Errors and Warnings

In case of syntax or semantic errors, a message will be highlighted in the terminal when the initial command is executed. The message will provide a brief explanation of the error, along with the line and column position in the input file where the error occurred.

- In case of a syntax error, the program will indicate which word was not recognized and what it expected to find instead.

- If an error occurs, no output or code structure will be generated.


