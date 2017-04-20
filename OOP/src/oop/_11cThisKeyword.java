
package oop;

/**
 *
 * @author amitoshseu
 */
public class _11cThisKeyword {
    public static void main(String[] args) {
        
    }
}

class SomeClass3{
    int x; 
    int y; 
    boolean z;
    char c;
    
    SomeClass3()
    {
        this(0,0,false,' ');
        //can't any statement above this statement
    }
    
    SomeClass3(int x)
    {
        this(x,0,false,' ');
    }
    
    SomeClass3(int x, int y)
    {
        this(x,y,false,' ');
    }
    
    SomeClass3(int x, int y, boolean z, char c)
    {
        this.x = x;
        this.y = y;
        this.z = z; 
        this.c = c;
    }
}
