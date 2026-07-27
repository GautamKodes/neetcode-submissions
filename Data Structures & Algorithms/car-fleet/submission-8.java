class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // pos  =  4  1  0  7
        // speed=  2  2  1  1
        // dist =  2 4 12 7 9
        // time = 1 1 12 7 3

        // time =  3  3.5 10 3
        // fleet=  a  b   c  c

        int len = speed.length;
        if (len <2){
            return len;
        }
        int[][] arr = new int[len][2];

        for (int i = 0; i<len; i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr, (a,b) ->Integer.compare(b[0], a[0]) );
        int[] dist = new int[len];
        float[] time = new float[len];
        int fleet = 1;
        // System.out.println("Dist: ");
        for (int i = 0; i<len; i++){
            dist[i] = target-arr[i][0];
            // System.out.println(dist[i]);
        }
        System.out.println("Time: ");
        for (int i = 0; i<len; i++){
            time[i] = (float)dist[i]/(float)arr[i][1];
            // System.out.println(time[i]);
        }
        float last = time[0];
        for (int i = 0; i<len; i++){
            if (time[i] > last){
                fleet++;
            }
            if (time[i]>last){
            last=time[i];
            }
        }
        return fleet;

    }
}
