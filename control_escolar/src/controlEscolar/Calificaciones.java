package controlEscolar;

import javax.swing.JOptionPane;

public class Calificaciones {

    private String[] materias;
    private double[] calificaciones;
    private double promedio;

    public void Materias(String[] materias) {
        this.materias = materias;
        
        JOptionPane.showMessageDialog(null,
                "materia 1: " + materias[0] + "\n");
        JOptionPane.showMessageDialog(null,
                "materia 2: " + materias[1] + "\n" );
        JOptionPane.showMessageDialog(null,
                "materia 3: " + materias[2] + "\n" );
        JOptionPane.showMessageDialog(null,
                "materia 4: " + materias[3] + "\n" );
        JOptionPane.showMessageDialog(null,
                "materia 5: " + materias[4] + "\n" );
        JOptionPane.showMessageDialog(null,
                "materia 6: " + materias[5] + "\n" );

    }

    public void Promedio(double[] calificaciones) {
        double sumaCalificaciones = calificaciones[0] + calificaciones[1] + calificaciones[2] + calificaciones[3] + calificaciones[4] + calificaciones[5];
        double promedio = sumaCalificaciones / 6;

       
        JOptionPane.showMessageDialog(null, "El promedio de las calificaciones es: " + promedio);
    }
}
