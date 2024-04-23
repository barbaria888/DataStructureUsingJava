
class CircularStack {
        static class circular_linked_list
        {
                node head;
                node tail;
                int size;

                static class node{
                        int data;
                        node next;
                        public node(int data){
                                this.data=data;
                                this.next=null;

                        }
                        public node(int data, node next){
                                this.data=data;
                                this.next=next;
                        }

                }
        /*public void OFGivenSize(int len){

        }*/

                public void add(int data)
                {
                        node temp =new node(data);
                        if(head==null)
                        {
                                head = temp;
                                tail=head;
                        }
                        tail.next = temp;
                        tail  = temp;
                        tail.next =head;
                        size++;
                }
                public void Display(){
                        node temp =head;
                        while(temp.next!=head)
                        {
                                System.out.print(temp.data+"->");
                                temp=temp.next;
                        }
                        System.out.print("null");
                }
                public int RemoveFromTail()
                {
                        node temp=head;
                        while(temp.next.next!=head)
                        {
                                temp = temp.next;
                        }
                        int val =temp.data;
                        temp.next=head;
                        tail = temp;
                        size--;
                        return val;}


                public int TailElement()
                {
                        if(tail==null)return -1;
                        return tail.data;
                }


        }

        circular_linked_list stack;


        public CircularStack() {
                this.stack = new circular_linked_list();
        }

        public void push(int data) {
                stack.add(data);
        }

        public int pop() throws Exception{
                if (stack.size == 0) throw new Exception("Stack underflow");

                int ans = stack.RemoveFromTail();
                return ans;
        }

        public int peek() {
                if(stack.size==0)return -1;
                return stack.TailElement();
        }

        public boolean isEmpty() {
                return (stack.size==0);
        }
        public static void main(String[] args) throws Exception{
                CircularStack cs = new CircularStack();
                cs.push(6);
                cs.push(5);
                cs.push(4);
                cs.push(3);
                cs.push(2);cs.push(1);cs.push(01);
                CircularStack ns  = new CircularStack();
                while(!cs.isEmpty()) {
                        System.out.println(cs.peek());
                        ns.push(cs.pop());

                }
        }


}