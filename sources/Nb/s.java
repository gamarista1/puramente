package nb;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class s {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5109d f61101a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f61102b;

    /* renamed from: c  reason: collision with root package name */
    private final c f61103c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f61104d;

    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5109d f61105a;

        /* renamed from: nb.s$a$a  reason: collision with other inner class name */
        class C0899a extends b {
            C0899a(s sVar, CharSequence charSequence) {
                super(sVar, charSequence);
            }

            /* access modifiers changed from: package-private */
            public int e(int i10) {
                return i10 + 1;
            }

            /* access modifiers changed from: package-private */
            public int f(int i10) {
                return a.this.f61105a.c(this.f61107c, i10);
            }
        }

        a(C5109d dVar) {
            this.f61105a = dVar;
        }

        /* renamed from: b */
        public b a(s sVar, CharSequence charSequence) {
            return new C0899a(sVar, charSequence);
        }
    }

    private static abstract class b extends C5107b {

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f61107c;

        /* renamed from: d  reason: collision with root package name */
        final C5109d f61108d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f61109e;

        /* renamed from: f  reason: collision with root package name */
        int f61110f = 0;

        /* renamed from: g  reason: collision with root package name */
        int f61111g;

        protected b(s sVar, CharSequence charSequence) {
            this.f61108d = sVar.f61101a;
            this.f61109e = sVar.f61102b;
            this.f61111g = sVar.f61104d;
            this.f61107c = charSequence;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String a() {
            int i10;
            int i11 = this.f61110f;
            while (true) {
                int i12 = this.f61110f;
                if (i12 == -1) {
                    return (String) b();
                }
                int f10 = f(i12);
                if (f10 == -1) {
                    f10 = this.f61107c.length();
                    this.f61110f = -1;
                } else {
                    this.f61110f = e(f10);
                }
                int i13 = this.f61110f;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    this.f61110f = i14;
                    if (i14 > this.f61107c.length()) {
                        this.f61110f = -1;
                    }
                } else {
                    while (i11 < f10 && this.f61108d.e(this.f61107c.charAt(i11))) {
                        i11++;
                    }
                    while (i10 > i11 && this.f61108d.e(this.f61107c.charAt(i10 - 1))) {
                        f10 = i10 - 1;
                    }
                    if (!this.f61109e || i11 != i10) {
                        int i15 = this.f61111g;
                    } else {
                        i11 = this.f61110f;
                    }
                }
            }
            int i152 = this.f61111g;
            if (i152 == 1) {
                i10 = this.f61107c.length();
                this.f61110f = -1;
                while (i10 > i11 && this.f61108d.e(this.f61107c.charAt(i10 - 1))) {
                    i10--;
                }
            } else {
                this.f61111g = i152 - 1;
            }
            return this.f61107c.subSequence(i11, i10).toString();
        }

        /* access modifiers changed from: package-private */
        public abstract int e(int i10);

        /* access modifiers changed from: package-private */
        public abstract int f(int i10);
    }

    private interface c {
        Iterator a(s sVar, CharSequence charSequence);
    }

    private s(c cVar) {
        this(cVar, false, C5109d.f(), a.e.API_PRIORITY_OTHER);
    }

    public static s d(char c10) {
        return e(C5109d.d(c10));
    }

    public static s e(C5109d dVar) {
        o.j(dVar);
        return new s(new a(dVar));
    }

    private Iterator g(CharSequence charSequence) {
        return this.f61103c.a(this, charSequence);
    }

    public List f(CharSequence charSequence) {
        o.j(charSequence);
        Iterator g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add((String) g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private s(c cVar, boolean z10, C5109d dVar, int i10) {
        this.f61103c = cVar;
        this.f61102b = z10;
        this.f61101a = dVar;
        this.f61104d = i10;
    }
}
