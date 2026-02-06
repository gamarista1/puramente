package io.intercom.android.sdk.survey.block;

import Q0.A;
import Q0.T;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import X0.e;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.q;
import b1.s;
import c1.v;
import c1.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.e2;
import t0.C2606g;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 82\u00020\u0001:\u00018BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJR\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÇ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020$H×\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H×\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u001f¨\u00069"}, d2 = {"Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "", "Lc1/v;", "fontSize", "LV0/p;", "fontWeight", "lineHeight", "Lr0/x0;", "textColor", "linkTextColor", "Lb1/j;", "textAlign", "<init>", "(JLV0/p;JLr0/x0;Lr0/x0;Lb1/j;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LQ0/T;", "toTextStyle$intercom_sdk_base_release", "()LQ0/T;", "toTextStyle", "component1-XSAIIZE", "()J", "component1", "component2", "()LV0/p;", "component3-XSAIIZE", "component3", "component4-QN2ZGVo", "()Lr0/x0;", "component4", "component5-QN2ZGVo", "component5", "component6-buA522U", "()Lb1/j;", "component6", "copy--ZsBm6Y", "(JLV0/p;JLr0/x0;Lr0/x0;Lb1/j;)Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getFontSize-XSAIIZE", "LV0/p;", "getFontWeight", "getLineHeight-XSAIIZE", "Lr0/x0;", "getTextColor-QN2ZGVo", "getLinkTextColor-QN2ZGVo", "Lb1/j;", "getTextAlign-buA522U", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BlockRenderTextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final BlockRenderTextStyle paragraphDefault = new BlockRenderTextStyle(w.f(16), p.f8210b.c(), 0, (C2544x0) null, (C2544x0) null, (j) null, 60, (DefaultConstructorMarker) null);
    private final long fontSize;
    private final p fontWeight;
    private final long lineHeight;
    private final C2544x0 linkTextColor;
    private final j textAlign;
    private final C2544x0 textColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle$Companion;", "", "<init>", "()V", "paragraphDefault", "Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "getParagraphDefault", "()Lio/intercom/android/sdk/survey/block/BlockRenderTextStyle;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BlockRenderTextStyle getParagraphDefault() {
            return BlockRenderTextStyle.paragraphDefault;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BlockRenderTextStyle(long j10, p pVar, long j11, C2544x0 x0Var, C2544x0 x0Var2, j jVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, pVar, j11, x0Var, x0Var2, jVar);
    }

    /* renamed from: copy--ZsBm6Y$default  reason: not valid java name */
    public static /* synthetic */ BlockRenderTextStyle m433copyZsBm6Y$default(BlockRenderTextStyle blockRenderTextStyle, long j10, p pVar, long j11, C2544x0 x0Var, C2544x0 x0Var2, j jVar, int i10, Object obj) {
        long j12;
        p pVar2;
        long j13;
        C2544x0 x0Var3;
        C2544x0 x0Var4;
        j jVar2;
        BlockRenderTextStyle blockRenderTextStyle2 = blockRenderTextStyle;
        if ((i10 & 1) != 0) {
            j12 = blockRenderTextStyle2.fontSize;
        } else {
            j12 = j10;
        }
        if ((i10 & 2) != 0) {
            pVar2 = blockRenderTextStyle2.fontWeight;
        } else {
            pVar2 = pVar;
        }
        if ((i10 & 4) != 0) {
            j13 = blockRenderTextStyle2.lineHeight;
        } else {
            j13 = j11;
        }
        if ((i10 & 8) != 0) {
            x0Var3 = blockRenderTextStyle2.textColor;
        } else {
            x0Var3 = x0Var;
        }
        if ((i10 & 16) != 0) {
            x0Var4 = blockRenderTextStyle2.linkTextColor;
        } else {
            x0Var4 = x0Var2;
        }
        if ((i10 & 32) != 0) {
            jVar2 = blockRenderTextStyle2.textAlign;
        } else {
            jVar2 = jVar;
        }
        return blockRenderTextStyle.m439copyZsBm6Y(j12, pVar2, j13, x0Var3, x0Var4, jVar2);
    }

    /* renamed from: component1-XSAIIZE  reason: not valid java name */
    public final long m434component1XSAIIZE() {
        return this.fontSize;
    }

    public final p component2() {
        return this.fontWeight;
    }

    /* renamed from: component3-XSAIIZE  reason: not valid java name */
    public final long m435component3XSAIIZE() {
        return this.lineHeight;
    }

    /* renamed from: component4-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m436component4QN2ZGVo() {
        return this.textColor;
    }

    /* renamed from: component5-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m437component5QN2ZGVo() {
        return this.linkTextColor;
    }

    /* renamed from: component6-buA522U  reason: not valid java name */
    public final j m438component6buA522U() {
        return this.textAlign;
    }

    /* renamed from: copy--ZsBm6Y  reason: not valid java name */
    public final BlockRenderTextStyle m439copyZsBm6Y(long j10, p pVar, long j11, C2544x0 x0Var, C2544x0 x0Var2, j jVar) {
        C6496s.h(pVar, "fontWeight");
        return new BlockRenderTextStyle(j10, pVar, j11, x0Var, x0Var2, jVar, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockRenderTextStyle)) {
            return false;
        }
        BlockRenderTextStyle blockRenderTextStyle = (BlockRenderTextStyle) obj;
        return v.e(this.fontSize, blockRenderTextStyle.fontSize) && C6496s.c(this.fontWeight, blockRenderTextStyle.fontWeight) && v.e(this.lineHeight, blockRenderTextStyle.lineHeight) && C6496s.c(this.textColor, blockRenderTextStyle.textColor) && C6496s.c(this.linkTextColor, blockRenderTextStyle.linkTextColor) && C6496s.c(this.textAlign, blockRenderTextStyle.textAlign);
    }

    /* renamed from: getFontSize-XSAIIZE  reason: not valid java name */
    public final long m440getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    public final p getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLineHeight-XSAIIZE  reason: not valid java name */
    public final long m441getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    /* renamed from: getLinkTextColor-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m442getLinkTextColorQN2ZGVo() {
        return this.linkTextColor;
    }

    /* renamed from: getTextAlign-buA522U  reason: not valid java name */
    public final j m443getTextAlignbuA522U() {
        return this.textAlign;
    }

    /* renamed from: getTextColor-QN2ZGVo  reason: not valid java name */
    public final C2544x0 m444getTextColorQN2ZGVo() {
        return this.textColor;
    }

    public int hashCode() {
        int i10 = ((((v.i(this.fontSize) * 31) + this.fontWeight.hashCode()) * 31) + v.i(this.lineHeight)) * 31;
        C2544x0 x0Var = this.textColor;
        int i11 = 0;
        int w10 = (i10 + (x0Var == null ? 0 : C2544x0.w(x0Var.y()))) * 31;
        C2544x0 x0Var2 = this.linkTextColor;
        int w11 = (w10 + (x0Var2 == null ? 0 : C2544x0.w(x0Var2.y()))) * 31;
        j jVar = this.textAlign;
        if (jVar != null) {
            i11 = j.l(jVar.n());
        }
        return w11 + i11;
    }

    public String toString() {
        return "BlockRenderTextStyle(fontSize=" + v.j(this.fontSize) + ", fontWeight=" + this.fontWeight + ", lineHeight=" + v.j(this.lineHeight) + ", textColor=" + this.textColor + ", linkTextColor=" + this.linkTextColor + ", textAlign=" + this.textAlign + ')';
    }

    public final T toTextStyle$intercom_sdk_base_release() {
        long h10;
        int f10;
        C2544x0 x0Var = this.textColor;
        if (x0Var != null) {
            h10 = x0Var.y();
        } else {
            h10 = C2544x0.f25560b.h();
        }
        long j10 = h10;
        long j11 = this.fontSize;
        p pVar = this.fontWeight;
        long j12 = this.lineHeight;
        j jVar = this.textAlign;
        if (jVar != null) {
            f10 = jVar.n();
        } else {
            f10 = j.f19110b.f();
        }
        return new T(j10, j11, pVar, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (C2606g) null, f10, 0, j12, (q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16613368, (DefaultConstructorMarker) null);
    }

    private BlockRenderTextStyle(long j10, p pVar, long j11, C2544x0 x0Var, C2544x0 x0Var2, j jVar) {
        C6496s.h(pVar, "fontWeight");
        this.fontSize = j10;
        this.fontWeight = pVar;
        this.lineHeight = j11;
        this.textColor = x0Var;
        this.linkTextColor = x0Var2;
        this.textAlign = jVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BlockRenderTextStyle(long r13, V0.p r15, long r16, r0.C2544x0 r18, r0.C2544x0 r19, b1.j r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21 & 4
            if (r0 == 0) goto L_0x000c
            c1.v$a r0 = c1.v.f19242b
            long r0 = r0.a()
            r6 = r0
            goto L_0x000e
        L_0x000c:
            r6 = r16
        L_0x000e:
            r0 = r21 & 8
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r8 = r1
            goto L_0x0017
        L_0x0015:
            r8 = r18
        L_0x0017:
            r0 = r21 & 16
            if (r0 == 0) goto L_0x001d
            r9 = r8
            goto L_0x001f
        L_0x001d:
            r9 = r19
        L_0x001f:
            r0 = r21 & 32
            if (r0 == 0) goto L_0x0025
            r10 = r1
            goto L_0x0027
        L_0x0025:
            r10 = r20
        L_0x0027:
            r11 = 0
            r2 = r12
            r3 = r13
            r5 = r15
            r2.<init>(r3, r5, r6, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.block.BlockRenderTextStyle.<init>(long, V0.p, long, r0.x0, r0.x0, b1.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
