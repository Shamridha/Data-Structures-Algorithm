import java.util.*;
class ReachabilityOptimized
{

public static void main(String arg[])
{

Scanner s1=new Scanner(System.in);
int numOfNodes=s1.nextInt();
HashMap<Integer,List<Integer>> graph=new HashMap<>();
int arrNodes[]=new int[numOfNodes];


for(int idx=0;idx<numOfNodes;idx++)
{

int nodes=s1.nextInt();

graph.put(nodes,new ArrayList<>());

}

int edges=s1.nextInt();

for(int idx=0;idx<edges;idx++)
{

int Node=s1.nextInt();
int follows=s1.nextInt();
graph.get(Node).add(follows);

}


int follower=s1.nextInt();
int following=s1.nextInt();



System.out.println(graph);

ArrayList<Integer> path=new ArrayList<>();

boolean ans=dfs(graph,follower,following,path);

if(ans)
{

System.out.println("1");

}
else
{

System.out.println("0");

}

}

public static boolean dfs(HashMap<Integer,List<Integer>> graph,int currNode,int endNode,ArrayList<Integer> path)
{
System.out.println(currNode);
if(currNode==endNode)
{
return true;
}
if(path.contains(currNode))
return false;

path.add(currNode);
for(int node:graph.get(currNode))
{

if(dfs(graph,node,endNode,path))
return true;

}

return false;

}



}