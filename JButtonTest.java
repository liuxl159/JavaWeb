import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.net.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
public class JButtonTest extends JFrame{
	public JButtonTest(){
		setLayout(new GridLayout(3,2,5,5));//�������񲼾�
		setSize(300,300);
		Container c = getContentPane();//ת��Ϊ����
		for(int i=0;i<5;i++){
			//������ť��ͬʱ���ð�ť������ͼ��
			JButton J = new JButton("button"+i);
			c.add(J);
			if(i%2==0){
				J.setEnabled(false);//��������һЩ��ť������
			}
		}
		JButton jb = new JButton();
		jb.setMaximumSize(new Dimension(90,30));
		jb.setHideActionText(true);
		jb.setToolTipText("ͼƬ��ť");
		jb.setBorderPainted(false);
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					//�����Ի���ȷ��
					JOptionPane.showMessageDialog(null,"�����Ի���ȷ��");
				}
			});
		c.add(jb);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String []args)
	{
		JButtonTest jb = new JButtonTest();
	}
}