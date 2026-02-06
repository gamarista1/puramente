package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "tabIndex", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(IILcom/revenuecat/purchases/paywalls/components/StackComponent;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;Ljh/d;Lih/f;)V", "I", "getTabIndex", "()I", "getTabIndex$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class TabControlButtonComponent implements PaywallComponent {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final StackComponent stack;
    private final int tabIndex;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TabControlButtonComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return TabControlButtonComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ TabControlButtonComponent(int i10, int i11, StackComponent stackComponent, t0 t0Var) {
        if (3 != (i10 & 3)) {
            C6456i0.a(i10, 3, TabControlButtonComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.tabIndex = i11;
        this.stack = stackComponent;
    }

    public static /* synthetic */ void getTabIndex$annotations() {
    }

    public static final /* synthetic */ void write$Self(TabControlButtonComponent tabControlButtonComponent, d dVar, f fVar) {
        dVar.i(fVar, 0, tabControlButtonComponent.tabIndex);
        dVar.B(fVar, 1, StackComponent$$serializer.INSTANCE, tabControlButtonComponent.stack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabControlButtonComponent)) {
            return false;
        }
        TabControlButtonComponent tabControlButtonComponent = (TabControlButtonComponent) obj;
        return this.tabIndex == tabControlButtonComponent.tabIndex && C6496s.c(this.stack, tabControlButtonComponent.stack);
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public final /* synthetic */ int getTabIndex() {
        return this.tabIndex;
    }

    public int hashCode() {
        return (Integer.hashCode(this.tabIndex) * 31) + this.stack.hashCode();
    }

    public String toString() {
        return "TabControlButtonComponent(tabIndex=" + this.tabIndex + ", stack=" + this.stack + ')';
    }

    public TabControlButtonComponent(int i10, StackComponent stackComponent) {
        C6496s.h(stackComponent, "stack");
        this.tabIndex = i10;
        this.stack = stackComponent;
    }
}
