package controlEscolar;

import javax.swing.JOptionPane;

public class InformacionAlumno {
    private String nombre;
    private String fechaNacimiento;
    private String telefono;
    private String direccion;
    private String numCuenta;
    private String semestre;
    private String[] materias;

    public InformacionAlumno() {}

    public void InformacionPersonal(String nombre, String fechaNacimiento, String telefono, String direccion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;

        JOptionPane.showMessageDialog(null, "Información personal guardada exitosamente.\n" +
                "Nombre: " + this.nombre + "\n" +
                "Fecha de nacimiento: " + this.fechaNacimiento + "\n" +
                "Teléfono: " + this.telefono + "\n" +
                "Dirección: " + this.direccion);
    }

    public void InformacionAcademica(String numCuenta, String semestre) {
        this.numCuenta = numCuenta;
        this.semestre = semestre;

        JOptionPane.showMessageDialog(null, "Información académica guardada exitosamente.\n" +
                "Número de cuenta: " + this.numCuenta + "\n" +
                "Semestre: " + this.semestre);
    }

    public void Horarios(String[] materias) {
        this.materias = materias;

        JOptionPane.showMessageDialog(null, "Horarios guardados exitosamente.\n" +
                "Materias:" );

        for (String materia : this.materias) {
            JOptionPane.showMessageDialog(null, materia);
        }
    }
}
