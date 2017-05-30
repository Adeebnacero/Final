package com.testPreparation.Factories;

import com.testPreparation.domain.AbuseReport;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class AbuseReportFactoryTest {
    Map<String, String> values;
    AbuseReport abuseReport;

    @BeforeMethod
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("description","Language");
    }

    @Test
    public void testGetAbuseReport() throws Exception {
        AbuseReport abuseReport = AbuseReportFactory.getAbuseReport(values);
        assertEquals(true, abuseReport.equals(abuseReport));
    }
    @Test
    public void testDescription() throws Exception {
        AbuseReport abuseReport = AbuseReportFactory.getAbuseReport(values);
        assertEquals("Language", abuseReport.getDescription());
    }

}