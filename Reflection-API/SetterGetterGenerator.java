package com.thinking.machines.util;
import java.io.*;
import java.lang.reflect.*;
public class SetterGetterGenerator
{
	public static void main(String args[])
	{
		if(args.length!=1 && args.length!=2)
		{
			System.out.println("Usage: java -classpath path _to_jar_file;. com.thinking.machines.util.SetterGetterGenerator class_Name constructor=true/false");
			return;
		}
		if(args.length==2)
		{
			if(args[1].equalsIgnoreCase("constructor=true")==false && args[1].equalsIgnoreCase("constructor=false")==false)
			{
				System.out.println("Usage: java -classpath path _to_jar_file;. com.thinking.machines.util.SetterGetterGenerator class_Name constructor=true/false");
				return;
			}
		}
		String className=args[0];
		try
		{
			Class c;
			c=Class.forName(className);
			Field fields[]=c.getDeclaredFields();
			TMList<String> list=new TMArrayList<>();
			Class fieldType;
			Field f;
			String fieldName;
			String setterName;
			String getterName;
			String tmp;
			String line;
			if(args.length==1 ||(args.length==2 && args[1].equalsIgnoreCase("constructor=true")))
			{
				line="public "+c.getSimpleName()+"()";
				list.add(line);
				list.add("{");
				for(int i=0;i<fields.length;i++)
				{
					line="this."+fields[i].getName()+"="+getDefaultValue(fields[i].getType())+";";
					list.add(line);
				}
				list.add("}");
			}
			for(int i=0;i<fields.length;i++)
			{
				f=fields[i];
				fieldName=f.getName();
				fieldType=f.getType();
				if(fieldName.charAt(0)>=97 && fieldName.charAt(0)<=122)
				{
					tmp=fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
				}
				else
				{
					tmp=fieldName;
				}
				setterName="set"+tmp;
				getterName="get"+tmp;
				line="public void "+setterName+"("+fieldType.getName()+" "+fieldName+")";
				list.add(line);
				list.add("{");
				line="this."+fieldName+"="+fieldName+";";
				list.add(line);
				list.add("}");
				line="public "+fieldType.getName()+" "+getterName+"()";
				list.add(line);
				list.add("{");
				line="return this."+fieldName+";";
				list.add(line);
				list.add("}");
			}
			File file=new File("tmp.data");
			if(file.exists()) file.delete();
			try( RandomAccessFile randomAccessFile=new RandomAccessFile(file, "rw") ){
                            TMIterator iterator=list.iterator();
                            while(iterator.hasNext())
                            {
				randomAccessFile.writeBytes(iterator.next()+"\r\n");
                            }
                        }
			System.out.println("setter/getter generated for "+c.getSimpleName()+" in file named as tmp.data");
		}catch(ClassNotFoundException classNotFoundException)
		{
			System.out.println(classNotFoundException+" doesn't exist or unable to load");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	}
	private static String getDefaultValue(Class c)
	{
		String className=c.getName();
		if(className.equals("java.lang.Long")||className.equals("long")) return "0";
		if(className.equals("java.lang.Integer")||className.equals("int")) return "0";
		if(className.equals("java.lang.Short")||className.equals("short")) return "0";
		if(className.equals("java.lang.Byte")||className.equals("byte")) return "0";
		if(className.equals("java.lang.Double")||className.equals("double")) return "0.0";
		if(className.equals("java.lang.Float")||className.equals("float")) return "0.0f";
		if(className.equals("java.lang.Character")||className.equals("char")) return "''";
		if(className.equals("java.lang.Boolean")||className.equals("boolean")) return "false";
		if(className.equals("java.lang.String")) return "\"\"";
		return "null";
		
	}
}