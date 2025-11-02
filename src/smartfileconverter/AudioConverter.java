package SmartFileConverter.src.smartfileconverter;

import java.io.*;

Public class AudioConverter
{
    public File mockConvert(File input, String targetExt) throws IOException
    {
        File out = new File(input.getParent(),input.getName().replace(".", "_converted."));
        try (FileInputStream fis = new FileInputStream(input);FileOutputStream fos = new FileOutputStream(out))
        {
            fis.transferTo(fos);
        }
