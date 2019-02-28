import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Map<String,String> map=new HashMap<String,String>();
        map.put("a", "aa");
        map.put("b", "bb");
        map.put("c", "cc");
        map.put("d", "dd");
        Set<String> set=map.keySet();
        Iterator<String> ite=set.iterator();
        while(ite.hasNext())
        {
            String str=ite.next();
            System.out.println(str+" = "+map.get(str));
        }
        System.out.println("-----------------------------------");
        Set<Map.Entry<String, String>> set1=map.entrySet();
        Iterator<Map.Entry<String,String>> i=set1.iterator();
        while(i.hasNext())
        {
            Map.Entry<String, String> s=i.next();
            System.out.println(s.getKey()+" = "+s.getValue());
        }
    }
}