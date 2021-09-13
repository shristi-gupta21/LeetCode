import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null){
            return lists;
        }
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> NodesAtOneLevel = new ArrayList<>();
            while (size-- > 0){
                Node head = queue.poll();
                NodesAtOneLevel.add(head.val);
                for (Node child : head.children){
                    queue.offer(child);
                }
            }
            lists.add(NodesAtOneLevel);
        }
        return lists;
    }
}
