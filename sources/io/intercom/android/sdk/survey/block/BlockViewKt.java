package io.intercom.android.sdk.survey.block;

import Q0.L;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.e;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.CarouselImageClickListener;
import io.intercom.android.sdk.blocks.LinkOpeningButtonClickListener;
import io.intercom.android.sdk.blocks.UploadingImageCache;
import io.intercom.android.sdk.blocks.ViewHolderGenerator;
import io.intercom.android.sdk.blocks.lib.Blocks;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import r0.C2550z0;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0001\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00102\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0010H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/block/BlockRenderData;", "blockRenderData", "", "isAttachmentFromAdmin", "Lio/intercom/android/sdk/survey/block/SuffixText;", "suffixText", "enabled", "", "conversationId", "Lio/intercom/android/sdk/survey/block/ImageRenderType;", "imageRenderType", "Lkotlin/Function0;", "Llf/M;", "onClick", "Lkotlin/Function1;", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "onCreateTicket", "LQ0/L;", "onLayoutResult", "BlockView", "(Lk0/i;Lio/intercom/android/sdk/survey/block/BlockRenderData;ZLio/intercom/android/sdk/survey/block/SuffixText;ZLjava/lang/String;Lio/intercom/android/sdk/survey/block/ImageRenderType;Lyf/a;Lyf/l;Lyf/l;LY/m;II)V", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "block", "Lr0/x0;", "textColor", "RenderLegacyBlocks-sW7UJKQ", "(Lio/intercom/android/sdk/blocks/lib/models/Block;JLk0/i;Ljava/lang/String;LY/m;II)V", "RenderLegacyBlocks", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BlockViewKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                io.intercom.android.sdk.blocks.lib.BlockType[] r0 = io.intercom.android.sdk.blocks.lib.BlockType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.IMAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.HEADING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.SUBHEADING     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.ORDEREDLIST     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.UNORDEREDLIST     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.CREATETICKETCARD     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.MESSENGERCARD     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.CODE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.ATTACHMENTLIST     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.LOCAL_ATTACHMENT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.CONVERSATIONRATING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.LINKLIST     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.VIDEOFILE     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.block.BlockViewKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0116, code lost:
        r24 = r14;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02f1, code lost:
        r0.M();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void BlockView(k0.i r25, io.intercom.android.sdk.survey.block.BlockRenderData r26, boolean r27, io.intercom.android.sdk.survey.block.SuffixText r28, boolean r29, java.lang.String r30, io.intercom.android.sdk.survey.block.ImageRenderType r31, yf.C6787a r32, yf.C6798l r33, yf.C6798l r34, Y.C1500m r35, int r36, int r37) {
        /*
            r2 = r26
            r11 = r36
            r12 = r37
            java.lang.String r0 = "blockRenderData"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = 363988683(0x15b206cb, float:7.1904345E-26)
            r1 = r35
            Y.m r0 = r1.h(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001b
            k0.i$a r1 = k0.i.f23074a
            goto L_0x001d
        L_0x001b:
            r1 = r25
        L_0x001d:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x0023
            r3 = 0
            goto L_0x0025
        L_0x0023:
            r3 = r27
        L_0x0025:
            r5 = r12 & 8
            if (r5 == 0) goto L_0x0030
            io.intercom.android.sdk.survey.block.SuffixText$Companion r5 = io.intercom.android.sdk.survey.block.SuffixText.Companion
            io.intercom.android.sdk.survey.block.SuffixText r5 = r5.getNO_SUFFIX()
            goto L_0x0032
        L_0x0030:
            r5 = r28
        L_0x0032:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0038
            r6 = 1
            goto L_0x003a
        L_0x0038:
            r6 = r29
        L_0x003a:
            r8 = r12 & 32
            if (r8 == 0) goto L_0x0041
            java.lang.String r8 = ""
            goto L_0x0043
        L_0x0041:
            r8 = r30
        L_0x0043:
            r9 = r12 & 64
            if (r9 == 0) goto L_0x004a
            io.intercom.android.sdk.survey.block.ImageRenderType r9 = io.intercom.android.sdk.survey.block.ImageRenderType.CROPPED
            goto L_0x004c
        L_0x004a:
            r9 = r31
        L_0x004c:
            r10 = r12 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0052
            r10 = 0
            goto L_0x0054
        L_0x0052:
            r10 = r32
        L_0x0054:
            r14 = r12 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x005a
            r15 = 0
            goto L_0x005c
        L_0x005a:
            r15 = r33
        L_0x005c:
            r14 = r12 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x0066
            io.intercom.android.sdk.survey.block.i r14 = new io.intercom.android.sdk.survey.block.i
            r14.<init>()
            goto L_0x0068
        L_0x0066:
            r14 = r34
        L_0x0068:
            r0.x0 r16 = r26.m432getTextColorQN2ZGVo()
            if (r16 == 0) goto L_0x0073
            long r16 = r16.y()
            goto L_0x0079
        L_0x0073:
            r0.x0$a r16 = r0.C2544x0.f25560b
            long r16 = r16.a()
        L_0x0079:
            io.intercom.android.sdk.blocks.lib.models.Block r13 = r26.getBlock()
            boolean r18 = io.intercom.android.sdk.Injector.isNotInitialised()
            if (r18 != 0) goto L_0x00c4
            io.intercom.android.sdk.Injector r18 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.Provider r18 = r18.getAppConfigProvider()
            java.lang.Object r18 = r18.get()
            r4 = r18
            io.intercom.android.sdk.identity.AppConfig r4 = (io.intercom.android.sdk.identity.AppConfig) r4
            java.lang.String r7 = "new-block-rendering-killswitch"
            boolean r4 = r4.hasFeature(r7)
            if (r4 == 0) goto L_0x00c4
            r4 = 1198668947(0x47723c93, float:62012.574)
            r0.T(r4)
            int r4 = r11 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r4 = r4 | 8
            r7 = 8
            r18 = 0
            r27 = r13
            r28 = r16
            r30 = r1
            r31 = r18
            r32 = r0
            r33 = r4
            r34 = r7
            m445RenderLegacyBlockssW7UJKQ(r27, r28, r30, r31, r32, r33, r34)
            r0.M()
            r24 = r14
            r4 = r15
            goto L_0x02f4
        L_0x00c4:
            r4 = 1198835541(0x4774c755, float:62663.332)
            r0.T(r4)
            io.intercom.android.sdk.survey.block.BlockViewKt$BlockView$textBlock$1 r4 = new io.intercom.android.sdk.survey.block.BlockViewKt$BlockView$textBlock$1
            r4.<init>(r2, r5, r14)
            r7 = 54
            r2 = 1618406847(0x6076edbf, float:7.117235E19)
            r12 = 1
            g0.a r2 = g0.c.e(r2, r12, r4, r0, r7)
            io.intercom.android.sdk.blocks.lib.BlockType r4 = r13.getType()
            if (r4 != 0) goto L_0x00e1
            r4 = -1
            goto L_0x00e9
        L_0x00e1:
            int[] r7 = io.intercom.android.sdk.survey.block.BlockViewKt.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r7[r4]
        L_0x00e9:
            r7 = 6
            switch(r4) {
                case 1: goto L_0x02c1;
                case 2: goto L_0x02ad;
                case 3: goto L_0x02ad;
                case 4: goto L_0x02ad;
                case 5: goto L_0x02ad;
                case 6: goto L_0x02ad;
                case 7: goto L_0x0276;
                case 8: goto L_0x020e;
                case 9: goto L_0x01e8;
                case 10: goto L_0x01c6;
                case 11: goto L_0x01a4;
                case 12: goto L_0x0180;
                case 13: goto L_0x015d;
                case 14: goto L_0x011b;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            r2 = 1201739187(0x47a115b3, float:82475.4)
            r0.T(r2)
            boolean r2 = io.intercom.android.sdk.Injector.isNotInitialised()
            if (r2 != 0) goto L_0x0113
            int r2 = r11 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | 8
            r4 = 8
            r7 = 0
            r27 = r13
            r28 = r16
            r30 = r1
            r31 = r7
            r32 = r0
            r33 = r2
            r34 = r4
            m445RenderLegacyBlockssW7UJKQ(r27, r28, r30, r31, r32, r33, r34)
        L_0x0113:
            r0.M()
        L_0x0116:
            r24 = r14
            r4 = r15
            goto L_0x02f1
        L_0x011b:
            r2 = -1208180414(0xffffffffb7fca142, float:-3.0115832E-5)
            r0.T(r2)
            java.lang.String r2 = r13.getUrl()
            int r4 = r2.length()
            if (r4 != 0) goto L_0x0133
            android.net.Uri r2 = r13.getLocalUri()
            java.lang.String r2 = r2.toString()
        L_0x0133:
            java.lang.String r4 = "ifEmpty(...)"
            kotlin.jvm.internal.C6496s.g(r2, r4)
            java.lang.String r4 = r13.getThumbnailUrl()
            kotlin.jvm.internal.C6496s.e(r4)
            int r7 = r4.length()
            if (r7 <= 0) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r4 = 0
        L_0x0147:
            r7 = r11 & 14
            r12 = 0
            r27 = r1
            r28 = r2
            r29 = r4
            r30 = r0
            r31 = r7
            r32 = r12
            io.intercom.android.sdk.survey.block.VideoFileBlockKt.VideoFileBlock(r27, r28, r29, r30, r31, r32)
            r0.M()
            goto L_0x0116
        L_0x015d:
            r2 = -1208186364(0xffffffffb7fc8a04, float:-3.010501E-5)
            r0.T(r2)
            int r2 = r11 >> 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 64
            r4 = 1
            r7 = 0
            r27 = r7
            r28 = r13
            r29 = r16
            r31 = r8
            r32 = r0
            r33 = r2
            r34 = r4
            io.intercom.android.sdk.survey.block.LinkListBlockKt.m456LinkListBlockcf5BqRc(r27, r28, r29, r31, r32, r33, r34)
            r0.M()
            goto L_0x0116
        L_0x0180:
            r2 = -1208193150(0xffffffffb7fc6f82, float:-3.0092666E-5)
            r0.T(r2)
            int r2 = r11 >> 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 64
            r4 = 1
            r7 = 0
            r27 = r7
            r28 = r26
            r29 = r16
            r31 = r8
            r32 = r0
            r33 = r2
            r34 = r4
            io.intercom.android.sdk.survey.block.ConversationRatingBlockKt.m455ConversationRatingBlockcf5BqRc(r27, r28, r29, r31, r32, r33, r34)
            r0.M()
            goto L_0x0116
        L_0x01a4:
            r2 = -1208196782(0xffffffffb7fc6152, float:-3.008606E-5)
            r0.T(r2)
            r2 = r11 & 14
            r2 = r2 | 64
            r4 = r11 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r4 = 0
            r27 = r1
            r28 = r26
            r29 = r3
            r30 = r0
            r31 = r2
            r32 = r4
            io.intercom.android.sdk.survey.block.AttachmentBlockKt.AttachmentBlock(r27, r28, r29, r30, r31, r32)
            r0.M()
            goto L_0x0116
        L_0x01c6:
            r2 = -1208200238(0xffffffffb7fc53d2, float:-3.0079773E-5)
            r0.T(r2)
            r2 = r11 & 14
            r2 = r2 | 64
            r4 = r11 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r4 = 0
            r27 = r1
            r28 = r26
            r29 = r3
            r30 = r0
            r31 = r2
            r32 = r4
            io.intercom.android.sdk.survey.block.AttachmentBlockKt.AttachmentBlock(r27, r28, r29, r30, r31, r32)
            r0.M()
            goto L_0x0116
        L_0x01e8:
            r2 = -1208203165(0xffffffffb7fc4863, float:-3.0074449E-5)
            r0.T(r2)
            int r2 = r11 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 8
            int r4 = r11 >> 21
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r4 = 0
            r27 = r13
            r28 = r1
            r29 = r14
            r30 = r0
            r31 = r2
            r32 = r4
            io.intercom.android.sdk.survey.block.CodeBlockKt.CodeBlock(r27, r28, r29, r30, r31, r32)
            r0.M()
            goto L_0x0116
        L_0x020e:
            r4 = 1200010069(0x4786b355, float:68966.664)
            r0.T(r4)
            java.lang.String r4 = r13.getFallbackUrl()
            java.lang.String r12 = "getFallbackUrl(...)"
            kotlin.jvm.internal.C6496s.g(r4, r12)
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x025e
            r2 = 1200059762(0x47877572, float:69354.89)
            r0.T(r2)
            java.lang.String r2 = r13.getFallbackUrl()
            kotlin.jvm.internal.C6496s.g(r2, r12)
            io.intercom.android.sdk.ui.component.IntercomCardStyle r13 = io.intercom.android.sdk.ui.component.IntercomCardStyle.INSTANCE
            int r4 = io.intercom.android.sdk.ui.component.IntercomCardStyle.$stable
            int r22 = r4 << 15
            r23 = 31
            r4 = 0
            r16 = 0
            r18 = 0
            r7 = 0
            r20 = 0
            r24 = r14
            r14 = r4
            r4 = r15
            r15 = r16
            r17 = r18
            r19 = r7
            r21 = r0
            io.intercom.android.sdk.ui.component.IntercomCardStyle$Style r7 = r13.m590conversationCardStylePEIptTM(r14, r15, r17, r19, r20, r21, r22, r23)
            int r12 = io.intercom.android.sdk.ui.component.IntercomCardStyle.Style.$stable
            int r12 = r12 << 3
            r12 = r12 | 384(0x180, float:5.38E-43)
            r14 = 0
            io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt.LegacyMessengerAppCard(r2, r7, r14, r0, r12)
            r0.M()
            goto L_0x0271
        L_0x025e:
            r24 = r14
            r4 = r15
            r12 = 1200312350(0x478b501e, float:71328.234)
            r0.T(r12)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.invoke(r0, r7)
            r0.M()
        L_0x0271:
            r0.M()
            goto L_0x02f1
        L_0x0276:
            r24 = r14
            r4 = r15
            r14 = 0
            r2 = 1199400237(0x477d652d, float:64869.176)
            r0.T(r2)
            if (r6 == 0) goto L_0x028d
            io.intercom.android.sdk.blocks.lib.models.TicketType r2 = r13.getTicketType()
            boolean r2 = r2.getArchived()
            if (r2 != 0) goto L_0x028d
            goto L_0x028e
        L_0x028d:
            r12 = r14
        L_0x028e:
            k0.i$a r2 = k0.i.f23074a
            io.intercom.android.sdk.survey.block.j r7 = new io.intercom.android.sdk.survey.block.j
            r7.<init>(r12, r4, r13, r10)
            r13 = 70
            r14 = 0
            r27 = r2
            r28 = r26
            r29 = r12
            r30 = r7
            r31 = r0
            r32 = r13
            r33 = r14
            io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt.CreateTicketCard(r27, r28, r29, r30, r31, r32, r33)
            r0.M()
            goto L_0x02f1
        L_0x02ad:
            r24 = r14
            r4 = r15
            r12 = -1208237988(0xffffffffb7fbc05c, float:-3.0011106E-5)
            r0.T(r12)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.invoke(r0, r7)
            r0.M()
            goto L_0x02f1
        L_0x02c1:
            r24 = r14
            r4 = r15
            r2 = -1208246307(0xffffffffb7fb9fdd, float:-2.9995974E-5)
            r0.T(r2)
            int r2 = r11 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 8
            int r7 = r11 >> 6
            r12 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r12
            r2 = r2 | r7
            r7 = 12
            r12 = 0
            r14 = 0
            r27 = r13
            r28 = r1
            r29 = r12
            r30 = r14
            r31 = r9
            r32 = r0
            r33 = r2
            r34 = r7
            io.intercom.android.sdk.survey.block.ImageBlockKt.ImageBlock(r27, r28, r29, r30, r31, r32, r33, r34)
            r0.M()
        L_0x02f1:
            r0.M()
        L_0x02f4:
            Y.Y0 r13 = r0.k()
            if (r13 == 0) goto L_0x0312
            io.intercom.android.sdk.survey.block.k r14 = new io.intercom.android.sdk.survey.block.k
            r0 = r14
            r2 = r26
            r12 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r12
            r10 = r24
            r11 = r36
            r12 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0312:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.block.BlockViewKt.BlockView(k0.i, io.intercom.android.sdk.survey.block.BlockRenderData, boolean, io.intercom.android.sdk.survey.block.SuffixText, boolean, java.lang.String, io.intercom.android.sdk.survey.block.ImageRenderType, yf.a, yf.l, yf.l, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M BlockView$lambda$0(L l10) {
        C6496s.h(l10, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BlockView$lambda$1(boolean z10, C6798l lVar, Block block, C6787a aVar) {
        C6496s.h(block, "$block");
        if (z10) {
            if (lVar != null) {
                TicketType ticketType = block.getTicketType();
                C6496s.g(ticketType, "getTicketType(...)");
                lVar.invoke(ticketType);
            }
        } else if (aVar != null) {
            aVar.invoke();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M BlockView$lambda$4(i iVar, BlockRenderData blockRenderData, boolean z10, SuffixText suffixText, boolean z11, String str, ImageRenderType imageRenderType, C6787a aVar, C6798l lVar, C6798l lVar2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(blockRenderData, "$blockRenderData");
        BlockView(iVar, blockRenderData, z10, suffixText, z11, str, imageRenderType, aVar, lVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* renamed from: RenderLegacyBlocks-sW7UJKQ  reason: not valid java name */
    public static final void m445RenderLegacyBlockssW7UJKQ(Block block, long j10, i iVar, String str, C1500m mVar, int i10, int i11) {
        i.a aVar;
        String str2;
        C6496s.h(block, "block");
        C1500m h10 = mVar.h(-119170784);
        if ((i11 & 4) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 8) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        Blocks blocks = new Blocks((Context) h10.m(AndroidCompositionLocals_androidKt.g()), LumberMill.getBlocksTwig());
        UploadingImageCache uploadingImageCache = new UploadingImageCache();
        Api api = Injector.get().getApi();
        Provider<AppConfig> appConfigProvider = Injector.get().getAppConfigProvider();
        Api api2 = Injector.get().getApi();
        C6496s.g(api2, "getApi(...)");
        Block block2 = block;
        e.a(new C6271g(blocks, block2, new ViewHolderGenerator(uploadingImageCache, api, appConfigProvider, str2, new CarouselImageClickListener(api2), new LinkOpeningButtonClickListener(Injector.get().getApi()), Injector.get().getGson(), Injector.get().getMetricTracker()), j10), aVar, (C6798l) null, h10, (i10 >> 3) & 112, 4);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6272h(block, j10, aVar, str2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final LinearLayout RenderLegacyBlocks_sW7UJKQ$lambda$6(Blocks blocks, Block block, ViewHolderGenerator viewHolderGenerator, long j10, Context context) {
        C6496s.h(blocks, "$blocks");
        C6496s.h(block, "$block");
        C6496s.h(viewHolderGenerator, "$generator");
        C6496s.h(context, "it");
        LinearLayout createBlocks = blocks.createBlocks(C6565s.e(block), viewHolderGenerator.getPostHolder());
        C6496s.e(createBlocks);
        int childCount = createBlocks.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = createBlocks.getChildAt(i10);
            if ((childAt instanceof TextView) && !(childAt instanceof Button)) {
                ((TextView) childAt).setTextColor(Color.rgb((C2550z0.k(j10) >> 16) & 255, (C2550z0.k(j10) >> 8) & 255, C2550z0.k(j10) & 255));
            }
        }
        createBlocks.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return createBlocks;
    }

    /* access modifiers changed from: private */
    public static final C6514M RenderLegacyBlocks_sW7UJKQ$lambda$7(Block block, long j10, i iVar, String str, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(block, "$block");
        m445RenderLegacyBlockssW7UJKQ(block, j10, iVar, str, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
