package io.intercom.android.sdk.survey.block;

import P.s;
import Q0.C;
import Q0.C1321d;
import Q0.C1338v;
import Q0.L;
import Q0.N;
import Q0.O;
import Q0.T;
import Q0.y;
import Q0.z;
import V.B0;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import X0.e;
import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import Y.Y0;
import Y.o1;
import android.content.Context;
import android.text.Spanned;
import android.text.style.BulletSpan;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C1644k0;
import b1.C1869a;
import b1.C1876h;
import b1.k;
import b1.q;
import c1.d;
import c1.r;
import c1.t;
import c1.w;
import g0.c;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.ArrayList;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import r0.e2;
import t0.C2606g;
import w1.b;
import yf.C6798l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u001aA\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u000f\u0010\u001d\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001d\u0010\u001a\u001a\u000f\u0010\u001e\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001e\u0010\u001a\u001a\u000f\u0010\u001f\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001f\u0010\u001a\u001a\u000f\u0010 \u001a\u00020\bH\u0001¢\u0006\u0004\b \u0010\u001a\"\u0014\u0010!\u001a\u00020\u00138\u0002XT¢\u0006\u0006\n\u0004\b!\u0010\"\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#¨\u0006$"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/block/BlockRenderData;", "blockRenderData", "Lio/intercom/android/sdk/survey/block/SuffixText;", "suffixText", "Lkotlin/Function1;", "LQ0/L;", "Llf/M;", "onLayoutResult", "TextBlock", "(Lk0/i;Lio/intercom/android/sdk/survey/block/BlockRenderData;Lio/intercom/android/sdk/survey/block/SuffixText;Lyf/l;LY/m;II)V", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "blockRenderTextStyle", "LQ0/d;", "textToRender", "(Lio/intercom/android/sdk/blocks/lib/models/Block;Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;LY/m;I)LQ0/d;", "", "", "items", "", "isOrderedList", "textListToRender", "(Ljava/util/List;ZLio/intercom/android/sdk/survey/block/BlockRenderTextStyle;LY/m;I)LQ0/d;", "TextBlockPreview", "(LY/m;I)V", "TextBlockAlignmentPreview", "HeadingTextBlockPreview", "SubheadingTextBlockPreview", "TextBlockWithSuffixPreview", "OrderedListTextBlockPreview", "UnorderedListTextBlockPreview", "formattedText", "Ljava/lang/String;", "Ljava/util/List;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextBlockKt {
    private static final String formattedText = "Hello <b>World</b>. This <i><strike>text</strike>sentence</i> is form<b>att<u>ed</u></b> in simple html. <a href=\"https://github.com/ch4rl3x/HtmlText\">HtmlText</a>";
    private static final List<String> items = C6565s.q("First item", "Second item with very long text. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", formattedText);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                io.intercom.android.sdk.blocks.lib.BlockType[] r0 = io.intercom.android.sdk.blocks.lib.BlockType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.UNORDEREDLIST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.ORDEREDLIST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.block.TextBlockKt.WhenMappings.<clinit>():void");
        }
    }

    @IntercomPreviews
    public static final void HeadingTextBlockPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1066073995);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(1821427103, true, new TextBlockKt$HeadingTextBlockPreview$1(new Block.Builder().withType(BlockType.HEADING.getSerializedName()).withText("Heading").build()), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HeadingTextBlockPreview$lambda$15(int i10, C1500m mVar, int i11) {
        HeadingTextBlockPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void OrderedListTextBlockPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(627599340);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(644450326, true, new TextBlockKt$OrderedListTextBlockPreview$1(new Block.Builder().withType(BlockType.ORDEREDLIST.getSerializedName()).withItems(items).build()), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new I(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M OrderedListTextBlockPreview$lambda$18(int i10, C1500m mVar, int i11) {
        OrderedListTextBlockPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void SubheadingTextBlockPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1598324377);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(-756436689, true, new TextBlockKt$SubheadingTextBlockPreview$1(new Block.Builder().withType(BlockType.SUBHEADING.getSerializedName()).withText("Subheading").build()), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new A(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SubheadingTextBlockPreview$lambda$16(int i10, C1500m mVar, int i11) {
        SubheadingTextBlockPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX INFO: finally extract failed */
    public static final void TextBlock(i iVar, BlockRenderData blockRenderData, SuffixText suffixText, C6798l lVar, C1500m mVar, int i10, int i11) {
        i.a aVar;
        SuffixText suffixText2;
        G g10;
        C1321d dVar;
        C6496s.h(blockRenderData, "blockRenderData");
        C1500m h10 = mVar.h(1921477906);
        if ((i11 & 1) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i11 & 4) != 0) {
            suffixText2 = SuffixText.Companion.getNO_SUFFIX();
        } else {
            suffixText2 = suffixText;
        }
        if ((i11 & 8) != 0) {
            g10 = new G();
        } else {
            g10 = lVar;
        }
        Block block = blockRenderData.getBlock();
        BlockRenderTextStyle textStyle = blockRenderData.getTextStyle();
        C1321d textToRender = textToRender(block, textStyle, h10, 8);
        if (!C6496s.c(suffixText2, SuffixText.Companion.getNO_SUFFIX())) {
            C1321d.a aVar2 = new C1321d.a(0, 1, (DefaultConstructorMarker) null);
            aVar2.f(textToRender);
            int m10 = aVar2.m(new C(suffixText2.m463getColor0d7_KjU(), 0, (p) null, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (z) null, (C2606g) null, 65534, (DefaultConstructorMarker) null));
            try {
                aVar2.h(suffixText2.getText());
                C6514M m11 = C6514M.f71813a;
                aVar2.j(m10);
                dVar = aVar2.n();
            } catch (Throwable th2) {
                aVar2.j(m10);
                throw th2;
            }
        } else {
            dVar = textToRender;
        }
        h10.T(1265133491);
        Object A10 = h10.A();
        if (A10 == C1500m.f10026a.a()) {
            A10 = u1.d((Object) null, (o1) null, 2, (Object) null);
            h10.r(A10);
        }
        h10.M();
        s.a(c.e(1602576547, true, new TextBlockKt$TextBlock$2(textStyle, blockRenderData, block, aVar, textToRender, suffixText2, dVar, g10, (C1510r0) A10), h10, 54), h10, 6);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new H(aVar, blockRenderData, suffixText2, g10, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextBlock$lambda$0(L l10) {
        C6496s.h(l10, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TextBlock$lambda$4(i iVar, BlockRenderData blockRenderData, SuffixText suffixText, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(blockRenderData, "$blockRenderData");
        TextBlock(iVar, blockRenderData, suffixText, lVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TextBlockAlignmentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1235422502);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextBlockKt.INSTANCE.m454getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new D(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextBlockAlignmentPreview$lambda$14(int i10, C1500m mVar, int i11) {
        TextBlockAlignmentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TextBlockPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(443046075);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(-140923183, true, new TextBlockKt$TextBlockPreview$1(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(formattedText).build()), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new B(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextBlockPreview$lambda$13(int i10, C1500m mVar, int i11) {
        TextBlockPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TextBlockWithSuffixPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-979323118);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(960883112, true, new TextBlockKt$TextBlockWithSuffixPreview$1(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Paragraph with suffix").build()), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new F(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextBlockWithSuffixPreview$lambda$17(int i10, C1500m mVar, int i11) {
        TextBlockWithSuffixPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void UnorderedListTextBlockPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-321451131);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(-1307522769, true, new TextBlockKt$UnorderedListTextBlockPreview$1(new Block.Builder().withType(BlockType.UNORDEREDLIST.getSerializedName()).withItems(items).build()), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new E(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UnorderedListTextBlockPreview$lambda$19(int i10, C1500m mVar, int i11) {
        UnorderedListTextBlockPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final C1321d textListToRender(List<String> list, boolean z10, BlockRenderTextStyle blockRenderTextStyle, C1500m mVar, int i10) {
        long h10;
        List<String> list2 = list;
        boolean z11 = z10;
        C1500m mVar2 = mVar;
        C6496s.h(list2, "items");
        C6496s.h(blockRenderTextStyle, "blockRenderTextStyle");
        mVar2.T(1896823201);
        T textStyle$intercom_sdk_base_release = blockRenderTextStyle.toTextStyle$intercom_sdk_base_release();
        new BulletSpan().toString();
        N a10 = O.a(0, mVar2, 0, 1);
        mVar2.T(1608415225);
        boolean S10 = mVar2.S(textStyle$intercom_sdk_base_release) | mVar2.S(a10);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = r.b(N.b(a10, textListToRender$bullet(z11, list.size()), textStyle$intercom_sdk_base_release, 0, false, 0, 0, (t) null, (d) null, (h.b) null, false, 1020, (Object) null).B());
            mVar2.r(A10);
        }
        long j10 = ((r) A10).j();
        mVar.M();
        C1338v vVar = new C1338v(0, 0, ((d) mVar2.m(C1644k0.e())).f0(r.f(j10)), new q(0, ((d) mVar2.m(C1644k0.e())).f0(r.g(j10)), 1, (DefaultConstructorMarker) null), (y) null, (C1876h) null, 0, 0, (b1.s) null, 499, (DefaultConstructorMarker) null);
        C1321d.a aVar = new C1321d.a(0, 1, (DefaultConstructorMarker) null);
        Iterable<String> iterable = list2;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (String a11 : iterable) {
            Spanned a12 = b.a(a11, 0);
            C6496s.g(a12, "fromHtml(...)");
            Context context = (Context) mVar2.m(AndroidCompositionLocals_androidKt.g());
            k d10 = k.f19119b.d();
            C2544x0 r13 = blockRenderTextStyle.m442getLinkTextColorQN2ZGVo();
            if (r13 != null) {
                h10 = r13.y();
            } else {
                h10 = C2544x0.f25560b.h();
            }
            arrayList.add(BlockExtensionsKt.toAnnotatedString(a12, context, new C(h10, 0, (p) null, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, d10, (e2) null, (z) null, (C2606g) null, 61438, (DefaultConstructorMarker) null)));
        }
        int i11 = 0;
        for (Object next : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C6565s.x();
            }
            C1321d dVar = (C1321d) next;
            int l10 = aVar.l(vVar);
            try {
                aVar.h(textListToRender$bullet(z11, i12));
                int length = String.valueOf(list.size()).length();
                if (length > 1) {
                    int length2 = length - String.valueOf(i12).length();
                    for (int i13 = 0; i13 < length2; i13++) {
                        aVar.h("\t");
                    }
                }
                aVar.f(dVar);
                C6514M m10 = C6514M.f71813a;
                aVar.j(l10);
                if (i11 < C6565s.p(list)) {
                    int l11 = aVar.l(new C1338v(0, 0, w.f(0), (q) null, (y) null, (C1876h) null, 0, 0, (b1.s) null, 507, (DefaultConstructorMarker) null));
                    try {
                        C6496s.g(aVar.append(10), "append(...)");
                    } finally {
                        aVar.j(l11);
                    }
                }
                i11 = i12;
            } catch (Throwable th2) {
                aVar.j(l10);
                throw th2;
            }
        }
        C1321d n10 = aVar.n();
        mVar.M();
        return n10;
    }

    /* access modifiers changed from: private */
    public static final String textListToRender$bullet(boolean z10, int i10) {
        if (!z10) {
            return "•\t\t";
        }
        return i10 + ".\t\t";
    }

    private static final C1321d textToRender(Block block, BlockRenderTextStyle blockRenderTextStyle, C1500m mVar, int i10) {
        int i11;
        C1321d dVar;
        long h10;
        BlockRenderTextStyle blockRenderTextStyle2 = blockRenderTextStyle;
        C1500m mVar2 = mVar;
        mVar2.T(235049690);
        BlockType type = block.getType();
        if (type == null) {
            i11 = -1;
        } else {
            i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i11 == 1) {
            mVar2.T(-1598850751);
            List<String> items2 = block.getItems();
            C6496s.g(items2, "getItems(...)");
            dVar = textListToRender(items2, false, blockRenderTextStyle2, mVar2, ((i10 << 3) & 896) | 56);
            mVar.M();
        } else if (i11 != 2) {
            mVar2.T(-1598838680);
            Spanned a10 = b.a(block.getText(), 0);
            C6496s.g(a10, "fromHtml(...)");
            Context context = (Context) mVar2.m(AndroidCompositionLocals_androidKt.g());
            k d10 = k.f19119b.d();
            C2544x0 r02 = blockRenderTextStyle.m442getLinkTextColorQN2ZGVo();
            if (r02 != null) {
                h10 = r02.y();
            } else {
                h10 = C2544x0.f25560b.h();
            }
            dVar = BlockExtensionsKt.toAnnotatedString(a10, context, new C(h10, 0, (p) null, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, d10, (e2) null, (z) null, (C2606g) null, 61438, (DefaultConstructorMarker) null));
            mVar.M();
        } else {
            mVar2.T(-1598845600);
            List<String> items3 = block.getItems();
            C6496s.g(items3, "getItems(...)");
            dVar = textListToRender(items3, true, blockRenderTextStyle2, mVar2, ((i10 << 3) & 896) | 56);
            mVar.M();
        }
        mVar.M();
        return dVar;
    }
}
