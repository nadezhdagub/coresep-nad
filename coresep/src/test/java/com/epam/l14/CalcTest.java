package com.epam.l14;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CalcTest {
    //private static int count = 0;

    @Mock
    CalcService calcService;

    @InjectMocks
    Calc calc = new Calc(calcService);

    @Test(expected = RuntimeException.class)
    public void testSum1() {
        when(calcService.devide(15.0, 3)).thenReturn(5.0);
        assertEquals(5.0, calcService.devide(15.0, 3), 0);

        RuntimeException exception = new RuntimeException("Cant devite on 0");
        doThrow(exception).when(calcService).devide(15.0, 0);
        assertEquals(0, calcService.devide(15.0, 0), 0);
    }
    @Test (timeout = 1L)
    public void testSum() {
      /*  try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        when(calc.sum(21.0, 30.0)).thenReturn(50.0);
        assertEquals(15.0, calc.sum(10, 5), 0 );
        verify(calcService).sum(20, 30);
        doReturn(15.0).when(calcService).sum(10.0, 5.0);
        assertEquals(15.0, calcService.sum(10.0, 5.0), 0);
        verify(calcService).sum(10.0, 5.0);
    }
}
