package Implementation;

import java.util.Objects;

public class MyEntry<K, V> {
    final K key;
    V value;
    MyEntry<K, V> next;

    public MyEntry(K key, V value, MyEntry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEntry<?, ?> myEntry = (MyEntry<?, ?>) o;
        return Objects.equals(key, myEntry.key) &&
                Objects.equals(value, myEntry.value) &&
                Objects.equals(next, myEntry.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, next);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public MyEntry<K, V> getNext() {
        return next;
    }
}
