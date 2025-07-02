package OOP;

public class Stack {
    int[] num = new  int[10];
    int tos;
    Stack(){
        tos = -1;
    }
    void push(int item){
//        ++tos;
        if (tos==9){
            System.out.println("Stack is full");
        }
        else {
            num[++tos]=item;
        }

    }
    int pop(){
        if(tos>=0){
            return num[tos--];
        }
       else {System.out.println("Stack is empty");
           return -1;}
    }
}
