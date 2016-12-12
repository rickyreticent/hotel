/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkManagersUI;

import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

import PO.hotelPromotionPO;
import RMICLIENT.RMIClient;

/**
 *
 * @author t
 */
public class StrategyFrame extends javax.swing.JFrame {

    /**
     * Creates new form StaffInformation
     */
    public StrategyFrame() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        MemberName = new javax.swing.JLabel();
        LoginMember = new javax.swing.JLabel();
        CurrentTime = new javax.swing.JLabel();
        LoginTime = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        Strategy = new javax.swing.JTable();
        Modify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Staff Information");
        setLocation(new java.awt.Point(380, 180));
        setPreferredSize(new java.awt.Dimension(747, 424));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(39, 43, 48));
        jPanel3.setPreferredSize(new java.awt.Dimension(747, 424));

        jPanel4.setBackground(new java.awt.Color(0, 76, 68));

        MemberName.setBackground(new java.awt.Color(255, 255, 255));
        MemberName.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        MemberName.setForeground(new java.awt.Color(153, 255, 153));
        MemberName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MemberName.setText("��Ա����");

        LoginMember.setBackground(new java.awt.Color(255, 255, 255));
        LoginMember.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        LoginMember.setForeground(new java.awt.Color(153, 255, 153));
        LoginMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginMember.setText("��¼��Ա��");

        NetworkManagersFrame frame=new NetworkManagersFrame();
        String time=frame.getTime;
        CurrentTime.setBackground(new java.awt.Color(255, 255, 255));
        CurrentTime.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        CurrentTime.setForeground(new java.awt.Color(153, 255, 153));
        CurrentTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentTime.setText(time);

        LoginTime.setBackground(new java.awt.Color(255, 255, 255));
        LoginTime.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        LoginTime.setForeground(new java.awt.Color(153, 255, 153));
        LoginTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTime.setText("��¼ʱ�䣺");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(LoginMember, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(LoginTime, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CurrentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginMember, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginTime, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CurrentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 76, 68));

        
        ArrayList<hotelPromotionPO> result= new ArrayList<hotelPromotionPO>();
        int site=0;
        //***�����õ�spacehehe�Ĳ���
        try {
			result=RMIClient.getPromotionService().getHotelPromotion("spacehehe");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        for(int i=0;i<Object.length;i++){
        	if(Object[i]==null){
        		site=i;
        		break;
        	}
        }
        for(int i=0;i<result.size();i++){
        	Object[i+site][0]="spacehehe";
        	Object[i+site][1]=result.get(i).getSerial();
        	if(result.get(i).getIsFullCut()){
        		Object[i+site][2]="Yes";
        	}else{
        		Object[i+site][2]="No";
        	}
        	Object[i+site][3]=String.valueOf(result.get(i).getMoneyCut());
        	if(result.get(i).getIsDiscount()){
        		Object[i+site][4]="Yes";
        	}else{
        		Object[i+site][4]="No";
        	}
        	Object[i+site][5]=String.valueOf(result.get(i).getdiscount());
        	Object[i+site][6]=result.get(i).getPromotionDescription();
        }
        //***�����õ�admin�Ĳ���
        ArrayList<hotelPromotionPO> result1= new ArrayList<hotelPromotionPO>();
        try {
			result1=RMIClient.getPromotionService().getHotelPromotion("admin");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        for(int i=0;i<Object.length;i++){
        	if(Object[i][0]==null){
        		
        		site=i;
        		break;
        	}
        }
        for(int i=0;i<result1.size();i++){
        	Object[i+site][0]="admin";
        	Object[i+site][1]=result1.get(i).getSerial();
        	if(result1.get(i).getIsFullCut()){
        		Object[i+site][2]="Yes";
        	}else{
        		Object[i][2]="No";
        	}
        	Object[i+site][3]=String.valueOf(result1.get(i).getMoneyCut());
        	if(result1.get(i).getIsDiscount()){
        		Object[i+site][4]="Yes";
        	}else{
        		Object[i+site][4]="No";
        	}
        	Object[i+site][5]=String.valueOf(result1.get(i).getdiscount());
        	Object[i+site][6]=result1.get(i).getPromotionDescription();
        }
        Strategy.setBackground(new java.awt.Color(0, 76, 68));
        Strategy.setModel(new javax.swing.table.DefaultTableModel(
            Object,
            new String [] {
               "ID", "���", "�Ƿ�����", "������", "�Ƿ����","������","��������"
            }

        ) {
            Class[] types = new Class [] {
            		java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                ,java.lang.String.class,java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
            
        });
        TableColumn column = null;  
        int colunms =Strategy.getColumnCount();  
        int num[]={85,45,70,45,70,45,134};
        
        for(int i=0;i<colunms;i++){
        	column = Strategy.getColumnModel().getColumn(i); 
            column.setPreferredWidth(num[i]);
        }
        Strategy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        Strategy.setForeground(new java.awt.Color(153, 255, 153));
        jScrollPane.setViewportView(Strategy);
        

        Modify.setBackground(new java.awt.Color(0, 76, 68));
        Modify.setFont(new java.awt.Font("΢���ź�", 1, 18)); // NOI18N
        Modify.setForeground(new java.awt.Color(153, 255, 153));
        Modify.setText("�޸�");
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>            
    

    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
    	new StrategyModify().setVisible(true);
    }                                      

   

    // Variables declaration - do not modify           
    public  String Object[][]=new String[20][7];
    private javax.swing.JButton Modify;
    private javax.swing.JLabel MemberName;
    private javax.swing.JLabel LoginMember;
    private javax.swing.JLabel CurrentTime;
    private javax.swing.JLabel LoginTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable Strategy;
    // End of variables declaration                   
}
