package SpringiA4_SourceCode.Chapter_01.knights.test;

import org.junit.Test;
import static org.mockito.Mockito.*;

import SpringiA4_SourceCode.Chapter_01.knights.BraveKnight;
import SpringiA4_SourceCode.Chapter_01.knights.Quest;

public class BraveKnightTest {
	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
