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
        assertEquals(test_job3.toString(), "\n"+"ID:" + test_job3.getId()+"\n"  +"Name:" + test_job3.getName()+"\n"  +"Employer:" + test_job3.getEmployer()+"\n" +"Location:" + test_job3.getLocation()+"\n"  +"PositionType:" + test_job3.getPositionType()+"\n"  +"CoreCompetency:" + test_job3.getCoreCompetency() +"\n");
        assertEquals(test_job1.toString(),
                "OOPS! This job does not seem to exist.");
        assertEquals(test_job4.toString(),
                "\n"+"ID:" + test_job4.getId()+"\n" +"Name:" + "Data not available"+"\n" +"Employer:" + test_job4.getEmployer()+"\n"+ "Location:" + test_job4.getLocation()+ "\n" +"PositionType:" + test_job4.getPositionType()+"\n" +"CoreCompetency:" + test_job4.getCoreCompetency() +"\n");
        assertEquals(test_job5.toString(),
                "\n"+"ID:" + test_job5.getId()+"\n" +"Name:" + test_job5.getName()+"\n" +"Employer:" + "Data not available"+"\n" +"Location:" + test_job5.getLocation()+"\n" +"PositionType:" + test_job5.getPositionType()+"\n" +"CoreCompetency:" + test_job5.getCoreCompetency() +"\n");
        assertEquals(test_job6.toString(),
                "\n"+"ID:" + test_job6.getId()+"\n" +"Name:" + test_job6.getName()+"\n" +"Employer:" + test_job6.getEmployer()+"\n" +"Location:" + "Data not available"+"\n" +"PositionType:" + test_job6.getPositionType()+"\n" +"CoreCompetency:" + test_job6.getCoreCompetency() +"\n");

    assertEquals(test_job7.toString(),
                "\n"+"ID:" + test_job7.getId()+"\n" +"Name:" + test_job7.getName()+"\n" +"Employer:" + test_job7.getEmployer()+"\n" +"Location:" + test_job7.getLocation()+"\n" +"PositionType:" + "Data not available"+"\n" +"CoreCompetency:" + test_job7.getCoreCompetency() +"\n");
    assertEquals(test_job8.toString(),
                "\n"+"ID:" + test_job8.getId()+"\n" +"Name:" + test_job8.getName()+"\n" +"Employer:" + test_job8.getEmployer()+"\n" +"Location:" + test_job8.getLocation()+"\n" +"PositionType:" + test_job8.getPositionType()+"\n"  +"CoreCompetency:" + "Data not available" +"\n");
}

}
