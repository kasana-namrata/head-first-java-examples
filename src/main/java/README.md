Head First Java — Examples

Small, self-contained programs inspired by Head First Java, collected for quick practice and reference.
The project uses a standard Maven layout (pom.xml, src/main/java). 
GitHub

Prerequisites

JDK 17+ (the latest LTS is fine)

Maven 3.8+ (optional, but convenient)

(Optional) IntelliJ IDEA Community or Ultimate

Getting started
1) Clone
git clone https://github.com/kasana-namrata/head-first-java-examples.git
cd head-first-java-examples

2) Open in IntelliJ (easiest)

File → Open… → select the project folder (IntelliJ will detect pom.xml). 
GitHub

Let it index; then right-click any class with a public static void main(String[] args) → Run.

3) Run from the command line
(A) Using Maven

Build:

mvn -q -DskipTests package


If the example you want has a main method, run it with the Exec plugin. If your pom.xml doesn’t have it yet, add this snippet under <build><plugins>:

<plugin>
  <groupId>org.codehaus.mojo</groupId>
  <artifactId>exec-maven-plugin</artifactId>
  <version>3.1.0</version>
</plugin>


Then:

mvn -q exec:java -Dexec.mainClass=fully.qualified.ClassName


Replace fully.qualified.ClassName with the class you want to run, e.g. PhraseOMatic if it’s in the default package, or com.example.PhraseOMatic if it’s in a package.

(B) Using javac/java
# compile everything into target/classes
javac -d target/classes $(find src/main/java -name "*.java")

# run a specific example with a main method:
java -cp target/classes fully.qualified.ClassName

Project structure
head-first-java-examples/
├─ pom.xml
└─ src/
   └─ main/
      └─ java/
         └─ … (example classes, each with a main method)


The repo follows the standard Maven src/main/java layout. Add each example as its own class/file; keep any shared helpers in their own package. 
GitHub

Tips

Keep examples single-purpose and runnable (each with a main).

Name files after the concept: PhraseOMatic.java, DogArrayList.java, SimpleDotCom.java, etc.

Prefer packages (e.g., hf.ch02), especially as the number of files grows.

If you need input files, place them in src/main/resources and load via the classpath.

Contributing

Create a branch (feature/new-example).

Add your example + a short comment at the top explaining what it demonstrates.

Open a Pull Request.

License

No license is currently declared. Consider adding one (MIT/Apache-2.0) so others know how they can use the code.
