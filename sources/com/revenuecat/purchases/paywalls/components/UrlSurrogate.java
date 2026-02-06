package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B2\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\nø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "url_lid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;Ljh/d;Lih/f;)V", "Ljava/lang/String;", "getUrl_lid-z7Tp-4o", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class UrlSurrogate {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, ButtonComponent.UrlMethod.Companion.serializer()};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ButtonComponent.UrlMethod method;
    private final String url_lid;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return UrlSurrogate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ UrlSurrogate(int i10, String str, ButtonComponent.UrlMethod urlMethod, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, urlMethod, t0Var);
    }

    public static final /* synthetic */ void write$Self(UrlSurrogate urlSurrogate, d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.B(fVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m112boximpl(urlSurrogate.url_lid));
        dVar.B(fVar, 1, bVarArr[1], urlSurrogate.method);
    }

    public final ButtonComponent.UrlMethod getMethod() {
        return this.method;
    }

    /* renamed from: getUrl_lid-z7Tp-4o  reason: not valid java name */
    public final String m84getUrl_lidz7Tp4o() {
        return this.url_lid;
    }

    public /* synthetic */ UrlSurrogate(String str, ButtonComponent.UrlMethod urlMethod, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, urlMethod);
    }

    private UrlSurrogate(int i10, String str, ButtonComponent.UrlMethod urlMethod, t0 t0Var) {
        if (3 != (i10 & 3)) {
            C6456i0.a(i10, 3, UrlSurrogate$$serializer.INSTANCE.getDescriptor());
        }
        this.url_lid = str;
        this.method = urlMethod;
    }

    private UrlSurrogate(String str, ButtonComponent.UrlMethod urlMethod) {
        C6496s.h(str, "url_lid");
        C6496s.h(urlMethod, "method");
        this.url_lid = str;
        this.method = urlMethod;
    }
}
