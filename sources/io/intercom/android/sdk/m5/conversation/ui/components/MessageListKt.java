package io.intercom.android.sdk.m5.conversation.ui.components;

import H0.C1197s;
import H0.C1198t;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import V.B0;
import Y.A1;
import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.o;
import c1.d;
import c1.h;
import c1.s;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import q0.C2423i;
import qf.C6658d;
import qf.g;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aå\u0001\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00072\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0017*\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\tH\u0001¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\tH\u0003¢\u0006\u0004\b(\u0010'\"\u0014\u0010)\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010+\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010*\"\u0014\u0010,\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010*\"\u0014\u0010-\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010*¨\u00065²\u0006\f\u0010/\u001a\u00020.8\nX\u0002²\u0006\u000e\u00101\u001a\u0002008\n@\nX\u0002²\u0006\u000e\u00102\u001a\u0002008\n@\nX\u0002²\u0006\u000e\u00103\u001a\u00020\u00178\n@\nX\u0002²\u0006\u000e\u00104\u001a\u00020\u00178\n@\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "contentRows", "Landroidx/compose/foundation/o;", "scrollState", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "Llf/M;", "onSuggestionClick", "Lio/intercom/android/sdk/models/ReplyOption;", "onReplyClicked", "Lio/intercom/android/sdk/models/Part;", "onRetryMessageClicked", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "onRetryImageClicked", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "onSubmitAttribute", "Lkotlin/Function0;", "navigateToTicketDetail", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "onCreateTicket", "", "addComposerPadding", "", "navigateToAnotherConversation", "MessageList", "(Lk0/i;Ljava/util/List;Landroidx/compose/foundation/o;Lyf/l;Lyf/l;Lyf/l;Lyf/l;Lyf/l;Lyf/a;Lyf/l;ZLyf/l;LY/m;III)V", "contentRow", "", "contentRowIndex", "allContentRows", "Lc1/h;", "gapWithPrevious", "(Lio/intercom/android/sdk/m5/conversation/states/ContentRow;ILjava/util/List;)F", "isAtBottom", "(Landroidx/compose/foundation/o;)Z", "MessageListPreview", "(LY/m;I)V", "EmptyMessageListPreview", "GroupedMessageGap", "F", "DefaultMessageGap", "BigMessageGap", "LargeMessageGap", "Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "keyboardAsState", "Lio/intercom/android/sdk/m5/conversation/ui/components/MessageListCoordinates;", "oldBounds", "currentBounds", "autoScrollEnabled", "hasUserScrolled", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MessageListKt {
    private static final float BigMessageGap = h.j((float) 24);
    private static final float DefaultMessageGap = h.j((float) 16);
    private static final float GroupedMessageGap = h.j((float) 2);
    private static final float LargeMessageGap = h.j((float) 32);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                io.intercom.android.sdk.m5.conversation.states.GroupingPosition[] r0 = io.intercom.android.sdk.m5.conversation.states.GroupingPosition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.m5.conversation.states.GroupingPosition r1 = io.intercom.android.sdk.m5.conversation.states.GroupingPosition.STANDALONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.m5.conversation.states.GroupingPosition r1 = io.intercom.android.sdk.m5.conversation.states.GroupingPosition.TOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.m5.conversation.states.GroupingPosition r1 = io.intercom.android.sdk.m5.conversation.states.GroupingPosition.MIDDLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.m5.conversation.states.GroupingPosition r1 = io.intercom.android.sdk.m5.conversation.states.GroupingPosition.BOTTOM     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt.WhenMappings.<clinit>():void");
        }
    }

    @IntercomPreviews
    private static final void EmptyMessageListPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1882438622);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$MessageListKt.INSTANCE.m241getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6113f0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyMessageListPreview$lambda$41(int i10, C1500m mVar, int i11) {
        EmptyMessageListPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v87, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$11$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: w.V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v88, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v27, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.k0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v71, resolved type: w.V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v28, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$11$1} */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r12v38 */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0280, code lost:
        if (r12 == Y.C1500m.f10026a.a()) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0812, code lost:
        if (r12 == Y.C1500m.f10026a.a()) goto L_0x0814;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x09b8  */
    /* JADX WARNING: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0232  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void MessageList(k0.i r42, java.util.List<? extends io.intercom.android.sdk.m5.conversation.states.ContentRow> r43, androidx.compose.foundation.o r44, yf.C6798l r45, yf.C6798l r46, yf.C6798l r47, yf.C6798l r48, yf.C6798l r49, yf.C6787a r50, yf.C6798l r51, boolean r52, yf.C6798l r53, Y.C1500m r54, int r55, int r56, int r57) {
        /*
            r2 = r43
            r13 = r55
            r15 = r57
            java.lang.String r0 = "contentRows"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = -1179478101(0xffffffffb9b297ab, float:-3.4063807E-4)
            r1 = r54
            Y.m r0 = r1.h(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x001b
            k0.i$a r1 = k0.i.f23074a
            goto L_0x001d
        L_0x001b:
            r1 = r42
        L_0x001d:
            r3 = r15 & 4
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x002a
            androidx.compose.foundation.o r3 = androidx.compose.foundation.m.a(r4, r0, r4, r5)
            r6 = r13 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x002d
        L_0x002a:
            r3 = r44
            r6 = r13
        L_0x002d:
            r7 = r15 & 8
            if (r7 == 0) goto L_0x0037
            io.intercom.android.sdk.m5.conversation.ui.components.m0 r7 = new io.intercom.android.sdk.m5.conversation.ui.components.m0
            r7.<init>()
            goto L_0x0039
        L_0x0037:
            r7 = r45
        L_0x0039:
            r8 = r15 & 16
            if (r8 == 0) goto L_0x0043
            io.intercom.android.sdk.m5.conversation.ui.components.r0 r8 = new io.intercom.android.sdk.m5.conversation.ui.components.r0
            r8.<init>()
            goto L_0x0045
        L_0x0043:
            r8 = r46
        L_0x0045:
            r9 = r15 & 32
            if (r9 == 0) goto L_0x004f
            io.intercom.android.sdk.m5.conversation.ui.components.s0 r9 = new io.intercom.android.sdk.m5.conversation.ui.components.s0
            r9.<init>()
            goto L_0x0051
        L_0x004f:
            r9 = r47
        L_0x0051:
            r10 = r15 & 64
            if (r10 == 0) goto L_0x005b
            io.intercom.android.sdk.m5.conversation.ui.components.t0 r10 = new io.intercom.android.sdk.m5.conversation.ui.components.t0
            r10.<init>()
            goto L_0x005d
        L_0x005b:
            r10 = r48
        L_0x005d:
            r11 = r15 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0067
            io.intercom.android.sdk.m5.conversation.ui.components.u0 r11 = new io.intercom.android.sdk.m5.conversation.ui.components.u0
            r11.<init>()
            goto L_0x0069
        L_0x0067:
            r11 = r49
        L_0x0069:
            r12 = r15 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0073
            io.intercom.android.sdk.m5.conversation.ui.components.g0 r12 = new io.intercom.android.sdk.m5.conversation.ui.components.g0
            r12.<init>()
            goto L_0x0075
        L_0x0073:
            r12 = r50
        L_0x0075:
            r14 = r15 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x007f
            io.intercom.android.sdk.m5.conversation.ui.components.h0 r14 = new io.intercom.android.sdk.m5.conversation.ui.components.h0
            r14.<init>()
            goto L_0x0081
        L_0x007f:
            r14 = r51
        L_0x0081:
            r5 = r15 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0088
            r16 = r4
            goto L_0x008a
        L_0x0088:
            r16 = r52
        L_0x008a:
            r5 = r15 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0096
            io.intercom.android.sdk.m5.conversation.ui.components.i0 r5 = new io.intercom.android.sdk.m5.conversation.ui.components.i0
            r5.<init>()
            r17 = r5
            goto L_0x0098
        L_0x0096:
            r17 = r53
        L_0x0098:
            Y.I0 r5 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r5 = r0.m(r5)
            android.content.Context r5 = (android.content.Context) r5
            Y.I0 r4 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r4 = r0.m(r4)
            c1.d r4 = (c1.d) r4
            java.lang.Object r15 = r0.A()
            Y.m$a r18 = Y.C1500m.f10026a
            r19 = r4
            java.lang.Object r4 = r18.a()
            if (r15 != r4) goto L_0x00c8
            qf.h r4 = qf.h.f72645a
            Ug.K r4 = Y.P.j(r4, r0)
            Y.B r15 = new Y.B
            r15.<init>(r4)
            r0.r(r15)
        L_0x00c8:
            Y.B r15 = (Y.B) r15
            Ug.K r4 = r15.a()
            r20 = r4
            r15 = 0
            Y.A1 r4 = io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt.keyboardAsState(r0, r15)
            r15 = 1713746915(0x6625b3e3, float:1.956272E23)
            r0.T(r15)
            java.lang.Object r15 = r0.A()
            r21 = r5
            java.lang.Object r5 = r18.a()
            r22 = r12
            r12 = 0
            if (r15 != r5) goto L_0x010d
            io.intercom.android.sdk.m5.conversation.ui.components.MessageListCoordinates r5 = new io.intercom.android.sdk.m5.conversation.ui.components.MessageListCoordinates
            r15 = 7
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r44 = r5
            r45 = r25
            r46 = r26
            r47 = r27
            r49 = r15
            r50 = r24
            r44.<init>(r45, r46, r47, r49, r50)
            r15 = 2
            Y.r0 r5 = Y.u1.d(r5, r12, r15, r12)
            r0.r(r5)
            r15 = r5
        L_0x010d:
            r5 = r15
            Y.r0 r5 = (Y.C1510r0) r5
            r0.M()
            r15 = 1713750755(0x6625c2e3, float:1.9569637E23)
            r0.T(r15)
            java.lang.Object r15 = r0.A()
            java.lang.Object r12 = r18.a()
            if (r15 != r12) goto L_0x014a
            io.intercom.android.sdk.m5.conversation.ui.components.MessageListCoordinates r12 = new io.intercom.android.sdk.m5.conversation.ui.components.MessageListCoordinates
            r15 = 7
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r44 = r12
            r45 = r26
            r46 = r27
            r47 = r28
            r49 = r15
            r50 = r25
            r44.<init>(r45, r46, r47, r49, r50)
            r25 = r8
            r8 = 0
            r15 = 2
            Y.r0 r12 = Y.u1.d(r12, r8, r15, r8)
            r0.r(r12)
            r15 = r12
            goto L_0x014c
        L_0x014a:
            r25 = r8
        L_0x014c:
            Y.r0 r15 = (Y.C1510r0) r15
            r0.M()
            r8 = 1713758063(0x6625df6f, float:1.9582802E23)
            r0.T(r8)
            java.lang.Object r8 = r0.A()
            java.lang.Object r12 = r18.a()
            if (r8 != r12) goto L_0x016f
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r26 = r7
            r7 = 0
            r12 = 2
            Y.r0 r8 = Y.u1.d(r8, r7, r12, r7)
            r0.r(r8)
            goto L_0x0171
        L_0x016f:
            r26 = r7
        L_0x0171:
            Y.r0 r8 = (Y.C1510r0) r8
            r0.M()
            r7 = 1713764528(0x6625f8b0, float:1.9594449E23)
            r0.T(r7)
            java.lang.Object r7 = r0.A()
            java.lang.Object r12 = r18.a()
            if (r7 != r12) goto L_0x0194
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r18 = r6
            r6 = 0
            r12 = 2
            Y.r0 r7 = Y.u1.d(r7, r6, r12, r6)
            r0.r(r7)
            goto L_0x0196
        L_0x0194:
            r18 = r6
        L_0x0196:
            Y.r0 r7 = (Y.C1510r0) r7
            r0.M()
            r6 = r2
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r12 = r6 instanceof java.util.Collection
            if (r12 == 0) goto L_0x01ae
            r12 = r6
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x01ae
        L_0x01ab:
            r27 = 0
            goto L_0x01cc
        L_0x01ae:
            java.util.Iterator r12 = r6.iterator()
        L_0x01b2:
            boolean r27 = r12.hasNext()
            if (r27 == 0) goto L_0x01ab
            java.lang.Object r27 = r12.next()
            r44 = r12
            r12 = r27
            io.intercom.android.sdk.m5.conversation.states.ContentRow r12 = (io.intercom.android.sdk.m5.conversation.states.ContentRow) r12
            boolean r12 = r12 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.FinStreamingRow
            if (r12 == 0) goto L_0x01c9
            r27 = 1
            goto L_0x01cc
        L_0x01c9:
            r12 = r44
            goto L_0x01b2
        L_0x01cc:
            r12 = 1713770490(0x66260ffa, float:1.9605189E23)
            r0.T(r12)
            r12 = r13 & 896(0x380, float:1.256E-42)
            r12 = r12 ^ 384(0x180, float:5.38E-43)
            r28 = r9
            r9 = 256(0x100, float:3.59E-43)
            if (r12 <= r9) goto L_0x01e6
            boolean r29 = r0.S(r3)
            if (r29 != 0) goto L_0x01e3
            goto L_0x01e6
        L_0x01e3:
            r29 = r14
            goto L_0x01ec
        L_0x01e6:
            r29 = r14
            r14 = r13 & 384(0x180, float:5.38E-43)
            if (r14 != r9) goto L_0x01ee
        L_0x01ec:
            r14 = 1
            goto L_0x01ef
        L_0x01ee:
            r14 = 0
        L_0x01ef:
            java.lang.Object r9 = r0.A()
            if (r14 != 0) goto L_0x01fd
            Y.m$a r14 = Y.C1500m.f10026a
            java.lang.Object r14 = r14.a()
            if (r9 != r14) goto L_0x0206
        L_0x01fd:
            io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$9$1 r9 = new io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$9$1
            r14 = 0
            r9.<init>(r3, r8, r7, r14)
            r0.r(r9)
        L_0x0206:
            yf.p r9 = (yf.p) r9
            r0.M()
            java.lang.String r14 = ""
            r30 = r10
            r10 = 70
            Y.P.g(r14, r9, r0, r10)
            B.j r9 = r3.k()
            Xg.f r9 = r9.c()
            r14 = 1713791690(0x662662ca, float:1.964338E23)
            r0.T(r14)
            r14 = 256(0x100, float:3.59E-43)
            if (r12 <= r14) goto L_0x022c
            boolean r31 = r0.S(r3)
            if (r31 != 0) goto L_0x0230
        L_0x022c:
            r10 = r13 & 384(0x180, float:5.38E-43)
            if (r10 != r14) goto L_0x0232
        L_0x0230:
            r10 = 1
            goto L_0x0233
        L_0x0232:
            r10 = 0
        L_0x0233:
            java.lang.Object r14 = r0.A()
            if (r10 != 0) goto L_0x0241
            Y.m$a r10 = Y.C1500m.f10026a
            java.lang.Object r10 = r10.a()
            if (r14 != r10) goto L_0x024a
        L_0x0241:
            io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$10$1 r14 = new io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$10$1
            r10 = 0
            r14.<init>(r3, r7, r10)
            r0.r(r14)
        L_0x024a:
            yf.p r14 = (yf.p) r14
            r0.M()
            r10 = 72
            Y.P.g(r9, r14, r0, r10)
            io.intercom.android.sdk.m5.conversation.ui.components.MessageListCoordinates r9 = MessageList$lambda$13(r15)
            r10 = 1713814881(0x6626bd61, float:1.9685157E23)
            r0.T(r10)
            r10 = 256(0x100, float:3.59E-43)
            if (r12 <= r10) goto L_0x0268
            boolean r12 = r0.S(r3)
            if (r12 != 0) goto L_0x026c
        L_0x0268:
            r12 = r13 & 384(0x180, float:5.38E-43)
            if (r12 != r10) goto L_0x026e
        L_0x026c:
            r10 = 1
            goto L_0x026f
        L_0x026e:
            r10 = 0
        L_0x026f:
            boolean r12 = r0.S(r4)
            r10 = r10 | r12
            java.lang.Object r12 = r0.A()
            if (r10 != 0) goto L_0x0282
            Y.m$a r10 = Y.C1500m.f10026a
            java.lang.Object r10 = r10.a()
            if (r12 != r10) goto L_0x029b
        L_0x0282:
            io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$11$1 r12 = new io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$11$1
            r10 = 0
            r44 = r12
            r45 = r3
            r46 = r5
            r47 = r15
            r48 = r4
            r49 = r7
            r50 = r8
            r51 = r10
            r44.<init>(r45, r46, r47, r48, r49, r50, r51)
            r0.r(r12)
        L_0x029b:
            yf.p r12 = (yf.p) r12
            r0.M()
            r4 = 64
            Y.P.g(r9, r12, r0, r4)
            r4 = 0
            r5 = 1
            r9 = 0
            k0.i r10 = androidx.compose.foundation.layout.q.f(r1, r4, r5, r9)
            r5 = 6
            r9 = 0
            r12 = 0
            r14 = 0
            r32 = 0
            r44 = r10
            r45 = r3
            r46 = r12
            r47 = r14
            r48 = r32
            r49 = r5
            r50 = r9
            k0.i r5 = androidx.compose.foundation.m.d(r44, r45, r46, r47, r48, r49, r50)
            r9 = 16
            float r9 = (float) r9
            float r10 = c1.h.j(r9)
            if (r16 == 0) goto L_0x02d2
            float r12 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt.getComposerHalfSize()
            goto L_0x02d8
        L_0x02d2:
            r12 = 0
            float r14 = (float) r12
            float r12 = c1.h.j(r14)
        L_0x02d8:
            float r10 = r10 + r12
            float r10 = c1.h.j(r10)
            r12 = 7
            r14 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r44 = r5
            r45 = r32
            r46 = r33
            r47 = r34
            r48 = r10
            r49 = r12
            r50 = r14
            k0.i r5 = androidx.compose.foundation.layout.n.m(r44, r45, r46, r47, r48, r49, r50)
            r10 = 1713858862(0x6627692e, float:1.9764386E23)
            r0.T(r10)
            java.lang.Object r10 = r0.A()
            Y.m$a r12 = Y.C1500m.f10026a
            java.lang.Object r12 = r12.a()
            if (r10 != r12) goto L_0x0311
            io.intercom.android.sdk.m5.conversation.ui.components.j0 r10 = new io.intercom.android.sdk.m5.conversation.ui.components.j0
            r10.<init>(r15)
            r0.r(r10)
        L_0x0311:
            yf.l r10 = (yf.C6798l) r10
            r0.M()
            k0.i r5 = androidx.compose.ui.layout.c.a(r5, r10)
            C.c r10 = C.C1085c.f882a
            C.c$m r10 = r10.g()
            k0.c$a r12 = k0.c.f23044a
            k0.c$b r12 = r12.g()
            r14 = 54
            H0.F r10 = C.C1090h.a(r10, r12, r0, r14)
            r12 = 0
            int r32 = Y.C1494j.a(r0, r12)
            Y.y r12 = r0.p()
            k0.i r5 = k0.h.e(r0, r5)
            J0.g$a r33 = J0.C1241g.f3853J
            yf.a r4 = r33.a()
            Y.f r35 = r0.j()
            if (r35 != 0) goto L_0x0348
            Y.C1494j.c()
        L_0x0348:
            r0.F()
            boolean r35 = r0.f()
            if (r35 == 0) goto L_0x0355
            r0.U(r4)
            goto L_0x0358
        L_0x0355:
            r0.q()
        L_0x0358:
            Y.m r4 = Y.F1.a(r0)
            yf.p r14 = r33.c()
            Y.F1.b(r4, r10, r14)
            yf.p r10 = r33.e()
            Y.F1.b(r4, r12, r10)
            yf.p r10 = r33.b()
            boolean r12 = r4.f()
            if (r12 != 0) goto L_0x0382
            java.lang.Object r12 = r4.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r32)
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r14)
            if (r12 != 0) goto L_0x0390
        L_0x0382:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r32)
            r4.r(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r32)
            r4.V(r12, r10)
        L_0x0390:
            yf.p r10 = r33.d()
            Y.F1.b(r4, r5, r10)
            C.k r4 = C.C1093k.f978a
            r5 = 1314343050(0x4e57488a, float:9.0296384E8)
            r0.T(r5)
            java.util.Iterator r5 = r6.iterator()
            r6 = 0
        L_0x03a4:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0989
            java.lang.Object r10 = r5.next()
            int r12 = r6 + 1
            if (r6 >= 0) goto L_0x03b5
            mf.C6565s.x()
        L_0x03b5:
            io.intercom.android.sdk.m5.conversation.states.ContentRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow) r10
            float r6 = gapWithPrevious(r10, r6, r2)
            k0.i$a r14 = k0.i.f23074a
            k0.i r2 = androidx.compose.foundation.layout.q.i(r14, r6)
            r32 = r5
            r5 = 0
            C.a0.a(r2, r0, r5)
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.BubbleMessageRow
            if (r2 == 0) goto L_0x04a3
            r2 = 39536478(0x25b475e, float:1.611006E-37)
            r0.T(r2)
            io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$13$1$renderMessageRow$1 r2 = new io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$13$1$renderMessageRow$1
            r44 = r2
            r45 = r10
            r46 = r11
            r47 = r30
            r48 = r29
            r49 = r28
            r44.<init>(r45, r46, r47, r48, r49)
            r6 = -98621052(0xfffffffffa1f2984, float:-2.066043E35)
            r5 = 54
            r14 = 1
            g0.a r2 = g0.c.e(r6, r14, r2, r0, r5)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.BubbleMessageRow) r10
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow$PartWrapper r5 = r10.getPartWrapper()
            io.intercom.android.sdk.models.Part r5 = r5.getPart()
            io.intercom.android.sdk.models.Part$MessageState r5 = r5.getMessageState()
            io.intercom.android.sdk.models.Part$MessageState r6 = io.intercom.android.sdk.models.Part.MessageState.SENDING
            r14 = 6
            if (r5 != r6) goto L_0x047e
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BubbleMessageRow$PartWrapper r5 = r10.getPartWrapper()
            boolean r5 = r5.isLastPart()
            if (r5 == 0) goto L_0x047e
            r5 = 41151051(0x273ea4b, float:1.7920059E-37)
            r0.T(r5)
            r5 = 1940991079(0x73b12c67, float:2.8074253E31)
            r0.T(r5)
            java.lang.Object r5 = r0.A()
            Y.m$a r6 = Y.C1500m.f10026a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x0430
            w.V r5 = new w.V
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.<init>(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.h(r6)
            r0.r(r5)
        L_0x0430:
            w.V r5 = (w.C2777V) r5
            r0.M()
            r6 = 300(0x12c, float:4.2E-43)
            r33 = r12
            r10 = 0
            r12 = 0
            w.q0 r6 = w.C2798j.j(r6, r10, r12, r14, r12)
            r10 = 2
            r14 = 0
            androidx.compose.animation.i r6 = androidx.compose.animation.g.o(r6, r14, r10, r12)
            io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$13$1$1 r10 = new io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$13$1$1
            r10.<init>(r2)
            r2 = -1982221804(0xffffffff89d9b214, float:-5.2408314E-33)
            r12 = 1
            r14 = 54
            g0.a r2 = g0.c.e(r2, r12, r10, r0, r14)
            int r10 = w.C2777V.f27247d
            r12 = 3
            int r10 = r10 << r12
            r12 = 1575942(0x180c06, float:2.208365E-39)
            r10 = r10 | r12
            r12 = 26
            r14 = 0
            r36 = 0
            r37 = 0
            r44 = r4
            r45 = r5
            r46 = r14
            r47 = r6
            r48 = r36
            r49 = r37
            r50 = r2
            r51 = r0
            r52 = r10
            r53 = r12
            v.C2721d.d(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r0.M()
            goto L_0x0490
        L_0x047e:
            r33 = r12
            r5 = 41784660(0x27d9554, float:1.863036E-37)
            r0.T(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r2.invoke(r0, r5)
            r0.M()
        L_0x0490:
            r0.M()
        L_0x0493:
            r36 = r1
            r2 = r19
            r5 = r21
            r21 = r25
            r6 = 54
            r12 = 0
            r25 = r11
            r11 = 1
            goto L_0x0966
        L_0x04a3:
            r33 = r12
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.PostCardRow
            if (r2 == 0) goto L_0x04d0
            r2 = 41917898(0x27f9dca, float:1.8779724E-37)
            r0.T(r2)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$PostCardRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.PostCardRow) r10
            io.intercom.android.sdk.models.Part r2 = r10.getPart()
            java.lang.String r5 = r10.getCompanyName()
            r6 = 64
            r10 = 1
            r12 = 0
            r44 = r12
            r45 = r2
            r46 = r5
            r47 = r0
            r48 = r6
            r49 = r10
            io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt.PostCardRow(r44, r45, r46, r47, r48, r49)
            r0.M()
            goto L_0x0493
        L_0x04d0:
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.NoteCardRow
            if (r2 == 0) goto L_0x04fb
            r2 = 42135146(0x282ee6a, float:1.9238626E-37)
            r0.T(r2)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$NoteCardRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.NoteCardRow) r10
            io.intercom.android.sdk.models.Part r2 = r10.getPart()
            java.lang.String r5 = r10.getCompanyName()
            r6 = 64
            r10 = 1
            r12 = 0
            r44 = r12
            r45 = r2
            r46 = r5
            r47 = r0
            r48 = r6
            r49 = r10
            io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt.NoteCardRow(r44, r45, r46, r47, r48, r49)
            r0.M()
            goto L_0x0493
        L_0x04fb:
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.SpecialNoticeRow
            r5 = 48
            if (r2 == 0) goto L_0x0538
            r2 = 42376884(0x2869eb4, float:1.9780622E-37)
            r0.T(r2)
            float r2 = c1.h.j(r9)
            float r6 = c1.h.j(r9)
            r12 = 10
            r36 = 0
            r37 = 0
            r38 = 0
            r44 = r14
            r45 = r2
            r46 = r37
            r47 = r6
            r48 = r38
            r49 = r12
            r50 = r36
            k0.i r2 = androidx.compose.foundation.layout.n.m(r44, r45, r46, r47, r48, r49, r50)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$SpecialNoticeRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.SpecialNoticeRow) r10
            java.lang.String r6 = r10.getMessage()
            r10 = 0
            io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt.SpecialNotice(r6, r2, r0, r5, r10)
            r0.M()
            goto L_0x0493
        L_0x0538:
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.TeamIntroRow
            if (r2 == 0) goto L_0x0573
            r2 = 42586320(0x289d0d0, float:2.0250193E-37)
            r0.T(r2)
            float r2 = c1.h.j(r9)
            float r6 = c1.h.j(r9)
            r12 = 10
            r36 = 0
            r37 = 0
            r38 = 0
            r44 = r14
            r45 = r2
            r46 = r37
            r47 = r6
            r48 = r38
            r49 = r12
            r50 = r36
            k0.i r2 = androidx.compose.foundation.layout.n.m(r44, r45, r46, r47, r48, r49, r50)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$TeamIntroRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.TeamIntroRow) r10
            java.lang.String r6 = r10.getMessage()
            r10 = 0
            io.intercom.android.sdk.m5.conversation.ui.components.row.TeamIntroKt.TeamIntro(r6, r2, r0, r5, r10)
            r0.M()
            goto L_0x0493
        L_0x0573:
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.ComposerSuggestionRow
            if (r2 == 0) goto L_0x05c8
            r2 = 42845728(0x28dc620, float:2.0831806E-37)
            r0.T(r2)
            r2 = 2
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r44 = r4
            r45 = r14
            r46 = r6
            r47 = r12
            r48 = r2
            r49 = r5
            k0.i r2 = C.C1092j.c(r44, r45, r46, r47, r48, r49)
            r5 = 0
            C.a0.a(r2, r0, r5)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$ComposerSuggestionRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.ComposerSuggestionRow) r10
            java.util.List r2 = r10.getSuggestions()
            r5 = 1
            r6 = 0
            r10 = 0
            k0.i r12 = androidx.compose.foundation.layout.q.h(r14, r10, r5, r6)
            float r5 = c1.h.j(r9)
            r14 = 2
            k0.i r5 = androidx.compose.foundation.layout.n.k(r12, r5, r10, r14, r6)
            int r6 = r18 >> 3
            r6 = r6 & 896(0x380, float:1.256E-42)
            r10 = 70
            r6 = r6 | r10
            r10 = 0
            r44 = r5
            r45 = r2
            r46 = r26
            r47 = r0
            r48 = r6
            r49 = r10
            io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt.ComposerSuggestions(r44, r45, r46, r47, r48, r49)
            r0.M()
            goto L_0x0493
        L_0x05c8:
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.QuickRepliesRow
            if (r2 == 0) goto L_0x060f
            r2 = 43294453(0x2949ef5, float:2.1837882E-37)
            r0.T(r2)
            r2 = 2
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r44 = r4
            r45 = r14
            r46 = r6
            r47 = r12
            r48 = r2
            r49 = r5
            k0.i r2 = C.C1092j.c(r44, r45, r46, r47, r48, r49)
            r5 = 0
            C.a0.a(r2, r0, r5)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$QuickRepliesRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.QuickRepliesRow) r10
            java.util.List r2 = r10.getReplyOptions()
            int r5 = r18 >> 9
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | 8
            r12 = r25
            io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt.AnimatedQuickReplies(r2, r12, r0, r5)
            r0.M()
        L_0x05ff:
            r36 = r1
            r25 = r11
        L_0x0603:
            r2 = r19
            r5 = r21
            r6 = 54
            r11 = 1
            r21 = r12
        L_0x060c:
            r12 = 0
            goto L_0x0966
        L_0x060f:
            r12 = r25
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.DayDividerRow
            if (r2 == 0) goto L_0x0640
            r2 = 1941069609(0x73b25f29, float:2.8264127E31)
            r0.T(r2)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$DayDividerRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.DayDividerRow) r10
            long r5 = r10.getTimestamp()
            Y.I0 r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r2 = r0.m(r2)
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r2 = io.intercom.android.sdk.utilities.TimeFormatterExtKt.formattedDateForDayDivider(r5, r2)
            r5 = 1
            r6 = 0
            r10 = 0
            k0.i r14 = androidx.compose.foundation.layout.q.h(r14, r10, r5, r6)
            r5 = 0
            r6 = 48
            io.intercom.android.sdk.m5.conversation.ui.components.row.DayDividerKt.DayDivider(r2, r14, r0, r6, r5)
            r0.M()
            goto L_0x05ff
        L_0x0640:
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.BigTicketRow
            if (r2 == 0) goto L_0x066f
            r2 = 43852701(0x29d239d, float:2.3089518E-37)
            r0.T(r2)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$BigTicketRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.BigTicketRow) r10
            io.intercom.android.sdk.tickets.TicketDetailState$TicketDetailContentState r2 = r10.getTicketDetailContentState()
            int r5 = r18 >> 21
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | 392(0x188, float:5.5E-43)
            r6 = 8
            r10 = 1
            r14 = 0
            r44 = r2
            r45 = r22
            r46 = r10
            r47 = r14
            r48 = r0
            r49 = r5
            r50 = r6
            io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt.BigTicketCard(r44, r45, r46, r47, r48, r49, r50)
            r0.M()
            goto L_0x05ff
        L_0x066f:
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.AskedAboutRow
            if (r2 == 0) goto L_0x06a1
            r2 = 44147015(0x2a1a147, float:2.3749392E-37)
            r0.T(r2)
            r2 = 1
            r5 = 0
            r6 = 0
            k0.i r14 = androidx.compose.foundation.layout.q.h(r14, r6, r2, r5)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$AskedAboutRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.AskedAboutRow) r10
            io.intercom.android.sdk.models.Part r10 = r10.getPart()
            r2 = 70
            r6 = 0
            io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt.AskedAboutRow(r14, r10, r0, r2, r6)
            r0.M()
            r36 = r1
            r25 = r11
            r2 = r19
            r6 = 54
            r11 = 1
            r41 = r12
            r12 = r5
            r5 = r21
            r21 = r41
            goto L_0x0966
        L_0x06a1:
            r5 = 0
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.EventRow
            if (r2 == 0) goto L_0x06de
            r2 = 44399045(0x2a579c5, float:2.4314463E-37)
            r0.T(r2)
            r2 = 1
            r6 = 0
            k0.i r14 = androidx.compose.foundation.layout.q.h(r14, r6, r2, r5)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$EventRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.EventRow) r10
            java.lang.String r2 = r10.getLabel()
            io.intercom.android.sdk.m5.components.avatar.AvatarWrapper r6 = new io.intercom.android.sdk.m5.components.avatar.AvatarWrapper
            io.intercom.android.sdk.models.Avatar r10 = r10.getAvatar()
            r25 = r11
            r11 = 2
            r13 = 0
            r6.<init>(r10, r13, r11, r5)
            r5 = 518(0x206, float:7.26E-43)
            r10 = 0
            r44 = r14
            r45 = r2
            r46 = r6
            r47 = r0
            r48 = r5
            r49 = r10
            io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt.EventRow(r44, r45, r46, r47, r48, r49)
            r0.M()
            r36 = r1
            goto L_0x0603
        L_0x06de:
            r25 = r11
            boolean r2 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.TicketStatusRow
            if (r2 == 0) goto L_0x073c
            r2 = 44757777(0x2aaf311, float:2.5118768E-37)
            r0.T(r2)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$TicketStatusRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.TicketStatusRow) r10
            java.lang.String r2 = r10.getTicketEventStatus()
            java.lang.String r5 = r10.getTicketStatusText()
            r13 = r12
            long r11 = r10.getCreatedAt()
            r6 = r21
            java.lang.String r11 = io.intercom.android.sdk.utilities.TimeFormatterExtKt.formattedDateFromLong(r11, r6)
            float r12 = c1.h.j(r9)
            r36 = r1
            r23 = r6
            r21 = r13
            r1 = 0
            r6 = 0
            r13 = 2
            k0.i r12 = androidx.compose.foundation.layout.n.k(r14, r12, r1, r13, r6)
            java.lang.String r1 = r10.getCustomStateLabel()
            java.lang.String r6 = r10.getCustomStatePrefix()
            r10 = 3072(0xc00, float:4.305E-42)
            r14 = 0
            r44 = r2
            r45 = r5
            r46 = r11
            r47 = r12
            r48 = r1
            r49 = r6
            r50 = r0
            r51 = r10
            r52 = r14
            io.intercom.android.sdk.m5.conversation.ui.components.row.TicketStatusRowKt.TicketStatusRow(r44, r45, r46, r47, r48, r49, r50, r51, r52)
            r0.M()
            r2 = r19
            r5 = r23
        L_0x0737:
            r6 = 54
        L_0x0739:
            r11 = 1
            goto L_0x060c
        L_0x073c:
            r36 = r1
            r5 = r21
            r13 = 2
            r21 = r12
            boolean r1 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.MergedConversationRow
            if (r1 == 0) goto L_0x078e
            r1 = 45293488(0x2b31fb0, float:2.6319874E-37)
            r0.T(r1)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$MergedConversationRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.MergedConversationRow) r10
            java.lang.String r1 = r10.getDescription()
            if (r1 == 0) goto L_0x0788
            int r1 = r1.length()
            if (r1 != 0) goto L_0x075c
            goto L_0x0788
        L_0x075c:
            java.lang.String r1 = r10.getConversationId()
            if (r1 == 0) goto L_0x0788
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0769
            goto L_0x0788
        L_0x0769:
            java.lang.String r1 = r10.getDescription()
            java.lang.String r2 = r10.getConversationId()
            int r6 = r56 << 6
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r10 = 1
            r11 = 0
            r44 = r11
            r45 = r1
            r46 = r2
            r47 = r17
            r48 = r0
            r49 = r6
            r50 = r10
            io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt.MergedConversationRow(r44, r45, r46, r47, r48, r49, r50)
        L_0x0788:
            r0.M()
        L_0x078b:
            r2 = r19
            goto L_0x0737
        L_0x078e:
            boolean r1 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.FinAnswerRow
            if (r1 == 0) goto L_0x07c7
            r1 = 45754892(0x2ba2a0c, float:2.7354377E-37)
            r0.T(r1)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$FinAnswerRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.FinAnswerRow) r10
            io.intercom.android.sdk.models.Part r1 = r10.getPart()
            io.intercom.android.sdk.m5.conversation.states.GroupingPosition r2 = r10.getGroupingPosition()
            io.intercom.android.sdk.models.Part r6 = r10.getPart()
            long r10 = r6.getCreatedAt()
            java.lang.String r6 = io.intercom.android.sdk.utilities.TimeFormatterExtKt.toHourOfDay(r10)
            r10 = 8
            r11 = 4
            r12 = 0
            r44 = r1
            r45 = r2
            r46 = r12
            r47 = r6
            r48 = r0
            r49 = r10
            r50 = r11
            io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt.FinAnswerRow(r44, r45, r46, r47, r48, r49, r50)
            r0.M()
            goto L_0x078b
        L_0x07c7:
            boolean r1 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.FinStreamingRow
            if (r1 == 0) goto L_0x0852
            r1 = 46089630(0x2bf459e, float:2.8104886E-37)
            r0.T(r1)
            float r1 = c1.h.j(r9)
            r2 = 7
            r11 = 0
            r12 = 0
            r23 = 0
            r37 = 0
            r44 = r14
            r45 = r12
            r46 = r23
            r47 = r37
            r48 = r1
            r49 = r2
            r50 = r11
            k0.i r1 = androidx.compose.foundation.layout.n.m(r44, r45, r46, r47, r48, r49, r50)
            r2 = 1
            r11 = 0
            r12 = 0
            k0.i r1 = androidx.compose.foundation.layout.q.h(r1, r12, r2, r11)
            r2 = 1941156395(0x73b3b22b, float:2.8473963E31)
            r0.T(r2)
            r2 = r19
            boolean r11 = r0.S(r2)
            boolean r12 = r0.c(r6)
            r11 = r11 | r12
            java.lang.Object r12 = r0.A()
            if (r11 != 0) goto L_0x0814
            Y.m$a r11 = Y.C1500m.f10026a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x0828
        L_0x0814:
            io.intercom.android.sdk.m5.conversation.ui.components.k0 r12 = new io.intercom.android.sdk.m5.conversation.ui.components.k0
            r44 = r12
            r45 = r2
            r46 = r6
            r47 = r7
            r48 = r15
            r49 = r8
            r44.<init>(r45, r46, r47, r48, r49)
            r0.r(r12)
        L_0x0828:
            yf.l r12 = (yf.C6798l) r12
            r0.M()
            k0.i r1 = androidx.compose.ui.layout.c.a(r1, r12)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$FinStreamingRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.FinStreamingRow) r10
            java.util.List r6 = r10.getBlocks()
            io.intercom.android.sdk.models.StreamingPart r10 = r10.getStreamingPart()
            r11 = 72
            r12 = 0
            r44 = r6
            r45 = r10
            r46 = r1
            r47 = r0
            r48 = r11
            r49 = r12
            io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt.FinStreamingRow(r44, r45, r46, r47, r48, r49)
            r0.M()
            goto L_0x0737
        L_0x0852:
            r2 = r19
            boolean r1 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.TypingIndicatorRow
            if (r1 == 0) goto L_0x08e5
            r1 = 47063743(0x2ce22bf, float:3.0288923E-37)
            r0.T(r1)
            r1 = 1941181927(0x73b415e7, float:2.8535695E31)
            r0.T(r1)
            java.lang.Object r1 = r0.A()
            Y.m$a r6 = Y.C1500m.f10026a
            java.lang.Object r6 = r6.a()
            if (r1 != r6) goto L_0x087f
            w.V r1 = new w.V
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r1.<init>(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r1.h(r6)
            r0.r(r1)
        L_0x087f:
            w.V r1 = (w.C2777V) r1
            r0.M()
            r6 = 0
            r11 = 0
            r12 = 3
            androidx.compose.animation.i r14 = androidx.compose.animation.g.o(r6, r11, r12, r6)
            io.intercom.android.sdk.m5.conversation.ui.components.n0 r13 = new io.intercom.android.sdk.m5.conversation.ui.components.n0
            r13.<init>()
            r11 = 1
            androidx.compose.animation.i r13 = androidx.compose.animation.g.C(r6, r13, r11, r6)
            androidx.compose.animation.i r13 = r14.c(r13)
            r14 = 0
            androidx.compose.animation.k r11 = androidx.compose.animation.g.q(r6, r14, r12, r6)
            io.intercom.android.sdk.m5.conversation.ui.components.o0 r14 = new io.intercom.android.sdk.m5.conversation.ui.components.o0
            r14.<init>()
            r12 = 1
            androidx.compose.animation.k r14 = androidx.compose.animation.g.G(r6, r14, r12, r6)
            androidx.compose.animation.k r6 = r11.c(r14)
            io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$13$1$5 r11 = new io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$13$1$5
            r11.<init>(r10)
            r10 = 1614696345(0x603e4f99, float:5.485339E19)
            r14 = 54
            g0.a r10 = g0.c.e(r10, r12, r11, r0, r14)
            int r11 = w.C2777V.f27247d
            r12 = 3
            int r11 = r11 << r12
            r12 = 1600518(0x186c06, float:2.242803E-39)
            r11 = r11 | r12
            r12 = 18
            r19 = 0
            r35 = 0
            r44 = r4
            r45 = r1
            r46 = r19
            r47 = r13
            r48 = r6
            r49 = r35
            r50 = r10
            r51 = r0
            r52 = r11
            r53 = r12
            v.C2721d.d(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r0.M()
            r6 = r14
            goto L_0x0739
        L_0x08e5:
            r1 = 0
            r6 = 54
            boolean r11 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.NewMessagesRow
            if (r11 == 0) goto L_0x08fc
            r10 = 48244254(0x2e0261e, float:3.293572E-37)
            r0.T(r10)
            r10 = 0
            r11 = 1
            r12 = 0
            io.intercom.android.sdk.m5.conversation.ui.components.row.NewMessagesRowKt.NewMessagesRow(r12, r0, r10, r11)
            r0.M()
            goto L_0x0966
        L_0x08fc:
            r11 = 1
            r12 = 0
            boolean r13 = r10 instanceof io.intercom.android.sdk.m5.conversation.states.ContentRow.FooterNoticeRow
            if (r13 == 0) goto L_0x097a
            r13 = 48361930(0x2e1f1ca, float:3.3199559E-37)
            r0.T(r13)
            r13 = 2
            r19 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r34 = 0
            r44 = r4
            r45 = r14
            r46 = r24
            r47 = r34
            r48 = r13
            r49 = r19
            k0.i r13 = C.C1092j.c(r44, r45, r46, r47, r48, r49)
            r1 = 0
            C.a0.a(r13, r0, r1)
            r1 = 24
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
            r13 = 4
            float r13 = (float) r13
            float r13 = c1.h.j(r13)
            k0.i r1 = androidx.compose.foundation.layout.n.j(r14, r1, r13)
            io.intercom.android.sdk.m5.conversation.states.ContentRow$FooterNoticeRow r10 = (io.intercom.android.sdk.m5.conversation.states.ContentRow.FooterNoticeRow) r10
            io.intercom.android.sdk.m5.conversation.states.FooterNoticeState r13 = r10.getFooterNoticeState()
            java.lang.String r13 = r13.getTitle()
            io.intercom.android.sdk.m5.conversation.states.FooterNoticeState r14 = r10.getFooterNoticeState()
            java.lang.String r14 = r14.getSubtitle()
            io.intercom.android.sdk.m5.conversation.states.FooterNoticeState r10 = r10.getFooterNoticeState()
            java.util.List r10 = r10.getAvatars()
            r19 = 4102(0x1006, float:5.748E-42)
            r24 = 0
            r44 = r1
            r45 = r13
            r46 = r14
            r47 = r10
            r48 = r0
            r49 = r19
            r50 = r24
            io.intercom.android.sdk.m5.components.FooterNoticeKt.ExpandedFooterNotice(r44, r45, r46, r47, r48, r49, r50)
            r0.M()
        L_0x0966:
            r13 = r55
            r19 = r2
            r11 = r25
            r6 = r33
            r1 = r36
            r2 = r43
            r25 = r21
            r21 = r5
            r5 = r32
            goto L_0x03a4
        L_0x097a:
            r1 = 1940943013(0x73b070a5, float:2.7958037E31)
            r0.T(r1)
            r0.M()
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x0989:
            r36 = r1
            r21 = r25
            r25 = r11
            r0.M()
            r0.u()
            boolean r1 = MessageList$lambda$16(r8)
            if (r1 == 0) goto L_0x09b2
            int r1 = r3.n()
            int r2 = r3.m()
            if (r1 == r2) goto L_0x09b2
            if (r27 != 0) goto L_0x09b2
            io.intercom.android.sdk.m5.conversation.ui.components.p0 r1 = new io.intercom.android.sdk.m5.conversation.ui.components.p0
            r2 = r20
            r1.<init>(r2, r3)
            r2 = 0
            Y.P.h(r1, r0, r2)
        L_0x09b2:
            Y.Y0 r15 = r0.k()
            if (r15 == 0) goto L_0x09e5
            io.intercom.android.sdk.m5.conversation.ui.components.q0 r14 = new io.intercom.android.sdk.m5.conversation.ui.components.q0
            r0 = r14
            r1 = r36
            r2 = r43
            r4 = r26
            r5 = r21
            r6 = r28
            r7 = r30
            r8 = r25
            r9 = r22
            r10 = r29
            r11 = r16
            r12 = r17
            r13 = r55
            r39 = r14
            r14 = r56
            r40 = r15
            r15 = r57
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r39
            r0 = r40
            r0.a(r1)
        L_0x09e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt.MessageList(k0.i, java.util.List, androidx.compose.foundation.o, yf.l, yf.l, yf.l, yf.l, yf.l, yf.a, yf.l, boolean, yf.l, Y.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$0(ReplySuggestion replySuggestion) {
        C6496s.h(replySuggestion, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$1(ReplyOption replyOption) {
        C6496s.h(replyOption, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final MessageListCoordinates MessageList$lambda$10(C1510r0 r0Var) {
        return (MessageListCoordinates) r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void MessageList$lambda$11(C1510r0 r0Var, MessageListCoordinates messageListCoordinates) {
        r0Var.setValue(messageListCoordinates);
    }

    /* access modifiers changed from: private */
    public static final MessageListCoordinates MessageList$lambda$13(C1510r0 r0Var) {
        return (MessageListCoordinates) r0Var.getValue();
    }

    private static final void MessageList$lambda$14(C1510r0 r0Var, MessageListCoordinates messageListCoordinates) {
        r0Var.setValue(messageListCoordinates);
    }

    /* access modifiers changed from: private */
    public static final boolean MessageList$lambda$16(C1510r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void MessageList$lambda$17(C1510r0 r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final boolean MessageList$lambda$19(C1510r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$2(Part part) {
        C6496s.h(part, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void MessageList$lambda$20(C1510r0 r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$26$lambda$25(C1510r0 r0Var, C1197s sVar) {
        C6496s.h(r0Var, "$currentBounds$delegate");
        C6496s.h(sVar, "layoutCoordinates");
        MessageList$lambda$14(r0Var, new MessageListCoordinates(C1198t.a(sVar), C1198t.c(sVar), s.d(sVar.b()), (DefaultConstructorMarker) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$3(PendingMessage.FailedImageUploadData failedImageUploadData) {
        C6496s.h(failedImageUploadData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$37$lambda$36$lambda$31$lambda$30(d dVar, float f10, C1510r0 r0Var, C1510r0 r0Var2, C1510r0 r0Var3, C1197s sVar) {
        boolean z10;
        C6496s.h(dVar, "$density");
        C6496s.h(r0Var, "$hasUserScrolled$delegate");
        C6496s.h(r0Var2, "$currentBounds$delegate");
        C6496s.h(r0Var3, "$autoScrollEnabled$delegate");
        C6496s.h(sVar, "it");
        C2423i c10 = C1198t.c(sVar);
        float t12 = dVar.t1(f10);
        if (!MessageList$lambda$19(r0Var)) {
            if (c10.l() != MessageList$lambda$13(r0Var2).getBoundsInWindow().l() && c10.l() <= MessageList$lambda$13(r0Var2).getBoundsInWindow().l() + t12) {
                z10 = false;
            } else {
                z10 = true;
            }
            MessageList$lambda$17(r0Var3, z10);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final int MessageList$lambda$37$lambda$36$lambda$34(int i10) {
        return i10;
    }

    /* access modifiers changed from: private */
    public static final int MessageList$lambda$37$lambda$36$lambda$35(int i10) {
        return i10;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$38(K k10, o oVar) {
        C6496s.h(k10, "$scope");
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new MessageListKt$MessageList$14$1(oVar, (C6658d<? super MessageListKt$MessageList$14$1>) null), 3, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$39(i iVar, List list, o oVar, C6798l lVar, C6798l lVar2, C6798l lVar3, C6798l lVar4, C6798l lVar5, C6787a aVar, C6798l lVar6, boolean z10, C6798l lVar7, int i10, int i11, int i12, C1500m mVar, int i13) {
        List list2 = list;
        C6496s.h(list2, "$contentRows");
        MessageList(iVar, list2, oVar, lVar, lVar2, lVar3, lVar4, lVar5, aVar, lVar6, z10, lVar7, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$4(AttributeData attributeData) {
        C6496s.h(attributeData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$5() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$6(TicketType ticketType) {
        C6496s.h(ticketType, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageList$lambda$7(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final KeyboardState MessageList$lambda$8(A1 a12) {
        return (KeyboardState) a12.getValue();
    }

    @IntercomPreviews
    public static final void MessageListPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(394311697);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$MessageListKt.INSTANCE.m239getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new l0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageListPreview$lambda$40(int i10, C1500m mVar, int i11) {
        MessageListPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final float gapWithPrevious(ContentRow contentRow, int i10, List<? extends ContentRow> list) {
        ContentRow.BubbleMessageRow bubbleMessageRow;
        GroupingPosition groupingPosition;
        C6496s.h(contentRow, "contentRow");
        C6496s.h(list, "allContentRows");
        if (contentRow instanceof ContentRow.DayDividerRow) {
            return LargeMessageGap;
        }
        if ((contentRow instanceof ContentRow.SpecialNoticeRow) || (contentRow instanceof ContentRow.TeamIntroRow) || (contentRow instanceof ContentRow.BubbleMessageRow) || (contentRow instanceof ContentRow.FinAnswerRow) || (contentRow instanceof ContentRow.QuickRepliesRow) || (contentRow instanceof ContentRow.AskedAboutRow) || (contentRow instanceof ContentRow.BigTicketRow) || (contentRow instanceof ContentRow.ComposerSuggestionRow) || (contentRow instanceof ContentRow.EventRow) || (contentRow instanceof ContentRow.TypingIndicatorRow) || (contentRow instanceof ContentRow.NewMessagesRow) || (contentRow instanceof ContentRow.FooterNoticeRow) || (contentRow instanceof ContentRow.PostCardRow) || (contentRow instanceof ContentRow.NoteCardRow) || (contentRow instanceof ContentRow.FinStreamingRow)) {
            ContentRow.FinAnswerRow finAnswerRow = null;
            if (contentRow instanceof ContentRow.BubbleMessageRow) {
                bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
            } else {
                bubbleMessageRow = null;
            }
            if (bubbleMessageRow == null || (groupingPosition = bubbleMessageRow.getGroupingPosition()) == null) {
                if (contentRow instanceof ContentRow.FinAnswerRow) {
                    finAnswerRow = (ContentRow.FinAnswerRow) contentRow;
                }
                if (finAnswerRow != null) {
                    groupingPosition = finAnswerRow.getGroupingPosition();
                } else {
                    groupingPosition = GroupingPosition.STANDALONE;
                }
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[groupingPosition.ordinal()];
            if (i11 == 1 || i11 == 2) {
                ContentRow contentRow2 = (ContentRow) C6565s.r0(list, i10 - 1);
                if (contentRow2 instanceof ContentRow.TicketStatusRow) {
                    return BigMessageGap;
                }
                if (contentRow2 instanceof ContentRow.MergedConversationRow) {
                    return BigMessageGap;
                }
                return DefaultMessageGap;
            } else if (i11 == 3 || i11 == 4) {
                return GroupedMessageGap;
            } else {
                throw new C6535s();
            }
        } else if (contentRow instanceof ContentRow.TicketStatusRow) {
            return BigMessageGap;
        } else {
            if (contentRow instanceof ContentRow.MergedConversationRow) {
                return BigMessageGap;
            }
            throw new C6535s();
        }
    }

    /* access modifiers changed from: private */
    public static final boolean isAtBottom(o oVar) {
        if (oVar.n() == oVar.m()) {
            return true;
        }
        return false;
    }
}
