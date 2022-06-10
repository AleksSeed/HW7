package ru.geekbrains;

import ru.geekbrains.testrunner.TestRunner;
import java.lang.reflect.InvocationTargetException;

public class HW7 {
        public static void main(String[] args)
                throws InvocationTargetException,
                IllegalAccessException,
                NoSuchMethodException,
                InstantiationException,
                ClassNotFoundException {
            TestRunner.start(HomeTest.class);
            TestRunner.start(HomeTest.class.getName());
        }
    }

