
package ProyectoEstructuras;

public class ImplementaciónEstructuras {
    static class ListaEnlazada{

    class Node{
        char data;
        Node next;
        public Node(char data){
            this.data = data;
            next = null;
        }
        public Node(){
            
        }
    }
        
        Node head;

        public ListaEnlazada(){
            head=null;
        }

        public void pushFront(char data){
            Node nodo = new Node(data);
            nodo.next = head;
            head = nodo;
        }
               
        public void pushBack(char data) {
            Node nodo = new Node(data);

            if (head == null) {
              head = new Node(data);
              return;
        }
            nodo.next = null;
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = nodo;
        }

        Character popBack(){
            Node temp = head;
            char c = ' ';
            if(head==null){
                c = ' ';
            }
            while(temp.next !=null && temp.next.data != ' '){
                temp = temp.next;
            }
            c = temp.data;
            temp.data = ' ';
            return c;
        }

        void deleteNode(int position) {
            if (head == null)
              return;

            Node temp = head;

            if (position == 0) {
              head = temp.next;
              return;
            }
            for (int i = 0; temp != null && i < position - 1; i++)
              temp = temp.next;

            if (temp == null || temp.next == null)
            return;

            Node next = temp.next.next;

            temp.next = next;
        }
        
        public boolean isEmpty(){
            return head==null;
        }

        void setValue(int position, char cambiar){
           Node temp = head;
           for(int i=0; i<position; i++){
               temp=temp.next;
           }
            temp.data = cambiar;
        }

        Character getValue(int position) {
            Node temp = head;
            for(int i=0; i<(position-1);i++){
                temp = temp.next;
            }
            return temp.data;
        }

        
        Integer size(){
            Node temp = head;
            int j = 0;
            if(this.head==null){
                return j;
            }
            while(temp != null){
                j++;
                temp = temp.next;
            }
            return j;
        }
        
        public void printList(){
            Node nodo = this.head;
            String aux = "";
            while (nodo != null) {
                aux = aux + nodo.data + " ";
                nodo = nodo.next;
            }
            aux.trim();
            System.out.print(aux);
        }

        public void printListLast(){
            Node nodo = this.head;
            while (nodo.next != null) {
                System.out.print(nodo.data + " ");
                nodo = nodo.next;
            }
            System.out.print(nodo.data);
        }
    }
    
    static class Pila extends ListaEnlazada{

        Node top = new Node();

        Pila(){
            this.top = null;
        }
        
        public void push(char x){
            Node temp = new Node();
            temp.data = x;
            temp.next = top;
            top = temp;
        }

        public boolean isEmpty(){
            return top == null;
        }

        public char peek(){
            return top.data;
        }

        Character pop(){
            char c = top.data;
            top = top.next;
            return c;
        }
        
        Integer size(){
            Node temp = top;
            int j = 0;
            if(this.top==null){
                return j;
            }
            while(temp != null){
                j++;
                temp = temp.next;
            }
            return j;
        }
    }
}
