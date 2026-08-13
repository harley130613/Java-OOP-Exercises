/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author CAM LOAN
 */
public class BT6 extends JFrame {
    public BT6(String title){
        setTitle(title);
}
    public void doShow(){
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addControl();
        setResizable(false);
        setVisible(true);
}
    public void addControl(){
        JPanel	pb = new JPanel();
        pb.setLayout(new BorderLayout());
        JPanel	pn=new JPanel();
        JLabel	lblt=new JLabel("Cộng Trừ Nhân Chia");
        pn.add(lblt);
        pb.add(pn,BorderLayout.NORTH);
        lblt.setForeground(Color.BLUE);
        Font ft=new Font("arial", Font.BOLD, 25);
        lblt.setFont(ft);
        JPanel	pw=new JPanel();
        pw.setLayout(new BoxLayout(pw, BoxLayout.Y_AXIS));
        JButton	btnGiai=new JButton("Giải");
        JButton	btnXoa=new JButton("Xóa");
        JButton	btnThoat=new JButton("Thoát");
        pw.add(btnGiai);
        pw.add(Box.createVerticalStrut(10));
        pw.add(btnXoa);
        pw.add(Box.createVerticalStrut(10));
        pw.add(btnThoat);
        pb.add(pw,BorderLayout.WEST);
        pw.setBackground(Color.LIGHT_GRAY);
        Border	sb = BorderFactory.createLineBorder(Color.RED);
        TitledBorder stb = new TitledBorder(sb, "Chọn tác vụ");
        pw.setBorder(stb);
        JPanel	pnSouth = new JPanel();
        pnSouth.setPreferredSize(new Dimension(0, 30));
        pnSouth.setBackground(Color.PINK);
        JPanel	pns1=new JPanel();
        pns1.setBackground(Color.BLUE);
        pnSouth.add(pns1);
        JPanel	pns2=new JPanel();
        pns2.setBackground(Color.RED);
        pnSouth.add(pns2);
        JPanel	pns3=new JPanel();
        pns3.setBackground(Color.YELLOW);
        pnSouth.add(pns3);
        pb.add(pnSouth,BorderLayout.SOUTH);
        JPanel	pnCenter=new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter,BoxLayout.Y_AXIS));
        pb.add(pnCenter,BorderLayout.CENTER);
        Border	centerborder = BorderFactory.createLineBorder(Color.RED);
        TitledBorder centerTitleBorder= new TitledBorder(centerborder,"nhập 2 số a và b:");
        pnCenter.setBorder(centerTitleBorder);
        JPanel	pna=new JPanel();
        JLabel	lbla=new JLabel("nhập a:");
        final JTextField txta = new JTextField(15);
        pna.add(lbla);
        pna.add(txta);
        pnCenter.add(pna);
        JPanel	pnb=new JPanel();
        JLabel	lblb=new JLabel("nhập b:");
        final JTextField txtb=new JTextField(15);
        pnb.add(lblb);
        pnb.add(txtb);
        pnCenter.add(pnb);
        JPanel	pnc=new JPanel();
        JPanel	pnpheptoan=new JPanel();
        pnpheptoan.setLayout(new GridLayout(2,	2));
        pnpheptoan.setBorder(new TitledBorder(
        BorderFactory.createLineBorder(Color.BLACK),"Chọn phép toán:"));
        final JRadioButton radCong=new JRadioButton("Cộng");
        pnpheptoan.add(radCong);
        final JRadioButton radTru=new JRadioButton("Trừ");
        pnpheptoan.add(radTru);
        final JRadioButton radNhan=new JRadioButton("Nhân");
        pnpheptoan.add(radNhan);
        final JRadioButton radChia=new JRadioButton("Chia");
        pnpheptoan.add(radChia);
        ButtonGroup group=new ButtonGroup();
        group.add(radCong);group.add(radTru);
        group.add(radNhan);group.add(radChia);
        pnc.add(pnpheptoan);
        pnCenter.add(pnc);
        JPanel	pnkq=new JPanel();
        JLabel	lblkq=new JLabel("Kết quả:");
        final JTextField txtkq=new JTextField(15);
        pnkq.add(lblkq);
        pnkq.add(txtkq);
        pnCenter.add(pnkq);
        lbla.setPreferredSize(lblkq.getPreferredSize());
        lblb.setPreferredSize(lblkq.getPreferredSize());
        btnThoat.addActionListener(new ActionListener()	{
        public void actionPerformed(ActionEvent	arg0)	{
        int ret=JOptionPane.showConfirmDialog(null, "Bạn muốn thoát?",	"Thoát",JOptionPane.YES_NO_OPTION);
        if(ret==JOptionPane.YES_OPTION)
        System.exit(0);
    }
});
        btnXoa.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent	arg0){
        txta.setText("");
        txtb.setText("");
        txtkq.setText("");
        txta.requestFocus();
}
});
        btnGiai.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent	arg0){
        String	sa=txta.getText();
        int a=0,b=0;
        try{
        a=Integer.parseInt(sa);
}
        catch(Exception	ex)
        {
        JOptionPane.showMessageDialog(null, "a sai định dạng");
        txta.selectAll();
        txta.requestFocus();
        return;
        }
        String	sb=txtb.getText();
        try{
        b=Integer.parseInt(sb);
        }
        catch(Exception	ex)
        {
        JOptionPane.showMessageDialog(null, "b sai định dạng");
        txtb.selectAll();
        txtb.requestFocus();
    return;
}
    double kq=0;
    if(radCong.isSelected()){
    kq=(a+b);
    }
    else if(radTru.isSelected()){
    kq=(a-b);
    }
    else if(radNhan.isSelected()){
    kq=(a*b);
    }
    else{
    kq=a*1.0/b*1.0;
    }
    txtkq.setText(kq+"");
    }
    });
    Container	con=getContentPane();
    con.add(pb);
    }
    public static void main(String[]args){
        BT6 bt6 = new BT6 ("Cộng - Trừ - Nhân	- Chia");
        bt6.doShow();
    }
}
