import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.WindowConstants;

public class GridLayoutPosition extends javax.swing.JFrame{//使用网格布局
	public GridLayoutPosition(){//创建构造方法
		setTitle("使用窗格布局");
		setLayout(new GridLayout(7,2,1,2));//使用网格类进行布局，7行2列，水平间距1，垂直间距2
		Container  mycontainer = getContentPane();//转换为容器
		setSize(300,300);
		for(int i=0;i<13;i++)
			mycontainer.add(new JButton("button"+i));//添加button
		setVisible(true);//设置可见
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭方式
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}
	public static void main(String args[]){
		new GridLayoutPosition();//新建实例
	}

}
