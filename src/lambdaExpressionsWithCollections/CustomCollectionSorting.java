import java.util.*;
/**
 * @author Abinash Dash
   This program demonstrates how to sort custom collection with Lambda expressions  
 **/
class Employee {
    int eNo;
    String eName;
    
    Employee(int eNo, String eName) {
        this.eNo = eNo;
        this.eName = eName;
    }
    
    @Override
    public String toString() {
        return eNo + ":" + eName;
    }
}

public class Test {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(200,"Deepika"));
        list.add(new Employee(400,"Sunny"));
        list.add(new Employee(300,"Malika"));
        list.add(new Employee(100,"Katrina"));
        System.out.println("Before sorting = " + list);
        
        Collections.sort(list, (e1,e2) -> {
           if(e1.eNo > e2.eNo)
              return -1;
           else if(e1.eNo < e2.eNo)
              return 1;
           else
              return 0;
        });
        
        System.out.println("After Sorting = " + list);
    }
}
