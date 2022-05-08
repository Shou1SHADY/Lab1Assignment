import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {


    public static Main a ;
    int n ;


    @Test
    public void testisEquil() {
        a = new Main();
        n=2;
        int arr [][]= {{1,2,3},{-1,-2,-3}};
        assertEquals("YES",a.isEquil(arr,n));
    }

    @Test
    public void test1isEquil() {
        a = new Main();
        n=3;
        int arr [][]= {{1,2,3},{-3,-5,-7},{1,2,-9}};
        assertEquals("NO",a.isEquil(arr,n));
    }
    @Test
    public void test2isEquil() {
        a = new Main();
        n=3;
        int arr [][]= {{-1000,200,1},{-3,-5,-7},{1,200,-900}};
        assertEquals("ERROR",a.isEquil(arr,n));
    }


}