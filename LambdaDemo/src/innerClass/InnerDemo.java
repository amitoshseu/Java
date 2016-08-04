
package innerClass;

/*
Inner Classes
1. Member class
2. Nested Class
3. Anonymous Class
4. Lambda
*/
public class InnerDemo {
    public static void main(String[] args) {
        First first = new First();
        First.Inner obj= first.new Inner();
        obj.show();
    }
}

class First
{
    int rollno;
    String name;
    
    class Inner
    {
        public void show(){
            System.out.println("Hello");
        }
    }
}