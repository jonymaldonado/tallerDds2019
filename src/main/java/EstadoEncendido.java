
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
	

	public void encendete()  {

		System.out.println( new YaEncendidoException());
	}

}
