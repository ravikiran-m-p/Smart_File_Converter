package SmartFileConverter.src.smartfileconverter;

import java.io.*;

Public class AudioConverter
{
    public File mockConvert(File input, String targetExt) throws IOException
    {
        File out = new File(input.getParent(),input.getName().replace(".", "_converted."));
