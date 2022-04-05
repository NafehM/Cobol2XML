package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.Token;

public class TokenTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		String s =  "cat";
		Token t = new Token(s);
		assertFalse( t.isNumber() );
		assertFalse( t.isSymbol() );
		assertTrue( t.isWord() );
		
		char c = '@';
		Token t1 = new Token(c);
		assertFalse( t1.isNumber() );
		assertFalse( t1.isWord() );
		assertTrue( t1.isSymbol() );
		
		int i = 1;
		Token t2 = new Token(i);
		assertFalse( t2.isSymbol() );
		assertFalse( t2.isWord() );
		assertTrue( t2.isNumber() );
		
	}

}
