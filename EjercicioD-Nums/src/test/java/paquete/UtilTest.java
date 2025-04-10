package paquete;

import org.junit.Test;
import org.junit.Assert;

public class UtilTest 
{
	@Test
	public void intlenTest()
	{
		int len = Util.intlen(123456);
		Assert.assertEquals(6, len);
	}
	
	@Test
	public void buscarNumTest()
	{
		int n = Util.buscarNum(1234, 3, Util.intlen(1234));
		Assert.assertEquals(n, 3);
	}
}
