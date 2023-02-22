import static org.junit.Assert.assertEquals;

import java.util.ArrayList;


public class Test {

    @org.junit.Test
    public void Infix_To_Postfix() { // Test para Single Linked List
        String infix = Main.infix_to_postfix("(4-3)+3");
        assertEquals("43-3+", infix);
        infix = Main.infix_to_postfix("2*(8/4)");
        assertEquals("284/*", infix);
    }
    @org.junit.Test
    public void SingleLinkedList() { // Test para Single Linked List
        ListFactory lf = new ListFactory();
        IList temp;
        temp = lf.getInstance("simple");
        temp.InsertAtStart(1);
        temp.InsertAtStart(2);
        assertEquals(2, temp.Get(0));
        assertEquals(1, temp.Get(1));
    }

    @org.junit.Test
    public void DoubleLinkedList() { // Test para Double Linked List
        ListFactory lf = new ListFactory();
        IList temp;
        temp = lf.getInstance("doble");
        temp.InsertAtStart(1);
        temp.InsertAtStart(2);
        assertEquals(2, temp.Get(0));
        assertEquals(1, temp.Get(1));
    }
    @org.junit.Test
    public void St_ArrayList() { // Stack con ArrayList
        StackFactory stf = new StackFactory();
        IStack<Integer> st = stf.getInstance("arraylist");
        st.push(1);
        assertEquals(1, st.peek().intValue());
        st.push(2);
        assertEquals(2, st.peek().intValue());
        assertEquals(2, st.pull().intValue());
        assertEquals(false, st.isEmpty());
        assertEquals(1, st.pull().intValue());
        assertEquals(true, st.isEmpty());
    }

    @org.junit.Test
    public void St_Vector() { // Stack con Vector
        StackFactory stf = new StackFactory();
        IStack<Integer> st = stf.getInstance("vector");
        st.push(1);
        assertEquals(1, st.peek().intValue());
        st.push(2);
        assertEquals(2, st.peek().intValue());
        assertEquals(2, st.pull().intValue());
        assertEquals(false, st.isEmpty());
        assertEquals(1, st.pull().intValue());
        assertEquals(true, st.isEmpty());
    }

    @org.junit.Test
    public void St_SimpleList() { // Stack con Lista Simple
        StackFactory stf = new StackFactory();
        IStack<Integer> st = stf.getInstance("simple");
        st.push(1);
        assertEquals(1, st.peek().intValue());
        st.push(2);
        assertEquals(2, st.peek().intValue());
        assertEquals(2, st.pull().intValue());
        assertEquals(false, st.isEmpty());
        assertEquals(1, st.pull().intValue());
        assertEquals(true, st.isEmpty());
    }
    @org.junit.Test
    public void St_DoubleList() { // Stack con Lista doble
        StackFactory stf = new StackFactory();
        IStack<Integer> st = stf.getInstance("doble");
        st.push(1);
        assertEquals(1, st.peek().intValue());
        st.push(2);
        assertEquals(2, st.peek().intValue());
        assertEquals(2, st.pull().intValue());
        assertEquals(false, st.isEmpty());
        assertEquals(1, st.pull().intValue());
        assertEquals(true, st.isEmpty());
    }

    @org.junit.Test
        public void Calculadora() { // operaciones
        Calculadora cal;
        cal = Calculadora.getInstance();
        // SUMA
        assertEquals(5, cal.suma(3, 2));
        assertEquals(-3, cal.suma(-9, 6));
        // MULT
        assertEquals(15, cal.multiplicacion(3, 5));
        assertEquals(-3, cal.multiplicacion(3, -1));
        // RESTA (se opera como b - a)
        assertEquals(2, cal.resta(3, 5));
        assertEquals(-4, cal.resta(6, 2));
        // DIV (se opera como b / a)
        assertEquals(3, cal.division(10, 30));
        assertEquals(4, cal.division(3, 12));
    }

    @org.junit.Test
    public void getItems() { // getItems
        Calculadora cal;
        cal = Calculadora.getInstance();
        ArrayList<String> ar = cal.getItems("ABC");
        assertEquals("A", ar.get(0));
        assertEquals("B", ar.get(1));
        assertEquals("C", ar.get(2));
    }

    @org.junit.Test
    public void isOneItem() { // isOneItem
        Calculadora cal;
        cal = Calculadora.getInstance();
        St_ArrayList st = new St_ArrayList<Integer>();
        st.push(1);
        assertEquals(true, cal.isOneItem(st));
        st.push(2);
        assertEquals(false, cal.isOneItem(st));
    }

    @org.junit.Test
    public void isOperator() { // getItems
        Calculadora cal;
        cal = Calculadora.getInstance();
        assertEquals(true, cal.isOperator("+"));
        assertEquals(true, cal.isOperator("-"));
        assertEquals(true, cal.isOperator("*"));
        assertEquals(true, cal.isOperator("/"));
        assertEquals(false, cal.isOperator("1"));
        assertEquals(false, cal.isOperator("3"));
    }
}