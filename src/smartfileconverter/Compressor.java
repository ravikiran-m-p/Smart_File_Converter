package SmartFileConverter.src.smartfileconverter;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Compressor
{
   public File compressText(File input) throws IOException
   {
       File out = new File(input.getParent(),input.getName().replace(".", "_compressed."));
        try(
               FileInputStream fis = new FileInputStream(input);
               FileOutputStream fos = new FileOutputStream(out);
               GZIPOutputStream gzip = new GZIPOutputStream(fos)
           )
             {
                fis.transferTo(gzip);
             }
      return out;
   }
}
