# git-to-neo4j

Parse .git directory, extract git entities (commits and users) and relationships among them, then store them into a neo4j graph database.

### Usage example

``
GitCodeGraphBuilder.process(GRAPH_DIR_PATH,GIT_DIR_PATH);
``

see [the test case](https://github.com/linzeqipku/git-to-neo4j/blob/master/src/test/java/com/github/linzeqipku/git_to_neo4j/GitCodeGraphBuilderTest.java).

### Maven

Add this repository in your ``pom.xml`` file:

```
<repositories>
    <repository>
        <id>linzeqipku-public-snapshots</id>
        <url>https://raw.github.com/linzeqipku/maven-repo/master/snapshots</url>
    </repository>
    <repository>
        <id>linzeqipku-public-releases</id>
        <url>https://raw.github.com/linzeqipku/maven-repo/master/releases</url>
    </repository>
</repositories>
```

Add the maven dependence:

```
<dependencies>
    <dependency>
        <groupId>com.github.linzeqipku</groupId>
        <artifactId>git-to-neo4j</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```
