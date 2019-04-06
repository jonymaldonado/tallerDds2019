package taller;

public class EstadoEncendido extends Estado{
	
	
	
	public EstadoEncendido(Auto auto) {
		super(auto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar(int unaVelocidad) {
		// TODO Auto-generated method stub
		acelerar(unaVelocidad);
	};
	

	
	@Override
	public void encendete()  {

		throw new YaEncendidoException();
	}

	@Override
	public void apagate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desacelera() {
		// TODO Auto-generated method stub
		
	}

}
