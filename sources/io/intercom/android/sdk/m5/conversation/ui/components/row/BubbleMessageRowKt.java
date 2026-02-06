package io.intercom.android.sdk.m5.conversation.ui.components.row;

import B.l;
import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.N;
import C.W;
import C.Z;
import H0.F;
import I.g;
import J0.C1241g;
import M0.e;
import Q0.C1321d;
import V.B0;
import V.C1389k;
import V.C1391l;
import V.C1393m;
import V.C1404s;
import V.T0;
import V.V;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.MessageStyle;
import io.intercom.android.sdk.models.Attachments;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.survey.block.SuffixText;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.views.compose.AttributeCollectorCardKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import o0.C2342e;
import r0.C2544x0;
import r0.g2;
import w1.b;
import x.C2868g;
import x.C2869h;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a·\u0001\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a±\u0001\u0010+\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b)\u0010*\u001a\u000f\u0010,\u001a\u00020\fH\u0003¢\u0006\u0004\b,\u0010-\u001a1\u00100\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u000202*\u00020\u0000H\u0000¢\u0006\u0004\b3\u00104\u001a\u0017\u00106\u001a\u0002052\u0006\u0010\"\u001a\u00020\u0004H\u0001¢\u0006\u0004\b6\u00107\u001a\u0013\u00108\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b8\u00109\"\"\u0010<\u001a\n ;*\u0004\u0018\u00010:0:8\u0000X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\"\u0010@\u001a\n ;*\u0004\u0018\u00010:0:8\u0000X\u0004¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?\"\"\u0010B\u001a\n ;*\u0004\u0018\u00010:0:8\u0000X\u0004¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?\"\"\u0010D\u001a\n ;*\u0004\u0018\u00010:0:8\u0000X\u0004¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?\"\"\u0010F\u001a\n ;*\u0004\u0018\u00010:0:8\u0000X\u0004¢\u0006\f\n\u0004\bF\u0010=\u001a\u0004\bG\u0010?\"\u001a\u0010I\u001a\u00020H8\u0000X\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lio/intercom/android/sdk/models/Part;", "conversationPart", "Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "groupingPosition", "", "isAdminOrAltParticipant", "Lk0/i;", "modifier", "", "timestamp", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "Llf/M;", "onSubmitAttribute", "", "failedAttributeIdentifiers", "loadingAttributeIdentifiers", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "onRetryImageClicked", "failedImageUploadData", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/FailedMessage;", "failedMessage", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "onCreateTicket", "BubbleMessageRow", "(Lio/intercom/android/sdk/models/Part;Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;ZLk0/i;Ljava/lang/String;Lyf/l;Ljava/util/List;Ljava/util/List;Lyf/l;Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;Lio/intercom/android/sdk/m5/conversation/ui/components/row/FailedMessage;Lyf/l;LY/m;III)V", "isFailed", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle;", "getMessageStyle", "(ZLio/intercom/android/sdk/m5/conversation/states/GroupingPosition;ZLY/m;I)Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle;", "FailedMessageIcon", "(Lk0/i;LY/m;II)V", "Lr0/x0;", "contentColor", "enabled", "Lr0/g2;", "contentShape", "Lkotlin/Function0;", "onClick", "Lc1/h;", "spaceBetweenBlocks", "MessageContent-993knro", "(Lio/intercom/android/sdk/models/Part;Ljava/util/List;Ljava/util/List;Lyf/l;JZLr0/g2;Lyf/a;Lyf/l;ZLio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;Lyf/l;FLY/m;III)V", "MessageContent", "BubbleMessageRowPreview", "(LY/m;I)V", "metaString", "attributeString", "MessageMeta", "(Lk0/i;Ljava/lang/String;Ljava/lang/String;ZLY/m;II)V", "LQ0/d;", "getCopyText", "(Lio/intercom/android/sdk/models/Part;)LQ0/d;", "", "contentAlpha", "(ZLY/m;I)F", "shouldShowAttribution", "(Lio/intercom/android/sdk/models/Part;)Z", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "kotlin.jvm.PlatformType", "paragraphBlock", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "getParagraphBlock", "()Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "longParagraphBlock", "getLongParagraphBlock", "createTicketBlock", "getCreateTicketBlock", "answerBlock", "getAnswerBlock", "articleBlock", "getArticleBlock", "Lio/intercom/android/sdk/models/Metadata;", "humanMetadata", "Lio/intercom/android/sdk/models/Metadata;", "getHumanMetadata", "()Lio/intercom/android/sdk/models/Metadata;", "Lio/intercom/android/sdk/blocks/lib/BlockType;", "imageBlockTypes", "Ljava/util/List;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BubbleMessageRowKt {
    private static final Block.Builder answerBlock;
    private static final Block.Builder articleBlock;
    private static final Block.Builder createTicketBlock = new Block.Builder().withTitle("Create ticket").withTicketType(new TicketType(-1, "Bug", "", C6565s.n(), false)).withType(BlockType.CREATETICKETCARD.getSerializedName());
    private static final io.intercom.android.sdk.models.Metadata humanMetadata = new io.intercom.android.sdk.models.Metadata("Lisa", (String) null, (Long) null, C6565s.e(new Avatar.Builder().withInitials("L")), 6, (DefaultConstructorMarker) null);
    private static final List<BlockType> imageBlockTypes = C6565s.q(BlockType.IMAGE, BlockType.LOCALIMAGE);
    private static final Block.Builder longParagraphBlock;
    private static final Block.Builder paragraphBlock;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                io.intercom.android.sdk.blocks.lib.BlockType[] r0 = io.intercom.android.sdk.blocks.lib.BlockType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.SUBHEADING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.HEADING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.CODE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.LINK     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.UNORDEREDLIST     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.ORDEREDLIST     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt.WhenMappings.<clinit>():void");
        }
    }

    static {
        Block.Builder withText = new Block.Builder().withText("Hey");
        BlockType blockType = BlockType.PARAGRAPH;
        paragraphBlock = withText.withType(blockType.getSerializedName());
        longParagraphBlock = new Block.Builder().withText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.").withType(blockType.getSerializedName());
        answerBlock = new Block.Builder().withText("Yes, you can change the date of your stay for up to seven days before it is due to begin. To do this, first go to your stays and click the relevant one. Then, go to change details and enter a new date. Checkout this article:").withType(blockType.getSerializedName());
        articleBlock = new Block.Builder().withText("I can’t find exactly what you need, but here is an article that could help:<br><br><a href=\"http://www.intercom.com\"> Making a group reservation</a><br>Explains how to make a group reservation with multiple guests.").withType(blockType.getSerializedName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void BubbleMessageRow(io.intercom.android.sdk.models.Part r31, io.intercom.android.sdk.m5.conversation.states.GroupingPosition r32, boolean r33, k0.i r34, java.lang.String r35, yf.C6798l r36, java.util.List<java.lang.String> r37, java.util.List<java.lang.String> r38, yf.C6798l r39, io.intercom.android.sdk.m5.conversation.states.PendingMessage.FailedImageUploadData r40, io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage r41, yf.C6798l r42, Y.C1500m r43, int r44, int r45, int r46) {
        /*
            r2 = r32
            r15 = r46
            java.lang.String r0 = "conversationPart"
            r1 = r31
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "groupingPosition"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = 1247044792(0x4a5464b8, float:3479854.0)
            r3 = r43
            Y.m r0 = r3.h(r0)
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0021
            k0.i$a r3 = k0.i.f23074a
            r14 = r3
            goto L_0x0023
        L_0x0021:
            r14 = r34
        L_0x0023:
            r3 = r15 & 16
            r4 = 0
            if (r3 == 0) goto L_0x002b
            r16 = r4
            goto L_0x002d
        L_0x002b:
            r16 = r35
        L_0x002d:
            r3 = r15 & 32
            if (r3 == 0) goto L_0x0039
            io.intercom.android.sdk.m5.conversation.ui.components.row.m r3 = new io.intercom.android.sdk.m5.conversation.ui.components.row.m
            r3.<init>()
            r17 = r3
            goto L_0x003b
        L_0x0039:
            r17 = r36
        L_0x003b:
            r3 = r15 & 64
            if (r3 == 0) goto L_0x0046
            java.util.List r3 = mf.C6565s.n()
            r18 = r3
            goto L_0x0048
        L_0x0046:
            r18 = r37
        L_0x0048:
            r3 = r15 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0053
            java.util.List r3 = mf.C6565s.n()
            r19 = r3
            goto L_0x0055
        L_0x0053:
            r19 = r38
        L_0x0055:
            r3 = r15 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0061
            io.intercom.android.sdk.m5.conversation.ui.components.row.n r3 = new io.intercom.android.sdk.m5.conversation.ui.components.row.n
            r3.<init>()
            r20 = r3
            goto L_0x0063
        L_0x0061:
            r20 = r39
        L_0x0063:
            r3 = r15 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x006a
            r21 = r4
            goto L_0x006c
        L_0x006a:
            r21 = r40
        L_0x006c:
            r3 = r15 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0073
            r22 = r4
            goto L_0x0075
        L_0x0073:
            r22 = r41
        L_0x0075:
            r3 = r15 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0081
            io.intercom.android.sdk.m5.conversation.ui.components.row.o r3 = new io.intercom.android.sdk.m5.conversation.ui.components.row.o
            r3.<init>()
            r23 = r3
            goto L_0x0083
        L_0x0081:
            r23 = r42
        L_0x0083:
            r13 = 1
            if (r22 == 0) goto L_0x0088
            r3 = r13
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            int r24 = r44 >> 6
            r5 = r24 & 14
            r6 = r44 & 112(0x70, float:1.57E-43)
            r5 = r5 | r6
            r12 = r33
            io.intercom.android.sdk.m5.conversation.ui.components.row.MessageStyle r5 = getMessageStyle(r12, r2, r3, r0, r5)
            if (r22 == 0) goto L_0x00b4
            io.intercom.android.sdk.m5.conversation.ui.components.row.BottomMetadata r3 = new io.intercom.android.sdk.m5.conversation.ui.components.row.BottomMetadata
            java.lang.String r6 = r22.getMessage()
            r7 = 2
            r8 = 0
            r9 = 0
            r10 = 1
            r34 = r3
            r35 = r6
            r36 = r9
            r37 = r10
            r38 = r7
            r39 = r8
            r34.<init>(r35, r36, r37, r38, r39)
        L_0x00b1:
            r25 = r3
            goto L_0x00ce
        L_0x00b4:
            if (r16 == 0) goto L_0x00cc
            io.intercom.android.sdk.m5.conversation.ui.components.row.BottomMetadata r3 = new io.intercom.android.sdk.m5.conversation.ui.components.row.BottomMetadata
            r6 = 6
            r7 = 0
            r8 = 0
            r9 = 0
            r34 = r3
            r35 = r16
            r36 = r8
            r37 = r9
            r38 = r6
            r39 = r7
            r34.<init>(r35, r36, r37, r38, r39)
            goto L_0x00b1
        L_0x00cc:
            r25 = r4
        L_0x00ce:
            k0.c$b r26 = r5.getRowAlignment()
            C.N r27 = r5.getRowPadding()
            if (r22 == 0) goto L_0x00df
            yf.a r3 = r22.getOnRetryMessageClicked()
            r28 = r3
            goto L_0x00e1
        L_0x00df:
            r28 = r4
        L_0x00e1:
            io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$BubbleMessageRow$6 r11 = new io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$BubbleMessageRow$6
            r3 = r11
            r4 = r22
            r6 = r31
            r7 = r18
            r8 = r19
            r9 = r17
            r10 = r23
            r1 = r11
            r11 = r33
            r12 = r21
            r2 = r13
            r13 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = 54
            r4 = 873055205(0x3409c3e5, float:1.2830385E-7)
            g0.a r1 = g0.c.e(r4, r2, r1, r0, r3)
            r2 = 1572872(0x180008, float:2.204063E-39)
            r3 = r24 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = 0
            r34 = r31
            r35 = r14
            r36 = r25
            r37 = r26
            r38 = r27
            r39 = r28
            r40 = r1
            r41 = r0
            r42 = r2
            r43 = r3
            io.intercom.android.sdk.m5.conversation.ui.components.row.ClickableMessageRowKt.ClickableMessageRow(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            Y.Y0 r13 = r0.k()
            if (r13 == 0) goto L_0x0157
            io.intercom.android.sdk.m5.conversation.ui.components.row.p r12 = new io.intercom.android.sdk.m5.conversation.ui.components.row.p
            r0 = r12
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r14 = r12
            r12 = r23
            r29 = r13
            r13 = r44
            r30 = r14
            r14 = r45
            r15 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r29
            r1 = r30
            r0.a(r1)
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt.BubbleMessageRow(io.intercom.android.sdk.models.Part, io.intercom.android.sdk.m5.conversation.states.GroupingPosition, boolean, k0.i, java.lang.String, yf.l, java.util.List, java.util.List, yf.l, io.intercom.android.sdk.m5.conversation.states.PendingMessage$FailedImageUploadData, io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage, yf.l, Y.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M BubbleMessageRow$lambda$0(AttributeData attributeData) {
        C6496s.h(attributeData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BubbleMessageRow$lambda$1(PendingMessage.FailedImageUploadData failedImageUploadData) {
        C6496s.h(failedImageUploadData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BubbleMessageRow$lambda$2(TicketType ticketType) {
        C6496s.h(ticketType, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BubbleMessageRow$lambda$5(Part part, GroupingPosition groupingPosition, boolean z10, i iVar, String str, C6798l lVar, List list, List list2, C6798l lVar2, PendingMessage.FailedImageUploadData failedImageUploadData, FailedMessage failedMessage, C6798l lVar3, int i10, int i11, int i12, C1500m mVar, int i13) {
        Part part2 = part;
        C6496s.h(part2, "$conversationPart");
        GroupingPosition groupingPosition2 = groupingPosition;
        C6496s.h(groupingPosition2, "$groupingPosition");
        BubbleMessageRow(part2, groupingPosition2, z10, iVar, str, lVar, list, list2, lVar2, failedImageUploadData, failedMessage, lVar3, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void BubbleMessageRowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(481690275);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BubbleMessageRowKt.INSTANCE.m286getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6145l(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BubbleMessageRowPreview$lambda$13(int i10, C1500m mVar, int i11) {
        BubbleMessageRowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void FailedMessageIcon(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        C1500m h10 = mVar.h(-1829301504);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (h10.S(iVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) != 2 || !h10.i()) {
            if (i14 != 0) {
                iVar = i.f23074a;
            }
            V.a(e.c(R.drawable.intercom_message_error, h10, 0), (String) null, q.n(iVar, h.j((float) 16)), IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m689getError0d7_KjU(), h10, 56, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6142i(iVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FailedMessageIcon$lambda$6(i iVar, int i10, int i11, C1500m mVar, int i12) {
        FailedMessageIcon(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* renamed from: MessageContent-993knro  reason: not valid java name */
    public static final void m280MessageContent993knro(Part part, List<String> list, List<String> list2, C6798l lVar, long j10, boolean z10, g2 g2Var, C6787a aVar, C6798l lVar2, boolean z11, PendingMessage.FailedImageUploadData failedImageUploadData, C6798l lVar3, float f10, C1500m mVar, int i10, int i11, int i12) {
        List list3;
        g2 g2Var2 = g2Var;
        PendingMessage.FailedImageUploadData failedImageUploadData2 = failedImageUploadData;
        C6798l lVar4 = lVar3;
        C6496s.h(part, "conversationPart");
        C6496s.h(list, "failedAttributeIdentifiers");
        C6496s.h(list2, "loadingAttributeIdentifiers");
        C6496s.h(lVar, "onSubmitAttribute");
        C6496s.h(g2Var2, "contentShape");
        C6496s.h(aVar, "onClick");
        C6496s.h(lVar2, "onCreateTicket");
        C6496s.h(lVar4, "onRetryImageClicked");
        C1500m h10 = mVar.h(-1984008321);
        float j11 = (i12 & 4096) != 0 ? h.j((float) 0) : f10;
        C1085c.f n10 = C1085c.f882a.n(j11);
        i.a aVar2 = i.f23074a;
        F a10 = C1090h.a(n10, c.f23044a.k(), h10, 0);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, aVar2);
        C1241g.a aVar3 = C1241g.f3853J;
        C6787a a12 = aVar3.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a12);
        } else {
            h10.q();
        }
        C1500m a13 = F1.a(h10);
        F1.b(a13, a10, aVar3.c());
        F1.b(a13, p10, aVar3.e());
        p b10 = aVar3.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar3.d());
        C1093k kVar = C1093k.f978a;
        h10.T(1162898485);
        if (part.getMessageStyle() == MessageStyle.ATTRIBUTE_COLLECTOR) {
            i h11 = q.h(aVar2, 0.0f, 1, (Object) null);
            List<Attribute> attributes = part.getForm().getAttributes();
            String id2 = part.getId();
            C6496s.g(id2, "getId(...)");
            AttributeCollectorCardKt.AttributeCollectorCard(h11, attributes, list, list2, id2, part.getForm().getDisabled(), lVar, h10, ((i10 << 9) & 3670016) | 4678, 0);
        }
        h10.M();
        h10.T(1162960640);
        List<Block> blocks = part.getBlocks();
        C6496s.g(blocks, "getBlocks(...)");
        Collection collection = blocks;
        List<Attachments> attachments = part.getAttachments();
        C6496s.g(attachments, "getAttachments(...)");
        if (!attachments.isEmpty()) {
            Block.Builder withType = new Block.Builder().withType("ATTACHMENTLIST");
            List<Attachments> attachments2 = part.getAttachments();
            C6496s.g(attachments2, "getAttachments(...)");
            Iterable<Attachments> iterable = attachments2;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (Attachments attachments3 : iterable) {
                arrayList.add(new BlockAttachment.Builder().withName(attachments3.getName()).withUrl(attachments3.getUrl()).withContentType(attachments3.getContentType()).withHumanFileSize(attachments3.getHumanFileSize()).build());
            }
            list3 = C6565s.e(withType.withAttachments(C6565s.e1(arrayList)).build());
        } else {
            list3 = C6565s.n();
        }
        Iterator it = C6565s.K0(collection, list3).iterator();
        while (it.hasNext()) {
            Block block = (Block) it.next();
            i.a aVar4 = i.f23074a;
            c.a aVar5 = c.f23044a;
            F h12 = d.h(aVar5.o(), false);
            int a14 = C1494j.a(h10, 0);
            C1523y p11 = h10.p();
            Iterator it2 = it;
            i e11 = k0.h.e(h10, aVar4);
            C1241g.a aVar6 = C1241g.f3853J;
            C6787a a15 = aVar6.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a15);
            } else {
                h10.q();
            }
            C1500m a16 = F1.a(h10);
            float f11 = j11;
            F1.b(a16, h12, aVar6.c());
            F1.b(a16, p11, aVar6.e());
            p b11 = aVar6.b();
            if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
                a16.r(Integer.valueOf(a14));
                a16.V(Integer.valueOf(a14), b11);
            }
            F1.b(a16, e11, aVar6.d());
            f fVar = f.f12848a;
            i a17 = C2342e.a(aVar4, g2Var2);
            C6496s.e(block);
            C2544x0 k10 = C2544x0.k(j10);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i13 = IntercomTheme.$stable;
            long l10 = intercomTheme.getTypography(h10, i13).getType04().l();
            V0.p o10 = intercomTheme.getTypography(h10, i13).getType04().o();
            if (o10 == null) {
                o10 = V0.p.f8210b.c();
            }
            BlockRenderData blockRenderData = new BlockRenderData(block, k10, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, new BlockRenderTextStyle(l10, o10, intercomTheme.getTypography(h10, i13).getType04().s(), (C2544x0) null, (C2544x0) null, (j) null, 56, (DefaultConstructorMarker) null), 12, (DefaultConstructorMarker) null);
            BlockViewKt.BlockView(a17, blockRenderData, z11, (SuffixText) null, z10, part.getParentConversation().getId(), ImageRenderType.WITH_MAX_SIZE, aVar, lVar2, (C6798l) null, h10, ((i10 >> 21) & 896) | 1572928 | ((i10 >> 3) & 57344) | (i10 & 29360128) | (i10 & 234881024), 520);
            h10.T(1737872381);
            if (failedImageUploadData2 != null) {
                C1393m.a(new C6143j(lVar4, failedImageUploadData2), fVar.e(aVar4, aVar5.e()), false, (g2) null, C1389k.f7680a.b(intercomTheme.getColors(h10, i13).m672getAction0d7_KjU(), C1404s.c(intercomTheme.getColors(h10, i13).m672getAction0d7_KjU(), h10, 0), 0, 0, h10, C1389k.f7694o << 12, 12), (C1391l) null, (C2868g) null, (N) null, (l) null, ComposableSingletons$BubbleMessageRowKt.INSTANCE.m285getLambda1$intercom_sdk_base_release(), h10, 805306368, 492);
            }
            h10.M();
            h10.u();
            C6798l lVar5 = lVar;
            it = it2;
            j11 = f11;
        }
        float f12 = j11;
        h10.M();
        h10.u();
        Y0 k11 = h10.k();
        if (k11 != null) {
            C6144k kVar2 = r0;
            C6144k kVar3 = new C6144k(part, list, list2, lVar, j10, z10, g2Var, aVar, lVar2, z11, failedImageUploadData, lVar3, f12, i10, i11, i12);
            k11.a(kVar2);
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageContent_993knro$lambda$11$lambda$10$lambda$9$lambda$8(C6798l lVar, PendingMessage.FailedImageUploadData failedImageUploadData) {
        C6496s.h(lVar, "$onRetryImageClicked");
        lVar.invoke(failedImageUploadData);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageContent_993knro$lambda$12(Part part, List list, List list2, C6798l lVar, long j10, boolean z10, g2 g2Var, C6787a aVar, C6798l lVar2, boolean z11, PendingMessage.FailedImageUploadData failedImageUploadData, C6798l lVar3, float f10, int i10, int i11, int i12, C1500m mVar, int i13) {
        Part part2 = part;
        C6496s.h(part2, "$conversationPart");
        C6496s.h(list, "$failedAttributeIdentifiers");
        C6496s.h(list2, "$loadingAttributeIdentifiers");
        C6496s.h(lVar, "$onSubmitAttribute");
        C6496s.h(g2Var, "$contentShape");
        C6496s.h(aVar, "$onClick");
        C6496s.h(lVar2, "$onCreateTicket");
        C6496s.h(lVar3, "$onRetryImageClicked");
        Part part3 = part2;
        m280MessageContent993knro(part3, list, list2, lVar, j10, z10, g2Var, aVar, lVar2, z11, failedImageUploadData, lVar3, f10, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C6514M.f71813a;
    }

    public static final void MessageMeta(i iVar, String str, String str2, boolean z10, C1500m mVar, int i10, int i11) {
        int i12;
        i iVar2;
        int i13;
        C1500m mVar2;
        i iVar3;
        i.a aVar;
        C1500m mVar3;
        int i14;
        IntercomTheme intercomTheme;
        i iVar4;
        int i15;
        int i16;
        int i17;
        int i18;
        String str3 = str;
        String str4 = str2;
        boolean z11 = z10;
        int i19 = i10;
        C6496s.h(str3, "metaString");
        C6496s.h(str4, "attributeString");
        C1500m h10 = mVar.h(302477331);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i19 | 6;
            iVar2 = iVar;
        } else if ((i19 & 14) == 0) {
            iVar2 = iVar;
            if (h10.S(iVar2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i19;
        } else {
            iVar2 = iVar;
            i12 = i19;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i19 & 112) == 0) {
            if (h10.S(str3)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i19 & 896) == 0) {
            if (h10.S(str4)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i19 & 7168) == 0) {
            if (h10.b(z11)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        int i21 = i12;
        if ((i21 & 5851) != 1170 || !h10.i()) {
            if (i20 != 0) {
                aVar = i.f23074a;
            } else {
                aVar = iVar2;
            }
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i22 = IntercomTheme.$stable;
            long r28 = intercomTheme2.getColors(h10, i22).m686getDescriptionText0d7_KjU();
            F b10 = W.b(C1085c.f882a.d(), c.f23044a.l(), h10, 6);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, b10, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b11 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b11);
            }
            F1.b(a12, e10, aVar2.d());
            Z z12 = Z.f873a;
            h10.T(-1112135187);
            if (!z11) {
                i15 = i22;
                iVar4 = aVar;
                intercomTheme = intercomTheme2;
                mVar3 = h10;
                i14 = i21;
                T0.b(str2, n.m(i.f23074a, 0.0f, 0.0f, h.j((float) 8), 0.0f, 11, (Object) null), r28, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme2.getTypography(h10, i22).getType05(), mVar3, ((i21 >> 6) & 14) | 48, 0, 65528);
            } else {
                i14 = i21;
                i15 = i22;
                iVar4 = aVar;
                intercomTheme = intercomTheme2;
                mVar3 = h10;
            }
            mVar3.M();
            IntercomTheme intercomTheme3 = intercomTheme;
            int i23 = i15;
            IntercomTheme intercomTheme4 = intercomTheme3;
            T0.b(str, (i) null, r28, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme3.getTypography(mVar3, i15).getType05(), mVar3, (i14 >> 3) & 14, 0, 65530);
            C1500m mVar4 = mVar3;
            mVar4.T(-1112121618);
            if (z10) {
                mVar2 = mVar4;
                T0.b(str2, n.m(i.f23074a, h.j((float) 8), 0.0f, 0.0f, 0.0f, 14, (Object) null), r28, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme4.getTypography(mVar4, i23).getType05(), mVar2, ((i14 >> 6) & 14) | 48, 0, 65528);
            } else {
                mVar2 = mVar4;
            }
            mVar2.M();
            mVar2.u();
            iVar3 = iVar4;
        } else {
            h10.I();
            iVar3 = iVar2;
            mVar2 = h10;
        }
        Y0 k10 = mVar2.k();
        if (k10 != null) {
            k10.a(new C6150q(iVar3, str, str2, z10, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageMeta$lambda$15(i iVar, String str, String str2, boolean z10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$metaString");
        C6496s.h(str2, "$attributeString");
        MessageMeta(iVar, str, str2, z10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final float contentAlpha(boolean z10, C1500m mVar, int i10) {
        float f10;
        mVar.T(1168284893);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.38f;
        }
        mVar.M();
        return f10;
    }

    public static final Block.Builder getAnswerBlock() {
        return answerBlock;
    }

    public static final Block.Builder getArticleBlock() {
        return articleBlock;
    }

    public static final C1321d getCopyText(Part part) {
        int i10;
        C6496s.h(part, "<this>");
        C1321d.a aVar = new C1321d.a(0, 1, (DefaultConstructorMarker) null);
        for (Block next : part.getBlocks()) {
            BlockType type = next.getType();
            if (type == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                    aVar.h(b.a(next.getText(), 0).toString());
                    break;
                case 5:
                    String url = next.getUrl();
                    C6496s.g(url, "getUrl(...)");
                    aVar.h(url);
                    break;
                case 6:
                case 7:
                    for (String next2 : next.getItems()) {
                        C6496s.e(next2);
                        aVar.h(next2);
                    }
                    break;
            }
        }
        C1321d n10 = aVar.n();
        if (n10.length() != 0) {
            return n10;
        }
        String summary = part.getSummary();
        C6496s.g(summary, "getSummary(...)");
        return new C1321d(summary, (List) null, (List) null, 6, (DefaultConstructorMarker) null);
    }

    public static final Block.Builder getCreateTicketBlock() {
        return createTicketBlock;
    }

    public static final io.intercom.android.sdk.models.Metadata getHumanMetadata() {
        return humanMetadata;
    }

    public static final Block.Builder getLongParagraphBlock() {
        return longParagraphBlock;
    }

    private static final MessageStyle getMessageStyle(boolean z10, GroupingPosition groupingPosition, boolean z11, C1500m mVar, int i10) {
        MessageStyle messageStyle;
        float f10;
        N n10;
        float f11;
        GroupingPosition groupingPosition2 = groupingPosition;
        C1500m mVar2 = mVar;
        mVar2.T(1733827858);
        if (z10) {
            mVar2.T(-1196940615);
            float j10 = h.j((float) 20);
            float j11 = h.j((float) 4);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            long r10 = intercomTheme.getColors(mVar2, i11).m675getAdminBackground0d7_KjU();
            float f12 = (float) 16;
            N b10 = n.b(h.j(f12), h.j((float) 12));
            if (groupingPosition2 == GroupingPosition.BOTTOM || groupingPosition2 == GroupingPosition.MIDDLE) {
                f11 = j11;
            } else {
                f11 = j10;
            }
            if (!(groupingPosition2 == GroupingPosition.TOP || groupingPosition2 == GroupingPosition.MIDDLE)) {
                j11 = j10;
            }
            messageStyle = new MessageStyle(new MessageStyle.BubbleStyle(r10, b10, g.d(f11, j10, j10, j11), C2869h.a(h.j((float) 1), intercomTheme.getColors(mVar2, i11).m676getAdminBorder0d7_KjU()), (DefaultConstructorMarker) null), c.f23044a.k(), n.e(h.j(f12), 0.0f, h.j((float) 60), 0.0f, 10, (Object) null), g.c(j10));
            mVar.M();
        } else {
            mVar2.T(-1195737257);
            float j12 = h.j((float) 20);
            float j13 = h.j((float) 4);
            long r92 = IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m672getAction0d7_KjU();
            float f13 = (float) 16;
            N b11 = n.b(h.j(f13), h.j((float) 12));
            if (groupingPosition2 == GroupingPosition.BOTTOM || groupingPosition2 == GroupingPosition.MIDDLE) {
                f10 = j13;
            } else {
                f10 = j12;
            }
            if (!(groupingPosition2 == GroupingPosition.TOP || groupingPosition2 == GroupingPosition.MIDDLE)) {
                j13 = j12;
            }
            MessageStyle.BubbleStyle bubbleStyle = new MessageStyle.BubbleStyle(r92, b11, g.d(j12, f10, j13, j12), (C2868g) null, (DefaultConstructorMarker) null);
            c.b j14 = c.f23044a.j();
            if (z11) {
                n10 = n.e(h.j((float) 36), 0.0f, h.j(f13), 0.0f, 10, (Object) null);
            } else {
                n10 = n.e(h.j((float) 60), 0.0f, h.j(f13), 0.0f, 10, (Object) null);
            }
            messageStyle = new MessageStyle(bubbleStyle, j14, n10, g.c(j12));
            mVar.M();
        }
        mVar.M();
        return messageStyle;
    }

    public static final Block.Builder getParagraphBlock() {
        return paragraphBlock;
    }

    public static final boolean shouldShowAttribution(Part part) {
        C6496s.h(part, "<this>");
        if (part.getBlocks().size() == 1) {
            List<BlockType> list = imageBlockTypes;
            List<Block> blocks = part.getBlocks();
            C6496s.g(blocks, "getBlocks(...)");
            if (list.contains(((Block) C6565s.o0(blocks)).getType())) {
                List<Block> blocks2 = part.getBlocks();
                C6496s.g(blocks2, "getBlocks(...)");
                String attribution = ((Block) C6565s.o0(blocks2)).getAttribution();
                C6496s.g(attribution, "getAttribution(...)");
                if (attribution.length() <= 0 || part.getMessageState() != Part.MessageState.NORMAL) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
