package Ug;

import Zg.G;

public abstract class F0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final G f65304a = new G("COMPLETING_ALREADY");

    /* renamed from: b  reason: collision with root package name */
    public static final G f65305b = new G("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final G f65306c = new G("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final G f65307d = new G("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final G f65308e = new G("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C5565e0 f65309f = new C5565e0(false);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C5565e0 f65310g = new C5565e0(true);

    public static final Object g(Object obj) {
        if (obj instanceof C5589q0) {
            return new C5590r0((C5589q0) obj);
        }
        return obj;
    }

    public static final Object h(Object obj) {
        C5590r0 r0Var;
        C5589q0 q0Var;
        if (obj instanceof C5590r0) {
            r0Var = (C5590r0) obj;
        } else {
            r0Var = null;
        }
        if (r0Var == null || (q0Var = r0Var.f65406a) == null) {
            return obj;
        }
        return q0Var;
    }
}
