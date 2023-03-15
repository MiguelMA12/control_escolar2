package controlEscolar;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre completo del alumno:");
        String fechaNacimiento = JOptionPane.showInputDialog("Ingresa la fecha de nacimiento del alumno (DD/MM/AAAA):");
        String telefono = JOptionPane.showInputDialog("Ingresa el teléfono del alumno:");
        String direccion = JOptionPane.showInputDialog("Ingresa la dirección del alumno:");
        
        InformacionAlumno alumno = new InformacionAlumno();
        alumno.InformacionPersonal(nombre, fechaNacimiento, telefono, direccion);
        
        String semestre = JOptionPane.showInputDialog("Ingresa el semestre que cursa:");
        String numCuenta = JOptionPane.showInputDialog("Ingresa tu numero de cuenta:");
        
        InformacionAlumno cuenta = new InformacionAlumno();
        cuenta.InformacionAcademica(numCuenta, semestre);
        
        String Horarios = JOptionPane.showInputDialog("Ingresa los horarios:");
        
        InformacionAlumno hor = new InformacionAlumno();
        hor.Horarios(args);
        String[] materias = new String[6];
        double[] calificaciones = new double[6];
        materias[0] = JOptionPane.showInputDialog("Ingresa el nombre de la materia 1:");
        String calificacionStr0 = JOptionPane.showInputDialog("Ingresa la calificación de " + materias[0] + ":");
        calificaciones[0] = Double.parseDouble(calificacionStr0);
        
        materias[1] = JOptionPane.showInputDialog("Ingresa el nombre de la materia 2:");
        String calificacionStr1 = JOptionPane.showInputDialog("Ingresa la calificación de " + materias[1] + ":");
        calificaciones[1] = Double.parseDouble(calificacionStr1);
        
        materias[2] = JOptionPane.showInputDialog("Ingresa el nombre de la materia 3:");
        String calificacionStr2 = JOptionPane.showInputDialog("Ingresa la calificación de " + materias[2] + ":");
        calificaciones[2] = Double.parseDouble(calificacionStr2);
        
        materias[3] = JOptionPane.showInputDialog("Ingresa el nombre de la materia 4:");
        String calificacionStr3 = JOptionPane.showInputDialog("Ingresa la calificación de " + materias[3] + ":");
        calificaciones[3] = Double.parseDouble(calificacionStr3);
        
        materias[4] = JOptionPane.showInputDialog("Ingresa el nombre de la materia 5:");
        String calificacionStr4 = JOptionPane.showInputDialog("Ingresa la calificación de " + materias[4] + ":");
        calificaciones[4] = Double.parseDouble(calificacionStr4);
        
        materias[5] = JOptionPane.showInputDialog("Ingresa el nombre de la materia 6:");
        String calificacionStr5 = JOptionPane.showInputDialog("Ingresa la calificación de " + materias[5] + ":");
        calificaciones[5] = Double.parseDouble(calificacionStr5);
        Calificaciones mat = new Calificaciones();
        mat.Materias(materias);
        
        Calificaciones pro = new Calificaciones();
        pro.Promedio(calificaciones);
    }
    
}
