package taller;

public class Motor {
	private double temperatura;
	
	public Motor(double temperatura) {
		this.temperatura = temperatura;
	};

	public Motor() {
		setTemperatura(0);
	};

	public void subirTemperatura(int unaVelocidad) {
		temperatura=+(unaVelocidad*0.2);	
	};
	
	public void bajarTemperatura() {
		
	};
	
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	};
	
	public double getTemperatura() {
		return temperatura;
	};

	public void subirTemperatura2(int unaVelocidad) {
		temperatura=+(unaVelocidad*0.04);	
	};
	
	public void subirTemperatura3(double unaValor) {
		temperatura=+unaValor;	
	};


}
