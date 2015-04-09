package capitulo4;

import java.util.Collection;
import java.util.Scanner;

/**
 * @author G4m[@]
 */
public class Cliente {

    public static void main(String[] args) {
        Facade facade = new Facade();
        Collection<DeptDTO> collDepts = facade.obtenerDepartamentos();
        
        //muestro los departamentos
        _mostrarDepartamentos(collDepts);
        
        //pido al usuario que ingrese un deptno
        Scanner scanner = new Scanner(System.in);
        int deptno = scanner.nextInt();
        
        Collection<EmpDTO> collEmps = facade.obtenerEmpleados(deptno);
        
        //muestro los empleados del deptno especificado
        _mostrarEmpleados(collEmps,deptno);
    }

    private static void _mostrarEmpleados(Collection<EmpDTO> collEmps, int deptno) {
        System.out.println("Empleados del departamento "+deptno);
        System.out.println("------------------------>");
        for (EmpDTO emp : collEmps) {
            System.out.println("| "+emp.getEmpno());
            System.out.println("| "+emp.getEname());
            System.out.println("| "+emp.getHiredate());
        }
        System.out.println("<-------------------------");
    }

    private static void _mostrarDepartamentos(Collection<DeptDTO> collDepts) {
        System.out.println("Departamentos: ");
        System.out.println("-------------------->");
        for (DeptDTO dto : collDepts) {
            System.out.println("| "+dto.getDeptno());
            System.out.println("| "+dto.getDname());
            System.out.println("| "+dto.getLoc());
        }
        System.out.println("<---------------------");
        System.out.println("Ingrese deptno: ");
    }
}
