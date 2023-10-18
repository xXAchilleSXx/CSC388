import org.junit.Test;
import org.junit.Assert;

public class AddOperatorTest {
   @Test
public void testEvalArithmetic(){
   AddOperator operator = new AddOperator();
   Assert.assertEquals("1+1 should equal 2",2,operator.eval(1,1));
   Assert.assertEquals("0-1 should equal -1",-1,operator.eval(0, -1));
   
}
@Test
public void testEvalBoolean(){
   Assert.assertTrue(AddOperator.eval(false, true));
   Assert.assertFalse(AddOperator.eval(false, false));
}

@Test
public void testEvalConcatnation(){
   Assert.assertEquals("ab", AddOperator.eval("a","b"));
   Assert.assertEquals("CSC388", AddOperator.eval("CSC388",""));
}
}
