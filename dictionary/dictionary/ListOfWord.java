
package dictionary;

import java.awt.*;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.*;

public class ListOfWord extends JFrame{
    //private static final long serial = 5L;

    public ListOfWord() {
        //JFrame frm = new JFrame("Word Display");
        super("Word List");
        Container c= getContentPane();
        Vector < String > headings = new Vector < String >();
        headings.add("Phrase");
        headings.add("Note/Meaning");
        
        Vector < Vector < String > > rows = new Vector < Vector < String > >();
        
        TreeMap< String, String> words = Dictionary.getWords();
        for(String word : words.keySet()){
            Vector <String> row = new Vector<String>();
            row.add(word);
            row.add(words.get(word));
            rows.add(row);
        }
        
        JTable table = new JTable(rows,headings);
        
        JScrollPane s = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        c.add(s);
        
        pack();
        
        //For checking only
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(500,400);
        setResizable(true);
       // setBounds(300,150,500,400);
        
        setVisible(true);
    }
    /*
    public static void main(String[] args) {
        ListOfWord a= new ListOfWord();
    }
    */
}
