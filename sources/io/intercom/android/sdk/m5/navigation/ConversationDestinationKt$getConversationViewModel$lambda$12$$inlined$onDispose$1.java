package io.intercom.android.sdk.m5.navigation;

import Y.L;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/m5/navigation/ConversationDestinationKt$getConversationViewModel$lambda$12$$inlined$onDispose$1", "LY/L;", "Llf/M;", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConversationDestinationKt$getConversationViewModel$lambda$12$$inlined$onDispose$1 implements L {
    final /* synthetic */ C1798v $lifecycleOwner$inlined;
    final /* synthetic */ C1795s $observer$inlined;

    public ConversationDestinationKt$getConversationViewModel$lambda$12$$inlined$onDispose$1(C1798v vVar, C1795s sVar) {
        this.$lifecycleOwner$inlined = vVar;
        this.$observer$inlined = sVar;
    }

    public void dispose() {
        this.$lifecycleOwner$inlined.getLifecycle().d(this.$observer$inlined);
    }
}
