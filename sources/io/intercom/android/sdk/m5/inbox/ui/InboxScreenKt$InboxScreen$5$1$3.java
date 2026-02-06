package io.intercom.android.sdk.m5.inbox.ui;

import D.c;
import Y.C1500m;
import io.intercom.android.sdk.m5.inbox.states.InboxUiState;
import io.intercom.android.sdk.models.EmptyState;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import yf.C6787a;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InboxScreenKt$InboxScreen$5$1$3 implements q {
    final /* synthetic */ C6787a $onBrowseHelpCenterButtonClick;
    final /* synthetic */ C6787a $onSendMessageButtonClick;
    final /* synthetic */ InboxUiState $uiState;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.models.ActionType[] r0 = io.intercom.android.sdk.models.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.models.ActionType r1 = io.intercom.android.sdk.models.ActionType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.models.ActionType r1 = io.intercom.android.sdk.models.ActionType.HELP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$5$1$3.WhenMappings.<clinit>():void");
        }
    }

    InboxScreenKt$InboxScreen$5$1$3(InboxUiState inboxUiState, C6787a aVar, C6787a aVar2) {
        this.$uiState = inboxUiState;
        this.$onSendMessageButtonClick = aVar;
        this.$onBrowseHelpCenterButtonClick = aVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((c) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, C1500m mVar, int i10) {
        C6787a aVar;
        C6496s.h(cVar, "$this$item");
        if ((i10 & 14) == 0) {
            i10 |= mVar.S(cVar) ? 4 : 2;
        }
        if ((i10 & 91) != 18 || !mVar.i()) {
            EmptyState emptyState = ((InboxUiState.Empty) this.$uiState).getEmptyState();
            boolean showActionButton = ((InboxUiState.Empty) this.$uiState).getShowActionButton();
            int i11 = WhenMappings.$EnumSwitchMapping$0[((InboxUiState.Empty) this.$uiState).getEmptyState().getAction().getType().ordinal()];
            if (i11 == 1) {
                aVar = this.$onSendMessageButtonClick;
            } else if (i11 == 2) {
                aVar = this.$onBrowseHelpCenterButtonClick;
            } else {
                throw new C6535s();
            }
            InboxEmptyScreenKt.InboxEmptyScreen(emptyState, showActionButton, aVar, c.a(cVar, i.f23074a, 0.0f, 1, (Object) null), mVar, 0, 0);
            return;
        }
        mVar.I();
    }
}
