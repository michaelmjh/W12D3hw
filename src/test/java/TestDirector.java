import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import staff.management.Director;


public class TestDirector {
    Director director;

    @Before
    public void before() {
        director = new Director("Bob", "JH123456", 30000.00, "IT", 1000000.00);
    }

    //    Tests relating to employee class
    @Test
    public void testGetName() {
        assertEquals("Bob", director.getName());
    }

    @Test
    public void testSetNamePass(){
        director.setName("Ian");
        assertEquals("Ian", director.getName());
    }

    @Test
    public void testSetNameFail(){
        director.setName("");
        assertEquals("Bob", director.getName());
    }

    @Test
    public void testGetNiNumber() {
        assertEquals("JH123456", director.getNiNumber());
    }

    @Test
    public void testSetNiNumber() {
        director.setNiNumber("YZ654321");
        assertEquals("YZ654321", director.getNiNumber());
    }

    @Test
    public void testGetSalary() {
        assertEquals(30000.00, director.getSalary(), 0);
    }

    @Test
    public void testSetSalary() {
        director.setSalary(40000.00);
        assertEquals(40000.00, director.getSalary(), 0);
    }

    @Test
    public void testRaiseSalaryPass() {
        director.raiseSalary(5000.00);
        assertEquals(35000.00, director.getSalary(), 0);
    }

    @Test
    public void testRaiseSalaryFail() {
        director.raiseSalary(-5000.00);
        assertEquals(30000.00, director.getSalary(), 0);
    }

    //    Tests relating to manager class
    @Test
    public void testGetDepartment() {
        assertEquals("IT", director.getDepartment());
    }

    @Test
    public void testSetDepartment() {
        director.setDepartment("HR");
        assertEquals("HR", director.getDepartment());
    }

    // Tests relating to director class
    @Test
    public void testGetBudget() {
        assertEquals(1000000.00, director.getBudget(), 0);
    }

    @Test
    public void testSetBudget() {
        director.setBudget(500000.00);
        assertEquals(500000.00, director.getBudget(), 0);
    }

    @Test
    public void testPayBonus() {
        assertEquals(6000.00, director.payBonus(), 0);
    }
}