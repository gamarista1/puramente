package h4;

import android.graphics.Bitmap;
import androidx.collection.C1609x;
import h4.C3568c;
import java.util.Map;
import o4.C3878a;

/* renamed from: h4.f  reason: case insensitive filesystem */
public final class C3571f implements C3573h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C3574i f43989a;

    /* renamed from: b  reason: collision with root package name */
    private final b f43990b;

    /* renamed from: h4.f$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f43991a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f43992b;

        /* renamed from: c  reason: collision with root package name */
        private final int f43993c;

        public a(Bitmap bitmap, Map map, int i10) {
            this.f43991a = bitmap;
            this.f43992b = map;
            this.f43993c = i10;
        }

        public final Bitmap a() {
            return this.f43991a;
        }

        public final Map b() {
            return this.f43992b;
        }

        public final int c() {
            return this.f43993c;
        }
    }

    /* renamed from: h4.f$b */
    public static final class b extends C1609x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3571f f43994a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, C3571f fVar) {
            super(i10);
            this.f43994a = fVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void entryRemoved(boolean z10, C3568c.b bVar, a aVar, a aVar2) {
            this.f43994a.f43989a.c(bVar, aVar.a(), aVar.b(), aVar.c());
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int sizeOf(C3568c.b bVar, a aVar) {
            return aVar.c();
        }
    }

    public C3571f(int i10, C3574i iVar) {
        this.f43989a = iVar;
        this.f43990b = new b(i10, this);
    }

    public void a(int i10) {
        if (i10 >= 40) {
            e();
        } else if (10 <= i10 && i10 < 20) {
            this.f43990b.trimToSize(g() / 2);
        }
    }

    public C3568c.C0675c b(C3568c.b bVar) {
        a aVar = (a) this.f43990b.get(bVar);
        if (aVar != null) {
            return new C3568c.C0675c(aVar.a(), aVar.b());
        }
        return null;
    }

    public void c(C3568c.b bVar, Bitmap bitmap, Map map) {
        int a10 = C3878a.a(bitmap);
        if (a10 <= f()) {
            this.f43990b.put(bVar, new a(bitmap, map, a10));
            return;
        }
        this.f43990b.remove(bVar);
        this.f43989a.c(bVar, bitmap, map, a10);
    }

    public void e() {
        this.f43990b.evictAll();
    }

    public int f() {
        return this.f43990b.maxSize();
    }

    public int g() {
        return this.f43990b.size();
    }
}
