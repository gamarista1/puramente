package ja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ja.i  reason: case insensitive filesystem */
public final class C3653i implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f45006a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map f45007b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Set f45008c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private List f45009d = Collections.emptyList();

    public Set O() {
        Set set;
        synchronized (this.f45006a) {
            set = this.f45008c;
        }
        return set;
    }

    public void a(Object obj) {
        synchronized (this.f45006a) {
            try {
                ArrayList arrayList = new ArrayList(this.f45009d);
                arrayList.add(obj);
                this.f45009d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f45007b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f45008c);
                    hashSet.add(obj);
                    this.f45008c = Collections.unmodifiableSet(hashSet);
                }
                Map map = this.f45007b;
                int i10 = 1;
                if (num != null) {
                    i10 = 1 + num.intValue();
                }
                map.put(obj, Integer.valueOf(i10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b(Object obj) {
        int i10;
        synchronized (this.f45006a) {
            try {
                if (this.f45007b.containsKey(obj)) {
                    i10 = ((Integer) this.f45007b.get(obj)).intValue();
                } else {
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f45006a
            monitor-enter(r0)
            java.util.Map r1 = r4.f45007b     // Catch:{ all -> 0x000f }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x000f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x000f }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return
        L_0x000f:
            r5 = move-exception
            goto L_0x004e
        L_0x0011:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x000f }
            java.util.List r3 = r4.f45009d     // Catch:{ all -> 0x000f }
            r2.<init>(r3)     // Catch:{ all -> 0x000f }
            r2.remove(r5)     // Catch:{ all -> 0x000f }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x000f }
            r4.f45009d = r2     // Catch:{ all -> 0x000f }
            int r2 = r1.intValue()     // Catch:{ all -> 0x000f }
            r3 = 1
            if (r2 != r3) goto L_0x003e
            java.util.Map r1 = r4.f45007b     // Catch:{ all -> 0x000f }
            r1.remove(r5)     // Catch:{ all -> 0x000f }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x000f }
            java.util.Set r2 = r4.f45008c     // Catch:{ all -> 0x000f }
            r1.<init>(r2)     // Catch:{ all -> 0x000f }
            r1.remove(r5)     // Catch:{ all -> 0x000f }
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ all -> 0x000f }
            r4.f45008c = r5     // Catch:{ all -> 0x000f }
            goto L_0x004c
        L_0x003e:
            java.util.Map r2 = r4.f45007b     // Catch:{ all -> 0x000f }
            int r1 = r1.intValue()     // Catch:{ all -> 0x000f }
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x000f }
            r2.put(r5, r1)     // Catch:{ all -> 0x000f }
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.C3653i.d(java.lang.Object):void");
    }

    public Iterator iterator() {
        Iterator it;
        synchronized (this.f45006a) {
            it = this.f45009d.iterator();
        }
        return it;
    }
}
