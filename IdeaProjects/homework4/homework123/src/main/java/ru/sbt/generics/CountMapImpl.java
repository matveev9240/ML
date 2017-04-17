package ru.sbt.generics;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by владимир on 09.11.2016.
 */
public class CountMapImpl<T> implements CountMap<T> {
    private HashMap<T,Integer> map;
    public CountMapImpl() {
        this.map = new HashMap<>();
    }

    @Override
    public void add(T o) {
        Integer count = map.get(o);
        if (count == null) {
            map.put(o, 1);
        }
        else {
            map.put(o, count + 1);
        }
    }

    public int getCount(T o) {
        return map.get(o) != 0 ? map.get(o): -1;
    }
    int remove(T o){
        Integer count = map.get(o);
        map.remove(o);
        return count != null ? count : -1;

    }

    public int size(){return map.size();}
    void addAll(CountMap source)
    {
        for (Object object : source.toMap().entrySet()) {
            Map.Entry<T,Integer> entry=(Map.Entry<T,Integer>) object;
            Integer count=this.map.get(entry.getKey());
            this.map.put(entry.getKey(), count == null ? entry.getValue() : entry.getValue() + count);


        }

    }
    Map toMap(){
        return this.map;
    }

    public void toMap(Map destination) {
        for (Map.Entry<T, Integer> entry : this.map.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }

}

