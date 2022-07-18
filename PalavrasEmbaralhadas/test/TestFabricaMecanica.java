import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.phmqz.poo.mecanica.DoisJogadores;
import com.phmqz.poo.mecanica.FabricaMecanica;
import com.phmqz.poo.mecanica.PalavraUnica;

class TestFabricaMecanica {

	@Test
	void testPalavraUnica() {
		assertEquals(new PalavraUnica().getClass(),FabricaMecanica.factory("Um jogador").getClass());
	}

	@Test
	void testDoisJogadores() {
		assertEquals(new DoisJogadores().getClass(),FabricaMecanica.factory("Dois jogadores").getClass());
	}

	@Test
	void testFalhas() {
		try {
			FabricaMecanica.factory("Modo de jogo Inexistente");
			fail();
		}catch(IllegalArgumentException e) {}
	}

}
