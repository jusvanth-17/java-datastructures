package graph;

import java.util.*;

public class MaximumWeightNode {
    public static int findMaximumWeightNode(int[] edges) {
        int n = edges.length;
        int[] weights = new int[n];
        
        // Calculate weights for each node
        for (int i = 0; i < n; i++) {
            if (edges[i] != -1) {
                weights[edges[i]] += i;
            }
        }
        
        // Find the node with the maximum weight
        int maxWeight = -1;
        int nodeWithMaxWeight = -1;
        for (int i = 0; i < n; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                nodeWithMaxWeight = i;
            }
        }
        
        return nodeWithMaxWeight;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] edges = new int[n];
        for (int i = 0; i < n; i++) {
            edges[i] = scanner.nextInt();
        }
        
        int result = findMaximumWeightNode(edges);
        System.out.println(result);
        
        scanner.close();
    }
}