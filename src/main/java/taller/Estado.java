package taller;

public abstract class Estado{
	protected Auto unAuto;
	
	public Estado(Auto auto) {
		this.unAuto=auto;
		// TODO Auto-generated constructor stub
	}
	

	public abstract void encendete();
	public abstract void acelerar(int unaVelocidad);
	public abstract void apagate();
	public abstract void desacelera();
	
	public boolean estaEnReserva() {
		return false;
		};

}
