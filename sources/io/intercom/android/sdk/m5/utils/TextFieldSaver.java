package io.intercom.android.sdk.m5.utils;

import Q0.S;
import W0.Q;
import h0.C2017a;
import h0.C2026j;
import h0.C2028l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/utils/TextFieldSaver;", "", "<init>", "()V", "Lh0/j;", "LW0/Q;", "textFieldValueSaver", "Lh0/j;", "getTextFieldValueSaver", "()Lh0/j;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextFieldSaver {
    public static final int $stable = 8;
    public static final TextFieldSaver INSTANCE = new TextFieldSaver();
    private static final C2026j textFieldValueSaver = C2017a.a(new a(), new b());

    private TextFieldSaver() {
    }

    /* access modifiers changed from: private */
    public static final List textFieldValueSaver$lambda$0(C2028l lVar, Q q10) {
        int i10;
        C6496s.h(lVar, "$this$listSaver");
        C6496s.h(q10, "it");
        String h10 = q10.h();
        Integer valueOf = Integer.valueOf(Q0.Q.n(q10.g()));
        Integer valueOf2 = Integer.valueOf(Q0.Q.i(q10.g()));
        Q0.Q f10 = q10.f();
        int i11 = -1;
        if (f10 != null) {
            i10 = Q0.Q.n(f10.r());
        } else {
            i10 = -1;
        }
        Integer valueOf3 = Integer.valueOf(i10);
        Q0.Q f11 = q10.f();
        if (f11 != null) {
            i11 = Q0.Q.i(f11.r());
        }
        return C6565s.q(h10, valueOf, valueOf2, valueOf3, Integer.valueOf(i11));
    }

    /* access modifiers changed from: private */
    public static final Q textFieldValueSaver$lambda$1(List list) {
        Q0.Q q10;
        C6496s.h(list, "it");
        Object obj = list.get(0);
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(2);
        C6496s.f(obj3, "null cannot be cast to non-null type kotlin.Int");
        long b10 = S.b(intValue, ((Integer) obj3).intValue());
        Object obj4 = list.get(3);
        C6496s.f(obj4, "null cannot be cast to non-null type kotlin.Int");
        if (((Integer) obj4).intValue() >= 0) {
            Object obj5 = list.get(3);
            C6496s.f(obj5, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            C6496s.f(obj6, "null cannot be cast to non-null type kotlin.Int");
            q10 = Q0.Q.b(S.b(intValue2, ((Integer) obj6).intValue()));
        } else {
            q10 = null;
        }
        return new Q(str, b10, q10, (DefaultConstructorMarker) null);
    }

    public final C2026j getTextFieldValueSaver() {
        return textFieldValueSaver;
    }
}
