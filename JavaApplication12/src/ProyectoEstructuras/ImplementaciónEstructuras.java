
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
    
    class Node {
    int key, height;
    Node left, right;
 
    Node(int d) {
        key = d;
        height = 1;
    }
}
 
class AVLTree {
 
    Node root;
 
    // A utility function to get the height of the tree
    int height(Node N) {
        if (N == null)
            return 0;
 
        return N.height;
    }
 
    // A utility function to get maximum of two integers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }
 
    // A utility function to right rotate subtree rooted with y
    // See the diagram given above.
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
 
        // Perform rotation
        x.right = y;
        y.left = T2;
 
        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
 
        // Return new root
        return x;
    }
 
    // A utility function to left rotate subtree rooted with x
    // See the diagram given above.
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
 
        // Perform rotation
        y.left = x;
        x.right = T2;
 
        //  Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
 
        // Return new root
        return y;
    }
 
    // Get Balance factor of node N
    int getBalance(Node N) {
        if (N == null)
            return 0;
 
        return height(N.left) - height(N.right);
    }
 
    Node insert(Node node, int key) {
 
        /* 1.  Perform the normal BST insertion */
        if (node == null)
            return (new Node(key));
 
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplicate keys not allowed
            return node;
 
        /* 2. Update height of this ancestor node */
        node.height = 1 + max(height(node.left),
                              height(node.right));
 
        /* 3. Get the balance factor of this ancestor
              node to check whether this node became
              unbalanced */
        int balance = getBalance(node);
 
        // If this node becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);
 
        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);
 
        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
 
        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
 
        /* return the (unchanged) node pointer */
        return node;
    }
    // A utility function to print preorder traversal
    // of the tree.
    // The function also prints height of every node
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
}
