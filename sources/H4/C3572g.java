package h4;

import android.graphics.Bitmap;
import h4.C3568c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

/* renamed from: h4.g  reason: case insensitive filesystem */
public final class C3572g implements C3574i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f43995c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap f43996a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f43997b;

    /* renamed from: h4.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: h4.g$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f43998a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference f43999b;

        /* renamed from: c  reason: collision with root package name */
        private final Map f44000c;

        /* renamed from: d  reason: collision with root package name */
        private final int f44001d;

        public b(int i10, WeakReference weakReference, Map map, int i11) {
            this.f43998a = i10;
            this.f43999b = weakReference;
            this.f44000c = map;
            this.f44001d = i11;
        }

        public final WeakReference a() {
            return this.f43999b;
        }

        public final Map b() {
            return this.f44000c;
        }

        public final int c() {
            return this.f43998a;
        }

        public final int d() {
            return this.f44001d;
        }
    }

    private final void e() {
        int i10 = this.f43997b;
        this.f43997b = i10 + 1;
        if (i10 >= 10) {
            d();
        }
    }

    public synchronized void a(int i10) {
        if (i10 >= 10 && i10 != 20) {
            d();
        }
    }

    public synchronized C3568c.C0675c b(C3568c.b bVar) {
        C3568c.C0675c cVar;
        try {
            ArrayList arrayList = (ArrayList) this.f43996a.get(bVar);
            C3568c.C0675c cVar2 = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                b bVar2 = (b) arrayList.get(i10);
                Bitmap bitmap = (Bitmap) bVar2.a().get();
                if (bitmap != null) {
                    cVar = new C3568c.C0675c(bitmap, bVar2.b());
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    cVar2 = cVar;
                    break;
                }
                i10++;
            }
            e();
            return cVar2;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void c(C3568c.b bVar, Bitmap bitmap, Map map, int i10) {
        try {
            LinkedHashMap linkedHashMap = this.f43996a;
            Object obj = linkedHashMap.get(bVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(bVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            b bVar2 = new b(identityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList.add(bVar2);
                    break;
                }
                b bVar3 = (b) arrayList.get(i11);
                if (i10 < bVar3.d()) {
                    i11++;
                } else if (bVar3.c() == identityHashCode && bVar3.a().get() == bitmap) {
                    arrayList.set(i11, bVar2);
                } else {
                    arrayList.add(i11, bVar2);
                }
            }
            e();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final void d() {
        Bitmap bitmap;
        WeakReference a10;
        this.f43997b = 0;
        Iterator it = this.f43996a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                b bVar = (b) C6565s.q0(arrayList);
                if (bVar == null || (a10 = bVar.a()) == null) {
                    bitmap = null;
                } else {
                    bitmap = (Bitmap) a10.get();
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((b) arrayList.get(i12)).a().get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
