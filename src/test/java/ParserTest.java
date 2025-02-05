import constants.FileLocationConstants;
import org.example.parsers.Parser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParserTest {

    @Test
    public void testPilot() {
        int result = 1 + 2;
        assertEquals(result, 3);
    }

    @Test
    public void testValidJsonForStep1() {
        Assertions.assertTrue(Parser.isValidJson(FileLocationConstants.STEP_1_VALID_FILE_PATH));
    }

    @Test
    public void testInvalidJsonForStep1() {
        Assertions.assertFalse(Parser.isValidJson(FileLocationConstants.STEP_1_INVALID_FILE_PATH));
    }
}
