package SmartFileConverter.src.smartfileconverter;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.Desktop;


public class FileConverterUI 
{
    private final JFrame frame;
    private final JLabel status;
    private final JButton openBtn;
    
    public FileConverterUI()
    {
        frame = new JFrame("Smart File Converter & Compressor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(260, 110);
        frame.setLayout(new FlowLayout());
