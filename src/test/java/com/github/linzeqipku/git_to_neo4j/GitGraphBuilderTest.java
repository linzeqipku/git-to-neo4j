package com.github.linzeqipku.git_to_neo4j;

import org.eclipse.jgit.api.errors.GitAPIException;
import org.junit.Test;

import java.io.IOException;

public class GitGraphBuilderTest {

    private static final String GRAPH_DIR_PATH="E:/tmp/graphdb";
    private static final String GIT_DIR_PATH="D:/test/lucene-solr/.git";

    @Test
    public void testGitGraphBuilder() throws IOException, GitAPIException {
        GitGraphBuilder.process(GRAPH_DIR_PATH,GIT_DIR_PATH);
    }

}
