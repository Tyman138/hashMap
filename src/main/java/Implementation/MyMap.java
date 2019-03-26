package Implementation;

public class MyMap<K, V> {

    private MyEntry<K, V>[] buckets;
    private static final int INITIAL_CAPACITY = 16;
    private int size = 0;

    public MyMap() {
        this(INITIAL_CAPACITY);
    }

    public MyMap(int capacity) {
        this.buckets = new MyEntry[capacity];
    }

    public void put(K key, V value) {
        MyEntry<K, V> entry = new MyEntry<>(key, value, null);
        int bucket = getHash(key) % getBucketSize();
        MyEntry<K, V> existing = buckets[bucket];
        if (existing == null) {
            buckets[bucket] = entry;
            size++;
        } else {
            // compare the keys see if key already exists
            while (existing.next != null) {
                if (existing.key.equals(key)) {
                    existing.value = value;
                    return;
                }
                existing = existing.next;
            }
            if (existing.key.equals(key)) {
                existing.value = value;
            } else {
                existing.next = entry;
                size++;
            }
        }
    }

    public V get(K key) {
        MyEntry<K, V> bucket = buckets[getHash(key) % getBucketSize()];
        while (bucket != null) {
            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

    public void remove(K key) {
        int bucketInt = getHash(key) % getBucketSize();
        MyEntry<K, V> bucket = buckets[bucketInt];
        MyEntry<K, V> tempBucket = null;

        if (bucket != null && bucket.key.equals(key)) {
            buckets[bucketInt] = bucket.next;
            return;
        }
        while (bucket != null && !bucket.key.equals(key)) {
            tempBucket = bucket;
            bucket = bucket.next;
        }

        if (bucket == null) return;

        tempBucket.next = bucket.next;
    }

    private int getBucketSize() {
        return buckets.length;
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode());
    }

    public int size() {
        return size;
    }
}