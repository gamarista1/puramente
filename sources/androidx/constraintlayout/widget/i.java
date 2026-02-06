package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private SparseIntArray f15671a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private HashMap f15672b = new HashMap();

    public interface a {
    }

    public void a(int i10, a aVar) {
        HashSet hashSet = (HashSet) this.f15672b.get(Integer.valueOf(i10));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f15672b.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }
}
