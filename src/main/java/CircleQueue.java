import java.util.Scanner;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-03
 * @Description 队列
 **/
public class CircleQueue {
    private int front;
    private int rest;
    private int maxSize;
    private Integer[] queue;

    public CircleQueue(int size){
        maxSize = size + 1;
        queue = new Integer[size + 1];
    }

    public boolean isFull(){
        return (rest + 1) % maxSize == front;
    }

    public boolean isEmpty(){
        return front == rest;
    }

    public void add(int element){
        if(isFull()){
            System.out.println("队列已满");
            return;
        }
        queue[(rest + maxSize)%maxSize] = element;
        rest++;
    }

    public int pop(){
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        int result = queue[front];
        queue[front] = null;
        front++;
        return result;
    }

    public void select(){
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for(int i = 0;i<(rest + maxSize - front) % maxSize;i++){
            System.out.print("queue["+(front + i + maxSize)%maxSize+"]="+queue[(front + i + maxSize)%maxSize]+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入队列大小");
        int i = scanner.nextInt();
        CircleQueue queue = new CircleQueue(i);
        boolean flag = true;
        while (flag) {
            System.out.println("a:新增，p:移除，s:查询，e:退出");
            char c = scanner.next().charAt(0);
            switch (c){
                case 'a':
                    queue.add(scanner.nextInt());
                    break;
                case 'p':
                    queue.pop();
                    break;
                case 's':
                    queue.select();
                    break;
                case 'e':
                    scanner.close();
                    flag = false;
                    break;
                default:
                    throw new RuntimeException("暂不支持的类型");
            }
        }
    }
}
