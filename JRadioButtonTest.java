import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import java.awt.Container;

public class JRadioButtonTest extends JFrame{
	private JRadioButton jr1;
	private JRadioButton jr2;
	private JRadioButton jr3;
	private JPanel jp1;
	private ButtonGroup bg1;
	public JRadioButtonTest(){
		jr1 = new JRadioButton("liuxiaoli",true);
		jr2 = new JRadioButton("dengqingyan");
		jr3 = new JRadioButton("others");
		jp1 = new JPanel();
		bg1 = new ButtonGroup();
		Container  jRcon = getContentPane();
		bg1.add(jr1);
		bg1.add(jr2);
		bg1.add(jr3);
		jp1.add(jr1);
		jp1.add(jr2);
		jp1.add(jr3);
		jRcon.add(jp1);
		
		this.setTitle("JRadioButton≤‚ ‘");
		this.setSize(300,300);
		this.setLayout(new GridLayout(1,2,4,4));
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
		
	public static void main(String []args){
		JRadioButtonTest jrbt1 = new JRadioButtonTest();
	}
}