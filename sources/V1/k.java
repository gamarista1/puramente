package v1;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p1.h;
import p1.i;
import x1.g;

public abstract class k {

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f26948a;

        /* renamed from: b  reason: collision with root package name */
        private final int f26949b;

        /* renamed from: c  reason: collision with root package name */
        private final int f26950c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f26951d;

        /* renamed from: e  reason: collision with root package name */
        private final int f26952e;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f26948a = (Uri) g.f(uri);
            this.f26949b = i10;
            this.f26950c = i11;
            this.f26951d = z10;
            this.f26952e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f26952e;
        }

        public int c() {
            return this.f26949b;
        }

        public Uri d() {
            return this.f26948a;
        }

        public int e() {
            return this.f26950c;
        }

        public boolean f() {
            return this.f26951d;
        }
    }

    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return i.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return C2749d.e(context, h.a(new Object[]{eVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        C2746a aVar = new C2746a(cVar, l.b(handler));
        if (!z10) {
            return i.d(context, list, i10, (Executor) null, aVar);
        }
        if (list.size() <= 1) {
            return i.e(context, (e) list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f26946a;

        /* renamed from: b  reason: collision with root package name */
        private final List f26947b;

        public a(int i10, b[] bVarArr) {
            this.f26946a = i10;
            this.f26947b = Collections.singletonList(bVarArr);
        }

        static a a(int i10, List list) {
            return new a(i10, list);
        }

        static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return (b[]) this.f26947b.get(0);
        }

        public List d() {
            return this.f26947b;
        }

        public int e() {
            return this.f26946a;
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            if (this.f26947b.size() > 1) {
                return true;
            }
            return false;
        }

        a(int i10, List list) {
            this.f26946a = i10;
            this.f26947b = list;
        }
    }
}
