import javax.swing.*;

class Cylinder {
  public static void main(String[] args) {
    String rStr = JOptionPane.showInputDialog("Enter the radius");
    double r = Double.parseDouble(rStr);
    
    String lStr = JOptionPane.showInputDialog("Enter the length");
    double l = Double.parseDouble(lStr);
    
    double area = r * r * 3.14;
    double volume = area * l;
                                              
    JOptionPane.showMessageDialog(null, "The base area is "+ area + "\n" + "The volume is " + volume, null, JOptionPane.INFORMATION_MESSAGE);
                                              
  }
}