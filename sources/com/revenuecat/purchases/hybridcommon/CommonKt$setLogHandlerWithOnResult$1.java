package com.revenuecat.purchases.hybridcommon;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "logDetails", "Llf/M;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class CommonKt$setLogHandlerWithOnResult$1 extends C6498u implements C6798l {
    final /* synthetic */ OnResult $onResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonKt$setLogHandlerWithOnResult$1(OnResult onResult) {
        super(1);
        this.$onResult = onResult;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, String>) (Map) obj);
        return C6514M.f71813a;
    }

    public final void invoke(Map<String, String> map) {
        C6496s.h(map, "logDetails");
        this.$onResult.onReceived(map);
    }
}
