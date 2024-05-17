import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccountGUI extends JFrame {
    private JTextField initialDepositField;
    private JTextField interestRateField;
    private JTextField yearsField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public BankAccountGUI() {
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Initial Deposit:"));
        initialDepositField = new JTextField();
        add(initialDepositField);

        add(new JLabel("Annual Interest Rate:"));
        interestRateField = new JTextField();
        add(interestRateField);

        add(new JLabel("Number of Years:"));
        yearsField = new JTextField();
        add(yearsField);

        calculateButton = new JButton("Calculate New Balance");
        add(calculateButton);

        resultLabel = new JLabel("Final Balance: ");
        add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double initialDeposit = Double.parseDouble(initialDepositField.getText());
                double annualInterestRate = Double.parseDouble(interestRateField.getText());
                int years = Integer.parseInt(yearsField.getText());

                BankAccount account = new BankAccount(initialDeposit, annualInterestRate);
                double finalBalance = account.calculateFinalBalance(years);

                resultLabel.setText("Final Balance: " + finalBalance);
            }
        });

        setSize(450, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BankAccountGUI();
    }
}

class BankAccount {
    private double balance;
    private double annualInterestRate;

    public BankAccount(double initialDeposit, double annualInterestRate) {
        this.balance = initialDeposit;
        this.annualInterestRate = annualInterestRate;
    }

    //I think this is how compounded intrest is gotten?
    public double calculateFinalBalance(int years) {
        for (int i = 0; i < years; i++) {
            balance += balance * annualInterestRate;
        }
        return balance;
    }
}