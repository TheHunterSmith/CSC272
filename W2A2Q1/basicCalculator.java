import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

class TimerHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println(new Date());
	}
}

public class basicCalculator implements ActionListener {
	
	public basicCalculator() {
		Timer t = new Timer(1000, new TimerHandler());
		t.start();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new basicCalculator();
			}
		});
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
