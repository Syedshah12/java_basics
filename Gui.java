import java awt.*;
import javax swing.*;

class Gui{
public static void main(String args[]){
Jframe frm=new Jframe();
Container con=frm.getContentPanel(); //Workable area

FlowLayout flw=new FlowLayout():
con.setLayout(flw);

Jbutton btn=new Jbutton("Click Me!");
con.add(btn);

frm.setsize(300,400);
frm.setVisile(true);
frm.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);


}


}