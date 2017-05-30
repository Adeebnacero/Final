package com.testPreparation.Repository;

import com.testPreparation.Factories.AbuseReportFactory;
import com.testPreparation.Repository.Impl.AbuseReportRepositoryImpl;
import com.testPreparation.domain.AbuseReport;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by thabomoopa on 2017/05/30.
 */
public class AbuseReportRepositoryTest {
    Map<String, String> values;
    AbuseReportRepository repository;

    @BeforeMethod
    public void setUp() throws Exception {
        repository = AbuseReportRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("description","Language");
    }

    @Test
    public void create() throws Exception {
        AbuseReport abuseReport = AbuseReportFactory.getAbuseReport(values);
        repository.create(abuseReport);
        assertEquals("1",abuseReport.getId());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        AbuseReport abuseReport = repository.read("1");
        assertEquals("Language", abuseReport.getDescription());
    }

    @Test(dependsOnMethods = {"read","create"})
    public void update() throws Exception {
        AbuseReport abuseReport = repository.read("1");
        AbuseReport updateAbuseReport = new AbuseReport.Builder()
                .id(values.get("id"))
                .description("Failed Language")
                .build();
        repository.update(updateAbuseReport);
        abuseReport = repository.read("1");
        assertEquals("Failed Language", abuseReport.getDescription());
    }

    @Test(dependsOnMethods = {"create","update"})
    public void delete() throws Exception {
        repository.delete("1");
        AbuseReport abuseReport = repository.read("1");
        assertNull(abuseReport);

    }

}