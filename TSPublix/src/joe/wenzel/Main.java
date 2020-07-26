package joe.wenzel;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.Collections;

//public class Main {
//    static int l ;
//    public static void main(String[] args) {
//
//        // sample input
//        int[][] w = {{0, 5, 15, 20},
//                    {3, 0, 11, 16},
//                    {23, 17, 0, 4},
//                    {2, 7, 23, 0}};
//
//        int n = w[0].length;
//        int k = (int) Math.pow(2, (n - 1));
//        int[][] p =new int[n][k];
//
//        //ptint shortest cylce's  length
//        System.out.println("The shortest cycle is of legnth "+ trvel(n, w, p));
//
//        //print the shotrest cycle
//        System.out.print("The shortest cycle is ");
//        System.out.print("ENTER ");
//        print_path(0,p,k-1);
//        System.out.print("EXIT ");
//    }
//
//    private static int trvel(int n, int[][] w, int[][] p) {
//        //the number of all subsets of vertices
//        int k = (int) Math.pow(2, (n - 1));
//
//        int[][] D = new int[n][k];
//
//        //initializing D[A][v1]
//        for (int i = 1; i < n; i++) {
//            D[i][0] = w[i][0];
//
//        }
//
//        //finding the shortest path excluding v1
//        for (int i = 1; i <= n - 2; i++) {
//            for (int subset = 1; subset < k; subset++) {
//                if (len(subset) == i) {
//                    for (int v = 1; v < n; v++) {
//                        if (!haveI(subset, v-1)) {
//                            D[v][subset] = min(v, w, D, subset, n);
//
//                            p[v][subset] = l;
//
//                        }
//
//                    }
//                }
//            }
//        }
//        int min = min(0, w, D, k-1, n);
//        p[0][k-1] = l;
//        return min;
//    }
//
//    // finding the cardinality of a subset
//    private static int len(int j) {
//        int count = 0;
//        while (j != 0) {
//            j = j & (j - 1);
//            count++;
//        }
//        return count;
//    }
//
//    //checking if Vi for some i belongs to a subset
//    private static boolean haveI(int subset, int position) {
//        int num = subset & ~(1 << (position));
//        return (num & subset) != subset;
//    }
//
//    // finding the minimum of (W[v][j]+D[j][subsrt - v] for every j
//    private static int min(int v, int[][] w, int[][] D, int set, int n) {
//        int[] m = new int[len(set)];
//        int []i = new int[len(set)];
//        int ind = 0;
//        for(int j = 0 ; j< n-1 ; j++)
//            if(haveI(set,j))
//            {
//                int num = set & ~(1 << (j));
//                num = set & num;
//                m[ind] = w[v][j+1]+D[j+1][num];
//                i[ind]=j+1;
//                ind++;
//            }
//        int min = m[0];
//        l = i[0];
//        for(int j = 1; j < len(set);j++)
//            if(min>m[j]){
//                min=m[j];
//                l = i[j];
//            }
//
//        return min;
//
//    }
//
//    //printing the shortest path
//    private static void print_path(int i, int[][] p, int n) {
//        while(n > 0 ){
//            System.out.print("Item #"+p[i][n]+" ");
//            i =p[i][n];
//            n = n& ~(1 << (i-1));
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static int count = 0;
    public static List<String> list =new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        assignItems( list);
        NodeBonus node = new  NodeBonus('a');
        addToV(node);
        System.out.println(node.items);

        NodeBonus node1 = new  NodeBonus('b');
        addToV(node1);
        System.out.println(node1.items);
        NodeBonus node2 = new  NodeBonus('c');
        addToV(node2);
        NodeBonus node3 = new  NodeBonus('d');
        addToV(node3);
        NodeBonus node4 = new  NodeBonus('e');
        addToV(node4);
        NodeBonus node5 = new  NodeBonus('f');
        addToV(node5);
        NodeBonus node6 = new  NodeBonus('g');
        addToV(node6);
        System.out.println(node6.items);
        NodeBonus node7 = new  NodeBonus('h');
        addToV(node7);
        NodeBonus node8 = new  NodeBonus('i');//...How many vertexes are we going to want to use?
        addToV(node8);
        System.out.println(node8.items);

        testBonus();
    }
    public static void addToV(NodeBonus n) {

        String[] s = new String[10];
        if(count>0) {
            s[0]=list.get(count);
            count++;
        }
        else {
            s[0]=list.get(0);
            count++;
        }
        int i = 1;
        while (count%10!=0) {
            if(count+1>=list.size()-1||list.get(count)==null)
                break;
            s[i]=list.get(count);
            i++;

            count++;
            System.out.println(count);
        }
        n.addItems(s);
    }
    public static void assignItems(List<String> l) {
        try {
            BufferedReader rd = new BufferedReader(new FileReader("inventory.txt"));
            String currentLine=null;
            while ((currentLine = rd.readLine()) != null) {
                if(currentLine.contains("`")) {
                    continue;
                }else {
                    l.add(currentLine);
                }
            }
        } catch (IOException e) {
            System.out.println("Exception loading words.txt.");
        }
    }

    // Runs dfs to see if path between start and end exists
    public static boolean dfs(Node start, Node end) {
        if (start == null) {
            return false;
        } else if (start.value == end.value) {
            return true;
        } else {
            for (Node next : start.edges) {
                if (dfs(next, end)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Runs bfs to see if path between start and end exists
    public static boolean bfs(Node start, Node end) {
        if (start == null) {
            return false;
        }
        Queue<Node> toExplore = new LinkedList<>();
        toExplore.add(start);
        // While not empty
        while (!toExplore.isEmpty()) {
            // Take off first
            Node current = toExplore.poll();
            // Check it, and then add its children
            if (current.value == end.value) {
                return true;
            }
            for (Node next : current.edges) {
                toExplore.add(next);
            }
        }
        return false;
    }

    public static void testBonus() {
//		ArrayList<NodeBonus> list = new ArrayList<>();
//
//		NodeBonus a = new NodeBonus('a');
//		NodeBonus b = new NodeBonus('b');
//		NodeBonus c = new NodeBonus('c');
//		NodeBonus d = new NodeBonus('d');
//		NodeBonus e = new NodeBonus('e');
//		NodeBonus f = new NodeBonus('f');
//		NodeBonus g = new NodeBonus('g');
//
//		Node aN = new Node('a');
//		Node bN = new Node('b');
//		Node cN = new Node('c');
//		Node dN = new Node('d');
//		Node eN = new Node('e');
//		Node fN = new Node('f');
//		Node gN = new Node('g');
//
//		aN.edges.add(bN);
//		aN.edges.add(cN);
//		bN.edges.add(dN);
//		cN.edges.add(dN);
//		cN.edges.add(eN);
//		eN.edges.add(fN);
//
//		// a points to b and c
//		// b points to c
//		// c points to d and e
//		// d points to nothing
//		// e points to f
//		// f points to nothing
//		// g is an island
//		a.edges.add(new NodeEdge(b, 3));
//		a.edges.add(new NodeEdge(c, 4));
//		b.edges.add(new NodeEdge(f, 9));
//		c.edges.add(new NodeEdge(f, 2));
//		c.edges.add(new NodeEdge(e, 3));
//		e.edges.add(new NodeEdge(f, 6));
//		System.out.println("Boom");
//		list.add(a);
//		list.add(b);
//		list.add(c);
//		list.add(d);
//		list.add(e);
//		list.add(f);
//		list.add(g);


        // Add your own test methods to see if you can find the *min* path to get
        // between two nodes. Return -1 if no path found
    }
}