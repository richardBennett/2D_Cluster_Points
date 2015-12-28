package clusterPoints;

import java.io.IOException;

public class ClusterMachineTester 
{
    public static void main(String[] args) throws IOException {
    
        clusterMachine clusterMachine = new clusterMachine();
        clusterMachine.accessFile("2dPoints.txt");
        clusterMachine.acquireData();
        clusterMachine.calcNormals();
        clusterMachine.selectInitialClusters();
        int number = clusterMachine.clusterPoints.size();
        System.out.println("Checking Clusters");
        for(int i = 0; i < number; i++) {
            System.out.println(clusterMachine.clusterPoints.get(i)[0] + "," + clusterMachine.clusterPoints.get(i)[1]);
        }
        System.out.println("Checking Refined Clusters");
        clusterMachine.refine(20000);
        for(int i = 0; i < number; i++) {
            System.out.println(clusterMachine.clusterPoints.get(i)[0] + "," + clusterMachine.clusterPoints.get(i)[1]);
        }
    }
}
