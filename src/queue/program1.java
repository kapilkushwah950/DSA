package queue;

public class program1 {

    int[] queue;
    int size;
    int front,rear;

    program1(int size)
    {
        queue = new int[size];
        this.size = size;
        front=rear=-1;


    }

       void enqueue(int data)
       {
           if(rear==size-1)
               System.out.println("Queue is full");
           else
           {
               if(front==-1){
                   front = 0;
               }
               rear++;
               queue[rear]=data;
           }
       }

       void dequeue()
       {

       if(front==-1)
               System.out.println("Queue is empty");
       else
            {
                if(front==rear)
                {
                    front=rear=-1;
                }
                else
                    {
                        front++;
                    }

            }
       }

        void printQueue()
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(queue[i]+"\t");
            }
            System.out.println();
        }
    public static void main(String[] args) {

        program1 p1 = new program1(5);
        p1.enqueue(10);
        p1.enqueue(20);
        p1.enqueue(30);
        p1.enqueue(40);
        p1.enqueue(50);
        p1.printQueue();
        p1.dequeue();
        p1.printQueue();
    }
}
