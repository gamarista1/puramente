package com.revenuecat.purchases.paywalls.components.common;

import Ff.d;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent$$serializer;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent$$serializer;
import com.revenuecat.purchases.paywalls.components.common.Background;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;", "stickyFooter", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;", "getStickyFooter", "()Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;", "getStickyFooter$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PaywallComponentsConfig {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, new C5983g("com.revenuecat.purchases.paywalls.components.common.Background", O.b(Background.class), new d[]{O.b(Background.Color.class), O.b(Background.Image.class)}, new C5978b[]{Background$Color$$serializer.INSTANCE, Background$Image$$serializer.INSTANCE}, new Annotation[0]), null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Background background;
    private final StackComponent stack;
    private final StickyFooterComponent stickyFooter;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PaywallComponentsConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ PaywallComponentsConfig(int i10, StackComponent stackComponent, Background background2, StickyFooterComponent stickyFooterComponent, t0 t0Var) {
        if (3 != (i10 & 3)) {
            C6456i0.a(i10, 3, PaywallComponentsConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.stack = stackComponent;
        this.background = background2;
        if ((i10 & 4) == 0) {
            this.stickyFooter = null;
        } else {
            this.stickyFooter = stickyFooterComponent;
        }
    }

    public static /* synthetic */ void getStickyFooter$annotations() {
    }

    public static final /* synthetic */ void write$Self(PaywallComponentsConfig paywallComponentsConfig, jh.d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.B(fVar, 0, StackComponent$$serializer.INSTANCE, paywallComponentsConfig.stack);
        dVar.B(fVar, 1, bVarArr[1], paywallComponentsConfig.background);
        if (dVar.q(fVar, 2) || paywallComponentsConfig.stickyFooter != null) {
            dVar.p(fVar, 2, StickyFooterComponent$$serializer.INSTANCE, paywallComponentsConfig.stickyFooter);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentsConfig)) {
            return false;
        }
        PaywallComponentsConfig paywallComponentsConfig = (PaywallComponentsConfig) obj;
        return C6496s.c(this.stack, paywallComponentsConfig.stack) && C6496s.c(this.background, paywallComponentsConfig.background) && C6496s.c(this.stickyFooter, paywallComponentsConfig.stickyFooter);
    }

    public final /* synthetic */ Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public final /* synthetic */ StickyFooterComponent getStickyFooter() {
        return this.stickyFooter;
    }

    public int hashCode() {
        int hashCode = ((this.stack.hashCode() * 31) + this.background.hashCode()) * 31;
        StickyFooterComponent stickyFooterComponent = this.stickyFooter;
        return hashCode + (stickyFooterComponent == null ? 0 : stickyFooterComponent.hashCode());
    }

    public String toString() {
        return "PaywallComponentsConfig(stack=" + this.stack + ", background=" + this.background + ", stickyFooter=" + this.stickyFooter + ')';
    }

    public PaywallComponentsConfig(StackComponent stackComponent, Background background2, StickyFooterComponent stickyFooterComponent) {
        C6496s.h(stackComponent, "stack");
        C6496s.h(background2, AppStateModule.APP_STATE_BACKGROUND);
        this.stack = stackComponent;
        this.background = background2;
        this.stickyFooter = stickyFooterComponent;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaywallComponentsConfig(StackComponent stackComponent, Background background2, StickyFooterComponent stickyFooterComponent, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(stackComponent, background2, (i10 & 4) != 0 ? null : stickyFooterComponent);
    }
}
