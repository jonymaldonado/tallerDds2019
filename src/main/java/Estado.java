
public abstract class Estado{
	protected Auto unAuto;
	
	public Estado(Auto auto) {
		this.unAuto=auto;
		// TODO Auto-generated constructor stub
	}
	

	public void encendete() {
	};
	public void acelerar(int unaVelocidad) {
	};
	
	public boolean estaEnReserva() {
		return false;
		};

}
