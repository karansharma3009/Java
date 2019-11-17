package DS;
// Program to check at which level , maximum sum in a tree is present and what is the sum
import java.util.LinkedList;
import java.util.Queue;

public class LevelWithMaximumSum {
        /* Level with maximum sum of nodes */
        public void displayLevelWithMaximumSum(Node root) {
            /* java.util.ArrayDeque */
            Queue<Node> queue = new LinkedList<Node>();
            Node dummy = new Node(Integer.MIN_VALUE); // Delimiter to check ending of one level
            int localSum = 0 ; int maxSum =0; int level=0; int currentLevel=0;

            if (root==null)
            {
                maxSum=0;
                level=0;
                return ;
            }

            if ( root!=null)
            {
                queue.add(root);
                queue.add(dummy);

                while (!queue.isEmpty())
                {
                    root = queue.remove();
                    if( root.equals(dummy))
                    {
                        if(!queue.isEmpty()){
                            queue.offer(dummy);
                            level++;
                            }
                       // maxSum = localSum;
                        localSum=0;

                    }

                    else {

                        localSum = localSum + root.data;
                        if (maxSum < localSum) {
                            maxSum = localSum;
                            currentLevel = level;
                        }
                        if (root.leftChild != null) queue.offer(root.leftChild);
                        if (root.rightChild != null) queue.offer(root.rightChild);
                       }

                }

                System.out.println(maxSum);
                System.out.println(currentLevel);
            }


        }

        public static void main(String[] args) {
            LevelWithMaximumSum slo = new LevelWithMaximumSum();
            Node root = slo.new BinaryTree().createTree();
            slo.displayLevelWithMaximumSum(root);
        }
    class BinaryTree {
        Node root;

        public BinaryTree() {
            root = null;
        }

        public Node createTree() {
            if (root == null) {
                root = new Node(12);
            }
            root.setLeftChild(new Node(23));
            root.setRightChild(new Node(1980));
            root.getLeftChild().setLeftChild(new Node(11));
            root.getLeftChild().setRightChild(new Node(991));
            root.getRightChild().setLeftChild(new Node(12));
            root.getLeftChild().getLeftChild().setLeftChild(new Node(56));
            root.getLeftChild().getLeftChild().setRightChild(new Node(78));
            root.getRightChild().getLeftChild().setRightChild(new Node(98));
            return root;
        }
    }

    class Node {
        private int data;
        private Node leftChild;
        private Node rightChild;

        public Node(int data) {
            this.data = data;
            leftChild = null;
            rightChild = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    }



}



