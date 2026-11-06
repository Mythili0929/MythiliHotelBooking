class Table {
    synchronized void printTable(int n) {
        for(int i=1;i<=5;i++) {
            System.out.println(n*i);
        }
    }
}

class Thread1 extends Thread {
    Table t;
    Thread1(Table t){ this.t = t; }
    public void run(){ t.printTable(5); }
}

class Thread2 extends Thread {
    Table t;
    Thread2(Table t){ this.t = t; }
    public void run(){ t.printTable(10); }
}

class TestSync {
    public static void main(String[] args) {
        Table obj = new Table();
        new Thread1(obj).start();
        new Thread2(obj).start();
    }
}