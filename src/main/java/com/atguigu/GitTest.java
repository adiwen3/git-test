package com.atguigu;

/**
 * @author adiwen
 * @date 2021/10/15 7:57
 */
public class GitTest {
    public static void main(String[] args) {
        System.out.println("hello git-刚创建文件名是红色-工作的文件未添加到暂存区");
        System.out.println("hello git-未修改文件名是黑色-已添加多暂存区的文件未修改");
        System.out.println("hello git-未修改文件名是蓝色-已添加多暂存区的文件被修改");
        System.out.println("hello git-蓝色文件，不用先add在commit，可以直接commit，因为已经追踪过这个文件");
        System.out.println("hello git-hotfix分支");
        System.out.println("hello git-master分支和后台fix，提交冲突3");
        System.out.println("hello git-hotfix分支-second commit2");
        System.out.println("hello git-master分支-commit3，push到github远程仓库");
        System.out.println("hello git-master分支-commit3，github网页端修改，idea端pull拉取");
        System.out.println("hello git-master分支-commit3，github网页端修改，idea端pull拉取-pull与update project不同");
    }
}
