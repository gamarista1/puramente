package io.intercom.android.sdk.survey.ui.components;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.a0;
import H0.F;
import J0.C1241g;
import V.T0;
import V0.n;
import V0.p;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import c1.w;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.survey.block.SuffixText;
import io.intercom.android.sdk.survey.ui.components.validation.ValidationErrorComponentKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.ArrayList;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000:\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001ae\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "title", "Lio/intercom/android/sdk/ui/common/StringProvider;", "description", "", "isRequired", "Lio/intercom/android/sdk/survey/ValidationError;", "validationError", "LV0/p;", "fontWeight", "Lc1/v;", "fontSize", "Lkotlin/Function0;", "Llf/M;", "error", "", "titleStringRes", "QuestionHeader-n1tc1qA", "(Ljava/util/List;Lio/intercom/android/sdk/ui/common/StringProvider;ZLio/intercom/android/sdk/survey/ValidationError;LV0/p;JLyf/p;Ljava/lang/Integer;LY/m;II)V", "QuestionHeader", "HeaderWithError", "(LY/m;I)V", "HeaderWithoutError", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QuestionHeaderComponentKt {
    public static final void HeaderWithError(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(784176451);
        if (i10 != 0 || !h10.i()) {
            m468QuestionHeadern1tc1qA(C6565s.e(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("How would your rate your experience?")), (StringProvider) null, true, new ValidationError.ValidationStringError(R.string.intercom_surveys_required_response, (List) null, 2, (DefaultConstructorMarker) null), p.f8210b.c(), w.f(14), (yf.p) null, (Integer) null, h10, 225672, 194);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6292o(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HeaderWithError$lambda$7(int i10, C1500m mVar, int i11) {
        HeaderWithError(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void HeaderWithoutError(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1382338223);
        if (i10 != 0 || !h10.i()) {
            i h11 = q.h(i.f23074a, 0.0f, 1, (Object) null);
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), h10, 0);
            int a11 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = h.e(h10, h11);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a12 = aVar.a();
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
            F1.b(a13, a10, aVar.c());
            F1.b(a13, p10, aVar.e());
            yf.p b10 = aVar.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar.d());
            C1093k kVar = C1093k.f978a;
            m468QuestionHeadern1tc1qA(C6565s.e(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("How would your rate your experience?")), new StringProvider.ActualString("Please select a rating"), true, ValidationError.NoValidationError.INSTANCE, p.f8210b.c(), w.f(16), (yf.p) null, (Integer) null, h10, (StringProvider.ActualString.$stable << 3) | 224648, 192);
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6294q(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HeaderWithoutError$lambda$9(int i10, C1500m mVar, int i11) {
        HeaderWithoutError(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* renamed from: QuestionHeader-n1tc1qA  reason: not valid java name */
    public static final void m468QuestionHeadern1tc1qA(List<Block.Builder> list, StringProvider stringProvider, boolean z10, ValidationError validationError, p pVar, long j10, yf.p pVar2, Integer num, C1500m mVar, int i10, int i11) {
        int i12;
        StringProvider stringProvider2;
        yf.p pVar3;
        Integer num2;
        C6514M m10;
        long j11;
        List<Block.Builder> list2 = list;
        ValidationError validationError2 = validationError;
        int i13 = i11;
        C6496s.h(list2, b.f37461S);
        C6496s.h(validationError2, "validationError");
        C6496s.h(pVar, "fontWeight");
        C1500m h10 = mVar.h(224116790);
        if ((i13 & 2) != 0) {
            stringProvider2 = new StringProvider.ActualString("");
            i12 = i10 & -113;
        } else {
            stringProvider2 = stringProvider;
            i12 = i10;
        }
        if ((i13 & 64) != 0) {
            pVar3 = null;
        } else {
            pVar3 = pVar2;
        }
        if ((i13 & 128) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        i.a aVar = i.f23074a;
        F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), h10, 0);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = h.e(h10, aVar);
        C1241g.a aVar2 = C1241g.f3853J;
        C6787a a12 = aVar2.a();
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
        F1.b(a13, a10, aVar2.c());
        F1.b(a13, p10, aVar2.e());
        yf.p b10 = aVar2.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar2.d());
        C1093k kVar = C1093k.f978a;
        long r62 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m689getError0d7_KjU();
        h10.T(788845668);
        List c10 = C6565s.c();
        c10.addAll(list2);
        if (num2 != null) {
            c10.add(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(M0.i.a(num2.intValue(), h10, (i12 >> 21) & 14)));
        }
        Iterable<Block.Builder> a14 = C6565s.a(c10);
        ArrayList arrayList = new ArrayList(C6565s.y(a14, 10));
        for (Block.Builder builder : a14) {
            arrayList.add(builder.withText(builder.build().getText()).build());
        }
        int i14 = 0;
        for (Object next : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C6565s.x();
            }
            Block block = (Block) next;
            if (i14 != 0 || !z10) {
                h10.T(670259702);
                C6496s.e(block);
                BlockViewKt.BlockView((i) null, new BlockRenderData(block, (C2544x0) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, new BlockRenderTextStyle(j10, pVar, 0, (C2544x0) null, (C2544x0) null, (j) null, 60, (DefaultConstructorMarker) null), 14, (DefaultConstructorMarker) null), false, (SuffixText) null, false, (String) null, (ImageRenderType) null, (C6787a) null, (C6798l) null, (C6798l) null, h10, 64, 1021);
                h10.M();
            } else {
                h10.T(669360671);
                h10.T(-671143347);
                if (validationError2 instanceof ValidationError.ValidationStringError) {
                    j11 = r62;
                } else {
                    j11 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m700getPrimaryText0d7_KjU();
                }
                h10.M();
                String a15 = M0.i.a(R.string.intercom_surveys_required_response, h10, 0);
                C6496s.e(block);
                BlockViewKt.BlockView((i) null, new BlockRenderData(block, (C2544x0) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, new BlockRenderTextStyle(j10, pVar, 0, (C2544x0) null, (C2544x0) null, (j) null, 60, (DefaultConstructorMarker) null), 14, (DefaultConstructorMarker) null), false, new SuffixText(" *", a15, j11, (DefaultConstructorMarker) null), false, (String) null, (ImageRenderType) null, (C6787a) null, (C6798l) null, (C6798l) null, h10, 64, 1013);
                h10.M();
            }
            i14 = i15;
        }
        h10.M();
        h10.T(788890949);
        if (validationError2 instanceof ValidationError.ValidationStringError) {
            h10.T(-1314135158);
            a0.a(q.i(i.f23074a, c1.h.j((float) 4)), h10, 6);
            h10.T(788894911);
            if (pVar3 == null) {
                m10 = null;
            } else {
                pVar3.invoke(h10, Integer.valueOf((i12 >> 18) & 14));
                m10 = C6514M.f71813a;
            }
            h10.M();
            if (m10 == null) {
                ValidationErrorComponentKt.m470ValidationErrorComponentFNF3uiM((i) null, (ValidationError.ValidationStringError) validationError2, r62, h10, 64, 1);
            }
            h10.M();
        } else {
            h10.T(788901884);
            int i16 = StringProvider.$stable;
            int i17 = (i12 >> 3) & 14;
            boolean d02 = Sg.p.d0(stringProvider2.getText(h10, i16 | i17));
            h10.M();
            if (!d02) {
                h10.T(-1313820446);
                a0.a(q.i(i.f23074a, c1.h.j((float) 4)), h10, 6);
                String text = stringProvider2.getText(h10, i17 | i16);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i18 = IntercomTheme.$stable;
                T0.b(text, (i) null, C2544x0.o(intercomTheme.getColors(h10, i18).m700getPrimaryText0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, (n) null, (p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(h10, i18).getType04(), h10, 0, 0, 65530);
                h10.M();
            }
        }
        h10.M();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6293p(list, stringProvider2, z10, validationError, pVar, j10, pVar3, num2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M QuestionHeader_n1tc1qA$lambda$6(List list, StringProvider stringProvider, boolean z10, ValidationError validationError, p pVar, long j10, yf.p pVar2, Integer num, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$title");
        ValidationError validationError2 = validationError;
        C6496s.h(validationError2, "$validationError");
        p pVar3 = pVar;
        C6496s.h(pVar3, "$fontWeight");
        m468QuestionHeadern1tc1qA(list, stringProvider, z10, validationError2, pVar3, j10, pVar2, num, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
