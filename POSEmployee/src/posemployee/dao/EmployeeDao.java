
package posemployee.dao;

import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import posemployee.model.EmployeeModel;
import posemployee.utill.DBUtill;

public class EmployeeDao {
    DBUtill db=new DBUtill();
    PreparedStatement ps;
    String sql="";
    EmployeeModel e;
    
    
    public void save(EmployeeModel e){
        sql="insert into employee(name,salary,email) values(?,?,?)";
        try {
            ps= db.getConn().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setDouble(2, e.getSalary());
            ps.setString(1, e.getEmail());
            ps.executeUpdate();
            ps.close();
            db.getConn().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<EmployeeModel> findAll(){
        List<EmployeeModel> eList= new ArrayList<>();
        
        sql="select * from employee";
        try {
            ps=db.getConn().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                EmployeeModel e=new EmployeeModel();
                e.setId(rs.getInt("id"));
                e.setName(rs.getString("name"));
                e.setSalary(rs.getDouble("Salary"));
                e.setEmail(rs.getString("email"));
                eList.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eList;
    }
}
