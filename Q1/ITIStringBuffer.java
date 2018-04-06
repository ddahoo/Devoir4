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
        Iterator<String> itr = buffer.iterator();
        String result = new String();
        while (itr.hasNext())
        {
          result.concat((String)itr.next());
        }
        return result;
    }

}
