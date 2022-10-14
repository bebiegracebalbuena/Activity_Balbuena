public class Person {
    private static int count ;
    private String name;
    private Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
        
        count++;
    }

    // public static void numberOfObjects(){
    //     System.out.println("-------Create " + count + " objects-------");
    // }
   
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;
    }
    

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
}


