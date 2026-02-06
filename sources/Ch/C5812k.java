package ch;

import Ug.C5582n;
import Zg.G;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.q;

/* renamed from: ch.k  reason: case insensitive filesystem */
public abstract class C5812k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final q f67389a = a.f67395a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final G f67390b = new G("STATE_REG");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final G f67391c = new G("STATE_COMPLETED");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final G f67392d = new G("STATE_CANCELLED");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final G f67393e = new G("NO_RESULT");

    /* renamed from: f  reason: collision with root package name */
    private static final G f67394f = new G("PARAM_CLAUSE_0");

    /* renamed from: ch.k$a */
    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final a f67395a = new a();

        a() {
            super(3);
        }

        /* renamed from: a */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final C5813l a(int i10) {
        if (i10 == 0) {
            return C5813l.SUCCESSFUL;
        }
        if (i10 == 1) {
            return C5813l.REREGISTER;
        }
        if (i10 == 2) {
            return C5813l.CANCELLED;
        }
        if (i10 == 3) {
            return C5813l.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    public static final G i() {
        return f67394f;
    }

    /* access modifiers changed from: private */
    public static final boolean j(C5582n nVar, C6798l lVar) {
        Object D10 = nVar.D(C6514M.f71813a, (Object) null, lVar);
        if (D10 == null) {
            return false;
        }
        nVar.L(D10);
        return true;
    }
}
