//package step3;
package test63;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class test63 {

    public HashSet getHashSet(){
        /********** Begin **********/
        HashSet hashset = new HashSet();
        hashset.add("www.educoder.net");
        return hashset;
        /********** End **********/

    }

    public ArrayList getArrayList(){
        /********** Begin **********/
        ArrayList arrayList = new ArrayList();
        arrayList.add("www.educoder.net");
        return arrayList;
        /********** End **********/
    }

    public LinkedList getLinkedList(){
        /********** Begin **********/
        LinkedList linkedList = new LinkedList();
        linkedList.add("www.educoder.net");
        return linkedList;
        /********** End **********/
    }

    public Map getHashMap(){
        /********** Begin **********/
        HashMap hashMap = new HashMap();
        hashMap.put("address","www.educoder.net");
        return hashMap;
        /********** End **********/
    }

}
