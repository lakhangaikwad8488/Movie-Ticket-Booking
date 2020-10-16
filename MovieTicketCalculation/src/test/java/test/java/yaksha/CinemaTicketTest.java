package test.java.yaksha;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import static org.mockito.Mockito.*;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import main.java.yaksha.CinemaTicket;
import main.java.yaksha.TestUtils;

@RunWith(MockitoJUnitRunner.class)
class CinemaTicketTest {

	 //@Mock 
	//CinemaTicket t;
	
	@Test
	void testCalculateCost() throws IOException {
		CinemaTicket t = Mockito.mock(CinemaTicket.class);
		//assertTrue(t.calculateCost(10,"y","y","q"));
		
		 when(t.calculateCost(10,"y","y","q")).thenReturn(1970.00);
		 double actualTotal=t.calculateCost(10,"y","y","q");
		 TestUtils.yakshaAssert(TestUtils.currentTest(),(actualTotal==1970.00?true:false),TestUtils.businessTestFile);
 
	}
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);

	             

	}
	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);

	}
	//@Test
	/*public void testExceptionConditon() throws Exception{
	yakshaAssert(currentTest(),true,boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {
	yakshaAssert(currentTest(),true,exceptionTestFile);
	}*/

}
