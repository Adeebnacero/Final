package com.testPreparation.Services;

import com.testPreparation.Factories.AbuseReportFactory;
import com.testPreparation.Services.Impl.AbuseReportServiceImpl;
import com.testPreparation.domain.AbuseReport;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.*;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class AbuseReportServiceTest {
   Map<String, String> values;
   AbuseReportService service;

    @BeforeMethod
    public void setUp() throws Exception {
        service = new AbuseReportServiceImpl();
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("description", "Language");
    }

    @Test
    public void create() throws Exception {
        AbuseReport abuseReport = AbuseReportFactory.getAbuseReport(values);
        service.create(abuseReport);
        assertEquals("1",abuseReport.getId());

    }

    @Test(dependsOnMethods = {"create"})
    public void read() throws Exception {
        AbuseReport abuseReport = service.read("1");
        assertEquals("Language", abuseReport.getDescription());
    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        AbuseReport abuseReport = service.read("1");
        AbuseReport updateAbuseReport = new AbuseReport.Builder()
                .id("1")
                .description("Failed Language")
                .build();
        service.update(updateAbuseReport);
        abuseReport = service.read("1");
        assertEquals("Failed Language", abuseReport.getDescription());
    }

    @Test(dependsOnMethods = {"update","create"})
    public void delete() throws Exception {
        service.delete("1");
        AbuseReport abuseReport = service.read("1");
        assertNull(abuseReport);
    }

}