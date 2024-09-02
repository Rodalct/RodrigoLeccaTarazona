package com.mycompany.leccatarazonarodrigoeli;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author leccat
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0, b=0, c=0, ra1=0, ra2=0, dis=0;
        double sqrtdis=0, r1=0, r2=0 ;
        a = Integer.parseInt(showInputDialog(null,"para la forma de la ecuación cuadrática ax²+bx+c=0"+"\n"+
                "coloca el valor de a","ecuación cuadrática",3));
        b = Integer.parseInt(showInputDialog(null,"para la forma de la ecuación cuadrática ax²+bx+c=0"+"\n"+
                "coloca el valor de b","ecuación cuadrática",3));
        c = Integer.parseInt(showInputDialog(null,"para la forma de la ecuación cuadrática ax²+bx+c=0"+"\n"+
                "coloca el valor de c","ecuación cuadrática",3));
        dis = (b*b)-(4*a*c);
        if (dis < 0){
        showMessageDialog(null,"La ecuación tiene raices complejas", "Raices",1);
        }else{
        sqrtdis= Math.sqrt(dis);
        r1=(-b+sqrtdis)/(2*a);
        r2 = (-b-sqrtdis)/(2*a);
        showMessageDialog(null,"La raices son: "+"\n"+"x1= "+r1+"\n"+"x2= "+r2, "Raices",1);
        }
        // TODO code application logic here
    }
    
}
