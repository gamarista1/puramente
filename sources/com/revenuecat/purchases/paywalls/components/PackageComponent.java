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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0005\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "packageId", "", "isSelectedByDefault", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(Ljava/lang/String;ZLcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLcom/revenuecat/purchases/paywalls/components/StackComponent;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/PackageComponent;Ljh/d;Lih/f;)V", "Ljava/lang/String;", "getPackageId", "()Ljava/lang/String;", "getPackageId$annotations", "()V", "Z", "()Z", "isSelectedByDefault$annotations", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PackageComponent implements PaywallComponent {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final boolean isSelectedByDefault;
    private final String packageId;
    private final StackComponent stack;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PackageComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PackageComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ PackageComponent(int i10, String str, boolean z10, StackComponent stackComponent, t0 t0Var) {
        if (7 != (i10 & 7)) {
            C6456i0.a(i10, 7, PackageComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.packageId = str;
        this.isSelectedByDefault = z10;
        this.stack = stackComponent;
    }

    public static /* synthetic */ void getPackageId$annotations() {
    }

    public static /* synthetic */ void isSelectedByDefault$annotations() {
    }

    public static final /* synthetic */ void write$Self(PackageComponent packageComponent, d dVar, f fVar) {
        dVar.t(fVar, 0, packageComponent.packageId);
        dVar.A(fVar, 1, packageComponent.isSelectedByDefault);
        dVar.B(fVar, 2, StackComponent$$serializer.INSTANCE, packageComponent.stack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageComponent)) {
            return false;
        }
        PackageComponent packageComponent = (PackageComponent) obj;
        return C6496s.c(this.packageId, packageComponent.packageId) && this.isSelectedByDefault == packageComponent.isSelectedByDefault && C6496s.c(this.stack, packageComponent.stack);
    }

    public final /* synthetic */ String getPackageId() {
        return this.packageId;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        return (((this.packageId.hashCode() * 31) + Boolean.hashCode(this.isSelectedByDefault)) * 31) + this.stack.hashCode();
    }

    public final /* synthetic */ boolean isSelectedByDefault() {
        return this.isSelectedByDefault;
    }

    public String toString() {
        return "PackageComponent(packageId=" + this.packageId + ", isSelectedByDefault=" + this.isSelectedByDefault + ", stack=" + this.stack + ')';
    }

    public PackageComponent(String str, boolean z10, StackComponent stackComponent) {
        C6496s.h(str, "packageId");
        C6496s.h(stackComponent, "stack");
        this.packageId = str;
        this.isSelectedByDefault = z10;
        this.stack = stackComponent;
    }
}
