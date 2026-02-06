package Ib;

import java.util.Comparator;

public interface h {

    public enum a {
        RED,
        BLACK
    }

    public static abstract class b {
        public abstract void a(Object obj, Object obj2);
    }

    h b();

    Object getKey();

    Object getValue();

    boolean isEmpty();

    h o();

    h p(Object obj, Object obj2, a aVar, h hVar, h hVar2);

    boolean q();

    h r(Object obj, Object obj2, Comparator comparator);

    h s(Object obj, Comparator comparator);

    int size();

    void t(b bVar);

    h u();

    h v();
}
