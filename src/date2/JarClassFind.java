package date2;

import java.util.*;
import java.io.*;

public class JarClassFind
{
    public static int count = 0;

    
    public JarClassFind()
    {
    }

    private static void FindClassInLocalSystem(String path,String classname)
    {
        if(path.charAt(path.length() - 1) != '\\')
        {
            path += '\\';
        }
        File file = new File(path);
        if(!file.exists())
        {
            System.out.println("Error: Path not Existed! Please Check it out!");
            return;
        }
        String[] filelist = file.list();
        for(int i = 0;i < filelist.length;i++)
        {
            File temp = new File(path + filelist[i]);
            if((temp.isDirectory() && !temp.isHidden() && temp.exists()))
            {
                FindClassInLocalSystem(path + filelist[i],classname);
            }
            else
            {
                if(filelist[i].endsWith("jar"))
                {
                    try
                    {
                        java.util.jar.JarFile jarfile = new java.util.jar.
                            JarFile(path + filelist[i]);
                        for(Enumeration e = jarfile.entries();e.hasMoreElements();)
                        {
                            String name = e.nextElement().toString();
                            if(name.equals(classname))
                            {
                                System.out.println("No." + ++ JarClassFind.count);
                                System.out.println("Jar Package:" + path + filelist[i]);
                                System.out.println(name);
                            }
                        }
                    }
                    catch(Exception eee)
                    {
                    }
                }
            }
        }

    }

    static public void main(String[] args)
    {
        if(args.length < 2)
        {
showHowToUsage();
        return;
        }
        String absoluteclassname = args[1].replace('.','/') + ".class";

        System.out.println("Find class [" + args[1] + "] in Path [" + args[0] + "] Results:");
        FindClassInLocalSystem(args[0],absoluteclassname);
        if(JarClassFind.count == 0)
        {
            System.out.println("Error:Can't Find Such Jar File!");
        }
        System.out.println("Find Process Ended! Total Results:" + JarClassFind.count);
    }

    public static void showHowToUsage()
    {
        System.out.println("Usage: Java -cp . JarClassFind <source path> <source class name>");
        System.out.println("Usage: Java -classpath . JarClassFind <source path> <source class name>");
        System.out.println("");
        System.out.println("<source path>:\t\tPath to Find eg:D:\\Jbuilder");
        System.out.println("<source class name>:\tClass to Find eg:java.applet.Applet");
    }
}