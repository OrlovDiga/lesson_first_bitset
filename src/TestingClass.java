import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;


public class TestingClass extends TestCase {

    @Test
    public void testingIntersection() {
        Bitset a = new Bitset(4);
        a.add(1);
        a.add(2);
        a.add("Hello");
        a.add('k');

        Bitset b = new Bitset(5);
        b.add(1);
        b.add(3);
        b.add('k');
        b.add("Hello");

        HashSet c = new HashSet();
        c.add(1);
        c.add(2);
        c.add("Hello");
        c.add('k');

        assertEquals(c, a.intersection(b));
    }


    @Test
    public void testingAdd() {
        Bitset a = new Bitset(4);
        a.add(1);

        HashSet b = new HashSet();
        b.add(1);

        assertEquals(b, a.getList());

        a.add('k');
        b.add('k');

        assertEquals(b, a.getList());

        a.add("Hello");
        b.add("Hello");

        assertEquals(b, a.getList());
    }


    @Test
    public void testingUnion() {
        Bitset a = new Bitset(4);

        Bitset b = new Bitset(3);
        b.add(1);
        b.add('k');

        HashSet c = new HashSet();
        c.add(1);
        c.add('k');

        assertEquals(c, a.union(b));
    }


    @Test
    public void testingAddArrayList() {
        Bitset a = new Bitset(4);
        ArrayList temp = new ArrayList();

        Bitset b = new Bitset(3);
        b.add(1);
        b.add('k');
        b.add("qwe");

        temp.add(1);
        temp.add('k');
        temp.add("qwe");

        a.addArrayList(b);

        assertEquals(b.getList(), a.getList());
    }


    @Test
    public void testingDelete() {
        Bitset a = new Bitset(4);
        a.add(1);
        a.add(2);

        HashSet temp = new HashSet();
        temp.add(1);

        assertEquals(temp, a.delete(2));
    }


    @Test
    public void testingDeleteSet() {
        Bitset a = new Bitset(4);
        a.add(1);
        a.add(2);
        a.add('l');

        HashSet temp = new HashSet();
        temp.add(1);
        temp.add('l');

        Bitset b = new Bitset(3);
        b.add(2);

        assertEquals(b.getList(), a.deleteSet(temp));
    }


    @Test
    public void testingOwn() {
        Bitset a = new Bitset(4);
        a.add(1);

        assertEquals(true, a.own(1));
        assertEquals(false, a.own(2));
    }
}
