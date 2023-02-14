package thread;

public class BreakThread extends Thread{
    public static void main(String[] args) {
        Thread thread = getThread();
        thread.interrupt();
    }
    public static Thread getThread(){
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        String groupName = group.getName();
        while(group != null) {
            Thread[] threads = new Thread[(int) (group.activeCount() * 1.2)];
            int count = group.enumerate(threads, true);
            for (int i = 0; i < count; i++) {
                Thread thread = threads[i];
                System.out.println("线程组"+groupName+"  线程数量"+group.activeCount()+"  线程名称:"+thread.getName());
                /*if ("testThread".equals(threads[i].getName())) {
                    return threads[i];
                }*/
            }
        }
        return null;
    }

}
