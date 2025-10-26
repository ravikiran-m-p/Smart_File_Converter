# Smart_File_Converter






# Smart_File_Converter

Smart_File_Converter is a **Java Swing-based application** that allows users to easily view file structures and automatically process files based on their type. The application supports text compression, image conversion, audio mock conversion, and generic file zipping.  

---

## Features
- **Graphical User Interface** using Java Swing.  
- Detects file type automatically: Text, Image, Audio, Video, or Other.  
- Processes files according to type:  
  - **Text:** Compressed using GZIP.  
  - **Image:** Converted to a different format (e.g., JPG).  
  - **Audio:** Mock conversion (copies and renames).  
  - **Other:** Zipped automatically.  
- Shows the **file structure and processing status**.  
- Provides a button to **open the processed file directly**.  



## Installation

Clone the repository:    git clone https://github.com/ravikiran-m-p/Smart_File_Converter.git










File Structure :-

Smart_File_Converter
      |
      |
      |_________  src
                  |
                  |
                  |_______________  smartfileconverter
                                              |
                                              |---------->    AudioConverter.java 
                                              |
                                              |---------->    Compressor.java
                                              |
                                              |---------->    FileConverterUI.java
                                              |
                                              |---------->    FileConverter.java
                                              |
                                              |---------->    FileProcessor.java
                                              |
                                              |---------->    FileTypeDectector.java
                                              |
                                              |---------->    ImageConverter.java
                                              |
                                              |---------->    Main.java
                                              |
                                              |---------->    Zipper.java


      
      
