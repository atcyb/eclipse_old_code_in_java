package worldGeography;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Planets 
{
	// frame
    JFrame f;
    // Table
    JTable j;
  
    // Constructor
    Planets()
    {
        // Frame initiallization
        f = new JFrame();
  
        // Frame Title
        f.setTitle("Planets and Their Characteristics");
  
        // Data to be displayed in the JTable
        String[][] data = {
            { "Mercury", "Nearest planet to sun and smallest planet.                                         "},
            { "Venus","Known as evening star.it is brightest planet, Nearest planet to Earth, Hottest planet."},
            { "Earth","It is known as ‘blue planet’ due to presence of Water.life is possible only on Earth. "},
            { "Mars","It is known as ‘Red planet’.                                                           "},
            { "Jupitar","It is Biggest planet. Fastest revolution in solar System (9.8 hour only).           "},
            { "Saturn","Second Biggest planet.                                                               "},
            { "Uranus","It is Green planet.                                                                  "},
            { "Neptune","Slowest revolution in solar system. Farthest planet from sun.                       "},
            
        };
  
        // Column Names
        String[] columnNames = { "Planets", "Characteristics" };
  
        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
  
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
  
    // Driver  method
    public static void main(String[] args)
    {
        new Planets();
    }


}
