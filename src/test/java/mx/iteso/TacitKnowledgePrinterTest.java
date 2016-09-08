package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class TacitKnowledgePrinterTest {

    Printer printer;

    @Before
    public void setUp() {
        printer = mock(Printer.class);

    }
    //Test printNumbers with a limit of 10
    //Verify calculate being called 10 times
    //Verify expected result
    @Test
    public void VerifyTenTimesTest() {
        TacitKnowledgePrinter tacit = new TacitKnowledgePrinter(printer);
        tacit.printNumbers(10);
        verify(printer, times(10)).print(anyString());

    }

    //Test printNumbers with a limit of 0

    @Test(expected = ZeroException.class) //Verify Exception++++++++++++++++++++|
    public void VerifyZeroTimesTest() {
        TacitKnowledgePrinter tacit = new TacitKnowledgePrinter(printer);
        tacit.printNumbers(0);
        verify(printer, times(0)).print(anyString());
    }

  @Test
    public void printTacitTest(){
      TacitKnowledgePrinter Tprinter=new TacitKnowledgePrinter(printer);
      assertEquals("Tacit",Tprinter.calculate(3));
    }

    @Test
    public void printTacitKnowledgeTest(){
        TacitKnowledgePrinter Tprinter=new TacitKnowledgePrinter(printer);
        assertEquals("TacitKnowledge",Tprinter.calculate(15));
    }

    @Test
    public void printKnowledgeTest(){

        TacitKnowledgePrinter Tprinter=new TacitKnowledgePrinter(printer);
        assertEquals("Knowledge",Tprinter.calculate(5));

    }

    //Test printNumbers Refactor to return a string with the results concated
    @Test
    public void checkStringConcatTest(){
        TacitKnowledgePrinter Tprinter=new TacitKnowledgePrinter(printer);
        assertEquals("12Tacit4KnowledgeTacit78TacitKnowledge11Tacit1314TacitKnowledge",Tprinter.printNumbers(15));
    }

}
