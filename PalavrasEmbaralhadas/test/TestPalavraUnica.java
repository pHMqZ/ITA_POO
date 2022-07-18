import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.phmqz.poo.embaralhador.Embaralhador;
import com.phmqz.poo.embaralhador.OrdemAlfabetica;
import com.phmqz.poo.mecanica.MecanicaDeJogo;
import com.phmqz.poo.mecanica.PalavraUnica;

class TestPalavraUnica {

	MecanicaDeJogo mecanica;
	Embaralhador e;
	
	@BeforeEach
	void beforeEach() {
		mecanica = new PalavraUnica();
		e = new OrdemAlfabetica();
	}
	
	@Test
	void testErroSetPalavra() {
		try {
			mecanica.setPalavra("ABACATE");
			fail();
		}catch(Exception e){}
	}

	@Test
	void testGetPalavra() {
		mecanica.setEmbaralhar(e);
		try {
			mecanica.setPalavra("ABACATE");
		}catch(Exception e){
			fail();
		}
		assertEquals("AAABCET",mecanica.getPalavra());
	}
	
	@Test
	void testNovaTentativaSemPalavra() {
		mecanica.setEmbaralhar(e);
		assertFalse(mecanica.novaTentativa());
		assertTrue(mecanica.fimDeJogo());
	}
	
	@Test
	void testNovaTentativaTempoDeJogo() {
		mecanica.setEmbaralhar(e);
		try {
			mecanica.setPalavra("ABACATE");
		}catch(Exception e){
			fail();
		}
		assertTrue(mecanica.novaTentativa());
		assertFalse(mecanica.fimDeJogo());
	}
	
	@Test
	void testNovaTentativaFimDeJogo() {
		mecanica.setEmbaralhar(e);
		try {
			mecanica.setPalavra("ABACATE");
		}catch(Exception e){
			fail();
		}
		mecanica.tentativa("ABACATE");
		assertFalse(mecanica.novaTentativa());
		assertTrue(mecanica.fimDeJogo());
	}

}
