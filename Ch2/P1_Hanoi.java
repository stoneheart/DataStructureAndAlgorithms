public class P1_Hanoi {
    public void TowersOfHanoi(int n, char frompeg, char topeg, char auxpeg) {
        /* If only 1 disk, make the move and return */
        if (n==1) {
            System.out.println("Move disk 1 from peg " + frompeg + " to peg " + topeg);
            return;
        }

        /* Move top n-1 disks from A to B, using C as auxiliary */
        TowersOfHanoi(n-1, frompeg, auxpeg, topeg);

        /* Move remaining disks from A to C */
        System.out.println("Move disk " + n + " from peg " + frompeg + " to " + topeg);

        /* Move n-1 disk from B to C using A as auxiliary */
        TowersOfHanoi(n-1, auxpeg, topeg, frompeg);
    }

    public static void main(String[] args) {
        int h = Integer.parseInt(args[0]);
        P1_Hanoi p = new P1_Hanoi();
        p.TowersOfHanoi(h, 'A', 'C', 'B');
    }
}
