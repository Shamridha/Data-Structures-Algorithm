import java.util.*;
class Reachability
{

public static void main(String arg[])
{

Scanner s1=new Scanner(System.in);
int numOfNodes=s1.nextInt();
HashMap<Integer,Integer> hm=new HashMap<>();
int arrNodes[]=new int[numOfNodes];
boolean vis[]=new boolean[numOfNodes];
ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

for(int idx=0;idx<numOfNodes;idx++)
{

graph.add(new ArrayList<>());

}

for(int idx=0;idx<numOfNodes;idx++)
{

int nodes=s1.nextInt();
arrNodes[idx]=nodes;
hm.put(nodes,idx);

}

int edges=s1.nextInt();

for(int idx=0;idx<edges;idx++)
{
int Node=hm.get(s1.nextInt());
int follows=hm.get(s1.nextInt());
graph.get(Node).add(follows);

}

int follower=hm.get(s1.nextInt());
int following=hm.get(s1.nextInt());

System.out.println(graph);

boolean ans=dfs(graph,follower,following,vis);

if(ans)
{

System.out.println("1");

}
else
{

System.out.println("0");

}

}


public static boolean dfs(ArrayList<ArrayList<Integer>> graph,int currNode,int endNode,boolean vis[])
{

if(currNode==endNode)
{
return true;
}
if(vis[currNode]==true)
return false;
vis[currNode]=true;
for(int node:graph.get(currNode))
{

if(dfs(graph,node,endNode,vis))
return true;

}

return false;

}

}