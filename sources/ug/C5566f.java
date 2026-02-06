package Ug;

import java.util.Collection;
import kotlin.coroutines.jvm.internal.d;
import mf.C6565s;
import qf.C6658d;

/* renamed from: Ug.f  reason: case insensitive filesystem */
public abstract class C5566f {

    /* renamed from: Ug.f$a */
    static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f65367a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f65368b;

        /* renamed from: c  reason: collision with root package name */
        int f65369c;

        a(C6658d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f65368b = obj;
            this.f65369c |= Integer.MIN_VALUE;
            return C5566f.b((Collection) null, this);
        }
    }

    public static final Object a(S[] sArr, C6658d dVar) {
        if (sArr.length == 0) {
            return C6565s.n();
        }
        return new C5564e(sArr).c(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(java.util.Collection r4, qf.C6658d r5) {
        /*
            boolean r0 = r5 instanceof Ug.C5566f.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            Ug.f$a r0 = (Ug.C5566f.a) r0
            int r1 = r0.f65369c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f65369c = r1
            goto L_0x0018
        L_0x0013:
            Ug.f$a r0 = new Ug.f$a
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f65368b
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.f65369c
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f65367a
            java.util.Iterator r4 = (java.util.Iterator) r4
            lf.w.b(r5)
            goto L_0x003e
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            lf.w.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x003e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0055
            java.lang.Object r5 = r4.next()
            Ug.w0 r5 = (Ug.C5600w0) r5
            r0.f65367a = r4
            r0.f65369c = r3
            java.lang.Object r5 = r5.B0(r0)
            if (r5 != r1) goto L_0x003e
            return r1
        L_0x0055:
            lf.M r4 = lf.C6514M.f71813a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.C5566f.b(java.util.Collection, qf.d):java.lang.Object");
    }
}
