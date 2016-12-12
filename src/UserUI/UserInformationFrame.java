package UserUI;

import UI.LoginFrame; 
import VO.userDataVO;

/**
 *
 * @author ������
 */
public class UserInformationFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserInformationFrame
     */
    public UserInformationFrame(userDataVO data) {
    	this.data = data;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        signOutjButton = new javax.swing.JButton();
        modifNamejButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modifyPhonejButton = new javax.swing.JButton();
        rechargejButton = new javax.swing.JButton();
        modifySexjButton = new javax.swing.JButton();
        returnMainFramejButton = new javax.swing.JButton();
        creditjLabel = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        sexjLabel = new javax.swing.JLabel();
        phonejLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 180));

        jPanel1.setBackground(new java.awt.Color(39, 43, 48));
        jPanel1.setPreferredSize(new java.awt.Dimension(747, 424));

        jPanel2.setBackground(new java.awt.Color(0, 76, 68));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 76, 68));
        jLabel1.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("��ϵ��ʽ��");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(118, 155, 126, 62);

        jLabel3.setBackground(new java.awt.Color(0, 76, 68));
        jLabel3.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("����ֵ �� ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(118, 217, 144, 67);

        signOutjButton.setBackground(new java.awt.Color(0, 76, 68));
        signOutjButton.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        signOutjButton.setForeground(new java.awt.Color(153, 255, 153));
        signOutjButton.setText("�˳���¼");
        signOutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(signOutjButton);
        signOutjButton.setBounds(124, 343, 234, 43);

        modifNamejButton1.setBackground(new java.awt.Color(0, 76, 68));
        modifNamejButton1.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        modifNamejButton1.setForeground(new java.awt.Color(153, 255, 153));
        modifNamejButton1.setText("�޸�");
        modifNamejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifNamejButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(modifNamejButton1);
        modifNamejButton1.setBounds(575, 35, 89, 35);

        jLabel2.setBackground(new java.awt.Color(0, 76, 68));
        jLabel2.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("���� ��");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(118, 13, 126, 74);

        jLabel4.setBackground(new java.awt.Color(0, 76, 68));
        jLabel4.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 153));
        jLabel4.setText("�Ա� ��");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(118, 87, 126, 62);

        modifyPhonejButton.setBackground(new java.awt.Color(0, 76, 68));
        modifyPhonejButton.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        modifyPhonejButton.setForeground(new java.awt.Color(153, 255, 153));
        modifyPhonejButton.setText("�޸�");
        modifyPhonejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyPhonejButtonActionPerformed(evt);
            }
        });
        jPanel2.add(modifyPhonejButton);
        modifyPhonejButton.setBounds(575, 170, 89, 34);

        rechargejButton.setBackground(new java.awt.Color(0, 76, 68));
        rechargejButton.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        rechargejButton.setForeground(new java.awt.Color(153, 255, 153));
        rechargejButton.setText("��ֵ");
        rechargejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechargejButtonActionPerformed(evt);
            }
        });
        jPanel2.add(rechargejButton);
        rechargejButton.setBounds(575, 242, 89, 34);

        modifySexjButton.setBackground(new java.awt.Color(0, 76, 68));
        modifySexjButton.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        modifySexjButton.setForeground(new java.awt.Color(153, 255, 153));
        modifySexjButton.setText("�޸� ");
        modifySexjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifySexjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(modifySexjButton);
        modifySexjButton.setBounds(575, 107, 89, 34);

        returnMainFramejButton.setBackground(new java.awt.Color(0, 76, 68));
        returnMainFramejButton.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        returnMainFramejButton.setForeground(new java.awt.Color(153, 255, 153));
        returnMainFramejButton.setText("����");
        returnMainFramejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMainFramejButtonActionPerformed(evt);
            }
        });
        jPanel2.add(returnMainFramejButton);
        returnMainFramejButton.setBounds(430, 343, 234, 43);

        creditjLabel.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        creditjLabel.setForeground(new java.awt.Color(153, 255, 153));
        creditjLabel.setText(String.valueOf(data.getUserCredit()));
        jPanel2.add(creditjLabel);
        creditjLabel.setBounds(250, 230, 210, 40);

        namejLabel.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        namejLabel.setForeground(new java.awt.Color(153, 255, 153));
        namejLabel.setText(data.getUserName());
        jPanel2.add(namejLabel);
        namejLabel.setBounds(250, 30, 210, 40);

        sexjLabel.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        sexjLabel.setForeground(new java.awt.Color(153, 255, 153));
        sexjLabel.setText(data.gerUserSex());
        jPanel2.add(sexjLabel);
        sexjLabel.setBounds(250, 100, 210, 40);

        phonejLabel.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        phonejLabel.setForeground(new java.awt.Color(153, 255, 153));
        phonejLabel.setText(data.getUserTel());
        jPanel2.add(phonejLabel);
        phonejLabel.setBounds(250, 170, 210, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void signOutjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        this.setVisible(false);
        new UI.LoginFrame().setVisible(true);
    }                                              

    private void modifNamejButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    	this.setVisible(false);
    	new ModifyFrame(data,"name").setVisible(true);
    }                                                 

    private void modifyPhonejButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    	this.setVisible(false);
    	new ModifyFrame(data,"phone").setVisible(true);
    }                                                  

    private void rechargejButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void modifySexjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    	this.setVisible(false);
    	new ModifyFrame(data,"sex").setVisible(true);
    }                                                

    private void returnMainFramejButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
    	this.setVisible(false);
        new UserMainFrame(data).setVisible(true);
    }                                                      

    

    // Variables declaration - do not modify
    private userDataVO data;
    private javax.swing.JLabel creditjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton modifNamejButton1;
    private javax.swing.JButton modifyPhonejButton;
    private javax.swing.JButton modifySexjButton;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JLabel phonejLabel;
    private javax.swing.JButton rechargejButton;
    private javax.swing.JButton returnMainFramejButton;
    private javax.swing.JLabel sexjLabel;
    private javax.swing.JButton signOutjButton;
    // End of variables declaration                   
}

