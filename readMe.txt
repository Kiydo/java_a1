Project completeness: 100%
List of known deficiencies/functionalities:
	- All criteria outlined in the assignment document is included. 
	- Progress tracker to output the status when sorting a file. 
	
How to install and use the sorting program

Requirements
	- The program requires a Java Runtime Environment (JRE) to run. 
	- The program requires a .txt file with shape data to process. This file should follow the format of:
		#_of_shapes, object_type, height, side_length
	Example: 
		20237 Cylinder 12595.147 650.338 (repeat for additional shapes)
	- The .txt file should have all shapes on the same line, separated by whitespace ' '. 
	- 4 .txt files to process can be found on d2l (ex. polyfor1.txt). 

Installation
	- Unzip the .zip file. Make sure it is extracted to a known location on your computer, as you will need to navigate to it in order to run the program. 
	- Locate the Sort.jar file in java_a1/AssignmentShapeSort/. This is how the program is executed. 

Usage
The program is intended to be run from the command line. 
	1. Open command prompt/terminal (CMD)
	2. Navigate to the directory holding Sort.jar (*/java_a1/AssignmentShapeSort/)
	3. Use the following command format to execute the program: 
		java -jar Sort.jar -f<file_name> -t<sorting_type> -s<sorting_algorithm>
			<file_name> Replace with the path to the text file containing the list of shapes. 
			<sorting_type> Replace with how you want to sort the shapes. 3 sorting options are: 'v' for volume, 'h' for height, or 'a' for base area. 
			<sorting_algorithm> Replace with the sorting algorithm to be used to sort the shapes. The 6 options are: 'b' bubble sort, 's' selection sort, 'i' insertion sort, 'm' merge sort, 'q' quick sort, and 'z' for heap sort. 
		Example command: 
			java -jar Sort.jar -fpolyfor1.txt -th -sz

Output
	- The program will output to the terminal the amount of time it took to sort the shapes using the selected sorting algorithm in milliseconds. 
	- It will also output the first, last, and every 1000th shape that was sorted. 
	- If incorrect input is used, an exception will be thrown explaining the error encountered. 