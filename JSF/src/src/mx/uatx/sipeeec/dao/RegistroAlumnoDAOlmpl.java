package mx.uatx.sipeeec.dao;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import mx.uatx.sipeeec.dto.RegistroAlumnoDTO;

public class RegistroAlumnoDAOlmpl implements RegistroAlumnoDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
   
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
	@Override
	public void insertar(RegistroAlumnoDAO alumno) {
		// TODO Auto-generated method stub
		jdbcTemplateObject.update("insert into EMPLOYEE (EMP_HIRE_DATE, EMP_NAME, EMP_SALARY) values (?, ?, ?)", alumno.getEmployeeHireDate(),alumno.getEmployeeName(),alumno.getEmployeeSalary());
		
	}

}
