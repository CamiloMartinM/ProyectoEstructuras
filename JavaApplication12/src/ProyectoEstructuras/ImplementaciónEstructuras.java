
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
    
// Create node
static class Node {
  Libro item;
   int height;
  Node left, right;

  Node(Libro d) {
    item = d;
    height = 1;
  }
}

// Tree class
 static class AVLTree {
  Node root;

  int height(Node N) {
    if (N == null)
      return 0;
    return N.height;
  }

  int max(int a, int b) {
    return (a > b) ? a : b;
  }

  Node rightRotate(Node y) {
    Node x = y.left;
    Node T2 = x.right;
    x.right = y;
    y.left = T2;
    y.height = max(height(y.left), height(y.right)) + 1;
    x.height = max(height(x.left), height(x.right)) + 1;
    return x;
  }

  Node leftRotate(Node x) {
    Node y = x.right;
    Node T2 = y.left;
    y.left = x;
    x.right = T2;
    x.height = max(height(x.left), height(x.right)) + 1;
    y.height = max(height(y.left), height(y.right)) + 1;
    return y;
  }

  // Get balance factor of a node
  int getBalanceFactor(Node N) {
    if (N == null)
      return 0;
    return height(N.left) - height(N.right);
  }

  // Insert a node
  Node insertNode(Node node, Libro item) {
    // Find the position and insert the node
    if (node == null)   
      return (new Node(item));
    if (item.getPrecio() < node.item.getPrecio())
      node.left = insertNode(node.left, item);
    else if (item.getPrecio() > node.item.getPrecio())
      node.right = insertNode(node.right, item);
    else
      return node;

    // Update the balance factor of each node
    // And, balance the tree
    node.height = 1 + max(height(node.left), height(node.right));
    int balanceFactor = getBalanceFactor(node);
    if (balanceFactor > 1) {
      if (item.getPrecio() < node.left.item.getPrecio()) {
        return rightRotate(node);
      } else if (item.getPrecio() > node.left.item.getPrecio()) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
      }
    }
    if (balanceFactor < -1) {
      if (item.getPrecio() > node.right.item.getPrecio()) {
        return leftRotate(node);
      } else if (item.getPrecio() < node.right.item.getPrecio()) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }
    }
    return node;
  }

  Node nodeWithMimumValue(Node node) {
    Node current = node;
    while (current.left != null)
      current = current.left;
    return current;
  }

  // Delete a node
  Node deleteNode(Node root, Libro item) {
    
    // Find the node to be deleted and remove it
    if (root == null)
      return root;
    if (item.getPrecio() < root.item.getPrecio())
      root.left = deleteNode(root.left, item);
    else if (item.getPrecio() > root.item.getPrecio())
      root.right = deleteNode(root.right, item);
    else {
      if ((root.left == null) || (root.right == null)) {
        Node temp = null;
        if (temp == root.left)
          temp = root.right;
        else
          temp = root.left;
        if (temp == null) {
          temp = root;
          root = null;
        } else
          root = temp;
      } else {
        Node temp = nodeWithMimumValue(root.right);
        root.item = temp.item;
        root.right = deleteNode(root.right, temp.item);
      }
    }
    if (root == null)
      return root;

    // Update the balance factor of each node and balance the tree
    root.height = max(height(root.left), height(root.right)) + 1;
    int balanceFactor = getBalanceFactor(root);
    if (balanceFactor > 1) {
      if (getBalanceFactor(root.left) >= 0) {
        return rightRotate(root);
      } else {
        root.left = leftRotate(root.left);
        return rightRotate(root);
      }
    }
    if (balanceFactor < -1) {
      if (getBalanceFactor(root.right) <= 0) {
        return leftRotate(root);
      } else {
        root.right = rightRotate(root.right);
        return leftRotate(root);
      }
    }
    return root;
  }

  void preOrder(Node node) {
    if (node != null) {
      System.out.println(node.item + " ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  // Print the tree
  public void printTree(Node currPtr, String indent, boolean last) {
    if (currPtr != null) {
      System.out.print(indent);
      if (last) {
        System.out.print("R----");
        indent += "   ";
      } else {
        System.out.print("L----");
        indent += "|  ";
      }
      System.out.println(currPtr.item);
      printTree(currPtr.left, indent, false);
      printTree(currPtr.right, indent, true);
    }
  }
  
  
  
}
}
