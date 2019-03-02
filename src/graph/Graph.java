package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Node {

    Integer fromName;
    Integer cost;

    public Node(Integer fromName, Integer cost) {
        this.fromName = fromName;
        this.cost = cost;
    }
}


class QueueNode implements Comparable<QueueNode> {

    private Integer from;
    private Integer to;
    private Integer cost;

    public QueueNode(Integer from, Integer to, Integer cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    public Integer getFrom() {
        return from;
    }

    public Integer getTo() {
        return to;
    }

    public Integer getCost() {
        return cost;
    }

    @Override
    public int compareTo(QueueNode other) {
        return this.cost - other.cost;
    }
}

public class Graph {

    private final int N = 6;
    private Integer[][] matrix;
    private Queue<QueueNode> queueNodes;
    private List<Node> list;

    public Graph() {
        matrix = new Integer[N][N];
    }

    public void draw() {

        for (Integer[] aMatrix : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(aMatrix[j] + " ");
            }
            System.out.println();
        }
    }

    @Test

    public void test() {

        Graph g = new Graph();

        g.matrix[0][5] = 1;
        g.matrix[0][2] = 2;
        g.matrix[0][1] = 2;
        g.matrix[3][1] = -1;
        g.matrix[2][3] = 1;
        g.matrix[3][4] = 3;
        g.matrix[2][4] = 30;
        g.matrix[5][2] = 18;
        g.matrix[5][4] = 7;

        g.queueNodes = new PriorityQueue<>();
        g.queueNodes.add(new QueueNode(-1, 0, 0));
        g.list = new ArrayList<Node>();

        while (!g.queueNodes.isEmpty()) {
            QueueNode qn = g.queueNodes.remove();
            list.add(new Node(qn.getFrom(), qn.getCost()));

            for (int i = 0; i < g.matrix.length; i++) {
                if (!g.matrix[i].equals(null)) {

                }
            }
        }

    }
}