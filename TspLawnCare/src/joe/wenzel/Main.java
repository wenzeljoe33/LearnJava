package joe.wenzel;
public class Main {
    static int shift;
    public static void main(String[] args) {
        int[][] adjacencyMatrix = { {0, 5, 10, 7},
                                    {5, 0, 6, 4},
                                    {10, 6, 0, 12},
                                    {7, 4, 12, 0} };
        int distance = adjacencyMatrix[0].length;
        int pow = (int) Math.pow(2, (distance - 1));
        int[][] distanceToThePow = new int[distance][pow];
        displayShortestPath(distance, adjacencyMatrix, distanceToThePow);
        displayShortestSequence(distanceToThePow, pow, distance, adjacencyMatrix);
    }

    public static boolean checkingForPropertyInSubset(int subset, int property) {
        int num = subset & ~(1 << (property));
        return (num & subset) != subset;
    }
    public static int findingMinimumPath(int v, int[][] w, int[][] D, int set, int n) {
        int[] m = new int[calculateLength(set)];
        int []i = new int[calculateLength(set)];
        int ind = 0;
        for(int j = 0 ; j< n-1 ; j++)
            if(checkingForPropertyInSubset(set,j)) {
                int num = set & ~(1 << (j));
                num = set & num;
                m[ind] = w[v][j+1]+D[j+1][num];
                i[ind]=j+1;
                ind++;
            }
        int min = m[0];
        shift = i[0];
        for(int j = 1; j < calculateLength(set); j++)
            if(min>m[j]){
                min=m[j];
                shift = i[j];
            }
        return min;
    }
    public static int calculateLength(int i) {
        int length = 0;
        while (i != 0) {
            i = i & (i - 1);
            length++;
        }
        return length;
    }
    public static int distanceTraveledBetweenJobs(int d, int[][] w, int[][] p) {
        int numberOfSubsetsOfVertices = (int) Math.pow(2, (d - 1));
        int[][] distanceTraveled = new int[d][numberOfSubsetsOfVertices];
        for (int i = 1; i < d; i++) {
            distanceTraveled[i][0] = w[i][0];

        }
        for (int i = 1; i <= (d - 2); i++) {
            for (int subset = 1; subset < numberOfSubsetsOfVertices; subset++) {
                if (calculateLength(subset) == i) {
                    for (int j = 1; j < d; j++) {
                        if (!checkingForPropertyInSubset(subset, j-1)) {
                            distanceTraveled[j][subset] = findingMinimumPath(j, w, distanceTraveled, subset, d);
                            p[j][subset] = shift;
                        }
                    }
                }
            }
        }
        int minimumPath = findingMinimumPath(0, w, distanceTraveled, numberOfSubsetsOfVertices-1, d);
        p[0][numberOfSubsetsOfVertices-1] = shift;
        return minimumPath;
    }
    public static void display(int job, int[][] jobNumberIndex, int jobNumber) {
        while(jobNumber > 0 ){
            System.out.print("Job #"+jobNumberIndex[job][jobNumber]+" \n");
            job = jobNumberIndex[job][jobNumber];
            jobNumber = jobNumber & ~(1 << (job-1));
        }
    }
    public static void displayShortestSequence(int[][] p, int k, int shortestPath, int[][] adjacencyMatrix) {
        System.out.println("The shortest route for the work day is: ");
        System.out.println("Home ");
        display(0,p,k-1);
        System.out.println("Home ");
    }
    public static void displayShortestPath(int shortestPath, int[][] adjacencyMatrix, int[][] p) {
        System.out.println("The shortest route will be a total of: \n" +
                distanceTraveledBetweenJobs(shortestPath, adjacencyMatrix, p) + " miles");
    }

}