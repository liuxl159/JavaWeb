import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.WindowConstants;

public class GridLayoutPosition extends javax.swing.JFrame{//ʹ�����񲼾�
	public GridLayoutPosition(){//�������췽��
		setTitle("ʹ�ô��񲼾�");
		setLayout(new GridLayout(7,2,1,2));//ʹ����������в��֣�7��2�У�ˮƽ���1����ֱ���2
		Container  mycontainer = getContentPane();//ת��Ϊ����
		setSize(300,300);
		for(int i=0;i<13;i++)
			mycontainer.add(new JButton("button"+i));//���button
		setVisible(true);//���ÿɼ�
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//���ùرշ�ʽ
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}
	public static void main(String args[]){
		new GridLayoutPosition();//�½�ʵ��
	}

}
