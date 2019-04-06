package taller;

public class TanqueGasolina {
	private double gasolina;
	private double capacidadTotal;
	
	
	public TanqueGasolina () {
		setGasolina(0);
	};
	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	};
	public void disminuirGasolinaEnPorcentaje(double unValor) {
		gasolina=-(gasolina*unValor);
	};
	public double getGasolina() {
		return gasolina;
	};
	public void consumir(double unValor) {
		disminuirGasolinaEnPorcentaje(unValor);
	}
	public double getCapacidadTotal() {
		return capacidadTotal;
	}
	public void setCapacidadTotal(double capacidadTotal) {
		this.capacidadTotal = capacidadTotal;
	};
	
	public boolean estaEnReserva() {
		return true;
	}
	public boolean estaEnReserva() {
		// TODO Auto-generated method stub
		return false;
	};
	
	
	
	
	
	
	
	
	
	
	

}
