import java.util.*;
class MaximumWeightNode
{

public static void main(String arg[])
{

Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
int arr[]=new int[n];
List<List<Integer>> li=new ArrayList<>();
for(int i=0;i<n;i++)
{

List<Integer> node=new ArrayList<>();
node.add(s1.nextInt());
li.add(node);

}

for(int i=0;i<n;i++)
{

for(int it:li.get(i))
{
if(it!=-1)
arr[it]+=i;
}

}
int max=0;
int idx=0;
for(int i=0;i<n;i++)
{

if(max<arr[i])
{

max=arr[i];
idx=i;

}


}
System.out.println(idx);

}


}