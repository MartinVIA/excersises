public class Person{
    String name;
    String birth;
    public void setName(String id){
        name=id;        
    }
    public void setbirth(int bday){
        birth = Integer.toString(bday);
        
    }
    
    public String getName(){
        return name;
    }
    
    public String getBday(){
        return birth;
    }
}
