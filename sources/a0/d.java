package a0;

import Rg.j;
import androidx.collection.W;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C6488j;
import lf.C6514M;
import qf.C6658d;
import yf.p;
import zf.C6828a;

public final class d implements Set, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final W f10564a;

    static final class a extends k implements p {

        /* renamed from: b  reason: collision with root package name */
        Object f10565b;

        /* renamed from: c  reason: collision with root package name */
        Object f10566c;

        /* renamed from: d  reason: collision with root package name */
        int f10567d;

        /* renamed from: e  reason: collision with root package name */
        int f10568e;

        /* renamed from: f  reason: collision with root package name */
        int f10569f;

        /* renamed from: g  reason: collision with root package name */
        int f10570g;

        /* renamed from: h  reason: collision with root package name */
        long f10571h;

        /* renamed from: i  reason: collision with root package name */
        int f10572i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f10573j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ d f10574k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C6658d dVar2) {
            super(2, dVar2);
            this.f10574k = dVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f10574k, dVar);
            aVar.f10573j = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(j jVar, C6658d dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f10572i
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r5) goto L_0x002b
                int r2 = r0.f10570g
                int r6 = r0.f10569f
                long r7 = r0.f10571h
                int r9 = r0.f10568e
                int r10 = r0.f10567d
                java.lang.Object r11 = r0.f10566c
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f10565b
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f10573j
                Rg.j r13 = (Rg.j) r13
                lf.w.b(r21)
                goto L_0x0094
            L_0x002b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0033:
                lf.w.b(r21)
                java.lang.Object r2 = r0.f10573j
                Rg.j r2 = (Rg.j) r2
                a0.d r6 = r0.f10574k
                androidx.collection.W r6 = r6.a()
                java.lang.Object[] r7 = r6.f12131b
                long[] r6 = r6.f12130a
                int r8 = r6.length
                int r8 = r8 + -2
                if (r8 < 0) goto L_0x00a2
                r9 = r3
            L_0x004a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L_0x009d
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L_0x006b:
                if (r2 >= r6) goto L_0x0097
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.32E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L_0x0094
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f10573j = r13
                r0.f10565b = r12
                r0.f10566c = r11
                r0.f10567d = r10
                r0.f10568e = r9
                r0.f10571h = r7
                r0.f10569f = r6
                r0.f10570g = r2
                r0.f10572i = r5
                java.lang.Object r14 = r13.b(r14, r0)
                if (r14 != r1) goto L_0x0094
                return r1
            L_0x0094:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L_0x006b
            L_0x0097:
                if (r6 != r4) goto L_0x00a2
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L_0x009d:
                if (r9 == r8) goto L_0x00a2
                int r9 = r9 + 1
                goto L_0x004a
            L_0x00a2:
                lf.M r1 = lf.C6514M.f71813a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(W w10) {
        this.f10564a = w10;
    }

    public final W a() {
        return this.f10564a;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return this.f10564a.c();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.f10564a.a(obj);
    }

    public boolean containsAll(Collection collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object a10 : iterable) {
            if (!this.f10564a.a(a10)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f10564a.d();
    }

    public Iterator iterator() {
        return Rg.k.a(new a(this, (C6658d) null));
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return b();
    }

    public Object[] toArray() {
        return C6488j.a(this);
    }

    public Object[] toArray(Object[] objArr) {
        return C6488j.b(this, objArr);
    }
}
