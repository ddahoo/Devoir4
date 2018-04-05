public class ITIStringBuffer {
    private SinglyLinkedList<String> buffer;

    public ITIStringBuffer() {
        buffer = new SinglyLinkedList<String>();
    }

    public ITIStringBuffer(String  firstString){
        if(buffer != null)
        {
            buffer.addFirst(firstString);
        }
        else
        {
            
        }
    }

    public void append(String nextString){
        throw new UnsupportedOperationException( "replace with your implementation" );
    }

    public String toString(){
        throw new UnsupportedOperationException( "replace with your implementation" );
    }

}
