package HashMapImplementation;

import java.util.LinkedList;

public class HashMap<K, V>{

    private class HMNode{
        private K key;
        private V value;

        HMNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<HMNode>[] buckets;
    int count;

    public HashMap() {
        buckets = new LinkedList[5];
        for(int i=0; i<buckets.length; i++) {
            buckets[i] = new LinkedList<HMNode>();
        }
    }

    // put method
    public void put(K key, V value) {
        int index = hashFucntion(key);
        HMNode node = foundAt(key);
        if(node != null) {
            node.value = value;
        }else {
            buckets[index].add(new HMNode(key, value));
            this.count++;
            double lambda = (count * 1.0) / buckets.length;
            if(lambda >= 2.0) {
                rehash();
            }
        }
    }

    public V get(K key) {
        int index = hashFucntion(key);
        HMNode node = foundAt(key);
        if(node == null) {
            return null;
        }
        return node.value;
    }

    public K remove(K key) {
        int index = hashFucntion(key);
        HMNode node = foundAt(key);
        if(node == null) {
            return null;
        }
        buckets[index].remove(node);
        this.count--;
        return node.key;
    }

    private int hashFucntion(K key) {
        int hash = key.hashCode();
        hash = Math.abs(hash);
        return hash % buckets.length;
    }

    private HMNode foundAt(K key) {
        int index = hashFucntion(key);
        LinkedList<HMNode> list = buckets[index];
        for(int i=0; i<list.size(); i++) {
            if(list.get(i).key.equals(key)) {
                return list.get(i);
            }
        }
        return null;
    }

    private void rehash() {
        LinkedList<HMNode>[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length *2 ];
        for(int i=0; i<buckets.length; i++) {
            buckets[i] = new LinkedList<HMNode>();
        }
        this.count = 0;
        for(int i=0; i<oldBuckets.length; i++) {
            LinkedList<HMNode> ll = oldBuckets[i];
            for(int j=0; j<ll.size(); j++) {
                HMNode node = ll.get(j);
                this.put(node.key, node.value);
            }
        }
    }
}
