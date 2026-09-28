package modelo;

import excepciones.IdEmpleadoInvalidaException;

public class Encargado extends Persona
{
    private double sueldoBase;
    private String idEmpleado; //identificador de empresa
    private String turno;

    //constructores

    public Encargado()
    {
        super();
        sueldoBase = 0;
        idEmpleado = "";
        turno = "";
    }
    
    public Encargado(String nombre, String rut, double sueldoBase, String idEmpleado, String turno)
    {
        super(nombre, rut);
        this.sueldoBase = sueldoBase;
        this.idEmpleado = idEmpleado;
        this.turno = turno;
    }
    
    public Encargado(String nombre, String rut, double sueldoBase, String idEmpleado)
    {
        super(nombre, rut);
        this.sueldoBase = sueldoBase;
        this.idEmpleado = idEmpleado;
        this.turno = "N/A";
    }

    // metodos

    public void cambiarTurno(String turno) {
        this.turno = turno;
    }

    public void cambiarTurno(Encargado encargadoNuevo) { //sobrecarga para cambiar de turno con otro empleado
        String turnoActual = this.turno;
        this.turno = encargadoNuevo.getTurno();
        encargadoNuevo.setTurno(turnoActual);
    }

    @Override
    public String identificarse()
    {
        return "\nRol: Encargado" +
        "\nNombre: " + getNombre() +
        "\nRut: "+ getRut() +
        "\nID de empleado: " + idEmpleado +
        "\nTurno: " + turno +
        "\nSueldo: $" + sueldoBase;
    }
    
    public static void validarIdEmpleado(String idEmpleado) throws IdEmpleadoInvalidaException {
        if (idEmpleado == null || !idEmpleado.matches("EMP-\\d{3,5}")) {
            throw new IdEmpleadoInvalidaException(
                "El ID de empleado debe tener el formato 'EMP-' seguido de 3 a 5 dígitos (ej: EMP-001)."
        );
        }
    }

    
    //getter y setter
    
	public double getSueldoBase() {
            return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
            this.sueldoBase = sueldoBase;
	}

	public String getIdEmpleado() {
            return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) throws IdEmpleadoInvalidaException {
            validarIdEmpleado(idEmpleado);
            this.idEmpleado = idEmpleado;
	}

	public String getTurno() {
            return turno;
	}

	public void setTurno(String turno) {
            this.turno = turno;
	}


    
}