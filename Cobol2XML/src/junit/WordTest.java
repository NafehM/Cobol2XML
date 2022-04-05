package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import parse.tokens.Word;

public class WordTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		Word word = new Word();
		int maxDepth = 2;
		int depth = 1;
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = word.randomExpansion(maxDepth, depth);
		assertFalse( arrayList.isEmpty() );
	}

}
