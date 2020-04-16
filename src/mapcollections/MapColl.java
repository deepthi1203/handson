package mapcollections;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapColl {

	public static void main(String[] args)
	{
		 Employee e1 = new Employee(1, "Bargav", "aa@gmail.com", 23000.00);
	     Employee e2 = new Employee(2, "Anudeep", "bb@gmail.com", 21000.00);
	     Employee e3 = new Employee(3, "Bhanupratap", "cc@gmail.com", 22000.00);
	     Employee e4 = new Employee(4, "Laxmi Soujamy", "dd@gmail.com", 20000.00);
	     Employee e5 = new Employee(5, "Charan", "ee@gmail.com", 24000.00);
	     SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			Date d1=new Date(11-03-2000); 
			Date d=new Date(12-03-2020);
	     Project p1=new Project(101, "develop", d1, d);
	     Project p2=new Project(201, "support", d1, d);
	     Project p3=new Project(301, "test", d1, d);
	     Project p4=new Project(401, "finance", d1, d);
	     Project p5=new Project(501, "manger", d1, d);
	     Project p6=new Project(601, "hr", d1, d);
	     Project p7=new Project(701, "asstmanager", d1, d);
	     Project p8=new Project(801, "executor", d1, d);
	     Project p9=new Project(901, "devleop", d1, d);
	     Project p10=new Project(102, "support", d1, d);
	     
	     Comparator<Employee> empComparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

                    if(o1.getSalary() > o2.getSalary())
                    {
                    	return 1;
                    }else if(o1.getSalary() < o2.getSalary())
                    {
                    	return -1;
                    }
                    else {
				return 0;
                    }
			}
		};	
		Map<Project,Employee> map=new HashMap<Project,Employee>();
		map.put(p1,e3);
		map.put(p2,e1);
		map.put(p3,e4);
		map.put(p4,e5);
		map.put(p5,e2);
		map.put(p6,e1);
		map.put(p7,e2);
		map.put(p8,e3);
		map.put(p9,e4);
		map.put(p10,e5);
	
		map.entrySet().stream().forEach(t->System.out.println(t));
		
	}
	
	public static Map<Project,Employee> loadProjects()
	{
		TreeMap<Project,Employee> map=new TreeMap<Project,Employee>();
		
		return map;
		
	}
	public void displayByProjectID(Map<Project,Employee> map)
	{
	System.out.println(map);	
	}
	public void displayByProjectDomain(Map<Project,Employee> map)
	{
		
	}


}
