package X3;

import Ug.G;
import X3.b;
import a4.C3120m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import b4.C3145a;
import h4.C3568c;
import j4.C3615b;
import j4.C3616c;
import j4.C3618e;
import j4.C3622i;
import k4.C3663e;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import n4.C3856c;
import o4.C3875A;
import o4.k;
import o4.w;
import o4.z;
import qf.C6658d;
import rh.C6703A;
import yf.C6787a;

public interface g {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f9691a;

        /* renamed from: b  reason: collision with root package name */
        private C3616c f9692b = k.b();

        /* renamed from: c  reason: collision with root package name */
        private Lazy f9693c = null;

        /* renamed from: d  reason: collision with root package name */
        private Lazy f9694d = null;

        /* renamed from: e  reason: collision with root package name */
        private Lazy f9695e = null;

        /* renamed from: f  reason: collision with root package name */
        private b.c f9696f = null;

        /* renamed from: g  reason: collision with root package name */
        private a f9697g = null;

        /* renamed from: h  reason: collision with root package name */
        private w f9698h = new w(false, false, false, 0, (C3120m) null, 31, (DefaultConstructorMarker) null);

        public a(Context context) {
            this.f9691a = context.getApplicationContext();
        }

        /* access modifiers changed from: private */
        public static final C3568c f(a aVar) {
            return new C3568c.a(aVar.f9691a).a();
        }

        /* access modifiers changed from: private */
        public static final C3145a g(a aVar) {
            return C3875A.f46979a.a(aVar.f9691a);
        }

        /* access modifiers changed from: private */
        public static final C6703A h() {
            return new C6703A();
        }

        public final a d(Bitmap.Config config) {
            this.f9692b = C3616c.b(this.f9692b, (G) null, (G) null, (G) null, (G) null, (C3856c.a) null, (C3663e) null, config, false, false, (Drawable) null, (Drawable) null, (Drawable) null, (C3615b) null, (C3615b) null, (C3615b) null, 32703, (Object) null);
            return this;
        }

        public final g e() {
            Context context = this.f9691a;
            C3616c cVar = this.f9692b;
            Lazy lazy = this.f9693c;
            if (lazy == null) {
                lazy = C6531o.b(new d(this));
            }
            Lazy lazy2 = lazy;
            Lazy lazy3 = this.f9694d;
            if (lazy3 == null) {
                lazy3 = C6531o.b(new e(this));
            }
            Lazy lazy4 = lazy3;
            Lazy lazy5 = this.f9695e;
            if (lazy5 == null) {
                lazy5 = C6531o.b(new f());
            }
            Lazy lazy6 = lazy5;
            b.c cVar2 = this.f9696f;
            if (cVar2 == null) {
                cVar2 = b.c.f9687b;
            }
            b.c cVar3 = cVar2;
            a aVar = this.f9697g;
            if (aVar == null) {
                aVar = new a();
            }
            return new i(context, cVar, lazy2, lazy4, lazy6, cVar3, aVar, this.f9698h, (z) null);
        }

        public final a i(a aVar) {
            this.f9697g = aVar;
            return this;
        }

        public final a j(C6787a aVar) {
            this.f9694d = C6531o.b(aVar);
            return this;
        }
    }

    Object a(C3622i iVar, C6658d dVar);

    C3616c b();

    C3618e c(C3622i iVar);

    C3568c d();

    a getComponents();
}
