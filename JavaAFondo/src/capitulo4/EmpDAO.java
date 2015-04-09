package capitulo4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Vector;
import util.MysqlDBConexion;

/**
 * @author G4m[@]
 */
public class EmpDAO {

    public Collection<EmpDTO> buscarXDept(int deptno){
        Connection con = null;
        PreparedStatement pstm =null;
        ResultSet rs = null;
        
        try {
            con = MysqlDBConexion.getConexion();
            String sql = "";
            sql += "select empno, ename, hiredate, deptno ";
            sql += "from emp ";
            sql += "where deptno = ?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, deptno);
            rs = pstm.executeQuery();
            
            Vector<EmpDTO> ret = new Vector<>();
            EmpDTO dto = null;
            
            while (rs.next()) {                
                dto = new EmpDTO();
                dto.setEmpno(rs.getInt("empno"));
                dto.setEname(rs.getString("ename"));
                dto.setHiredate(rs.getDate("hiredate"));
                dto.setDeptno(rs.getInt("deptno"));
                ret.add(dto);
            }
            
            return ret;
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            try {
                if(rs != null) rs.close();
                if(pstm != null) pstm.close();
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}
