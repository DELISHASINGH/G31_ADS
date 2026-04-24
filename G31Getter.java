public class G31Getter {
    a s = new a();
    public static void main(String[] args) {
        G31Getter g = new G31Getter();
        System.out.println(g.s.getAge());
        System.out.println(g.s.getName());
    }
}
class a{
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    

}
