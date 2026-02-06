package Sg;

import Ef.i;
import Ef.m;
import Rg.h;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import yf.p;
import zf.C6828a;

/* renamed from: Sg.e  reason: case insensitive filesystem */
final class C5542e implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f65037a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f65038b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f65039c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final p f65040d;

    /* renamed from: Sg.e$a */
    public static final class a implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f65041a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f65042b;

        /* renamed from: c  reason: collision with root package name */
        private int f65043c;

        /* renamed from: d  reason: collision with root package name */
        private i f65044d;

        /* renamed from: e  reason: collision with root package name */
        private int f65045e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5542e f65046f;

        a(C5542e eVar) {
            this.f65046f = eVar;
            int l10 = m.l(eVar.f65038b, 0, eVar.f65037a.length());
            this.f65042b = l10;
            this.f65043c = l10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < Sg.C5542e.e(r6.f65046f)) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f65043c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f65041a = r1
                r0 = 0
                r6.f65044d = r0
                goto L_0x009e
            L_0x000c:
                Sg.e r0 = r6.f65046f
                int r0 = r0.f65039c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f65045e
                int r0 = r0 + r3
                r6.f65045e = r0
                Sg.e r4 = r6.f65046f
                int r4 = r4.f65039c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f65043c
                Sg.e r4 = r6.f65046f
                java.lang.CharSequence r4 = r4.f65037a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                Ef.i r0 = new Ef.i
                int r1 = r6.f65042b
                Sg.e r4 = r6.f65046f
                java.lang.CharSequence r4 = r4.f65037a
                int r4 = Sg.p.V(r4)
                r0.<init>(r1, r4)
                r6.f65044d = r0
                r6.f65043c = r2
                goto L_0x009c
            L_0x0047:
                Sg.e r0 = r6.f65046f
                yf.p r0 = r0.f65040d
                Sg.e r4 = r6.f65046f
                java.lang.CharSequence r4 = r4.f65037a
                int r5 = r6.f65043c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x0077
                Ef.i r0 = new Ef.i
                int r1 = r6.f65042b
                Sg.e r4 = r6.f65046f
                java.lang.CharSequence r4 = r4.f65037a
                int r4 = Sg.p.V(r4)
                r0.<init>(r1, r4)
                r6.f65044d = r0
                r6.f65043c = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f65042b
                Ef.i r4 = Ef.m.u(r4, r2)
                r6.f65044d = r4
                int r2 = r2 + r0
                r6.f65042b = r2
                if (r0 != 0) goto L_0x0099
                r1 = r3
            L_0x0099:
                int r2 = r2 + r1
                r6.f65043c = r2
            L_0x009c:
                r6.f65041a = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Sg.C5542e.a.a():void");
        }

        /* renamed from: b */
        public i next() {
            if (this.f65041a == -1) {
                a();
            }
            if (this.f65041a != 0) {
                i iVar = this.f65044d;
                C6496s.f(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f65044d = null;
                this.f65041a = -1;
                return iVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f65041a == -1) {
                a();
            }
            if (this.f65041a == 1) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5542e(CharSequence charSequence, int i10, int i11, p pVar) {
        C6496s.h(charSequence, MetricTracker.Object.INPUT);
        C6496s.h(pVar, "getNextMatch");
        this.f65037a = charSequence;
        this.f65038b = i10;
        this.f65039c = i11;
        this.f65040d = pVar;
    }

    public Iterator iterator() {
        return new a(this);
    }
}
