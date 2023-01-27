/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
 
import com.itextpdf.text.Document;

import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.Random;
import javax.swing.JOptionPane;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.text.Element;




public class Pdf {
    
   
    public void pd(String name,String email,String country,String state,String phone)
    {
        try
        {
           // Random rand =new Random();
            //int a=rand.nextInt(99);
            String path="D:\\"+name+".pdf";
            OutputStream fos = new FileOutputStream(new File(path));
            Document document = new Document();
            PdfWriter.getInstance(document, fos);
 
            document.open();
        //Pragrafh
        Font fontSize_10 =  FontFactory.getFont(FontFactory.TIMES, 15f);
        //Font fontSize_12 =  FontFactory.getFont(FontFactory.TIMES, 12f);
        //Font fontSize_14 =  FontFactory.getFont(FontFactory.TIMES, 14f);
        Font fontSize_16 =  FontFactory.getFont(FontFactory.TIMES, 38f,Font.BOLD);
        Paragraph p=new Paragraph("WELCOME", fontSize_16);
        p.setAlignment(Element.ALIGN_CENTER);
        //p.setSpacingAfter(35f);
        Paragraph p1=new Paragraph("|----To The World Of Dreams----|", fontSize_10);
        p1.setAlignment(Element.ALIGN_CENTER);
        p1.setSpacingAfter(35f);
        p1.setSpacingBefore(4f);
            
        // Create table
            PdfPTable table = new PdfPTable(5);
              PdfPCell cell1 = new PdfPCell(new Paragraph("Name"));
               PdfPCell cell2 = new PdfPCell(new Paragraph("Email"));
                PdfPCell cell3 = new PdfPCell(new Paragraph("Country"));
                 PdfPCell cell4 = new PdfPCell(new Paragraph("State"));
                  PdfPCell cell5 = new PdfPCell(new Paragraph("Pnone"));
                   
                  
                  
              PdfPCell name1 = new PdfPCell(new Paragraph(name));
               PdfPCell email1= new PdfPCell(new Paragraph(email));
                PdfPCell country1 = new PdfPCell(new Paragraph(country));
                 PdfPCell state1= new PdfPCell(new Paragraph(state));
                  PdfPCell phone1 = new PdfPCell(new Paragraph(phone));
                  
                  
                  table.addCell(cell1);
                  table.addCell(cell2);
                  table.addCell(cell3);
                  table.addCell(cell4);
                  table.addCell(cell5);
                  
                  table.addCell(name1);
                  table.addCell(email1);
                  table.addCell(country1);
                  table.addCell(state1);
                  table.addCell(phone1);
                  
                  document.add(p);
                   document.add(p1);
                  document.add(table);
 
                  document.close();
                  fos.close();
 
                  System.out.println("PDF created in >> " +path);
                  
                  JOptionPane.showMessageDialog(null,"Create pdf Successfully..."+path);
                 
            
 
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
             JOptionPane.showMessageDialog(null,"Pdf Does Not Create");
            
        }
        
    }
    
}
