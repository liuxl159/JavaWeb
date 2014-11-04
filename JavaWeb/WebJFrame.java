
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
public class WebJFrame extends JFrame{
	public WebJFrame()
	{
		this.setTitle("华东师范大学云盘客户端");
		Container webContaier = getContentPane();
		GridBagLayout webLayout = new GridBagLayout();
		webContaier.setLayout(webLayout);
		GridBagConstraints webLayoutCon = new GridBagConstraints();
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null); 
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String []args){
		WebJFrame webJF=new WebJFrame(); 
	}
}