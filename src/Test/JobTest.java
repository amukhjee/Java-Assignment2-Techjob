package Test;


import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;


import static org.junit.Assert.*;

public class JobTest {


    Job test_job1=new Job();
    Job test_job2=new Job();

    @Before
    public void createJobObjects(){
        test_job1=new Job();
        test_job2=new Job();
    }

    @Test
    public void testSettingJobId(){
        assertEquals(test_job1.getId(),test_job2.getId(),1);
        assertFalse(test_job2.getId()==test_job1.getId());
        assertTrue(test_job2.getId()-test_job1.getId()==1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job3=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(test_job3.getEmployer() instanceof Employer);
    assertTrue(test_job3.getLocation() instanceof Location);
    assertTrue(test_job3.getPositionType() instanceof PositionType);
    assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
    assertEquals(test_job3.getId(), 22, .1);
    assertEquals(test_job3.getName(), "Product tester");
    assertEquals(test_job3.getEmployer().getValue(), new Employer("ACME").getValue());
    assertEquals(test_job3.getLocation().getValue(), new Location("Desert").getValue());
    assertEquals(test_job3.getPositionType().getValue(), new PositionType("Quality control").getValue());
    assertEquals(test_job3.getCoreCompetency().getValue(), new CoreCompetency("Persistence").getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job test_job3=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job  test_job4=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test_job3.equals(test_job4), false);
    }

    @Test
    public void testJobsFortoString(){
        Job test_job3=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job1=new Job();
        Job test_job4=new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job5=new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job6=new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job7=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        Job test_job8=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        assertEquals(test_job3.toString(), "\n"+"id:" + test_job3.getId()+"\n"  +"name:" + test_job3.getName()+"\n"  +"employer:" + test_job3.getEmployer()+"\n" +"location:" + test_job3.getLocation()+"\n"  +"positionType:" + test_job3.getPositionType()+"\n"  +"coreCompetency:" + test_job3.getCoreCompetency() +"\n");
        assertEquals(test_job1.toString(),
                "OOPS! This job does not seem to exist.");
        assertEquals(test_job4.toString(),
                "\n"+"id:" + test_job4.getId()+"\n" +"name:" + "Data not available"+"\n" +"employer:" + test_job4.getEmployer()+"\n"+ "location:" + test_job4.getLocation()+ "\n" +"positionType:" + test_job4.getPositionType()+"\n" +"coreCompetency:" + test_job4.getCoreCompetency() +"\n");
        assertEquals(test_job5.toString(),
                "\n"+"id:" + test_job5.getId()+"\n" +"name:" + test_job5.getName()+"\n" +"employer:" + "Data not available"+"\n" +"location:" + test_job5.getLocation()+"\n" +"positionType:" + test_job5.getPositionType()+"\n" +"coreCompetency:" + test_job5.getCoreCompetency() +"\n");
        assertEquals(test_job6.toString(),
                "\n"+"id:" + test_job6.getId()+"\n" +"name:" + test_job6.getName()+"\n" +"employer:" + test_job6.getEmployer()+"\n" +"location:" + "Data not available"+"\n" +"positionType:" + test_job6.getPositionType()+"\n" +"coreCompetency:" + test_job6.getCoreCompetency() +"\n");

    assertEquals(test_job7.toString(),
                "\n"+"id:" + test_job7.getId()+"\n" +"name:" + test_job7.getName()+"\n" +"employer:" + test_job7.getEmployer()+"\n" +"location:" + test_job7.getLocation()+"\n" +"positionType:" + "Data not available"+"\n" +"coreCompetency:" + test_job7.getCoreCompetency() +"\n");
    assertEquals(test_job8.toString(),
                "\n"+"id:" + test_job8.getId()+"\n" +"name:" + test_job8.getName()+"\n" +"employer:" + test_job8.getEmployer()+"\n" +"location:" + test_job8.getLocation()+"\n" +"positionType:" + test_job8.getPositionType()+"\n"  +"coreCompetency:" + "Data not available" +"\n");
}

}
