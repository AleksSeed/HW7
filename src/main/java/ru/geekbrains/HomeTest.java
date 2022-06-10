package ru.geekbrains;

import ru.geekbrains.testrunner.AfterSuite;
import ru.geekbrains.testrunner.BeforeSuite;
import ru.geekbrains.testrunner.Priority;
import ru.geekbrains.testrunner.Test;

public class HomeTest {

    @BeforeSuite
    public void init() {
        System.out.println("BeforeSuite runs");
    }

    @Test
    public void test0(){
        System.out.println("Runs test 0");
    }

    @Test(priotity = Priority.Pr1)
    public void test1() {
        System.out.println("Runs test 1");
    }

    @Test(priotity = Priority.Pr2)
    public void test2() {
        System.out.println("Runs test 2");
    }

    @Test(priotity = Priority.Pr5)
    public void test3() {
        System.out.println("Runs test 3");
    }

    @Test(priotity = Priority.Pr7)
    public void test4() {
        System.out.println("Runs test 4");
    }

    @Test(priotity = Priority.Pr10)
    public void test5() {
        System.out.println("Runs test 5");
    }

    @AfterSuite
    public void close() {
        System.out.println("AfterSuite runs");
    }
}
