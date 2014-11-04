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
		setLayout(new GridLayout(3,2,5,5));//设置网格布局
		setSize(300,300);
		Container c = getContentPane();//转换为容器
		for(int i=0;i<5;i++){
			//创建按钮，同时设置按钮文字与图标
			JButton J = new JButton("button"+i);
			c.add(J);
			if(i%2==0){
				J.setEnabled(false);//设置其中一些按钮不可用
			}
		}
		JButton jb = new JButton();
		jb.setMaximumSize(new Dimension(90,30));
		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮");
		jb.setBorderPainted(false);
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					//弹出对话框确认
					JOptionPane.showMessageDialog(null,"弹出对话框确认");
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