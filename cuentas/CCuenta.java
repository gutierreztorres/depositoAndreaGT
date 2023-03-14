package cuentas;

/**
 * La clase CCuenta simula el funcionamiento de una cuenta bancaria y sus operaciones
 * @author Andrea Gutierrez Torres
 * @version 2.0
 
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
	 * Constructor vacio 
	 */
    public CCuenta()
    {
    }

    /**
	 * Constructor que inicializa los parametros de clase cuenta 
	 * @param nom Nombre
	 * @param cue Cuenta
	 * @param sal Saldo de la cuenta
	 * @param tipo Tipo de interes de la cuenta
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
	 * Metodo get del nombre
	 * @return nombre
	 */
    private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo get de la cuenta
	 * @return cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Metodo get del saldo
	 * @return saldo
	 */
	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * Metodo get del tipo de interes
	 * @return tipoInterés
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	
	/**
	 * Metodo comprueba el estado de la cuenta
	 * @return saldo
	 */
	public double estado()
    {
        return getSaldo();
    }

	/**
	 * Implementa el ingreso de una cantidad de dinero y actualizacion de saldo
	 * @param cantidad Cantidad de dinero a incresar
	 * @throws Exception cantidad menos o igual a 0
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
	 * Implementa la retirada de una cantidad pasada por parametro y actualizacion de saldo
	 * @param cantidad Cantidad de dinero a retirar
	 * @throws Exception cantidad menor o igual a 0 o saldo menos que cantidad
	 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
