import java.util.*;
public class LargestSumCycle{
public static void main(String arg[])
{
Scanner s1=new Scanner(System.in);
int numOfNodes=s1.nextInt();
boolean vis[]=new boolean[numOfNodes];
List<List<Integer>> graph=new ArrayList<>();
for(int i=0;i<numOfNodes;i++)
{
List<Integer> node=new ArrayList<>();
node.add(s1.nextInt());
graph.add(node);
}
int maxLength=0;
for(int idx=0;idx<numOfNodes;idx++)
{
if(vis[idx]==false)
{
int lengthOfCycle=dfs(idx,graph,vis,graph.get(idx).get(0));
vis[idx]=true;
if(maxLength<lengthOfCycle)
maxLength=lengthOfCycle;
}
}
System.out.println(maxLength);
}
public static int dfs(int startNode,List<List<Integer>> graph,boolean vis[],int currNode)
{
if(currNode==startNode)
{
vis[currNode]=true;
return 1;
}
if(currNode==-1||vis[currNode]==true)
return -1;
vis[currNode]=true;
 int ans=dfs(startNode,graph,vis,graph.get(currNode).get(0));
if(ans==-1)
{
vis[currNode]=false;
return -1;
}

return ans+1;
}
}