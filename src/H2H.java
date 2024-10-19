import javax.swing.*;
import java.awt.*;
import java.awt.color.*;

public class H2H {

    private static JFrame mainFrame;
    private static JPanel mainPanel;

    public static void main(String[] args) {
        // Create the main frame
        mainFrame = new JFrame("Hare 2 Help");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1920, 1080);
        mainFrame.setLayout(new BorderLayout());

        // Initialize the main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Add the title page content
        showTitlePage();

        // Add the main panel to the frame
        mainFrame.add(mainPanel, BorderLayout.CENTER);

        // Make the main frame visible
        mainFrame.setVisible(true);
    }

    private static void showTitlePage() {
        // Clear the main panel
        mainPanel.removeAll();

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/hare.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Create a button to proceed to the main content
        JButton continueButton = new JButton("Continue");
        continueButton.setBackground(new Color(240,230,210));
        continueButton.setFont(new Font("Arial", Font.PLAIN, 70));
        continueButton.addActionListener(e -> helpwho());
        mainPanel.add(continueButton, BorderLayout.SOUTH);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private static void helpwho() {
        // Clear the main panel
        mainPanel.removeAll();

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/helpwho.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Create buttons for each choice
        JButton button1 = new JButton("Choose Yourself");
        button1.setBackground(new Color(255, 182, 193));
        JButton button2 = new JButton("Choose Others");
        button2.setBackground(new Color(255, 182, 193));

        // Add action listeners to the buttons
        button1.addActionListener(e -> mainpageyou());
        button2.addActionListener(e -> showChoicePage2());

        // Add buttons to the button panel
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        
        // Format Font
        button1.setFont(new Font("Arial", Font.PLAIN, 70));
        button2.setFont(new Font("Arial", Font.PLAIN, 70));

        // Add the button panel to the main panel
        button1.setHorizontalAlignment(JLabel.CENTER);
        button2.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private static void mainpageyou() {
        // Clear the main panel
        mainPanel.removeAll();

        // Insert Image into body 
        ImageIcon imageIcon = new ImageIcon("src/resources/images/user.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> helpwho());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);
        
        // Create a panel for the bottom buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        
        // Create buttons for each choice
        JButton buttonage1 = new JButton("Seizure");
        JButton buttonage2 = new JButton("Choking");
        JButton buttonage3 = new JButton("Cardiac Arrest");
        
        // Add action listeners to the buttons
        buttonage1.addActionListener(e -> seizureyou());
        buttonage2.addActionListener(e -> chokingyou());
        buttonage3.addActionListener(e -> cardiac());
        
        // Add buttons to the button panel
        buttonPanel.add(buttonage1);
        buttonPanel.add(buttonage2);
        buttonPanel.add(buttonage3);
        
        // Format Font
        buttonage1.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonage2.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonage3.setFont(new Font("Arial", Font.PLAIN, 70));       
        
        // Add the button panel to the main panel
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void seizureyou() {
    	// Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpageyou());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/seizureself.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void chokingyou() {
    	// Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpageyou());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/chokeself.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void cardiac() {
    	// Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpageyou());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/cardiacself.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void showChoicePage2() {
        // Clear the main panel
        mainPanel.removeAll();
        
        // Body
        JLabel choicesLabel = new JLabel("Body");
        choicesLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        choicesLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(choicesLabel, BorderLayout.CENTER);

        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> helpwho());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/agerange.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Create buttons for each choice
        JButton buttonage1 = new JButton("Child");
        JButton buttonage2 = new JButton("Adult");
        JButton buttonage3 = new JButton("Elderly");
        
        // Add action listeners to the buttons
        buttonage1.addActionListener(e -> mainpagechild());
        buttonage2.addActionListener(e -> mainpageadult());
        buttonage3.addActionListener(e -> mainpageelder());
        
        // Add buttons to the button panel
        buttonPanel.add(buttonage1);
        buttonPanel.add(buttonage2);
        buttonPanel.add(buttonage3);
        
        // Format Font
        buttonage1.setFont(new Font("Arial", Font.PLAIN, 100));
        buttonage2.setFont(new Font("Arial", Font.PLAIN, 100));
        buttonage3.setFont(new Font("Arial", Font.PLAIN, 100));
        
        // Add the button panel to the main panel
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private static void mainpagechild() {
        // Clear the main panel
        mainPanel.removeAll();
        
        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/child.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> showChoicePage2());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);
        
        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        
        // Create buttons for each choice
        JButton buttonage1 = new JButton("Seizure");
        JButton buttonage2 = new JButton("Choking");
        JButton buttonage3 = new JButton("CPR");
        
        // Add action listeners to the buttons
        buttonage1.addActionListener(e -> seizurechild());
        buttonage2.addActionListener(e -> chokingchild());
        buttonage3.addActionListener(e -> cprchild());

        
        // Add buttons to the button panel
        buttonPanel.add(buttonage1);
        buttonPanel.add(buttonage2);
        buttonPanel.add(buttonage3);
        
        // Format Font
        buttonage1.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonage2.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonage3.setFont(new Font("Arial", Font.PLAIN, 70));
        
        // Add the button panel to the main panel
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        
        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void seizurechild() {
    	// Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpagechild());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/seizureother.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void chokingchild() {
    	// Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpagechild());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/chokeother.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void cprchild() {
    	// Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpagechild());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/cprchild.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void mainpageadult() {
        // Clear the main panel
        mainPanel.removeAll();
        
        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/adult.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> showChoicePage2());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);
        
        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        
        
        // Create buttons for each choice
        JButton buttonage1 = new JButton("Seizure");
        JButton buttonage2 = new JButton("Choking");
        JButton buttonage3 = new JButton("CPR");
        
        // Add action listeners to the buttons
        buttonage1.addActionListener(e -> seizureadult());
        buttonage2.addActionListener(e -> chokingadult());
        buttonage3.addActionListener(e -> cpradult());
        
        // Add buttons to the button panel
        buttonPanel.add(buttonage1);
        buttonPanel.add(buttonage2);
        buttonPanel.add(buttonage3);
        
        // Format Font
        buttonage1.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonage2.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonage3.setFont(new Font("Arial", Font.PLAIN, 70));
        
        // Add the button panel to the main panel
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void seizureadult() {
    	// Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpageadult());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/seizureother.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();    
}
    
    private static void chokingadult() {
    	// Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpageadult());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/chokeother.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void cpradult() {
    	// Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpageadult());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/cprother.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void mainpageelder() {
        // Clear the main panel
        mainPanel.removeAll();
        
        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/gramp.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> showChoicePage2());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);
        
        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
                
        // Create buttons for each choice
        JButton buttonage1 = new JButton("Seizure");
        JButton buttonage2 = new JButton("Choking");
        JButton buttonage3 = new JButton("CPR");
        
        // Add action listeners to the buttons
        buttonage1.addActionListener(e -> seizureelder());
        buttonage2.addActionListener(e -> chokingelder());
        buttonage3.addActionListener(e -> cprelder());
        
        
        // Add buttons to the button panel
        buttonPanel.add(buttonage1);
        buttonPanel.add(buttonage2);
        buttonPanel.add(buttonage3);
        
        // Format Font
        buttonage1.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonage2.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonage3.setFont(new Font("Arial", Font.PLAIN, 70));
        
        // Add the button panel to the main panel
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void seizureelder() {
    	// Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpageelder());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/seizureother.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void chokingelder() {
    	// Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpageelder());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/chokeother.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void cprelder() {
        // Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbutton = new JButton("Return");
        returnbutton.addActionListener(e -> mainpageelder());
        returnbutton.setFont(new Font("Arial", Font.PLAIN, 24));
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 24));
        
        // Congratulations Screen
        JButton congratulations = new JButton("Finish Lesson");
        congratulations.addActionListener(e -> congratulations());
        congratulations.setFont(new Font("Arial", Font.PLAIN, 24));
        congratulations.setBackground(new Color(255, 255,210));
        returnPanel.add(congratulations, BorderLayout.CENTER);
        mainPanel.add(returnPanel, BorderLayout.SOUTH);
        
        // Add return button to panels
        returnPanel.add(returnbutton, BorderLayout.WEST);
        returnPanel.add(returnbuttonstart, BorderLayout.EAST);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.NORTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/cprother.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    
    private static void congratulations() {
        // Clear the main panel
        mainPanel.removeAll();
        
        // Create a panel for a return button
        JPanel returnPanel = new JPanel(new BorderLayout());
        
        JButton returnbuttonstart = new JButton("Return to Start");
        returnbuttonstart.addActionListener(e -> helpwho());
        returnbuttonstart.setFont(new Font("Arial", Font.PLAIN, 70));
        
        // Add return button to panels
        returnPanel.add(returnbuttonstart, BorderLayout.CENTER);
        
        // Add the return button panel to the main panel
        mainPanel.add(returnPanel, BorderLayout.SOUTH);

        // Add image
        ImageIcon imageIcon = new ImageIcon("src/resources/images/caterpillar.png");
        JLabel imageLabel = new JLabel(imageIcon);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        // Refresh the panel
        mainPanel.revalidate();
        mainPanel.repaint();
        
        
    }
    
}