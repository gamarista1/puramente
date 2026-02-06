package Q9;

import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.B;
import ja.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map f33675a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f33676b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f33677c;

    /* renamed from: d  reason: collision with root package name */
    private final Random f33678d;

    public b() {
        this(new Random());
    }

    private static void b(Object obj, long j10, Map map) {
        if (map.containsKey(obj)) {
            j10 = Math.max(j10, ((Long) M.j((Long) map.get(obj))).longValue());
        }
        map.put(obj, Long.valueOf(j10));
    }

    private List c(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.f33675a);
        h(elapsedRealtime, this.f33676b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            R9.b bVar = (R9.b) list.get(i10);
            if (!this.f33675a.containsKey(bVar.f33750b) && !this.f33676b.containsKey(Integer.valueOf(bVar.f33751c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static int d(R9.b bVar, R9.b bVar2) {
        int compare = Integer.compare(bVar.f33751c, bVar2.f33751c);
        if (compare != 0) {
            return compare;
        }
        return bVar.f33750b.compareTo(bVar2.f33750b);
    }

    public static int f(List list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(((R9.b) list.get(i10)).f33751c));
        }
        return hashSet.size();
    }

    private static void h(long j10, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    private R9.b k(List list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += ((R9.b) list.get(i11)).f33752d;
        }
        int nextInt = this.f33678d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            R9.b bVar = (R9.b) list.get(i13);
            i12 += bVar.f33752d;
            if (nextInt < i12) {
                return bVar;
            }
        }
        return (R9.b) B.d(list);
    }

    public void e(R9.b bVar, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f33750b, elapsedRealtime, this.f33675a);
        int i10 = bVar.f33751c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), elapsedRealtime, this.f33676b);
        }
    }

    public int g(List list) {
        HashSet hashSet = new HashSet();
        List c10 = c(list);
        for (int i10 = 0; i10 < c10.size(); i10++) {
            hashSet.add(Integer.valueOf(((R9.b) c10.get(i10)).f33751c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f33675a.clear();
        this.f33676b.clear();
        this.f33677c.clear();
    }

    public R9.b j(List list) {
        List c10 = c(list);
        if (c10.size() < 2) {
            return (R9.b) B.c(c10, (Object) null);
        }
        Collections.sort(c10, new a());
        ArrayList arrayList = new ArrayList();
        int i10 = ((R9.b) c10.get(0)).f33751c;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            R9.b bVar = (R9.b) c10.get(i11);
            if (i10 == bVar.f33751c) {
                arrayList.add(new Pair(bVar.f33750b, Integer.valueOf(bVar.f33752d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (R9.b) c10.get(0);
            }
        }
        R9.b bVar2 = (R9.b) this.f33677c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        R9.b k10 = k(c10.subList(0, arrayList.size()));
        this.f33677c.put(arrayList, k10);
        return k10;
    }

    b(Random random) {
        this.f33677c = new HashMap();
        this.f33678d = random;
        this.f33675a = new HashMap();
        this.f33676b = new HashMap();
    }
}
