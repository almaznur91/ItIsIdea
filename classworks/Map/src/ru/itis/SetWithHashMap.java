package ru.itis;

import java.util.Iterator;

public class SetWithHashMap<N> implements Set<N> {

    Map<N,String> temp = new HashMap<N,String>();


    @Override
    public void put(N value) {
    temp.put(value,null);
    }

    @Override
    public Iterator<N> iterator() {
         return temp.getKeySet().iterator();
    }
}
