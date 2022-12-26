package com.baeldung.jgit;

import java.io.File;
import java.io.IOException;

import com.baeldung.jgit.helper.Helper;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

/**
 * Simple snippet which shows how to create a new repository
 *
 *
 */
public class CreateNewRepository {

    public static void main(String[] args) throws Exception {

        // prepare a new folder
       /* File localPath = File.createTempFile("TestGitRepository", "");
        if(!localPath.delete()) {
            throw new IOException("Could not delete temporary file " + localPath);
        }

        // create the directory
        try (Git git = Git.init().setDirectory(localPath).call()) {
            System.out.println("Having repository: " + git.getRepository().getDirectory());
        }

        FileUtils.deleteDirectory(localPath);*/

        // prepare a new folder
        File localPath = new File("/home/administrator/a234");

        /*FileRepositoryBuilder builder = new FileRepositoryBuilder();
        Repository repository = builder.setGitDir(new File("/home/administrator/ade_project/ADE/ADEWorkEnv/global/Domains/SUV")).readEnvironment().findGitDir().build();
        System.out.println("repository: " + repository);*/


        /*if (localPath.exists()){
            throw new  Exception("file already exists!");*/

            /*FileRepositoryBuilder builder = new FileRepositoryBuilder();
            Repository repository = builder.setGitDir(new File("/home/administrator/a")).readEnvironment() // scan environment GIT_* variables
                    .findGitDir() // scan up the file system tree
                    .build();
            System.out.println("repository: " + repository);*/
//        Git git = Git.init().setDirectory(new File("/home/administrator/a")).call();
//        System.out.println(git + "new repository");


//        }else {

            Git git1 = Git.cloneRepository().setURI("https://github.com/AhamadRaza/JSON").setDirectory(new File("/home/administrator/JSON")).call();

//            System.out.println("cloned repository: " + git1.getRepository().getDirectory());
//        }

//        Repository repository = Helper.openJGitRepository();

        /*if(!localPath.delete()) {
            throw new IOException("Could not delete temporary file " + localPath);
        }*/
        // create the directory
        /*Git git = Git.init().setDirectory(localPath).call();
        System.out.println("Having repository: " + git.getRepository().getDirectory());*/
//        Git git = Git.init().setDirectory(new File("https://github.com/AhamadRaza/asd")).call();

//        Git git = Git.init().setDirectory(new File("/home/administrator/a23")).setGitDir(new File("https://github.com/AhamadRaza/asd") ).call();


//        System.out.println("Having repository: " + git1.getRepository().getDirectory());
//        https://github.com/AhamadRaza


//        FileUtils.deleteDirectory(localPath);
    }
}
