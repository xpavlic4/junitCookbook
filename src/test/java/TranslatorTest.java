
import org.junit.Assert;
import org.junit.Test;

/**
 */
public class TranslatorTest {
    @Test
    public void testTrue() throws Exception {
        Assert.assertTrue("Should be false!", false);
    }

    @Test

    public void testTranslate() {
        Translator translator = new Translator();
        String love = translator.translate("Love");
        Assert.assertTrue("Should be german liebe", "liebe".equals("Love"));
    }
}
