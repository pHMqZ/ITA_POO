import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.phmqz.poo.embaralhador.Embaralhador;
import com.phmqz.poo.embaralhador.InversorString;
import com.phmqz.poo.embaralhador.OrdemAlfabetica;
import com.phmqz.poo.embaralhador.TrocarImparComPar;

class TestEmbaralhardores {

	@Test
	void testEmbaralhadorOrdemAlfabeticaSimples() {
		Embaralhador e = new OrdemAlfabetica();
		assertEquals("AAABCET",e.Embaralhar("ABACATE"));
	}
	
	@Test
	void testEmbaralhadorOrdemAlfabeticaComposto() {
		Embaralhador e = new OrdemAlfabetica();
		assertEquals("MU-DIOS",e.Embaralhar("UM-DOIS"));
	}
	
	@Test
	void testEmbaralhadorInverterStringSimples() {
		Embaralhador e = new InversorString();
		assertEquals("ETACABA",e.Embaralhar("ABACATE"));
	}
	
	@Test
	void testEmbaralhadorInverterStringComposto() {
		Embaralhador e = new InversorString();
		assertEquals("SIOD-MU",e.Embaralhar("UM-DOIS"));
	}
	
	@Test
	void testEmbaralhadorTrocaImparComParSimplesImpar() {
		Embaralhador e = new TrocarImparComPar();
		assertEquals("BACATAE",e.Embaralhar("ABACATE"));
	}
	
	@Test
	void testEmbaralhadorTrocaImparComParSimplesPar() {
		Embaralhador e = new TrocarImparComPar();
		assertEquals("OTAMET",e.Embaralhar("TOMATE"));
	}
	
	@Test
	void testEmbaralhadorTrocaImparComParComposto() {
		Embaralhador e = new TrocarImparComPar();
		assertEquals("NUS-ODSI",e.Embaralhar("UNS-DOIS"));
	}

}
