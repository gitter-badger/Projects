package hospital2;

import com.itextpdf.text.BaseColor;
import hospital2.Database;
import hospital2.home;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;

public class dischargePatient extends javax.swing.JFrame {
  
    int rcharge,acharge,scharge,mcharge,micharge,wcharge,pay,due;
    home q;
    String date;
    int regn,casen,tamt;
    String wardt;
    int bedn,wardn,c1,c2,c3,c4,c5;
    String transdate;
    int days;
    int f=0,f1=0;
    int payamt;
    String prewrd,dat2;
    java.util.Date de;
    String rno,cno,n,add,bg,ag,con,gen,dis,heal,tim,dt,rish;
    String rgfee,medch,sch,mich,wardch,pd,genwrd,icuwrd,bill,tot;
    /** Creates new form dischargePatient */
    public dischargePatient(home h) {
        super("Discharge Patient");
       q=h;
        initComponents();
        fail.setVisible(false);
        fail2.setVisible(false);
        de=new java.util.Date();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        date = formatter.format(de);
        
        dat2=date;
        fail.setVisible(false);
        
         
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogSucesss = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        labelSucess = new javax.swing.JLabel();
        buttonOk = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelDischarge = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonClear = new javax.swing.JButton();
        buttonDischarge = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        textCase = new javax.swing.JTextField();
        textReg = new javax.swing.JTextField();
        fail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        wrdchrg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        paychrg = new javax.swing.JTextField();
        go = new javax.swing.JButton();
        fail2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        dialogSucesss.setAlwaysOnTop(true);
        dialogSucesss.setBounds(new java.awt.Rectangle(471, 284, 337, 231));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        labelSucess.setFont(new java.awt.Font("Tahoma", 1, 14));
        labelSucess.setText("Patient Discharged Sucessfully");

        buttonOk.setText("OK");
        buttonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonOkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(buttonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(labelSucess, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(labelSucess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(buttonOk)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout dialogSucesssLayout = new javax.swing.GroupLayout(dialogSucesss.getContentPane());
        dialogSucesss.getContentPane().setLayout(dialogSucesssLayout);
        dialogSucesssLayout.setHorizontalGroup(
            dialogSucesssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogSucesssLayout.setVerticalGroup(
            dialogSucesssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 200, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        labelDischarge.setFont(new java.awt.Font("Times New Roman", 0, 24));
        labelDischarge.setText("Discharge Patient");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Reg. No.:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Case No.:");

        buttonClear.setText("Clear");
        buttonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonClearMouseClicked(evt);
            }
        });
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonDischarge.setText("Discharge");
        buttonDischarge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDischargeMouseClicked(evt);
            }
        });
        buttonDischarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDischargeActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelMouseClicked(evt);
            }
        });
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        textCase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textCaseMouseExited(evt);
            }
        });
        textCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCaseActionPerformed(evt);
            }
        });
        textCase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textCaseFocusLost(evt);
            }
        });
        textCase.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                textCaseInputMethodTextChanged(evt);
            }
        });

        textReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRegActionPerformed(evt);
            }
        });

        fail.setText("fail");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Ward Charge Remaining :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("Pay: ");

        go.setText("GO");
        go.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goMouseClicked(evt);
            }
        });
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        fail2.setText("jLabel5");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital2/discharge.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(110, 110, 110)
                                        .addComponent(buttonDischarge))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textReg)
                                            .addComponent(textCase, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(wrdchrg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(paychrg, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(20, 20, 20)
                                        .addComponent(go))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fail, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fail2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(labelDischarge)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelDischarge)
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel3)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(go))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(wrdchrg, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(paychrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(fail)
                        .addGap(29, 29, 29)
                        .addComponent(fail2)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDischarge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel5)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-816)/2, (screenSize.height-638)/2, 816, 638);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOkMouseClicked
        this.setVisible(false);
        dialogSucesss.setVisible(false);
            home r = new home();
            r.setVisible(true);
            // Generating PDF
            try{
            System.out.println(rish);
            Document doc=new Document(PageSize.A4,50,50,50,50);
            PdfWriter writer=PdfWriter.getInstance(doc,new FileOutputStream(Integer.toString(casen)+".pdf"));
            doc.open();
            Paragraph p1=new Paragraph("----------SDR Hospital----------",
                                FontFactory.getFont(FontFactory.COURIER_BOLD,24,BaseColor.BLUE));
            //doc.add(new Paragraph("----------SDR Hospital----------"));
            doc.add(p1);
            Paragraph g1=new Paragraph("                                                      Near Marine Drive",
                                FontFactory.getFont(FontFactory.COURIER_BOLD,14,BaseColor.BLUE));
            doc.add(g1);
            Paragraph g2=new Paragraph("                                                               MUMBAI",
                                FontFactory.getFont(FontFactory.COURIER_BOLD,14,BaseColor.BLUE));
            doc.add(g2);
            Paragraph g3=new Paragraph("                                                      Phone no.=8090034069",
                                FontFactory.getFont(FontFactory.COURIER_BOLD,14,BaseColor.BLUE));
            doc.add(g3);
            Paragraph p2=new Paragraph("Patient Report",
                                FontFactory.getFont(FontFactory.COURIER_BOLD,20,BaseColor.BLUE));
            //doc.add(new Paragraph("Patient Report"));
            doc.add(p2);
            Paragraph p3=new Paragraph(rish,
                                FontFactory.getFont(FontFactory.COURIER_BOLD,17,BaseColor.BLACK));
            doc.add(p3);
            Paragraph p4=new Paragraph("Bill Details",
                                FontFactory.getFont(FontFactory.COURIER_BOLD,20,BaseColor.BLUE));
            doc.add(p4);
            Paragraph p5=new Paragraph(bill,
                                FontFactory.getFont(FontFactory.COURIER_BOLD,17,BaseColor.BLACK));
            doc.add(p5);
            doc.close();
            if(Desktop.isDesktopSupported())
            {
              File myf=new File(casen+".pdf");
              Desktop.getDesktop().open(myf);
             // Desktop.getDesktop().print(myf);
            }
            
            
            }
            catch(Exception e){}
       
        // TODO add your handling code here:
}//GEN-LAST:event_buttonOkMouseClicked

    private void buttonDischargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDischargeMouseClicked
        f1=1;
        regn=Integer.parseInt(textReg.getText());
        casen=Integer.parseInt(textCase.getText());
        payamt=Integer.parseInt(paychrg.getText());
        f=0;
        try {
            if(textReg.getText().isEmpty() || textCase.getText().isEmpty() || paychrg.getText().isEmpty())
                f1=0;
            if(f1==1)
            {
             Database db=new Database();
             db.getConnection();
             db.ps=db.con.prepareStatement("select regno,name,gender,bgrp,age,address,contact from patient where regno=?");
             db.ps.setInt(1,regn);
             db.r=db.ps.executeQuery();
             if(db.r.next())
             {
                 rno=""+db.r.getInt(1);
                 n=db.r.getString(2);
                 gen=db.r.getString(3);
                 bg=db.r.getString(4);
                 ag=db.r.getString(5);
                 add=db.r.getString(6);
                 con=db.r.getString(7);
             }
             db.ps.close();
             db.ps=db.con.prepareStatement("select caseno,disease,dat,time,health from admit where caseno=?");
            db.ps.setInt(1, casen);
            db.r=db.ps.executeQuery();
            if(db.r.next())
            {
                cno=""+db.r.getInt(1);
                dis=db.r.getString(2);
                dt=db.r.getString(3);
                tim=db.r.getString(4);
                heal=db.r.getString(5);
            }
            db.ps.close();
            db.ps=db.con.prepareStatement("select mcharge,scharge,micharge,paid from payment where regno=?");
            db.ps.setInt(1,regn);
            db.r=db.ps.executeQuery();
            if(db.r.next())
            {
                medch=""+db.r.getInt(1);
                sch=""+db.r.getInt(2);
                mich=""+db.r.getInt(3);
                pd=""+db.r.getInt(4);
            }
            db.ps.close();
            db.ps=db.con.prepareStatement("select genwardrate,icuwardrate from wardcharge where regno=?");
            db.ps.setInt(1,regn);
            db.r=db.ps.executeQuery();
            if(db.r.next())
            {
                genwrd=""+db.r.getInt(1);
                icuwrd=""+db.r.getInt(2);
            }
            db.ps.close();
            int wrd1=Integer.parseInt(genwrd);
            int wrd2=Integer.parseInt(icuwrd);
            int tt=wrd1+wrd2;
            int t=tt+Integer.parseInt(medch)+Integer.parseInt(sch)+Integer.parseInt(mich);
            wardch=Integer.toString(tt);
            wardch=wardch+payamt;
            db.ps=db.con.prepareStatement("select regfee from admit where caseno=?");
            db.ps.setInt(1,casen);
            db.r=db.ps.executeQuery();
            if(db.r.next())
            {
            rgfee=""+db.r.getInt(1);
            
            }
            t=t+Integer.parseInt(rgfee);
            tot=Integer.toString(t);
            db.ps.close();
            bill="Registration Fees :                "+rgfee+"\n"
                 +"Medicine Charges :                "+medch+"\n"
                 +"Surgery Charges :                 "+sch+"\n"
                 +"Miscellaneous Charges :           "+mich+"\n"
                 +"Ward Charges :                    "+wardch+"\n"
                 +"Total Amount:                     "+tot+"\n"
                 +"Amount Paid To Hospital :         "+pd+"\n";
            
                    
                    
           rish="Registration Number :          "+rno+"\n"
                +"Case Number :                 "+cno+"\n"
                +"Name :                        "+n+"\n"
                +"Blood group :                 "+bg+"\n"
                +"Age :                         "+ag+"\n"
                +"Date of Admission :           "+dt+"\n"
                +"Date of Discharge :           "+dat2+"\n"
                +"Gender :                      "+gen+"\n"
                +"Address :                     "+add+"\n"
                +"Disease :                     "+dis+"\n";
             //Database db=new Database();
            //db.getConnection();
            db.ps=db.con.prepareStatement("select mcharge,scharge,micharge,paid from payment where regno=?");
            db.ps.setInt(1,regn);
            db.r=db.ps.executeQuery();
            if(db.r.next())
            {
                c1=db.r.getInt(1);
                c2=db.r.getInt(2);
                c3=db.r.getInt(3);
                c4=db.r.getInt(4);
            }
            db.ps.close();
            db.ps=db.con.prepareStatement("select regfee from admit where caseno=?");
            db.ps.setInt(1, casen);
            db.r=db.ps.executeQuery();
            if(db.r.next())
            {
                c5=db.r.getInt(1);
            }
            if((c1+c2+c3+c5)<=c4 && payamt>=tamt)
                f=1;
            else
                f=0;
            if(f==1)
            {
            
            db.ps=db.con.prepareStatement("update patient set status=? where regno=?");
            db.ps.setString(1,"Discharged");
            db.ps.setInt(2,regn);
            db.ps.executeUpdate();
            db.ps.close();
            db.r=db.stmt.executeQuery("select ward,wardno,bedno from patinfo where regno="+regn);
            //db.ps.setInt(1,regn);
            //db.r=db.ps.executeQuery();
            if(db.r.next())
            {
                wardt=db.r.getString(1);
                wardn=db.r.getInt(2);
                bedn=db.r.getInt(3);
            }
               System.out.println(wardt+" "+wardn+" "+bedn);
            db.ps.close();
            
            db.ps=db.con.prepareStatement("insert into freebed values(?,?,?)");
            db.ps.setString(1,wardt);
            db.ps.setInt(2,wardn);
            db.ps.setInt(3,bedn);
            db.ps.executeUpdate();
            System.out.println("insert to freebed");
            db.ps.close();
            db.ps=db.con.prepareStatement("delete from admit where caseno=?");
            db.ps.setInt(1,casen);
            db.ps.executeUpdate();
            System.out.println("delete from admit");
            db.ps.close();
            db.ps=db.con.prepareStatement("delete from patinfo where regno=?");
            db.ps.setInt(1,regn);
            db.ps.executeUpdate();
            System.out.println("deleted executed");
            db.ps.close();
            if(prewrd.equals("General"))
            {
                System.out.println("InGen");
           db.ps=db.con.prepareStatement("update wardcharge set genwardrate=genwardrate+?,dat=? where regno=?");

          db.ps.setInt(1,tamt);
      
           db.ps.setString(2,dat2);
        
           db.ps.setInt(3,regn);
     
         db.ps.executeUpdate();
          
           System.out.println("GENexecuted");
           //db.closeAll();
            }
            else if(prewrd.equals("ICU"))
            {
             System.out.println("InICU");
                 db.ps=db.con.prepareStatement("update wardcharge set icuwardrate=icuwardrate+?,dat=? where regno=?");
         
           db.ps.setInt(1,tamt);
         
          db.ps.setString(2,dat2);
         
           db.ps.setInt(3,regn);
         
           db.ps.executeUpdate();
                    System.out.println("ICUexecuted");
           //db.closeAll();
                
            }
            db.closeAll();
            }
            }
        } catch(Exception e) {
            //jTextArea1.setText(e.toString());
        }
        if(f==1 && f1==1)
         {
            labelSucess.setFont(new java.awt.Font("Sylfaen", 1, 14));
            labelSucess.setForeground(new java.awt.Color(204, 0, 0));
            this.setEnabled(false);
            dialogSucesss.setVisible(true);
        }
        else if(f==0 && f1==1)
        {
            fail.setText("Bill is Due.Pay Bill Before Discharge.");
            fail.setFont(new java.awt.Font("Sylfaen", 1, 14));
            fail.setForeground(new java.awt.Color(204, 0, 0));
            fail.setVisible(true);
        
        }
        if(f1==0)
        {
            fail2.setText("Incorrect Data Entries");
            fail2.setFont(new java.awt.Font("Sylfaen", 1, 14));
            fail2.setForeground(new java.awt.Color(204, 0, 0));
            fail2.setVisible(true);
  
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDischargeMouseClicked

    private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
   
        this.setVisible(false);
        q.setVisible(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelMouseClicked

    private void buttonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonClearMouseClicked
        textCase.setText(null);
        textReg.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClearMouseClicked

    private void textCaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCaseFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textCaseFocusLost

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClearActionPerformed

    private void textCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCaseActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textCaseActionPerformed

    private void textCaseInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textCaseInputMethodTextChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_textCaseInputMethodTextChanged

    private void textCaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCaseMouseExited
        // TODO add your handling code here:
    
    }//GEN-LAST:event_textCaseMouseExited

    private void goMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goMouseClicked
        // TODO add your handling code here:
        casen=Integer.parseInt(textCase.getText());
        regn=Integer.parseInt(textReg.getText());
        try
        {
            Database d=new Database();
        d.getConnection();
         System.out.println("date chck");
            d.ps=d.con.prepareStatement("select dat from wardcharge where caseno=?");
           
            d.ps.setInt(1,casen);
            d.r=d.ps.executeQuery();
            if(d.r.next())
            {  
            transdate=d.r.getString(1);
            } 
            d.ps.close();
            System.out.println("Old date "+transdate);
            System.out.println("present date "+date);
           d.ps=d.con.prepareStatement("select ward from patinfo where regno=?");
           d.ps.setInt(1,regn);
           d.r=d.ps.executeQuery();
           if(d.r.next())
           {
             prewrd=d.r.getString(1);
           }
           d.r.close();
           System.out.println(prewrd);
       DateFormat forma;
       Date dt;
       Date d2;
       dt=java.sql.Date.valueOf(transdate);
       //forma=new SimpleDateFormat("dd-MMM-YYYY");
       //dt=(Date)forma.parse(transdate);
       System.out.println("dt "+dt);
       days=(int) ((de.getTime()-dt.getTime())/(1000*60*60*24));
       if(days==0)
           days=1;
       d.closeAll();
      // Database db=new Database();
      // db.getConnection();
       if(prewrd.equals("General"))
       {
           //amt 500
           
           tamt=500*days;
           wrdchrg.setText(Integer.toString(tamt));
           wrdchrg.setVisible(true);
           System.out.println(tamt);
          // System.out.println("InGen");
          // db.ps=db.con.prepareStatement("update wardcharge set genwardrate=genwardrate+?,dat=? where regno=?");

         //  db.ps.setInt(1,tamt);
      
        //   db.ps.setString(2,dat2);
        
         //  db.ps.setInt(3,regn);
     
        //   db.ps.executeUpdate();
          
       //    System.out.println("executed");
       //    db.closeAll();
       }
       else if(prewrd.equals("ICU"))
       {
           //amt 1000
           
          // System.out.println("InICU");
           tamt=1000*days;
           wrdchrg.setText(Integer.toString(tamt));
            wrdchrg.setVisible(true);
           System.out.println(tamt);
        //   db.ps=db.con.prepareStatement("update wardcharge set icuwardrate=icuwardrate+?,dat=? where regno=?");
         
          // db.ps.setInt(1,tamt);
         
       //    db.ps.setString(2,dat2);
         
        //   db.ps.setInt(3,regn);
         
         //  db.ps.executeUpdate();
                    System.out.println("executed");
        //   db.closeAll();
       }
        
        }
        catch(Exception e){}
    }//GEN-LAST:event_goMouseClicked

private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_buttonCancelActionPerformed

private void buttonDischargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDischargeActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_buttonDischargeActionPerformed

private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_goActionPerformed

private void textRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRegActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_textRegActionPerformed

    /**
    * @param args the command line arguments
    *//*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dischargePatient().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDischarge;
    private javax.swing.JButton buttonOk;
    private javax.swing.JDialog dialogSucesss;
    private javax.swing.JLabel fail;
    private javax.swing.JLabel fail2;
    private javax.swing.JButton go;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelDischarge;
    private javax.swing.JLabel labelSucess;
    private javax.swing.JTextField paychrg;
    private javax.swing.JTextField textCase;
    private javax.swing.JTextField textReg;
    private javax.swing.JLabel wrdchrg;
    // End of variables declaration//GEN-END:variables
}