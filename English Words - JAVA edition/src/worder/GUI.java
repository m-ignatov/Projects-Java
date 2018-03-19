package worder;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    static String fileName = "src\\worder\\data.txt";
    static String line = null;
    static BufferedReader bufferedReader;
    static ArrayList<Map> list = new ArrayList<Map>();

    static int fromBG = 1, size = 0, ind, br = 0;
    static boolean[] used = new boolean[2000]; //Масив за използваните думи

    public GUI() {
        initComponents();

        Image i = Toolkit.getDefaultToolkit().getImage("src/worder/resources/icon.png");
        setIconImage(i);
        checkBox.setVisible(false);
        
        reader();
        generateWord();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        placeHolder = new javax.swing.JLabel();
        checkBox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Worder");
        setBackground(new java.awt.Color(51, 153, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("изберете език:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("БЪЛГАРСКИ ЕЗИК");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("АНГЛИЙСКИ ЕЗИК");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worder/resources/swap.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jButton1.setText("ПРОДЪЛЖИ");
        jButton1.setToolTipText("");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        placeHolder.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        placeHolder.setForeground(new java.awt.Color(51, 51, 51));
        placeHolder.setText("place");

        checkBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worder/resources/complete-icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(placeHolder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(233, 233, 233))
            .addGroup(layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placeHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBox))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //За ефекта на стрелките за езиците
    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worder/resources/swap_click.png")));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worder/resources/swap.png")));
    }//GEN-LAST:event_jLabel4MouseExited

    //При натискане на стрелките за езиците
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        String tmp = jLabel2.getText();
        jLabel2.setText(jLabel3.getText());
        jLabel3.setText(tmp);

        fromBG ^= 1;
        br = 0;
        used = new boolean[2000];

        checkBox.setVisible(false);
        jTextField1.setEnabled(true);
        jButton1.setEnabled(false);
        jTextField1.setText("");

        generateWord();
    }//GEN-LAST:event_jLabel4MouseClicked

    //При въвеждане на текст
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        if (comparator())
        {
            checkBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worder/resources/complete-icon.png")));
            checkBox.setVisible(true);
            jTextField1.setEnabled(false);
            jButton1.setEnabled(true);
        }
        else
        {
            checkBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worder/resources/incomplete-icon.png")));
            checkBox.setVisible(true);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    //При натискане на бутона ОК
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (br >= size) {
            JOptionPane.showMessageDialog(null, "Край на думите", "Worder", JOptionPane.INFORMATION_MESSAGE);
            jButton1.setEnabled(true);
            return;
        }
        checkBox.setVisible(false);
        jTextField1.setEnabled(true);
        jButton1.setEnabled(false);
        jTextField1.setText("");
        generateWord();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JLabel placeHolder;
    // End of variables declaration//GEN-END:variables
    
    //Четец на текстовия файл
    static void reader() {
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));

            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() > 2) {
                    String w = new String();
                    String t = new String();

                    for (int k = 0; k < line.length(); k++) {
                        if (line.charAt(k) == ',') {
                            w = line.substring(0, k);
                            t = line.substring(k + 1, line.length());
                            break;
                        }
                    }
                    list.add(new Map(w, t));
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
        size = list.size();
    }
    
    //Генерира нова дума
    static void generateWord() {
        br++;
        ind = ThreadLocalRandom.current().nextInt(0, size);

        while (used[ind]) {
            ind = ThreadLocalRandom.current().nextInt(0, size);
        }

        used[ind] = true;
        setter(list.get(ind).word, list.get(ind).trans);
    }
    
    //Задава коректно думите, които генерира, взависимост от избрания език
    static void setter(String w, String t) {
        if (fromBG == 1) {
            placeHolder.setText(t);
        } else {
            placeHolder.setText(w);
        }
    }
 
    //Сравнява дали въведения текст и търсената дума са еднакви
    static boolean comparator() {
        if (fromBG == 1 && jTextField1.getText().equals(list.get(ind).word)) {
            return true;
        } else if (fromBG == 0 && jTextField1.getText().equals(list.get(ind).trans)) {
            return true;
        }
        return false;
    }
}
