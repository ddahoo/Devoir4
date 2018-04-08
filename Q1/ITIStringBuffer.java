import java.util.*;

public class ITIStringBuffer {
    private static final SinglyLinkedList<String> buffer = new SinglyLinkedList<String>();

    public ITIStringBuffer() {
    }

    public ITIStringBuffer(String firstString){
        buffer.addFirst(firstString);
    }

    public void append(String nextString){
        buffer.add(nextString);
    }

    public String toString(){
        String result = String.join("", buffer);
        return result;
    }

}
