package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.AmazonLWAConsentStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.C6535s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/AmazonLWAConsentStatus;", "it", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/AmazonLWAConsentStatus;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class CommonKt$getAmazonLWAConsentStatus$2 extends C6498u implements C6798l {
    final /* synthetic */ OnResultAny<Boolean> $onResult;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.revenuecat.purchases.AmazonLWAConsentStatus[] r0 = com.revenuecat.purchases.AmazonLWAConsentStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.AmazonLWAConsentStatus r1 = com.revenuecat.purchases.AmazonLWAConsentStatus.CONSENTED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.AmazonLWAConsentStatus r1 = com.revenuecat.purchases.AmazonLWAConsentStatus.UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.CommonKt$getAmazonLWAConsentStatus$2.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonKt$getAmazonLWAConsentStatus$2(OnResultAny<Boolean> onResultAny) {
        super(1);
        this.$onResult = onResultAny;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AmazonLWAConsentStatus) obj);
        return C6514M.f71813a;
    }

    public final void invoke(AmazonLWAConsentStatus amazonLWAConsentStatus) {
        C6496s.h(amazonLWAConsentStatus, "it");
        OnResultAny<Boolean> onResultAny = this.$onResult;
        int i10 = WhenMappings.$EnumSwitchMapping$0[amazonLWAConsentStatus.ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 == 2) {
                z10 = false;
            } else {
                throw new C6535s();
            }
        }
        onResultAny.onReceived(Boolean.valueOf(z10));
    }
}
