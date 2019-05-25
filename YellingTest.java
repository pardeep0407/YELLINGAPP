import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class YellingTest {
@Before
public void setUp() throws Exception {
}
@After
public void tearDown() throws Exception {
}
@Test
public void test1PersonIsYelling() {
// 1 PERSON IS YELLINg
Yelling y = new Yelling();
String result = y.Scream("Peter");
assertEquals("Peter is yelling",result );
}
@Test
public void test0PersonIsYelling() {
// 0  IS YELLINg
Yelling y = new Yelling();
String result = y.Scream("");
assertEquals("Nobody is yelling",result );
}
@Test
public void testUppercaseYelling() {
// UPPERCASE IS YELLINg
Yelling y = new Yelling();
String result = y.Scream("PETER");
assertEquals("PETER IS YELLING",result );
}
@Test
public void test2PersonAreYelling() {
// 2 person IS YELLINg
Yelling y = new Yelling();
String result = y.Scream("Peter, Kadeem");
assertEquals("Peter and Kadeem are yelling",result );
}
@Test
public void testMoreThanTwoPeopleAreYelling() {
// more than 2 are YELLINg
Yelling y = new Yelling();
String result = y.Scream("Peter, Kadeem, Albert");
assertEquals("Peter, Kadeem, and Albert are yelling",result );
}
}