package taller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;


public class TestAuto {
	private Auto unAuto;
	
	
	
	@Before
	public void init() {
		
		TanqueGasolina tanque= new TanqueGasolina();
		Motor motor=new Motor();
		unAuto = new Auto(motor,tanque);
		unAuto.setEstado(new EstadoEncendido(unAuto));
	}
	
	

	@Test
	//public void testEncender() {
/*		Estado unEstado=new EstadoApagado(unAuto);
		Assert.assertTrue(unAuto.encendete()=="ya esta encendido");
}*/
		public void test1() {
			Assert.assertEquals(true,unAuto.getUnTanque().estaEnReserva());
		};
		
	}
	
