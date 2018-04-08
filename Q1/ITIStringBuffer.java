import java.util.*;

/*
* String buffer implemented using a singly linked list.
*/
public class ITIStringBuffer {
    /*
    * Linked list used for the buffer.
    */
    private static final SinglyLinkedList<String> buffer = new SinglyLinkedList<String>();
    /*
    * Constructor for ITIStringBuffer.
    */
    public ITIStringBuffer() {
    }
    /*
    * Constructor for ITIStringBuffer.
    * The argument will be the first string of the buffer.
    * @param firstString The first string to append.
    */
    public ITIStringBuffer(String firstString){
        buffer.addFirst(firstString);
    }
    /*
    * Appends the argument at the end of the buffer.
    * @param nextString The String to append.
    */
    public void append(String nextString){
        buffer.add(nextString);
    }
    /*
    * @return A string representation of the buffer.
    */
    public String toString(){
        String result = String.join("", buffer);
        return result;
    }

}
