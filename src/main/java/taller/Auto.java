package taller;

public class Auto {
	private Motor unMotor;
	private TanqueGasolina unTanque;
	private Estado estado;
	
	public Auto() {
		
	};
	
	public Auto(Motor unMotor, TanqueGasolina unTanque) {
		super();
		this.unMotor = unMotor;
		this.unTanque = unTanque;
		this.estado=new EstadoApagado(this);
	}	
	public Motor getUnMotor() {
		return unMotor;
	}
	public void setUnMotor(Motor unMotor) {
		this.unMotor = unMotor;
	}
	public TanqueGasolina getUnTanque() {
		return unTanque;
	}
	public void setUnTanque(TanqueGasolina unTanque) {
		this.unTanque = unTanque;
	}	
	public Estado setEstado(Estado estado) {
		return this.estado = estado;
	};
	public Estado getEstado() {
		return estado;
	}
	public void acelerar(int unaVelocidad) {
		estado.acelerar(unaVelocidad);;
	};
	public void detenete(int unaVelocidad) {
		unMotor.subirTemperatura2(unaVelocidad);
	};
//	public boolean entreDosNumeros(unint unNumero, int otroNumero) {
//		double unValor;
//		String resultado;
//		if (unValor<unNumero && unValor>otroNumero) {
//			resultado="esta cerca de la reserva";
//		} else {if (unValor<otroNumero && unValor>0) {
//			System.out.println("esta en la reserva");
//		} else {
//			System.out.println("está lejos de la reserba");
//		}
//		}
//	}
	
	public void encendete() {
		estado.encendete();
	};
	
//	public boolean estaEnReserva() {
//		double valorMaximo,valorMinimo;
//		
//		if (condition) {
//			
//		} else {
//
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
