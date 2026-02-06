package Y;

import kotlin.jvm.internal.C6498u;
import lf.C6527k;
import yf.C6787a;
import yf.C6798l;

public final class D extends I0 {

    /* renamed from: b  reason: collision with root package name */
    private final E f9755b;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9756a = new a();

        a() {
            super(0);
        }

        public final Object invoke() {
            C1506p.s("Unexpected call to default provider");
            throw new C6527k();
        }
    }

    public D(C6798l lVar) {
        super(a.f9756a);
        this.f9755b = new E(lVar);
    }

    public J0 c(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new J0(this, obj, z10, (o1) null, (C1510r0) null, (C6798l) null, true);
    }

    /* renamed from: g */
    public E a() {
        return this.f9755b;
    }
}
