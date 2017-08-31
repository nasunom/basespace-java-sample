public class Test{
    static void test(int nloops){
        for(int i = nloops; 0 < i; i--){
            java.util.Date date = new java.util.Date();
            System.out.println(i + " " + date.toString());

            // sleep
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        }
    }

    public static void main(String[] args){
        java.util.StringJoiner joiner = new java.util.StringJoiner(",");
        for(String s : args){
            joiner.add(s);
        }
        System.out.println("args: " + joiner.toString());

        String name = new Object(){}.getClass().getEnclosingClass().getName();
        try{
            int nloops = Integer.parseInt(args[0]);
            test(nloops);
        }
        catch(Exception e){
            System.err.println(e.getMessage());
            System.out.println(name + " failed.");
            System.exit(1);
        }
        System.out.println(name + " completed.");
    }
}
