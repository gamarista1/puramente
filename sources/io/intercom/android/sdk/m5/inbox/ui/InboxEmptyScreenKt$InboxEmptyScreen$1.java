package io.intercom.android.sdk.m5.inbox.ui;

import Y.C1500m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.EmptyState;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import lf.C6535s;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class InboxEmptyScreenKt$InboxEmptyScreen$1 implements p {
    final /* synthetic */ EmptyState $emptyState;
    final /* synthetic */ C6787a $onActionButtonClick;
    final /* synthetic */ boolean $showActionButton;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|5|6|7|8|9|10|11|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
        static {
            /*
                io.intercom.android.sdk.m5.home.data.IconType[] r0 = io.intercom.android.sdk.m5.home.data.IconType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                io.intercom.android.sdk.m5.home.data.IconType r2 = io.intercom.android.sdk.m5.home.data.IconType.TEAMMATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                io.intercom.android.sdk.m5.home.data.IconType r3 = io.intercom.android.sdk.m5.home.data.IconType.BOT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.m5.home.data.IconType r3 = io.intercom.android.sdk.m5.home.data.IconType.FIN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.m5.home.data.IconType r3 = io.intercom.android.sdk.m5.home.data.IconType.FACE_PILE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r4 = 4
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                io.intercom.android.sdk.models.ActionType[] r0 = io.intercom.android.sdk.models.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.models.ActionType r3 = io.intercom.android.sdk.models.ActionType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x003c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                io.intercom.android.sdk.models.ActionType r1 = io.intercom.android.sdk.models.ActionType.HELP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$InboxEmptyScreen$1.WhenMappings.<clinit>():void");
        }
    }

    InboxEmptyScreenKt$InboxEmptyScreen$1(boolean z10, EmptyState emptyState, C6787a aVar) {
        this.$showActionButton = z10;
        this.$emptyState = emptyState;
        this.$onActionButtonClick = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        Integer valueOf;
        if ((i10 & 11) == 2 && mVar.i()) {
            mVar.I();
        } else if (this.$showActionButton) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[this.$emptyState.getAction().getType().ordinal()];
            if (i11 == 1) {
                mVar.T(1738022382);
                String label = this.$emptyState.getAction().getLabel();
                IconType icon = this.$emptyState.getAction().getIcon();
                int i12 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                if (i12 == 1) {
                    valueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
                } else if (i12 == 2 || i12 == 3 || i12 == 4) {
                    valueOf = Integer.valueOf(R.drawable.intercom_conversation_card_question);
                } else {
                    valueOf = null;
                }
                IntercomPrimaryButtonKt.IntercomPrimaryButton(label, (i) null, valueOf, this.$onActionButtonClick, mVar, 0, 2);
                mVar.M();
            } else if (i11 == 2) {
                mVar.T(1738038509);
                IntercomPrimaryButtonKt.IntercomPrimaryButton(this.$emptyState.getAction().getLabel(), (i) null, Integer.valueOf(R.drawable.intercom_article_book_icon), this.$onActionButtonClick, mVar, 0, 2);
                mVar.M();
            } else {
                mVar.T(1738020481);
                mVar.M();
                throw new C6535s();
            }
        }
    }
}
