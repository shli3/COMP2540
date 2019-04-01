class q4{
    public static void main(String args[]){

        BinaryTree bt = new BinaryTree();
        long t = System.nanoTime();

        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(5);
        bt.insert(6);
        bt.insert(7);
        bt.insert(8);
        bt.insert(9);
        bt.insert(10);
        bt.insert(11);
        bt.insert(12);
        bt.insert(13);
        bt.insert(14);
        bt.insert(15);

        bt.InOrder();

        for(int i = 0; i < 100000; i++){
            bt.search(1);
        }

        long t1 = System.nanoTime();
        int n = (int)t1-(int)t;

        System.out.println(" " + n);

        long t2 = System.nanoTime();

        for(int i = 0; i < 100000; i++){
            bt.search(15);
        }

        long t3 = System.nanoTime();
        int n1 = (int)t3-(int)t2;

        System.out.println(" " + n1);

        bt.remove(5);
        bt.InOrder();
        System.out.print("\n");
        bt.remove(15);
        bt.InOrder();
        System.out.print("\n");
        bt.remove(1);
        bt.InOrder();
        System.out.print("\n");
        bt.insert(2);
        bt.InOrder();
        System.out.print("\n");

        BinaryTree bt2 = new BinaryTree();

        bt2.insert(8);
        bt2.insert(4);
        bt2.insert(12);
        bt2.insert(2);
        bt2.insert(6);
        bt2.insert(10);
        bt2.insert(14);
        bt2.insert(1);
        bt2.insert(3);
        bt2.insert(5);
        bt2.insert(7);
        bt2.insert(9);
        bt2.insert(11);
        bt2.insert(13);
        bt2.insert(15);

        bt2.InOrder();

        long t4 = System.nanoTime();

        for(int i = 0; i < 100000; i++){
            bt2.search(1);
        }

        long t5 = System.nanoTime();
        int n2 = (int)t5-(int)t4;

        System.out.println(" " + n2);

        long t6 = System.nanoTime();

        for(int i = 0; i < 100000; i++){
            bt2.search(15);
        }

        long t7 = System.nanoTime();
        int n3 = (int)t7-(int)t6;

        System.out.println(" " + n3);

        bt2.remove(8);
        bt2.InOrder();

    }
}