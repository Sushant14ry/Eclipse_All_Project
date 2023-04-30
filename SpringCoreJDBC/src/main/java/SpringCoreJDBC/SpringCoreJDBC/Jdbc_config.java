package SpringCoreJDBC.SpringCoreJDBC;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import SpringCoreJDBC.SpringCoreJDBC.Dao.StudentDao;
import SpringCoreJDBC.SpringCoreJDBC.Dao.StudentdDao_empl;

@Configuration
@ComponentScan(basePackages = {"SpringCoreJDBC.SpringCoreJDBC.Dao"})
public class Jdbc_config {
	@Bean("ds")
	public DataSource getDatasource() {	
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("");
		
		return ds;
	}
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplates = new JdbcTemplate();
		jdbcTemplates.setDataSource(getDatasource());
		
		return jdbcTemplates;
	}
	
	
	
}
