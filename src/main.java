import java.lang.reflect.Array;
import java.util.*;

public class main
{
    public static void main(String[] args)
    {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(1);
//        arrayList.add(1);
//        arrayList.add(5);
//        arrayList.add(5);
//        arrayList.add(8);
//        arrayList.add(3);
//        arrayList.add(9);
//        arrayList.add(1);
//        arrayList.add(5);
//
//        ArrayList<Integer> resultArrayList = new ArrayList<>();
//        int nills = 0;
//        for (int i = 0; i < arrayList.size(); i++){
//            if(resultArrayList.contains(arrayList.get(i))){ // если значение уже было
//                resultArrayList.add(0);
//                nills++;
//            } else {
//                resultArrayList.add(i-nills, arrayList.get(i));
//                if (nills>0) {
//                    resultArrayList.add(0);
//                }
//            }
//        }
//        System.out.println("array nills:");
//        System.out.println(resultArrayList.toString());
//
        HashMap <String, Integer> myMap= new HashMap<>();
        myMap.put( "1", 1 ); //Entry
        myMap.put( "2", 2 );
        myMap.put( "4", 1 );
        myMap.put( "3", 3 );
        myMap.put( "5", 2 );
        myMap.put( "6", 3 );
        myMap.put( "7", 4 );
        myMap.put( "8", 5 );
        myMap.put( "9", 7 );


        for (Map.Entry <String, Integer> lol : myMap.entrySet() )
        {
            System.out.println( lol.getKey() );

            if (lol.getKey().equals("1"))
            {
                lol.setValue( 2 );
            }
        }

        Set keyset = myMap.keySet();
        String[] keyarray = (String[]) keyset.toArray(new String[0]);
        myMap.put(keyarray[2], 9);

        System.out.println( myMap );
        System.out.println( myMap.get("1") );
        System.out.println("keys:");
        for (String s : keyarray) {
            System.out.println(s);
        }

        System.out.println("values:");
        List<Integer> valueSet = new ArrayList<>();
        valueSet.addAll(myMap.values());
        Integer[] values =  valueSet.toArray(new Integer[0]);
        for (Integer s : values) {
            System.out.println(s);
        }



//        Integer info = new Integer(4);
//        System.out.println(info);
//        System.out.println(info.hashCode());
//        Object s = new Integer(4);
//        System.out.println(s);
//        System.out.println(s.hashCode());
    }
}
