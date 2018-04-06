public class ITIStringBuffer {
    private SinglyLinkedList<String> buffer;

    public ITIStringBuffer() {
        buffer = new SinglyLinkedList<String>();
    }

    public ITIStringBuffer(String  firstString){
        buffer = new SinglyLinkedList<String>();
        buffer.addFirst(firstString);
    }

    public void append(String nextString){
        buffer.add(nextString);
    }

    public String toString(){
        Iterator itr = buffer.iterator();
        while (itr.hasNext())
        {
          System.out.print(itr.next());
        }
    }

}
