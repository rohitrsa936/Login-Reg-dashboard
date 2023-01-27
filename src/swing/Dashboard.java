/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

/**
 *
 * @author PC
 */

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.File;
import java.util.*;
import javax.mail.Message;
import javax.mail.Session;
import javax.swing.table.DefaultTableModel;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Authenticator;
import javax.swing.JOptionPane;



public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Forgetpass
     */
    DefaultTableModel tm;
    String a;
    String name;
    String email;
    String pass;
    String repass;
    String country;
    String state;
    String phone;
    Session ses;
   
    public Dashboard() {
        initComponents();
    }
    public void data(String name,String email,String pass,String repass,String country,String state,String phone)
            
    {
        this.name=name;
        this.email=email;
        this.pass=pass;
        this.repass=repass;
        this.country=country;
        this.state=state;
        this.phone=phone;
         String[] a=new String[]{name,email,pass,repass,country,state,phone};
         tm =(DefaultTableModel)jtable.getModel();
          System.out.println("hello"+a.toString());
         tm.addRow(a);
          System.out.println("hello"+a.toString());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jemail = new javax.swing.JLabel();
        jpdf = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tqr = new javax.swing.JLabel();
        bback = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable.setBackground(new java.awt.Color(0, 0, 0));
        jtable.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jtable.setForeground(new java.awt.Color(255, 255, 255));
        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email ID", "Password", "Repasswrd", "Country", "State", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 520, 70));

        jemail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jemail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/img/Email.png"))); // NOI18N
        jemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jemailMouseClicked(evt);
            }
        });
        jPanel1.add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 316, 50, 30));

        jpdf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jpdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/img/pdf (1).png"))); // NOI18N
        jpdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpdfMouseClicked(evt);
            }
        });
        jPanel1.add(jpdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 311, 40, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Open Your Details Pdf or Email ID");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 325, -1, -1));

        tqr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/img/qrc (2).png"))); // NOI18N
        tqr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tqrMouseClicked(evt);
            }
        });
        jPanel1.add(tqr, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 5, 50, 50));

        bback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/img/back.png"))); // NOI18N
        bback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbackMouseClicked(evt);
            }
        });
        jPanel1.add(bback, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 7, -1, -1));

        jLabel4.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("WELCOME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/img/web.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tqrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tqrMouseClicked
        // TODO add your handling code here:
        try 
        {
            String str="Name : "+name+" Email : "+email+" Country : "+country+" State : "+state+" Phone : "+phone;
            String path="C:\\Users\\PC\\Documents\\NetBeansProjects\\loginproject\\src\\swing\\img\\qrc.png";
            String cha="UTF-8";
             Map <EncodeHintType,ErrorCorrectionLevel> hintMap=new HashMap<EncodeHintType,ErrorCorrectionLevel>();
             hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            
             BitMatrix matrix=new MultiFormatWriter().encode(new String(str.getBytes(cha),cha),BarcodeFormat.QR_CODE,200,200);
            MatrixToImageWriter.writeToFile(matrix,path.substring(path.lastIndexOf('.')+1),new File(path));
             System.out.print("oqr success"+path);
             
             QRcde cr=new QRcde();
             cr.show();
             
            
       /*   JFrame frame=new JFrame();
            JPanel jp=new JPanel();
            jp.setLayout(new FlowLayout());
            ImageIcon icon = new ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\loginproject\\src\\swing\\img\\qrc.png");
            JLabel jl=new JLabel(icon);
            //JButton jb=new JButton();
           // jb.setText("close");
           // jb.setBounds(40,80,75,25);
            //jb.addActionListener(new ActionListner(){public void actionPerformed(Action evt){
               // frame.dispose();}
            //});
            frame.add(jp);
            frame.add(jl);
            frame.setSize(200,300);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);   */
            
            
            
            
            
            
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_tqrMouseClicked

    private void bbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbackMouseClicked
        // TODO add your handling code here:
        Login lp=new Login();
        lp.show();
        dispose();
    }//GEN-LAST:event_bbackMouseClicked
    
    private void jemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jemailMouseClicked
        // TODO add your handling code here:
         String str1="Name : "+name+" Email : "+email+" Country : "+country+" State : "+state+" Phone : "+phone;
        String toemail=email;
        String fromemail="rohitrsa210@gmail.com";
        String fromEmailPass="khgjvmkzhykpvdnq";
        String subject="Your Details";
        
        Properties pro=new Properties();
        pro.put("mail.smtp.auth","true");
         pro.put("mail.smtp.starttls.enable","true");
          pro.put("mail.smtp.host","smtp.gmail.com");
           pro.put("mail.smtp.port","587");
             
           Authenticator auth=new javax.mail.Authenticator() {
           
         
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromemail,fromEmailPass);
            }
        };
           ses = Session.getDefaultInstance(pro,auth);
           
           try
           { 
               MimeMessage mes=new MimeMessage(ses);
               mes.setFrom(new InternetAddress(fromemail));
               mes.addRecipient(Message.RecipientType.TO,new InternetAddress(toemail));
               mes.setSubject(subject);
               mes.setText(str1);
               Transport.send(mes);
               JOptionPane.showMessageDialog(bback,"Message Send Successfully");
               System.out.print("Name : "+name+" Email : "+email+" Country : "+country+" State : "+state+" Phone : "+phone);
           }
           catch(Exception e)
           {
              e.printStackTrace();
              JOptionPane.showMessageDialog(bback,"Message Dose Not send");
           }
        
    }//GEN-LAST:event_jemailMouseClicked

    private void jpdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpdfMouseClicked
        // TODO add your handling code here:
        Pdf pd=new Pdf();
        pd.pd(name, email, country, state, phone);
        
      
    }//GEN-LAST:event_jpdfMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jemail;
    private javax.swing.JLabel jpdf;
    private javax.swing.JTable jtable;
    private javax.swing.JLabel tqr;
    // End of variables declaration//GEN-END:variables
}