package stack;

public class program1 {

    int[] stack;
    int top;
    int size;
    program1(int size)
    {
        stack = new int[size];
        this.size = size;
        top = -1;
    }
    void push(int data)
    {
        if(top==size-1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            stack[top] = data;
        }
    }
    void printstack() {
        for (int i = 0; i <= top; i++)
        {
            System.out.print(stack[i] + "\t");
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        else
        {
            top--;
        }
    }
    int peek()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
            return -1;
        }
        else
        {
            return stack[top];
        }
    }

   public static void main(String[] args)
   {
        program1 p1 = new program1(5);
        p1.push(10);
        p1.push(20);
        p1.push(30);
        p1.push(40);
        p1.push(50);
        p1.printstack();
        p1.pop();
        p1.printstack();
       System.out.println("the value of stack is "+p1.peek());
    }
}
