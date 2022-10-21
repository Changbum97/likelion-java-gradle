package Week3.Day13_1021;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {

    @Test
    @DisplayName("괄호를 잘 푸는지 테스트")
    void solveBracketTest() {
        SolveBracketByReplace sb = new SolveBracketByReplace();

        assertTrue(sb.solve("()()"));
        assertTrue(sb.solve("(())()"));
        assertFalse(sb.solve(")()("));
        assertFalse(sb.solve("(()("));
    }
}