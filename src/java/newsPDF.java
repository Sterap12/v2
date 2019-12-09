

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kathe
 */
@WebServlet(urlPatterns = {"/newsPDF"})
public class newsPDF extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        OutputStream out = response.getOutputStream();
        try {
            
            try {
              
              Connection con = null; 
              Statement st = null;
              ResultSet rs = null;
              
              Class.forName("com.mysql.jdbc.Driver");
              con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/nova", "root", "");
              st = (Statement) con.createStatement();
              rs = st.executeQuery("SELECT * FROM news");
              
                if (con!=null) {
                    
                     try {
                 Document documento = new Document();
                 PdfWriter.getInstance(documento, out);
                 
                 documento.open();
                 
                 Paragraph par1 = new Paragraph();
                 Font fontitulo = new Font(Font.FontFamily.HELVETICA,16,Font.BOLD,BaseColor.BLACK);
                 par1.add( new Phrase("Reporte novedades",fontitulo));
                 par1.setAlignment(Element.ALIGN_CENTER);
                 par1.add(new Phrase(Chunk.NEWLINE));
                 par1.add(new Phrase(Chunk.NEWLINE));
                 documento.add(par1);
                 
                 
               
                 
               //  Image imagenes = Image.getInstance("URL DE LA IMAGEN");
                //imagenes.setAlignment(Element.ALIGN_CENTER);
                // imagenes.scaleToFit(100, 100);
                //documento.add(imagenes);
                 
                PdfPTable tabla = new PdfPTable(7);
                PdfPCell celda1 = new PdfPCell(new Paragraph("Codigo",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
                PdfPCell celda2 = new PdfPCell(new Paragraph("Descripcion",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));

                PdfPCell celda4 = new PdfPCell(new Paragraph("Fecha",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
                
                PdfPCell celda6 = new PdfPCell(new Paragraph("departamento",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
                PdfPCell celda7 = new PdfPCell(new Paragraph("salon",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
                PdfPCell celda8 = new PdfPCell(new Paragraph("instructor",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
                PdfPCell celda9 = new PdfPCell(new Paragraph("proceso",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
               
                
                tabla.addCell(celda1);
                tabla.addCell(celda2);
               
                tabla.addCell(celda4);
                
                tabla.addCell(celda6);
                tabla.addCell(celda7);
                tabla.addCell(celda8);
                tabla.addCell(celda9);
            
                while (rs.next()) {
                    tabla.addCell(rs.getString(1));
                    tabla.addCell(rs.getString(2));
                    
                    tabla.addCell(rs.getString(4));
                  
                    tabla.addCell(rs.getString(6));
                    tabla.addCell(rs.getString(7));
                    tabla.addCell(rs.getString(8));
                    tabla.addCell(rs.getString(9));
                    tabla.addCell(rs.getString(10));
                    
                    }
                
                documento.add(tabla);
                
                
                
                documento.close();
                 
                         
            } catch (Exception ex) {ex.getMessage();}
                    
                }
              
            } catch (Exception ex){ex.getMessage();}
            
         
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
