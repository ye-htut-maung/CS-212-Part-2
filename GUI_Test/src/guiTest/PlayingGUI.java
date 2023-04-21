package guiTest;

import javax.swing.*;

public class PlayingGUI extends JFrame{
   
   public PlayingGUI() {
      setTitle("Playground");
      setSize(400,400);
      setLocation(200,200);
      createMenu();
      setDefaultCloseOperation(EXIT_ON_CLOSE);  
      setVisible(true);     
      
      
   }
   
   private void createMenu() {
      JMenuBar menuBar = new JMenuBar();
      JMenu fileMenu = new JMenu("File");
      JMenuItem item;
      FileMenuHandler fmh = new FileMenuHandler(this);
      System.out.println(this);
      
      item = new JMenuItem("Open");
      item.addActionListener(fmh);
      fileMenu.add(item);
      
      fileMenu.addSeparator();
      
      item = new JMenuItem("Quit");
      item.addActionListener(fmh);
      fileMenu.add(item);
      
      
      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
   }
     
}
