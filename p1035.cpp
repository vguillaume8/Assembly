using namespace std;
void exit(int rc)
{
   // code to terminate execution and return 1 to
   // start-up code
}
void f() {
   cout << "in f\n";
   exit(1);
   cout << "bug\n";
}
void g()
{
   cout << "in g\n";
   f();
   cout << "bug\n";
}
int main()
{
   g();
   return 0;
}
