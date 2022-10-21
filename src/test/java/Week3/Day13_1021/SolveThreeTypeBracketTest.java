package Week3.Day13_1021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveThreeTypeBracketTest {

    @Test
    @DisplayName("3종류의 괄호를 잘 푸는지 테스트")
    void solveBracketTest() {
        SolveThreeTypeBracketByStack sb = new SolveThreeTypeBracketByStack();

        assertFalse(sb.solve("{}()[](({))"));
        assertTrue(sb.solve("{}()[](({}))"));
        assertTrue(sb.solve("[{(())()}]"));
        assertTrue(sb.solve("{{()}[][]{}()}"));
        assertFalse(sb.solve("[{())}]"));
        assertFalse(sb.solve(")[{()}]"));
    }
}