package capitulo4;

/**
 * @author G4m[@]
 */
public class DeptDTO {

    private int deptno;
    private String dname;
    private String loc;
    
    @Override
    public String toString(){
        return deptno+", "+dname+", "+loc;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    
    
}