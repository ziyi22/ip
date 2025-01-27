package judy.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class TodoTest {
    @Test
    public void testTodoConvertString() {
        Todo t = new Todo("read book");
        assertEquals(" [T][ ] read book", t.toString());
    }
    @Test
    public void testTodoEncode() {
        Todo t = new Todo("grocery");
        assertEquals(" T | 0 | grocery", t.encode());
    }
}
