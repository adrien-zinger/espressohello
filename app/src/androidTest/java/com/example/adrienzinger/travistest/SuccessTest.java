package com.example.adrienzinger.travistest;
import org.junit.Test;
import java.util.regex.Pattern;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class SuccessTest {

    @Test
    public void firstTest() {
        assertEquals(true, true);
    }
}