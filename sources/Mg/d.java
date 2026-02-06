package Mg;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6549b;
import mf.C6559l;

public final class d extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f64139c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Object[] f64140a;

    /* renamed from: b  reason: collision with root package name */
    private int f64141b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends C6549b {

        /* renamed from: c  reason: collision with root package name */
        private int f64142c = -1;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f64143d;

        b(d dVar) {
            this.f64143d = dVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r2 = this;
            L_0x0000:
                int r0 = r2.f64142c
                int r0 = r0 + 1
                r2.f64142c = r0
                Mg.d r1 = r2.f64143d
                java.lang.Object[] r1 = r1.f64140a
                int r1 = r1.length
                if (r0 >= r1) goto L_0x001b
                Mg.d r0 = r2.f64143d
                java.lang.Object[] r0 = r0.f64140a
                int r1 = r2.f64142c
                r0 = r0[r1]
                if (r0 == 0) goto L_0x0000
            L_0x001b:
                int r0 = r2.f64142c
                Mg.d r1 = r2.f64143d
                java.lang.Object[] r1 = r1.f64140a
                int r1 = r1.length
                if (r0 < r1) goto L_0x002a
                r2.b()
                goto L_0x003c
            L_0x002a:
                Mg.d r0 = r2.f64143d
                java.lang.Object[] r0 = r0.f64140a
                int r1 = r2.f64142c
                r0 = r0[r1]
                java.lang.String r1 = "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl"
                kotlin.jvm.internal.C6496s.f(r0, r1)
                r2.c(r0)
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Mg.d.b.a():void");
        }
    }

    private d(Object[] objArr, int i10) {
        super((DefaultConstructorMarker) null);
        this.f64140a = objArr;
        this.f64141b = i10;
    }

    private final void k(int i10) {
        Object[] objArr = this.f64140a;
        if (objArr.length <= i10) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i10);
            Object[] copyOf = Arrays.copyOf(this.f64140a, length);
            C6496s.g(copyOf, "copyOf(...)");
            this.f64140a = copyOf;
        }
    }

    public int a() {
        return this.f64141b;
    }

    public void b(int i10, Object obj) {
        C6496s.h(obj, "value");
        k(i10);
        if (this.f64140a[i10] == null) {
            this.f64141b = a() + 1;
        }
        this.f64140a[i10] = obj;
    }

    public Object get(int i10) {
        return C6559l.m0(this.f64140a, i10);
    }

    public Iterator iterator() {
        return new b(this);
    }

    public d() {
        this(new Object[20], 0);
    }
}
