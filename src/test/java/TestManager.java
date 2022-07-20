import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import staff.management.Manager;


public class TestManager {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "JH123456", 30000.00, "IT");
    }

//    Tests relating to employee class
    @Test
    public void testGetName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void testSetNamePass(){
        manager.setName("Ian");
        assertEquals("Ian", manager.getName());
    }

    @Test
    public void testSetNameFail(){
        manager.setName("");
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void testGetNiNumber(){
        assertEquals("JH123456", manager.getNiNumber());
    }

    @Test
    public void testSetNiNumber(){
        manager.setNiNumber("YZ654321");
        assertEquals("YZ654321", manager.getNiNumber());
    }

    @Test
    public void testGetSalary(){
        assertEquals(30000.00, manager.getSalary(), 0);
    }

    @Test
    public void testSetSalary(){
        manager.setSalary(40000.00);
        assertEquals(40000.00, manager.getSalary(), 0);
    }

    @Test
    public void testRaiseSalaryPass() {
        manager.raiseSalary(5000.00);
        assertEquals(35000.00, manager.getSalary(), 0);
    }

    @Test
    public void testRaiseSalaryFail() {
        manager.raiseSalary(-5000.00);
        assertEquals(30000.00, manager.getSalary(), 0);
    }

    @Test
    public void testPayBonus(){
        assertEquals(3000.00, manager.payBonus(), 0);
    }

//    Tests relating to manager class
    @Test
    public void testGetDepartment(){
        assertEquals("IT", manager.getDepartment());
    }

    @Test
    public void testSetDepartment(){
        manager.setDepartment("HR");
        assertEquals("HR", manager.getDepartment());
    }
}
