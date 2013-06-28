package de.htwg.battleship.view.gui;

import java.awt.Color;

import javax.swing.JFormattedTextField;
import javax.swing.JPanel;

import com.google.inject.Inject;

import de.htwg.battleship.controller.IController;

/**
 *
 * @author Sandro
 */
@SuppressWarnings("serial")
public class BattleshipInfos extends JPanel {

	private JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private JFormattedTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    Color background = new Color(255, 255, 255);
    IController controller;

    /**
     * declares some minor attributes/options/information
     * @param controller
     */
    @Inject
    public BattleshipInfos(IController controller) {
    	
    	this.controller = controller;
        
        jTextField2 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(background);
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        
        setBackground(background);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jTextField2.setBackground(background);
        jTextField2.setForeground(new java.awt.Color(0, 0, 102));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText(controller.getStatus());
        jTextField2.setAutoscrolls(false);
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Status:"));
        jTextField2.setName("");

        jTextField3.setEditable(false);
        jTextField3.setBackground(background);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField3.setForeground(new java.awt.Color(104, 161, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Flotte des Bots");
        jTextField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.setPreferredSize(new java.awt.Dimension(88, 23));
        jTextField3.setSelectionEnd(12);
        jTextField3.setSelectionStart(12);

        jTextField1.setEditable(false);
        jTextField1.setBackground(background);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField1.setForeground(new java.awt.Color(104, 161, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Deine Flotte");
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.setScrollOffset(0);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }
    
    /**
     * asks the controller for it�s statusline
     */
    public void update() {
    	jTextField2.setValue(controller.getStatus());
    	revalidate();
    }
}
