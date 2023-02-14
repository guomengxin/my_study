package thread;
public class HandleThread extends Thread{
    @Override
    public void run() {
        System.out.println("开始睡眠");
            System.out.println(Thread.currentThread().getName());
            while(true){
                System.out.println("循环中------");
            }

    }

    public static void main(String[] args) {
        HandleThread handleThread = new HandleThread();

        handleThread.setName("testThread");
        handleThread.start();
    }
}
