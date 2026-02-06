package Fg;

import Of.C5490h;
import Of.m0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class M extends E0 {

    /* renamed from: c  reason: collision with root package name */
    private final m0[] f62952c;

    /* renamed from: d  reason: collision with root package name */
    private final B0[] f62953d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f62954e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(m0[] m0VarArr, B0[] b0Arr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(m0VarArr, b0Arr, (i10 & 4) != 0 ? false : z10);
    }

    public boolean b() {
        return this.f62954e;
    }

    public B0 e(S s10) {
        m0 m0Var;
        C6496s.h(s10, SubscriberAttributeKt.JSON_NAME_KEY);
        C5490h o10 = s10.N0().o();
        if (o10 instanceof m0) {
            m0Var = (m0) o10;
        } else {
            m0Var = null;
        }
        if (m0Var == null) {
            return null;
        }
        int index = m0Var.getIndex();
        m0[] m0VarArr = this.f62952c;
        if (index >= m0VarArr.length || !C6496s.c(m0VarArr[index].l(), m0Var.l())) {
            return null;
        }
        return this.f62953d[index];
    }

    public boolean f() {
        if (this.f62953d.length == 0) {
            return true;
        }
        return false;
    }

    public final B0[] i() {
        return this.f62953d;
    }

    public final m0[] j() {
        return this.f62952c;
    }

    public M(m0[] m0VarArr, B0[] b0Arr, boolean z10) {
        C6496s.h(m0VarArr, "parameters");
        C6496s.h(b0Arr, "arguments");
        this.f62952c = m0VarArr;
        this.f62953d = b0Arr;
        this.f62954e = z10;
        int length = m0VarArr.length;
        int length2 = b0Arr.length;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public M(List list, List list2) {
        this((m0[]) list.toArray(new m0[0]), (B0[]) list2.toArray(new B0[0]), false, 4, (DefaultConstructorMarker) null);
        C6496s.h(list, "parameters");
        C6496s.h(list2, "argumentsList");
    }
}
