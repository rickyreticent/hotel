package UI;

import java.rmi.RemoteException;  

import PO.hotelAccountPO;
import PO.hotelDataPO;
import RMICLIENT.RMIClient;
import VO.hotelAccountVO;
import VO.hotelDataVO;
import transform.POtoVO;
import transform.VOtoPO;

public class hotelSignUpJFrame extends javax.swing.JFrame {

    /**
     * Creates new form hotelSignUpJFrame
     */
    public hotelSignUpJFrame() {
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

        BGjPanel = new javax.swing.JPanel();
        signUpResultFrame = new javax.swing.JInternalFrame();
        signUpResuktBGjPanel = new javax.swing.JPanel();
        signUpResultJButton = new javax.swing.JButton();
        signUpResultFore = new javax.swing.JPanel();
        signUpSuccess = new javax.swing.JLabel();
        signUpFail = new javax.swing.JLabel();
        accountJPanel = new javax.swing.JPanel();
        passwordJLabel = new javax.swing.JLabel();
        accountjLabel = new javax.swing.JLabel();
        checkPasswordJLabel = new javax.swing.JLabel();
        accountJTextField = new javax.swing.JTextField();
        passwordJTextField = new javax.swing.JTextField();
        checkPasswordJTextField = new javax.swing.JTextField();
        check = new javax.swing.JButton();
        hotelDataJPanel = new javax.swing.JPanel();
        HotelNameJLabel = new javax.swing.JLabel();
        hotelTelJLabel = new javax.swing.JLabel();
        hotelIteoductionJLabel = new javax.swing.JLabel();
        hotelNameJTextField = new javax.swing.JTextField();
        hotelTelJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hotelIntroductionJTextArea = new javax.swing.JTextArea();
        checkHotelName = new javax.swing.JButton();
        signUpJButton = new javax.swing.JButton();
        CancleJButton = new javax.swing.JButton();
        hotelTelJLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(400, 300, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        BGjPanel.setBackground(new java.awt.Color(39, 43, 48));
        BGjPanel.setForeground(new java.awt.Color(255, 51, 51));
        BGjPanel.setLayout(null);

        signUpResultFrame.setVisible(false);

        signUpResuktBGjPanel.setBackground(new java.awt.Color(39, 43, 48));

        signUpResultJButton.setBackground(new java.awt.Color(0, 76, 68));
        signUpResultJButton.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        signUpResultJButton.setForeground(new java.awt.Color(153, 255, 153));
        signUpResultJButton.setText("ȷ��");
        signUpResultJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpResultJButtonActionPerformed(evt);
            }
        });

        signUpResultFore.setBackground(new java.awt.Color(0, 76, 68));
        signUpResultFore.setLayout(null);

        signUpSuccess.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        signUpSuccess.setForeground(new java.awt.Color(153, 255, 153));
        signUpSuccess.setText("ע��ɹ�");
        signUpResultFore.add(signUpSuccess);
        signUpSuccess.setBounds(150, 30, 100, 30);

        signUpFail.setFont(new java.awt.Font("΢���ź�", 1, 24)); // NOI18N
        signUpFail.setForeground(new java.awt.Color(153, 255, 153));
        signUpFail.setText("ע��ʧ��");
        signUpResultFore.add(signUpFail);
        signUpFail.setBounds(150, 30, 100, 30);

        javax.swing.GroupLayout signUpResuktBGjPanelLayout = new javax.swing.GroupLayout(signUpResuktBGjPanel);
        signUpResuktBGjPanel.setLayout(signUpResuktBGjPanelLayout);
        signUpResuktBGjPanelLayout.setHorizontalGroup(
            signUpResuktBGjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpResuktBGjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signUpResultFore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(signUpResuktBGjPanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(signUpResultJButton)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        signUpResuktBGjPanelLayout.setVerticalGroup(
            signUpResuktBGjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpResuktBGjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signUpResultFore, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signUpResultJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout signUpResultFrameLayout = new javax.swing.GroupLayout(signUpResultFrame.getContentPane());
        signUpResultFrame.getContentPane().setLayout(signUpResultFrameLayout);
        signUpResultFrameLayout.setHorizontalGroup(
            signUpResultFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpResuktBGjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        signUpResultFrameLayout.setVerticalGroup(
            signUpResultFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpResuktBGjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BGjPanel.add(signUpResultFrame);
        signUpResultFrame.setBounds(150, 120, 430, 200);

        accountJPanel.setBackground(new java.awt.Color(0, 76, 68));

        passwordJLabel.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        passwordJLabel.setForeground(new java.awt.Color(153, 255, 153));
        passwordJLabel.setText("���룺");

        accountjLabel.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        accountjLabel.setForeground(new java.awt.Color(153, 255, 153));
        accountjLabel.setText("�˺ţ�");

        checkPasswordJLabel.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        checkPasswordJLabel.setForeground(new java.awt.Color(153, 255, 153));
        checkPasswordJLabel.setText("ȷ�����룺");

        accountJTextField.setBackground(new java.awt.Color(0, 76, 68));
        accountJTextField.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        accountJTextField.setForeground(new java.awt.Color(153, 255, 153));
        accountJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountJTextFieldActionPerformed(evt);
            }
        });

        passwordJTextField.setBackground(new java.awt.Color(0, 76, 68));
        passwordJTextField.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        passwordJTextField.setForeground(new java.awt.Color(153, 255, 153));
        passwordJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJTextFieldActionPerformed(evt);
            }
        });

        checkPasswordJTextField.setBackground(new java.awt.Color(0, 76, 68));
        checkPasswordJTextField.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        checkPasswordJTextField.setForeground(new java.awt.Color(153, 255, 153));
        checkPasswordJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPasswordJTextFieldActionPerformed(evt);
            }
        });

        check.setBackground(new java.awt.Color(0, 76, 68));
        check.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        check.setForeground(new java.awt.Color(153, 255, 153));
        check.setText("���");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountJPanelLayout = new javax.swing.GroupLayout(accountJPanel);
        accountJPanel.setLayout(accountJPanelLayout);
        accountJPanelLayout.setHorizontalGroup(
            accountJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountJPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(accountJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkPasswordJLabel)
                    .addComponent(passwordJLabel)
                    .addComponent(accountjLabel))
                .addGap(18, 18, 18)
                .addGroup(accountJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkPasswordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        accountJPanelLayout.setVerticalGroup(
            accountJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountJPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(accountJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountjLabel)
                    .addComponent(accountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accountJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJLabel)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(accountJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPasswordJLabel)
                    .addComponent(checkPasswordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        BGjPanel.add(accountJPanel);
        accountJPanel.setBounds(20, 20, 700, 160);

        hotelDataJPanel.setBackground(new java.awt.Color(0, 76, 68));

        HotelNameJLabel.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        HotelNameJLabel.setForeground(new java.awt.Color(153, 255, 153));
        HotelNameJLabel.setText("�Ƶ����֣�");

        hotelTelJLabel.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        hotelTelJLabel.setForeground(new java.awt.Color(153, 255, 153));
        hotelTelJLabel.setText("�Ƶ�绰��");

        hotelIteoductionJLabel.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        hotelIteoductionJLabel.setForeground(new java.awt.Color(153, 255, 153));
        hotelIteoductionJLabel.setText("�Ƶ���ܣ�");

        hotelNameJTextField.setBackground(new java.awt.Color(0, 76, 68));
        hotelNameJTextField.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        hotelNameJTextField.setForeground(new java.awt.Color(153, 255, 153));
        hotelNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelNameJTextFieldActionPerformed(evt);
            }
        });

        hotelTelJTextField.setBackground(new java.awt.Color(0, 76, 68));
        hotelTelJTextField.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        hotelTelJTextField.setForeground(new java.awt.Color(153, 255, 153));
        hotelTelJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelTelJTextFieldActionPerformed(evt);
            }
        });

        hotelIntroductionJTextArea.setBackground(new java.awt.Color(0, 76, 68));
        hotelIntroductionJTextArea.setColumns(20);
        hotelIntroductionJTextArea.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        hotelIntroductionJTextArea.setForeground(new java.awt.Color(153, 255, 153));
        hotelIntroductionJTextArea.setLineWrap(true);
        hotelIntroductionJTextArea.setRows(5);
        jScrollPane1.setViewportView(hotelIntroductionJTextArea);

        checkHotelName.setBackground(new java.awt.Color(0, 76, 68));
        checkHotelName.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        checkHotelName.setForeground(new java.awt.Color(153, 255, 153));
        checkHotelName.setText("���");
        checkHotelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHotelNameActionPerformed(evt);
            }
        });

        signUpJButton.setBackground(new java.awt.Color(0, 76, 68));
        signUpJButton.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        signUpJButton.setForeground(new java.awt.Color(153, 255, 153));
        signUpJButton.setText("ע��");
        signUpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpJButtonActionPerformed(evt);
            }
        });

        CancleJButton.setBackground(new java.awt.Color(0, 76, 68));
        CancleJButton.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        CancleJButton.setForeground(new java.awt.Color(153, 255, 153));
        CancleJButton.setText("ȡ��");
        CancleJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancleJButtonActionPerformed(evt);
            }
        });

        hotelTelJLabel1.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        hotelTelJLabel1.setForeground(new java.awt.Color(153, 255, 153));
        hotelTelJLabel1.setText("�Ƶ�������");

        jComboBox1.setBackground(new java.awt.Color(0, 76, 68));
        jComboBox1.setForeground(new java.awt.Color(153, 255, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout hotelDataJPanelLayout = new javax.swing.GroupLayout(hotelDataJPanel);
        hotelDataJPanel.setLayout(hotelDataJPanelLayout);
        hotelDataJPanelLayout.setHorizontalGroup(
            hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hotelDataJPanelLayout.createSequentialGroup()
                .addGroup(hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hotelDataJPanelLayout.createSequentialGroup()
                        .addGroup(hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(hotelDataJPanelLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(hotelIteoductionJLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hotelDataJPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(signUpJButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hotelDataJPanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hotelDataJPanelLayout.createSequentialGroup()
                                .addComponent(hotelTelJLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(hotelDataJPanelLayout.createSequentialGroup()
                                    .addComponent(hotelTelJLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hotelTelJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(hotelDataJPanelLayout.createSequentialGroup()
                                    .addComponent(HotelNameJLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hotelNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hotelDataJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkHotelName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hotelDataJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(CancleJButton)
                        .addGap(43, 43, 43))))
        );
        hotelDataJPanelLayout.setVerticalGroup(
            hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hotelDataJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HotelNameJLabel)
                    .addComponent(hotelNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkHotelName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hotelTelJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hotelTelJLabel))
                .addGroup(hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hotelDataJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hotelTelJLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(hotelDataJPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hotelDataJPanelLayout.createSequentialGroup()
                        .addComponent(hotelIteoductionJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hotelDataJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(signUpJButton)
                            .addComponent(CancleJButton))
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        BGjPanel.add(hotelDataJPanel);
        hotelDataJPanel.setBounds(20, 200, 700, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void accountJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void passwordJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void checkPasswordJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {                                      
        try {
    		if(RMIClient.getAccountService().checkHotelIdExist(accountJTextField.getText())){
    			check.setText("��");
    		}else{
    			check.setText("��");
    		}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }                                     

    private void hotelNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void hotelTelJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void checkHotelNameActionPerformed(java.awt.event.ActionEvent evt) {                                               
    try {
    	if(RMIClient.getAccountService().checkHotelNameExist(hotelNameJTextField.getText())){
    		checkHotelName.setText("��");
    	}else{
    		checkHotelName.setText("��");
   		}
	}catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
    }                                              

    private void CancleJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.setVisible(false);
    }                                             

    private void signUpJButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	 boolean checkIsNull = false;
        if(!accountJTextField.getText().equals("")&&!passwordJTextField.getText().equals("")&&
        		!hotelNameJTextField.getText().equals("")&&!hotelTelJTextField.getText().equals("")&&
        			!hotelIntroductionJTextArea.getText().equals("")&&!checkPasswordJTextField.getText().equals(""))
        {
        	checkIsNull = true;
        
        	
        }
        if(checkIsNull){
        	hotelAccountPO accountPO = vtp.ToHotelAccountPO(
            	new hotelAccountVO(accountJTextField.getText(),passwordJTextField.getText()));
            	hotelDataVO DataVO = new hotelDataVO();
            	DataVO.setHotelName(hotelNameJTextField.getText());
            	DataVO.setHotelTel(hotelTelJTextField.getText());
            	DataVO.setHotelIntroduction(hotelIntroductionJTextArea.getText());
            	hotelDataPO DataPO = vtp.TOhotelDataPO(DataVO);
            	try {
            		if(RMIClient.getAccountService().hotelSignUp(accountPO, DataPO)){
            			signUpFail.setVisible(false);
    				    signUpSuccess.setVisible(true);   
    				}else{
    				    signUpFail.setVisible(true);
    				    signUpSuccess.setVisible(false);
    				}
            	} catch (RemoteException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    			signUpResultFrame.setVisible(true);
        	
        }else{
        	signUpSuccess.setVisible(false);
        	signUpFail.setVisible(true);
        	signUpResultFrame.setVisible(true);
        }
        
        
            	
            	
       
        
    }                                             

    private void signUpResultJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
    	 signUpResultFrame.setVisible(false);
    	 this.dispose();
    }                                                   


    
    
    private POtoVO ptv = new POtoVO();
    private VOtoPO vtp = new VOtoPO();
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JPanel BGjPanel;
    private javax.swing.JButton CancleJButton;
    private javax.swing.JLabel HotelNameJLabel;
    private javax.swing.JPanel accountJPanel;
    private javax.swing.JTextField accountJTextField;
    private javax.swing.JLabel accountjLabel;
    private javax.swing.JButton check;
    private javax.swing.JButton checkHotelName;
    private javax.swing.JLabel checkPasswordJLabel;
    private javax.swing.JTextField checkPasswordJTextField;
    private javax.swing.JPanel hotelDataJPanel;
    private javax.swing.JTextArea hotelIntroductionJTextArea;
    private javax.swing.JLabel hotelIteoductionJLabel;
    private javax.swing.JTextField hotelNameJTextField;
    private javax.swing.JLabel hotelTelJLabel;
    private javax.swing.JLabel hotelTelJLabel1;
    private javax.swing.JTextField hotelTelJTextField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JLabel signUpFail;
    private javax.swing.JButton signUpJButton;
    private javax.swing.JPanel signUpResuktBGjPanel;
    private javax.swing.JPanel signUpResultFore;
    private javax.swing.JInternalFrame signUpResultFrame;
    private javax.swing.JButton signUpResultJButton;
    private javax.swing.JLabel signUpSuccess;
    // End of variables declaration                   
}

