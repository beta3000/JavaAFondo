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
public class DeptDAO {

    public Collection<DeptDTO> buscarTodos(){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try {
            con = MysqlDBConexion.getConexion();
            String sql = "SELECT deptno, dname, loc FROM dept";
            
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            Vector<DeptDTO> ret = new Vector<>();
            DeptDTO dto = null;
            
            while (rs.next()) {                
                dto = new DeptDTO();
                dto.setDeptno(rs.getInt("deptno"));
                dto.setDname(rs.getString("dname"));
                dto.setLoc(rs.getString("loc"));
                ret.add(dto);
            }
            
            return ret;
            
        } catch (Exception e) {
            e.printStackTrace();
            throw  new RuntimeException(e);
        }finally{
            try {
                if(rs != null) rs.close();
                if(pstm != null) pstm.close();
            } catch (Exception e) {
                e.printStackTrace();
                throw  new RuntimeException(e);
            }
        }
        
        
    }
}
