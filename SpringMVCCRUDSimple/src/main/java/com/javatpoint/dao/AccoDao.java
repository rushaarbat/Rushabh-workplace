package com.javatpoint.dao;
import java.sql.ResultSet;
 

import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.javatpoint.beans.Account;
public class AccoDao {
	
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Account a){  
	    String sql="insert into acco(name,balance,type) values(('"+a.getNo()+"','"+a.getName()+"',"+a.getBalance()+",'"+a.getType()+"')";  
	    return template.update(sql);  
	}  
	public int update(Account a){  
	    String sql="update acco set no='"+a.getNo()+"' name='"+a.getName()+"', salary="+a.getBalance()+",designation='"+a.getType()+"' where no="+a.getNo()+"";  
	    return template.update(sql);  
	}  
	public int delete(int no){  
	    String sql="delete from acco where no="+no+"";  
	    return template.update(sql);  
	}  
	public Account getAccoByNo(int no){  
	    String sql="select * from acco where no=?";  
	    return template.queryForObject(sql, new Object[]{no},new BeanPropertyRowMapper<Account>(Account.class));  
	}  
	public List<Account> getAccount(){  
	    return template.query("select * from acco",
	    	new RowMapper<Account>()
	    	{  
	        	public Account mapRow(ResultSet rs, int row) throws SQLException 
	        	{  
	        		Account a=new Account();  
	        		a.setNo(rs.getInt(1));  
	        		a.setName(rs.getString(2));  
	        		a.setBalance(rs.getFloat(3));  
	        		a.setType(rs.getString(4));  
	        		return a;  
	        	}  
	    	}
	   );  
	}
	
}
