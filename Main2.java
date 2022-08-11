import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main2 {
    public static int[] stack;
    public static int size = 0;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        while(N > 0){
            st = new StringTokenizer(br.readLine(), " ");
            
            switch(st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                
                case "pop":
                    sb.append(pop()).append('\n');
                    break; 
                case "size":
                    sb.append(size()).append('\n');
                    break; 
                case "empty":
                    sb.append(empty()).append('\n');
                    break; 
                case "top":
                    sb.append(top()).append('\n');
                    break;   
            }
            N--;
        }
        
        System.out.println(sb);
    }
    


    public static void push(int a){
        stack[size] = a;
        size++;
    }
    public static int pop(){
        if(size ==0){
            return -1;
        }else{
            int res = stack[size - 1];
            stack[size - 1] =0;
            size --;
            return res;
        }
    }
    public static int size(){     
        return size;
    }
    public static int empty(){
        if(size ==0){
            return 1;
        }else{
            return 0;
        }
    }
    public static int top(){
        if(size == 0){
            return -1;
        }else{
            return stack[size - 1];
        }
    }
}
