import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import staff.techStaff.Developer;


public class TestDeveloper {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Bob", "JH123456", 30000.00);
    }

    //    Tests relating to employee class
    @Test
    public void testGetName() {
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void testSetNamePass(){
        developer.setName("Ian");
        assertEquals("Ian", developer.getName());
    }

    @Test
    public void testSetNameFail(){
        developer.setName("");
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void testGetNiNumber() {
        assertEquals("JH123456", developer.getNiNumber());
    }

    @Test
    public void testSetNiNumber() {
        developer.setNiNumber("YZ654321");
        assertEquals("YZ654321", developer.getNiNumber());
    }

    @Test
    public void testGetSalary() {
        assertEquals(30000.00, developer.getSalary(), 0);
    }

    @Test
    public void testSetSalary() {
        developer.setSalary(40000.00);
        assertEquals(40000.00, developer.getSalary(), 0);
    }

    @Test
    public void testRaiseSalaryPass() {
        developer.raiseSalary(5000.00);
        assertEquals(35000.00, developer.getSalary(), 0);
    }

    @Test
    public void testRaiseSalaryFail() {
        developer.raiseSalary(-5000.00);
        assertEquals(30000.00, developer.getSalary(), 0);
    }

    @Test
    public void testPayBonus() {
        assertEquals(3000.00, developer.payBonus(), 0);
    }
}