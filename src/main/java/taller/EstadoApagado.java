package taller;

public class EstadoApagado extends Estado{

	public EstadoApagado(Auto auto) {
		super(auto);
		// TODO Auto-generated constructor stub
	};
	
	
	public void encendete() {
		unAuto.acelerar(70);

		
	}


	@Override
	public void acelerar(int unaVelocidad) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void apagate() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void desacelera() {
		// TODO Auto-generated method stub
		
	};
	
	



}
