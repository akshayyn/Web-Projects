/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Citizen;


import Business.Organization.AdminOrganization;
import Business.Organization.Organization;

import Citizen.Citizen;
import business.Area.Area;
import business.MedicalHistory.VitalSign;
import business.WorkQueue.CitizenRegistrationWorkRequest;
import business.sensors.AsthamaInhalerSensor;
import businessLogic.formValidation.FormValidator;
import businessLogic.formValidation.NumericDocumentFilter;
import bussinesslogic.email.SendMail;
import controller.vitalSigns.VitalSignProcessor;
import java.awt.CardLayout;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javafx.util.converter.LocalDateStringConverter;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Aks
 */
public class RegisterMedicalRecordJPanel extends javax.swing.JPanel {
    private JPanel userProcesContainer;
    private Citizen citizen;
    private Area area;
    /**
     * Creates new form RegisterMedicalRecordJPanel
     */
    public RegisterMedicalRecordJPanel(JPanel up,Area area, Citizen citizen) {
        initComponents();
        userProcesContainer = up;
        this.citizen = citizen;
        this.area = area;
        asthamaGroup.setSelected(jRadioButton2.getModel(), true);
        copdGroup.setSelected(jRadioButton3.getModel(), true);
        lungCancerGroup.setSelected(jRadioButton6.getModel(), true);
        addDocumentFilters();
    }

    RegisterMedicalRecordJPanel(JPanel userPanel, Citizen citizen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void addDocumentFilters(){
        PlainDocument resRateDoc = (PlainDocument) resRateField.getDocument();
        resRateDoc.setDocumentFilter(new NumericDocumentFilter());
        
        PlainDocument heartRateDoc = (PlainDocument) heartRateField.getDocument();
        heartRateDoc.setDocumentFilter(new NumericDocumentFilter());
        
        PlainDocument bpDoc = (PlainDocument) bpField.getDocument();
        bpDoc.setDocumentFilter(new NumericDocumentFilter());
        
        PlainDocument weightDoc = (PlainDocument) weightField.getDocument();
        weightDoc.setDocumentFilter(new NumericDocumentFilter());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asthamaGroup = new javax.swing.ButtonGroup();
        copdGroup = new javax.swing.ButtonGroup();
        lungCancerGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        resRateField = new javax.swing.JTextField();
        heartRateField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bpField = new javax.swing.JTextField();
        regButton = new javax.swing.JButton();

        setForeground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Add Medical History");

        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Are you an Asthama Patient");

        asthamaGroup.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButton1.setText("Yes");

        asthamaGroup.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButton2.setText("No");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        copdGroup.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButton3.setText("No");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Are you a COPD Patient");

        copdGroup.add(jRadioButton4);
        jRadioButton4.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButton4.setText("Yes");

        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Are you a Lung Cancer Patient");

        lungCancerGroup.add(jRadioButton5);
        jRadioButton5.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButton5.setText("Yes");

        lungCancerGroup.add(jRadioButton6);
        jRadioButton6.setForeground(new java.awt.Color(0, 102, 153));
        jRadioButton6.setText("No");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Respiratory Rate");

        resRateField.setForeground(new java.awt.Color(0, 102, 153));

        heartRateField.setForeground(new java.awt.Color(0, 102, 153));

        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Heart  Rate");

        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Weight");

        weightField.setForeground(new java.awt.Color(0, 102, 153));
        weightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightFieldActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Systolic Blood Pressure");

        bpField.setForeground(new java.awt.Color(0, 102, 153));

        regButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        regButton.setForeground(new java.awt.Color(0, 102, 153));
        regButton.setText("Register");
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(51, 51, 51)
                        .addComponent(jRadioButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bpField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(heartRateField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton6))
                            .addComponent(resRateField)
                            .addComponent(weightField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(regButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(resRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(heartRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(58, 58, 58)
                .addComponent(regButton)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void weightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightFieldActionPerformed
       
        
    }//GEN-LAST:event_weightFieldActionPerformed

    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regButtonActionPerformed
        FormValidator fv = new FormValidator();
        VitalSignProcessor vsp = new VitalSignProcessor();
        if(fv.verifyStringInput(resRateField.getText()) &&
              fv.verifyStringInput(heartRateField.getText()) &&
                fv.verifyStringInput(bpField.getText()) &&
                fv.verifyStringInput(weightField.getText())){
            VitalSign vs = citizen.getHealthReport().addVitalSigns();
            vs.setRespiratoryRate(Float.parseFloat(resRateField.getText().trim()));
            vs.setHeartRate(Float.parseFloat(heartRateField.getText().trim()));
            vs.setSystolicBloodPressure(Float.parseFloat(bpField.getText().trim()));
            vs.setWeight(Float.parseFloat(weightField.getText().trim()));
            Calendar currentDateCalendar = new GregorianCalendar();
            Calendar birthDate = new GregorianCalendar();
            currentDateCalendar.setTime(citizen.getPerson().getDateOfBirth());
            birthDate.setTime(new Date());
            int diffYear = currentDateCalendar.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
            //vs.setAge(diffYear);
            vs.setVitalSignsNormal(vsp.verifyVitalSigns(vs, diffYear));
            vs.setTimeStamp(new Date());
            if(asthamaGroup.isSelected(jRadioButton1.getModel())){
                citizen.getHealthReport().setIsAsthamaPatient(true);
                AsthamaInhalerSensor sensor = area.getSensorNetwork().addAsthamaInhalerSensor();
                citizen.getHealthReport().setAsthamaInhalerSensor(sensor);
            }
            if(copdGroup.isSelected(jRadioButton4.getModel())){
                citizen.getHealthReport().setIsCOPDPatient(true);
            }
            if(lungCancerGroup.isSelected(jRadioButton5.getModel())){
                citizen.getHealthReport().setIsLungCancerPatient(true);
            }
            if (!vs.isVitalSignsNormal()) {
                SendMail mailer = new SendMail();
                mailer.sendAbnormalVitalSignsEmail(citizen, vs);
            }
            JOptionPane.showMessageDialog(null, "Step 2 Complete! Press Save on left side to Finish registration");
            sendRequestToAreaAdmin(citizen);
        }
        else{
            JOptionPane.showMessageDialog(null, "One or more field empty or Invalid. Vital Signs Could not be added");
        }
        
    }//GEN-LAST:event_regButtonActionPerformed
    public void sendRequestToAreaAdmin(Citizen c){
        String message = "Register Me!";
        
        CitizenRegistrationWorkRequest request = new CitizenRegistrationWorkRequest();
        request.setMessage(message);
        request.setCitizen(citizen);
        request.setStatus("Sent");
        
        if (area!=null){
            area.getWorkQueue().getWorkRequestList().add(request);
            //userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup asthamaGroup;
    private javax.swing.JTextField bpField;
    private javax.swing.ButtonGroup copdGroup;
    private javax.swing.JTextField heartRateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.ButtonGroup lungCancerGroup;
    private javax.swing.JButton regButton;
    private javax.swing.JTextField resRateField;
    private javax.swing.JTextField weightField;
    // End of variables declaration//GEN-END:variables
}