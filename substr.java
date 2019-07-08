Public class substr{
final static int no=256;
static int maxofch(String str,int n)
{
int count=new int[no];
for(int i=0i<n;i++){
count[str.charAt(i)]++;}
int max=0;
for(int i=0;i<no;i++){
if(count[i]!=0){
max++;}
}
return max;
}
static int smallestofsub(String str){
int n=str.length();
int max=maxofch(str,n);
int min=n;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)
{
String sub=null;
if(i<j)
 sub=str.substring(i,j);
else
 sub=str.substring(j,i);
int subl=sub.legth();
int subchar=maxofch(sub,subl);
if(subl<min && max==subchar){
minl=subl;
}}
}
return minl;
}
Public static void main(String[] args){
Scanner str1=new Scanner(System.in)
str1=Scanner.next();
int len=smallestofsub(str1);
System.out.println(len);
}
}
 
