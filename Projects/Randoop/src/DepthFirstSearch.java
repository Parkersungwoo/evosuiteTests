import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
 
public class DepthFirstSearch
{ 
 
	static class Node
	{
		int data;
		boolean visited;
		List<Node> neighbours;
 
		Node(int data)
		{
			this.data=data;
			this.neighbours=new ArrayList<>();
 
		}
		public void addneighbours(Node neighbourNode)
		{
			this.neighbours.add(neighbourNode);
		}
		public List<Node> getNeighbours() {
			return neighbours;
		}
		public void setNeighbours(List<Node> neighbours) {
			this.neighbours = neighbours;
		}
	}
 
	// Recursive DFS
	public  void dfs(Node node)
	{
		System.out.print(node.data + " ");
		List<Node> neighbours=node.getNeighbours();
        node.visited=true;
		for (int i = 0; i < neighbours.size(); i++) {
			Node n=neighbours.get(i);
			if(n!=null && !n.visited)
			{
				dfs(n);
			}
		}
	}
 
	// Iterative DFS using stack
	public  void dfsUsingStack(Node node)
	{
		Stack<Node> stack=new  Stack<Node>();
		stack.add(node);
		while (!stack.isEmpty())
		{
			Node element=stack.pop();
			if(!element.visited)
			{
				System.out.print(element.data + " ");
				element.visited=true;
			}
			
			List<Node> neighbours=element.getNeighbours();
			for (int i = 0; i < neighbours.size(); i++) {
				Node n=neighbours.get(i);
				if(n!=null && !n.visited)
				{
					stack.add(n);
				}
			}
		}
    }
}