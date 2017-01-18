package _30.jpql.service;

public class JPQLQuery {

	/*	 mysql join 
	SELECT distinct d.name FROM `jpa.schema`.employee30 e inner join `jpa.schema`. department5 d ON(d.ÝD = e.DEPT_ID);
	SELECT * FROM `jpa.schema`.employee30 e left join `jpa.schema`. department5 d ON(d.ÝD = e.DEPT_ID);
	SELECT * FROM `jpa.schema`.employee30 e right join `jpa.schema`. department5 d ON(d.ÝD = e.DEPT_ID);	  
	 */
	
	public final static String JOIN_EMPLOYEE_AND_PHONE = "SELECT e.name , p FROM Employee30 e JOIN e.phones p";
	
	public final static String SELECT_ALL_PHONES_FROM_EMPLOYEE = "SELECT e.phones FROM Employee30 e where e.phones IS NOT EMPTY";

	public final static String JOIN_SELECT_EMPLOYEE_AND_DEPARTMENT = "Select Distinct d FROM Employee30 e JOIN e.department d";
	//distinct duplicate i önler 
	
	public final static String SELECT_ALL_DEPARTMENTS_FROM_EMPLOYEE = "Select Distinct e.department from Employee30 e where e.department IS NOT NULL";

	public final static String JOIN_DEPARTMENT_PROJECT_ADDRESS = "Select Distinct e.department from Employee30 e "
			+ "join Project3 p where p.name='Release1' and e.address.state='CA'";

	public final static String MORE_JOIN = "SELECT e.name, p  FROM Employee30 e JOIN e.phones p";

	public final static String LEFT_OUTER_JOIN = "SELECT e , d  FROM Employee30 e LEFT JOIN e.department d";

	public final static String RIGHT_OUTER_JOIN = "SELECT e , d FROM Department5 d LEFT JOIN d.employees e";

	public final static String INPUT_PARAMETER = "SELECT e from Employee30 e where e.salary > ?1";

	public final static String GREAT_AND_LESS = "SELECT e FROM Employee30 e WHERE e.salary >= ?1 AND e.salary <= ?2";

	public final static String BETWEEN_EXPRESSION = "SELECT e FROM Employee30 e WHERE e.salary BETWEEN ?1 AND ?2";

	public final static String NOT_BETWEEN_EXPRESSION = "SELECT e FROM Employee30 e WHERE e.salary NOT BETWEEN ?1 AND ?2";

	public final static String LIKE_EXPRESSION = "SELECT d FROM Department5 d WHERE d.name LIKE ?1";

	//SELECT * FROM `jpa.schema`.employee30 e JOIN `jpa.schema`.address2 a on (e.ADDRESS_ÝD= a.ÝD) where a.STATE in('NY','NJ');
	public final static String IN_EXPRESSION = "SELECT e FROM Employee30 e WHERE e.address.state IN (?1, ?2)";

	public final static String ALL_EXPRESSION = "SELECT e from Employee30 e WHERE e.salary> ALL(SELECT e2.salary FROM Employee30 e2 WHERE e2.department.id =?1)";

	public final static String AGGREGATE_FUNCTIONS="SELECT AVG(e.salary) , SUM(e.salary) , COUNT(e.id) , MAX(e.salary) , MIN(e.salary) FROM Employee30 e";
	
	//SELECT d.name , avg(e.salary) FROM `jpa.schema`.employee30 e JOin `jpa.schema`.department5 d on (d.id=e.DEPT_ID)
	//group by d.NAME;
	public final static String AVG_SALARY_GROUP_BY_DEPARTMENT="SELECT d.name , AVG(e.salary) FROM Department5 d JOIN d.employees e GROUP BY d.name";
	
	public final static String AVG_SALARY_GROUP_BY_DEPARTMENT_HAVING="SELECT d.name , AVG(e.salary) FROM Department5 d JOIN d.employees e GROUP BY d.name HAVING AVG(e.salary)>?1";
	
	public final static String SELECT_EMPLOYEE_ORDER_BY_SALARY= "SELECT e FROM Employee30 e ORDER BY e.salary DESC";
	
	public final static String UPDATE_EMPLOYEE_SALARY="UPDATE Employee30 e SET e.salary=80000 WHERE e.id=1";
	
	public final static String DELETE_EMPLOYEE_BYID= "DELETE FROM Employee30 e WHERE e.id=13";
	
}
