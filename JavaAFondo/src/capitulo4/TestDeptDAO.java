package capitulo4;

import java.util.Collection;

/**
 * @author G4m[@]
 */
public class TestDeptDAO {

    public static void main(String[] args) {
        //instancio un DAO
        DeptDAO dept = new DeptDAO();
        
        //le pido la coleccion de todos los departamentos
        Collection<DeptDTO> coll = dept.buscarTodos();
        
        //itero la coleccion y muestro cada departamento
        for (DeptDTO dto : coll) {
            System.out.println(dto);
        }
        
        EmpDAO emp = new EmpDAO();
        
        Collection<EmpDTO> coll2 = emp.buscarXDept(2);
        
        for (EmpDTO empl : coll2) {
            System.out.println(empl);
        }
    }
}
