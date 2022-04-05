package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import parse.tokens.Symbol;

public class SymbolTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		char c = 'a';
		Symbol symbol = new Symbol(c);
		int maxDepth = 2;
		int depth = 1;
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = symbol.randomExpansion(maxDepth, depth);
		assertFalse(arrayList.isEmpty());
	}

}
