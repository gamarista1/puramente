package R9;

import M9.a;
import android.net.Uri;
import ja.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final long f33753a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33754b;

    /* renamed from: c  reason: collision with root package name */
    public final long f33755c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f33756d;

    /* renamed from: e  reason: collision with root package name */
    public final long f33757e;

    /* renamed from: f  reason: collision with root package name */
    public final long f33758f;

    /* renamed from: g  reason: collision with root package name */
    public final long f33759g;

    /* renamed from: h  reason: collision with root package name */
    public final long f33760h;

    /* renamed from: i  reason: collision with root package name */
    public final o f33761i;

    /* renamed from: j  reason: collision with root package name */
    public final l f33762j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f33763k;

    /* renamed from: l  reason: collision with root package name */
    public final h f33764l;

    /* renamed from: m  reason: collision with root package name */
    private final List f33765m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List list) {
        List list2;
        this.f33753a = j10;
        this.f33754b = j11;
        this.f33755c = j12;
        this.f33756d = z10;
        this.f33757e = j13;
        this.f33758f = j14;
        this.f33759g = j15;
        this.f33760h = j16;
        this.f33764l = hVar;
        this.f33761i = oVar;
        this.f33763k = uri;
        this.f33762j = lVar;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = list;
        }
        this.f33765m = list2;
    }

    private static ArrayList c(List list, LinkedList linkedList) {
        M9.c cVar = (M9.c) linkedList.poll();
        int i10 = cVar.f32703a;
        ArrayList arrayList = new ArrayList();
        do {
            int i11 = cVar.f32704b;
            a aVar = (a) list.get(i11);
            List list2 = aVar.f33745c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((j) list2.get(cVar.f32705c));
                cVar = (M9.c) linkedList.poll();
                if (!(cVar.f32703a == i10 && cVar.f32704b == i11)) {
                    arrayList.add(new a(aVar.f33743a, aVar.f33744b, arrayList2, aVar.f33746d, aVar.f33747e, aVar.f33748f));
                }
                arrayList2.add((j) list2.get(cVar.f32705c));
                cVar = (M9.c) linkedList.poll();
                break;
            } while (cVar.f32704b == i11);
            arrayList.add(new a(aVar.f33743a, aVar.f33744b, arrayList2, aVar.f33746d, aVar.f33747e, aVar.f33748f));
        } while (cVar.f32703a == i10);
        linkedList.addFirst(cVar);
        return arrayList;
    }

    /* renamed from: b */
    public final c a(List list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new M9.c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i10 >= e()) {
                break;
            }
            if (((M9.c) linkedList.peek()).f32703a != i10) {
                long f10 = f(i10);
                if (f10 != -9223372036854775807L) {
                    j11 += f10;
                }
            } else {
                g d10 = d(i10);
                arrayList.add(new g(d10.f33788a, d10.f33789b - j11, c(d10.f33790c, linkedList), d10.f33791d));
            }
            i10++;
        }
        long j12 = this.f33754b;
        if (j12 != -9223372036854775807L) {
            j10 = j12 - j11;
        }
        return new c(this.f33753a, j10, this.f33755c, this.f33756d, this.f33757e, this.f33758f, this.f33759g, this.f33760h, this.f33764l, this.f33761i, this.f33762j, this.f33763k, arrayList);
    }

    public final g d(int i10) {
        return (g) this.f33765m.get(i10);
    }

    public final int e() {
        return this.f33765m.size();
    }

    public final long f(int i10) {
        long j10;
        long j11;
        if (i10 == this.f33765m.size() - 1) {
            j10 = this.f33754b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((g) this.f33765m.get(i10)).f33789b;
        } else {
            j10 = ((g) this.f33765m.get(i10 + 1)).f33789b;
            j11 = ((g) this.f33765m.get(i10)).f33789b;
        }
        return j10 - j11;
    }

    public final long g(int i10) {
        return M.C0(f(i10));
    }
}
