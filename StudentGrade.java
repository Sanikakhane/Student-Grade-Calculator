import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGrade extends JFrame{
    

    private JTextField Hindi;
    private JTextField English;
    private JTextField Science;
    private JTextField History;
    private JTextField Math;
    private JButton total;
    private JButton percentage;
    private JButton grade;

    private double t,p,g,h1,e1,s1,h2,m1;
    private JLabel t1,p1,g1,error;
    public StudentGrade()
    {
        setTitle("Student Grade calculator");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Hindi = new JTextField(20);
        English = new JTextField(20);
        Science = new JTextField(20);
        History = new JTextField(20);
        Math = new JTextField(20);
        t1 = new JLabel();
        p1 = new JLabel();
        g1 = new JLabel();
        error=new JLabel();
        total=new JButton("Total");
        percentage=new JButton("Percentage");
        grade=new JButton("Grade");
        setLayout(new FlowLayout());


        JLabel hindi= new JLabel("Hindi");
        hindi .setName("hindi");
        add(hindi);
        add(Hindi);

        JLabel english=new JLabel("English");
        english.setName("english");
        add(english);
        add(English);

        JLabel scinece=new JLabel("Science");
        scinece.setName("science");
        add(scinece);
        add(Science);

        JLabel history=new JLabel("History");
        history.setName("histry");
        add(history);
        add(History);

        JLabel math=new JLabel("Math");
        math.setName("math");
        add(math);
        add(Math);

        add(total);
        add(percentage);
        add(grade);

        add(t1);
        add(p1);
        add(g1);

        add(error);

       // initialization();
        total.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                initialization();
                calculateTotal();
            }
        });

        percentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePercentage();
            }
        });

        grade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateGrade();
            }
        });
    }
    private void initialization()
    {
        try {
            Double h=Double.parseDouble(Hindi.getText());
            Double e=Double.parseDouble(English.getText());
            Double s=Double.parseDouble(Science.getText());
            Double hi=Double.parseDouble(History.getText());
            Double m=Double.parseDouble(Math.getText());
            h1=h;
            e1=e;
            s1=s;
            h2=hi;
            m1=m;
        }
        catch (NumberFormatException e)
        {
            error.setText("Invalid number");
        }

    }
    private void calculateTotal()
    {
        t=h1+e1+s1+h2+m1;
        t1.setText("The Total Marks Of the student is :"+ t);
    }
    private void calculatePercentage()
    {
        p=(t*100)/500;
        p1.setText("The Percentage Of the student is :" + p);
    }
    private void calculateGrade()
    {
        if(p>90&&p<=100)
        {
            g1.setText("The Grade of the student is :"+ "A+");
        }
        else if(p>80&&p<=90)
        {
            g1.setText("The Grade of the student is :"+ "A");
        }
        else if(p>70&&p<=80)
        {
            g1.setText("The Grade of the student is :"+"B+");
        }
        else if(p>60&&p<=70)
        {
            g1.setText("The grade of the student is :"+"B");
        }
        else if(p>50&&p<=60)
        {
            g1.setText("The grade of the student is :"+"C+");
        }
        else if(p>40&&p<=50)
        {
            g1.setText("The grade of the student is :"+"C");
        }
        else if(p>=35&&p<=40)
        {
            g1.setText("The grade of the student is :"+"D");
        }
        else
        {
            g1.setText("Sorry This student fail the exam");
        }
    }
    public static void main(String[] args) {
		
                StudentGrade sc=new StudentGrade();
                sc.setVisible(true);

    }

}
