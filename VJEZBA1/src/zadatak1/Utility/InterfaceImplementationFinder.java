package zadatak1.Utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;

/**
 * This class is used to find all classes that implement a certain interface.
 * It is used in the TestApp class to find all classes that implement the
 * Calculation interface.
 * This class was made with the help of ChatGPT-3.
 */
public class InterfaceImplementationFinder {

    public static List<Class<?>> findClassesImplementingInterface(String packageName, Class<?> interfaceClass) {
        List<Class<?>> implementingClasses = new ArrayList<>();
        try {
            String path = packageName.replace('.', '/');
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Enumeration<URL> resources = classLoader.getResources(path);

            while (resources.hasMoreElements()) {
                URL resource = resources.nextElement();
                File directory = new File(resource.getFile());

                if (directory.exists()) {
                    String[] files = directory.list();
                    if (files != null) {
                        for (String file : files) {
                            if (file.endsWith(".class")) {
                                String className = packageName + '.' + file.substring(0, file.length() - 6);
                                Class<?> clazz = Class.forName(className);
                                if (interfaceClass.isAssignableFrom(clazz) && !clazz.isInterface()) {
                                    implementingClasses.add(clazz);
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return implementingClasses;
    }
}
