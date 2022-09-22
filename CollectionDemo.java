import java.util.ArrayList;
class CollectionDemo {
    public static void main(String[] args) {
        ArrayList name = new ArrayList();
        name.add("Hermann");
        name.add("Fahyien");
        name.add("Farhan");

        System.out.println(name);
        ArrayList emp_id = new ArrayList();
        emp_id.add(101);
        emp_id.add(102);
        emp_id.add(103);

        System.out.println(emp_id);
        emp_id.addAll(name);
        System.out.println(emp_id);

        System.out.println(emp_id.add("Rehan"));//returns booleans if it adds object
        System.out.println(emp_id.contains("Farhan"));//it checks whether it contains object or not returns booleans value
        System.out.println(emp_id.contains("Anique"));

        System.out.println(name.isEmpty());//it check collection is empty or not boolean returns
        System.out.println(name.size());//it checks the collection object size
        System.out.println(name.get(2));//its return the index of collection objects
        System.out.println(name.set(0, "Insha"));//it set the value at given index and returns existed object at the given index 
        System.out.println(name);
        name.add(2, "Hermann");
        name.add(1, "jack");
        System.out.println(name);
        System.out.println(name.remove("jack"));//it returns the boolean value and remove the given object
        name.remove(0);//with remove we can give index value of collection object
        System.out.println(name);
        //-----------------------------------------------------//

        ArrayList company = new ArrayList();
        company.add("facebook");
        company.add("netflix");
        company.add("Amazon");
        company.add("Google");
        // System.out.println(company);
        // company.remove("facebook");
        System.out.println(company);

        ArrayList company2 = new ArrayList();
        company2.add("Groom");
        company2.add("netflix");
        company2.add("Amazon");
        company2.add("IT");
        company2.removeAll(company);//it compares to cllection and remove all simillar objects
        System.out.println(company2);
        company2.clear();//it will delete all objects inside collection
        System.out.println(company2);


    }
}
