package com.revenuecat.purchases.customercenter;

import gh.C5978b;
import gh.C5985i;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "customerCenter", "<init>", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "getCustomerCenter", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "getCustomerCenter$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterRoot {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final CustomerCenterConfigData customerCenter;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return CustomerCenterRoot$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ CustomerCenterRoot(int i10, CustomerCenterConfigData customerCenterConfigData, t0 t0Var) {
        if (1 != (i10 & 1)) {
            C6456i0.a(i10, 1, CustomerCenterRoot$$serializer.INSTANCE.getDescriptor());
        }
        this.customerCenter = customerCenterConfigData;
    }

    public static /* synthetic */ void getCustomerCenter$annotations() {
    }

    public final CustomerCenterConfigData getCustomerCenter() {
        return this.customerCenter;
    }

    public CustomerCenterRoot(CustomerCenterConfigData customerCenterConfigData) {
        C6496s.h(customerCenterConfigData, "customerCenter");
        this.customerCenter = customerCenterConfigData;
    }
}
