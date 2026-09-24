public class NoSunshine {
public static void main(String[] args) { 
g();
n("It's not warm when she's away");
g();
n("And she's always gone too long");
a();
n("\nWonder this time where she's gone\nWonder if she's gone to stay");
g();
n("And this house just ain't no home");
a();
n("And ");
k(4);
n("");
k(5);
n("");
k(5);
n("");
k(5);
n("");
k(5);
n("");
k(2);
n("\n\nHey, I ought to leave young thing alone\nBut aint't no sunshine when she's gone, whoa-whoa");
g();
n("Only darkness every day\n");
g();
n("And this house just ain't no home\n");
a();
a();
a();
a();
}  
public static void n(String line){
System.out.println(line);
}
public static void g() {
n("Ain't no sunshine when she's gone");
}
public static void a() {
n("Anytime she goes away");
}
public static void k(int n) {
for (int g = 0; g < n; g++) { 
System.out.print("I know, ");
}
}
}