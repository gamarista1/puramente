package io.intercom.android.sdk.survey.block;

import V0.p;
import b1.j;
import c1.w;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019H×\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\rR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b)\u0010\rR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010\r¨\u0006+"}, d2 = {"Lio/intercom/android/sdk/survey/block/BlockRenderData;", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "block", "Lr0/x0;", "textColor", "Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "headingTextStyle", "subHeadingTextStyle", "paragraphTextStyle", "<init>", "(Lio/intercom/android/sdk/blocks/lib/models/Block;Lr0/x0;Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTextStyle", "()Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "component1", "()Lio/intercom/android/sdk/blocks/lib/models/Block;", "component2-QN2ZGVo", "()Lr0/x0;", "component2", "component3", "component4", "component5", "copy-ZLcQsz0", "(Lio/intercom/android/sdk/blocks/lib/models/Block;Lr0/x0;Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;)Lio/intercom/android/sdk/survey/block/BlockRenderData;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "getBlock", "Lr0/x0;", "getTextColor-QN2ZGVo", "Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "getHeadingTextStyle", "getSubHeadingTextStyle", "getParagraphTextStyle", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BlockRenderData {
    public static final int $stable = 8;
    private final Block block;
    private final BlockRenderTextStyle headingTextStyle;
    private final BlockRenderTextStyle paragraphTextStyle;
    private final BlockRenderTextStyle subHeadingTextStyle;
    private final C2544x0 textColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                io.intercom.android.sdk.blocks.lib.BlockType[] r0 = io.intercom.android.sdk.blocks.lib.BlockType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.HEADING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.SUBHEADING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.blocks.lib.BlockType r1 = io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.block.BlockRenderData.WhenMappings.<clinit>():void");
        }
    }

    public /* synthetic */ BlockRenderData(Block block2, C2544x0 x0Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, DefaultConstructorMarker defaultConstructorMarker) {
        this(block2, x0Var, blockRenderTextStyle, blockRenderTextStyle2, blockRenderTextStyle3);
    }

    /* renamed from: copy-ZLcQsz0$default  reason: not valid java name */
    public static /* synthetic */ BlockRenderData m429copyZLcQsz0$default(BlockRenderData blockRenderData, Block block2, C2544x0 x0Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            block2 = blockRenderData.block;
        }
        if ((i10 & 2) != 0) {
            x0Var = blockRenderData.textColor;
        }
        C2544x0 x0Var2 = x0Var;
        if ((i10 & 4) != 0) {
            blockRenderTextStyle = blockRenderData.headingTextStyle;
        }
        BlockRenderTextStyle blockRenderTextStyle4 = blockRenderTextStyle;
        if ((i10 & 8) != 0) {
            blockRenderTextStyle2 = blockRenderData.subHeadingTextStyle;
        }
        BlockRenderTextStyle blockRenderTextStyle5 = blockRenderTextStyle2;
        if ((i10 & 16) != 0) {
            blockRenderTextStyle3 = blockRenderData.paragraphTextStyle;
        }
        return blockRenderData.m431copyZLcQsz0(block2, x0Var2, blockRenderTextStyle4, blockRenderTextStyle5, blockRenderTextStyle3);
    }

    public final Block component1() {
        return this.block;
    }

    /* renamed from: component2-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m430component2QN2ZGVo() {
        return this.textColor;
    }

    public final BlockRenderTextStyle component3() {
        return this.headingTextStyle;
    }

    public final BlockRenderTextStyle component4() {
        return this.subHeadingTextStyle;
    }

    public final BlockRenderTextStyle component5() {
        return this.paragraphTextStyle;
    }

    /* renamed from: copy-ZLcQsz0  reason: not valid java name */
    public final BlockRenderData m431copyZLcQsz0(Block block2, C2544x0 x0Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3) {
        C6496s.h(block2, "block");
        C6496s.h(blockRenderTextStyle, "headingTextStyle");
        C6496s.h(blockRenderTextStyle2, "subHeadingTextStyle");
        C6496s.h(blockRenderTextStyle3, "paragraphTextStyle");
        return new BlockRenderData(block2, x0Var, blockRenderTextStyle, blockRenderTextStyle2, blockRenderTextStyle3, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockRenderData)) {
            return false;
        }
        BlockRenderData blockRenderData = (BlockRenderData) obj;
        return C6496s.c(this.block, blockRenderData.block) && C6496s.c(this.textColor, blockRenderData.textColor) && C6496s.c(this.headingTextStyle, blockRenderData.headingTextStyle) && C6496s.c(this.subHeadingTextStyle, blockRenderData.subHeadingTextStyle) && C6496s.c(this.paragraphTextStyle, blockRenderData.paragraphTextStyle);
    }

    public final Block getBlock() {
        return this.block;
    }

    public final BlockRenderTextStyle getHeadingTextStyle() {
        return this.headingTextStyle;
    }

    public final BlockRenderTextStyle getParagraphTextStyle() {
        return this.paragraphTextStyle;
    }

    public final BlockRenderTextStyle getSubHeadingTextStyle() {
        return this.subHeadingTextStyle;
    }

    /* renamed from: getTextColor-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m432getTextColorQN2ZGVo() {
        return this.textColor;
    }

    public final BlockRenderTextStyle getTextStyle() {
        int i10;
        BlockType type = this.block.getType();
        if (type == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i10 == 1) {
            return this.headingTextStyle;
        }
        if (i10 == 2) {
            return this.subHeadingTextStyle;
        }
        if (i10 != 3) {
            return BlockRenderTextStyle.Companion.getParagraphDefault();
        }
        return this.paragraphTextStyle;
    }

    public int hashCode() {
        int hashCode = this.block.hashCode() * 31;
        C2544x0 x0Var = this.textColor;
        return ((((((hashCode + (x0Var == null ? 0 : C2544x0.w(x0Var.y()))) * 31) + this.headingTextStyle.hashCode()) * 31) + this.subHeadingTextStyle.hashCode()) * 31) + this.paragraphTextStyle.hashCode();
    }

    public String toString() {
        return "BlockRenderData(block=" + this.block + ", textColor=" + this.textColor + ", headingTextStyle=" + this.headingTextStyle + ", subHeadingTextStyle=" + this.subHeadingTextStyle + ", paragraphTextStyle=" + this.paragraphTextStyle + ')';
    }

    private BlockRenderData(Block block2, C2544x0 x0Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3) {
        C6496s.h(block2, "block");
        C6496s.h(blockRenderTextStyle, "headingTextStyle");
        C6496s.h(blockRenderTextStyle2, "subHeadingTextStyle");
        C6496s.h(blockRenderTextStyle3, "paragraphTextStyle");
        this.block = block2;
        this.textColor = x0Var;
        this.headingTextStyle = blockRenderTextStyle;
        this.subHeadingTextStyle = blockRenderTextStyle2;
        this.paragraphTextStyle = blockRenderTextStyle3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlockRenderData(Block block2, C2544x0 x0Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(block2, (i10 & 2) != 0 ? null : x0Var, (i10 & 4) != 0 ? new BlockRenderTextStyle(w.f(48), p.f8210b.a(), w.f(56), (C2544x0) null, (C2544x0) null, (j) null, 56, (DefaultConstructorMarker) null) : blockRenderTextStyle, (i10 & 8) != 0 ? new BlockRenderTextStyle(w.f(36), p.f8210b.d(), w.f(44), (C2544x0) null, (C2544x0) null, (j) null, 56, (DefaultConstructorMarker) null) : blockRenderTextStyle2, (i10 & 16) != 0 ? BlockRenderTextStyle.Companion.getParagraphDefault() : blockRenderTextStyle3, (DefaultConstructorMarker) null);
    }
}
