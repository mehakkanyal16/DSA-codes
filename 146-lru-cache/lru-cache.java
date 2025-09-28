class LRUCache {
  class Node{
    
    int key;
    int val;
    Node prev;
    Node next;
    Node(int key ,int val){
        this.key=key;
        this.val=val;
    }
  }
   Node head=new Node(-1,-1);
   Node tail=new Node(-1,-1);
   int cap;
   HashMap<Integer,Node>mp=new HashMap<>();

    public LRUCache(int capacity) {
        this.cap=capacity;
        head.next=tail;
        tail.prev=head;
        
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            Node resNode=mp.get(key);
            int ans=resNode.val;
            mp.remove(key);
            delNode(resNode);
            addNode(resNode);
            mp.put(key,head.next);
            return ans;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
       if(mp.containsKey(key)){
        Node curr=mp.get(key);
        mp.remove(key);
        delNode(curr);

       }

       if(mp.size()==cap){
        mp.remove(tail.prev.key);
        delNode(tail.prev);
       }

       addNode(new Node(key,value));
       mp.put(key,head.next);

        
    }
    private void addNode(Node newNode){
        Node temp=head.next;
        newNode.next=temp;
        newNode.prev=head;
        head.next=newNode;
        temp.prev=newNode;
    }
    private void delNode(Node delNode){
        Node prev=delNode.prev;
        Node next=delNode.next;
        prev.next=next;
        next.prev=prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */