package capitulo4;

import java.util.Collection;

/**
 * @author G4m[@]
 */
public class Facade {

    public Collection<DeptDTO> obtenerDepartamentos(){
        DeptDAO deptDAO = new DeptDAO();
        return deptDAO.buscarTodos();
    }
    
    public Collection<EmpDTO> obtenerEmpleados(int deptno){
        EmpDAO empDAO = new EmpDAO();
        return empDAO.buscarXDept(deptno);
    }
    
}
