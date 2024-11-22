package fibonacciMain.es.iessoterohernandez.daw.endes;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Hello world!
 *
 */
public class HelloWorldPdf 
{
    public static void main( String[] args ) throws DocumentException
    {
    	
    	        
    	        try {
    	            Document document = new Document();
    	            String dest = "hello_world.pdf";
    	            PdfWriter.getInstance(document, new FileOutputStream(dest));
    	            document.open();
    	            
    	            Phrase header = new Phrase("Hola Mundo");
    	            document.add(header);
    	            
    	            document.close();
    	            
    	            System.out.println("PDF creado");
    	            
    	        } catch (FileNotFoundException ex) {
    	            Logger.getLogger(HelloWorldPdf.class.getName()).log(Level.SEVERE, null, ex);
    	        }
    	    }
    	}
    

