/*
 * VoicePanel.java
 *
 * Created on 17. September 2009, 17:25
 */

package marytts.tools.install;

import java.util.Locale;

/**
 *
 * @author  marc
 */
public class VoicePanel extends javax.swing.JPanel {
    
    private VoiceComponentDescription desc;
    
    /** Creates new form VoicePanel */
    public VoicePanel(VoiceComponentDescription desc) {
        this.desc = desc;
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        lName = new javax.swing.JLabel();
        lNameValue = new javax.swing.JLabel();
        lName1 = new javax.swing.JLabel();
        lNameValue1 = new javax.swing.JLabel();
        lName2 = new javax.swing.JLabel();
        lNameValue2 = new javax.swing.JLabel();
        lNameValue3 = new javax.swing.JLabel();
        lName3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lName4 = new javax.swing.JLabel();
        lNameValue4 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(desc.getLocale().getDisplayName(Locale.ENGLISH)+" voice"));
        lName.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        lName.setText("Name:");

        lNameValue.setText(desc.getName());

        lName1.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        lName1.setText("Type:");

        lNameValue1.setText(desc.getType());

        lName2.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        lName2.setText("Version:");

        lNameValue2.setText(desc.getDisplayPackageSize());

        lNameValue3.setText(desc.getVersion());

        lName3.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        lName3.setText("Size:");

        jScrollPane1.setFont(new java.awt.Font("Courier New", 0, 10));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 10));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setText(desc.getDescription());
        jScrollPane1.setViewportView(jTextArea1);

        lName4.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        lName4.setText("Status:");

        lNameValue4.setText(desc.getStatus().toString());

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(lName)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lNameValue)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lName1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lNameValue1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 39, Short.MAX_VALUE)
                        .add(lName2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lNameValue3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lName3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lNameValue2))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(lName4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lNameValue4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lNameValue2)
                    .add(lName3)
                    .add(lNameValue3)
                    .add(lName2)
                    .add(lName)
                    .add(lNameValue)
                    .add(lName1)
                    .add(lNameValue1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lName4)
                    .add(lNameValue4)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lName1;
    private javax.swing.JLabel lName2;
    private javax.swing.JLabel lName3;
    private javax.swing.JLabel lName4;
    private javax.swing.JLabel lNameValue;
    private javax.swing.JLabel lNameValue1;
    private javax.swing.JLabel lNameValue2;
    private javax.swing.JLabel lNameValue3;
    private javax.swing.JLabel lNameValue4;
    // End of variables declaration//GEN-END:variables
    
}
