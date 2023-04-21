package lab19;
import javax.swing.*;

public class SampleGUI extends JFrame {
   
   static JMenuBar menuBar;
      
   public SampleGUI(String title, int height, int width) {
	    setTitle(title);
	    setSize(height,width);
       setLocation  (400,200);
       menuBar = new JMenuBar();
       setJMenuBar(menuBar);
	    createFileMenu();
	    createEditMenu();
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
   } //SSNGUI

   private void createFileMenu( ) {
      JMenuItem   item;
      JMenu       fileMenu = new JMenu("File");
      FileMenuHandler fmh  = new FileMenuHandler(this);

      item = new JMenuItem("Open");    //Open...
      item.addActionListener( fmh );
      fileMenu.add( item );

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Quit");       //Quit
      item.addActionListener( fmh );
      fileMenu.add( item );

      
      menuBar.add(fileMenu);
    
   } //createMenu
   
   private void createEditMenu() {
      JMenu editMenu = new JMenu("Edit");
      EditMenuHandler emh = new EditMenuHandler(this);
      JMenuItem item;
      
      item = new JMenuItem("Find");
      item.addActionListener(emh);
      editMenu.add(item);
      
      editMenu.addSeparator();
      
      item = new JMenuItem("Replace");
      item.addActionListener(emh);
      editMenu.add(item);
      

      menuBar.add(editMenu);
      
      
   }

} //SSNGUI
