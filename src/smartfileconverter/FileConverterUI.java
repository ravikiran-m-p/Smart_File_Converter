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
        frame.setSize(520, 220);
        frame.setLayout(new FlowLayout());

        JButton chooseBtn = new JButton("Choose File");
        status = new JLabel("No file selected.");
        openBtn = new JButton("Open File");
        openBtn.setVisible(false);

        chooseBtn.addActionListener(e -> openFileChooser());

        frame.add(chooseBtn);
        frame.add(status);
        frame.add(openBtn);
        
        frame.setVisible(true);
    }

    private void openFileChooser()
    {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select a file to convert or compress");

        
        if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
        {
            File file = chooser.getSelectedFile();
            status.setText("Selected: " + file.getName());
            process(file);
        }
    }
    private void process(File file) 
    {
        FileProcessor processor = new FileProcessor();
        try
        {
            File output = processor.process(file);
            status.setText("<html> Done!<br>Saved: " + output.getAbsolutePath() + "</html>");
            openBtn.setVisible(true);
            openBtn.addActionListener(e -> {
            try
            {
                Desktop.getDesktop().open(output); 
            }
            catch (Exception ex) 
            {
                ex.printStackTrace(); 
            }
          });
        }
        catch (Exception ex)
        {
          status.setText(" Error: " + ex.getMessage());
          ex.printStackTrace();
        }
    }
}
      

    
