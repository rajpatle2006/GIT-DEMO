class QueueArray {
    int f=0,r=0;
    int[] q=new int[5];

    void insert(int x){
        if(r==5) System.out.println("Overflow");
        else q[r++]=x;
    }
    void delete(){
        if(f==r) System.out.println("Underflow");
        else System.out.println(q[f++]);
    }

    public static void main(String[] args) {
        QueueArray q=new QueueArray();
        q.insert(10);
        q.insert(20);
        q.delete();
    }
}