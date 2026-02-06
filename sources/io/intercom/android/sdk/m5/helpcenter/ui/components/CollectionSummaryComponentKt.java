package io.intercom.android.sdk.m5.helpcenter.ui.components;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import V.B0;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.j;
import b1.k;
import b1.t;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import r0.C2550z0;
import r0.g2;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Content;", "state", "Lk0/i;", "modifier", "Llf/M;", "CollectionSummaryComponent", "(Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Content;Lk0/i;LY/m;II)V", "Landroid/content/Context;", "context", "", "Lio/intercom/android/sdk/helpcenter/sections/Author;", "authors", "", "constructByAuthorsText", "(Landroid/content/Context;Ljava/util/List;)Ljava/lang/String;", "CollectionSummaryComponentPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CollectionSummaryComponentKt {
    public static final void CollectionSummaryComponent(CollectionDetailsUiState.Content content, i iVar, C1500m mVar, int i10, int i11) {
        i.a aVar;
        int i12;
        IntercomTheme intercomTheme;
        CollectionDetailsUiState.Content content2 = content;
        int i13 = i11;
        C6496s.h(content2, "state");
        C1500m h10 = mVar.h(-2122142392);
        i.a aVar2 = (i13 & 2) != 0 ? i.f23074a : iVar;
        Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
        i h11 = q.h(aVar2, 0.0f, 1, (Object) null);
        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
        int i14 = IntercomTheme.$stable;
        i d10 = b.d(h11, intercomTheme2.getColors(h10, i14).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null);
        C1085c cVar = C1085c.f882a;
        C1085c.m g10 = cVar.g();
        c.a aVar3 = c.f23044a;
        F a10 = C1090h.a(g10, aVar3.k(), h10, 0);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = h.e(h10, d10);
        C1241g.a aVar4 = C1241g.f3853J;
        C6787a a12 = aVar4.a();
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
        F1.b(a13, a10, aVar4.c());
        F1.b(a13, p10, aVar4.e());
        p b10 = aVar4.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar4.d());
        C1093k kVar = C1093k.f978a;
        i.a aVar5 = i.f23074a;
        i i15 = n.i(aVar5, c1.h.j((float) 16));
        F a14 = C1090h.a(cVar.g(), aVar3.k(), h10, 0);
        int a15 = C1494j.a(h10, 0);
        C1523y p11 = h10.p();
        i e11 = h.e(h10, i15);
        C6787a a16 = aVar4.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a16);
        } else {
            h10.q();
        }
        C1500m a17 = F1.a(h10);
        F1.b(a17, a14, aVar4.c());
        F1.b(a17, p11, aVar4.e());
        p b11 = aVar4.b();
        if (a17.f() || !C6496s.c(a17.A(), Integer.valueOf(a15))) {
            a17.r(Integer.valueOf(a15));
            a17.V(Integer.valueOf(a15), b11);
        }
        F1.b(a17, e11, aVar4.d());
        int i16 = i14;
        IntercomTheme intercomTheme3 = intercomTheme2;
        i.a aVar6 = aVar5;
        Context context2 = context;
        i iVar2 = aVar2;
        T0.b(content.getTitle(), (i) null, intercomTheme2.getColors(h10, i14).m700getPrimaryText0d7_KjU(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme2.getTypography(h10, i14).getType04SemiBold(), h10, 0, 0, 65530);
        h10.T(2075464466);
        if (!Sg.p.d0(content.getSummary())) {
            i.a aVar7 = aVar6;
            a0.a(q.i(aVar7, c1.h.j((float) 4)), h10, 6);
            int i17 = i16;
            IntercomTheme intercomTheme4 = intercomTheme3;
            intercomTheme = intercomTheme4;
            i12 = i17;
            aVar = aVar7;
            T0.b(content.getSummary(), (i) null, intercomTheme4.getColors(h10, i17).m700getPrimaryText0d7_KjU(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme4.getTypography(h10, i17).getType04Point5(), h10, 0, 0, 65530);
        } else {
            i12 = i16;
            intercomTheme = intercomTheme3;
            aVar = aVar6;
        }
        h10.M();
        i.a aVar8 = aVar;
        a0.a(q.i(aVar8, c1.h.j((float) 20)), h10, 6);
        i h12 = q.h(aVar8, 0.0f, 1, (Object) null);
        F b12 = W.b(cVar.d(), aVar3.i(), h10, 54);
        int a18 = C1494j.a(h10, 0);
        C1523y p12 = h10.p();
        i e12 = h.e(h10, h12);
        C6787a a19 = aVar4.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a19);
        } else {
            h10.q();
        }
        C1500m a20 = F1.a(h10);
        F1.b(a20, b12, aVar4.c());
        F1.b(a20, p12, aVar4.e());
        p b13 = aVar4.b();
        if (a20.f() || !C6496s.c(a20.A(), Integer.valueOf(a18))) {
            a20.r(Integer.valueOf(a18));
            a20.V(Integer.valueOf(a18), b13);
        }
        F1.b(a20, e12, aVar4.d());
        Z z10 = Z.f873a;
        F a21 = C1090h.a(cVar.g(), aVar3.k(), h10, 0);
        int a22 = C1494j.a(h10, 0);
        C1523y p13 = h10.p();
        i e13 = h.e(h10, aVar8);
        C6787a a23 = aVar4.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a23);
        } else {
            h10.q();
        }
        C1500m a24 = F1.a(h10);
        F1.b(a24, a21, aVar4.c());
        F1.b(a24, p13, aVar4.e());
        p b14 = aVar4.b();
        if (a24.f() || !C6496s.c(a24.A(), Integer.valueOf(a22))) {
            a24.r(Integer.valueOf(a22));
            a24.V(Integer.valueOf(a22), b14);
        }
        F1.b(a24, e13, aVar4.d());
        ArticleCountComponentKt.ArticleCountComponent((i) null, content.getArticlesCount(), h10, 0, 1);
        T0.b(constructByAuthorsText(context2, content.getAuthors()), (i) null, C2550z0.d(4285887861L), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, t.f19154a.b(), false, 0, 0, (C6798l) null, intercomTheme.getTypography(h10, i12).getType04Point5(), h10, 384, 48, 63482);
        h10.u();
        Iterable<Author> V02 = C6565s.V0(content.getAuthors(), 3);
        ArrayList arrayList = new ArrayList(C6565s.y(V02, 10));
        for (Author author : V02) {
            Avatar create = Avatar.create(author.getAvatar().getImageUrl(), author.getAvatar().getInitials());
            C6496s.g(create, "create(...)");
            arrayList.add(new AvatarWrapper(create, false));
        }
        AvatarGroupKt.m136AvatarGroupJ8mCjc(arrayList, (i) null, c1.h.j((float) 32), 0, h10, 392, 10);
        h10.u();
        h10.u();
        IntercomDividerKt.IntercomDivider((i) null, h10, 0, 1);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new w(content2, iVar2, i10, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CollectionSummaryComponent$lambda$5(CollectionDetailsUiState.Content content, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(content, "$state");
        CollectionSummaryComponent(content, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void CollectionSummaryComponentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1054855652);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$CollectionSummaryComponentKt.INSTANCE.m354getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new v(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M CollectionSummaryComponentPreview$lambda$6(int i10, C1500m mVar, int i11) {
        CollectionSummaryComponentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final String constructByAuthorsText(Context context, List<Author> list) {
        CharSequence charSequence;
        if (list.isEmpty()) {
            return "";
        }
        int size = list.size();
        if (size == 1) {
            charSequence = Phrase.from(context, R.string.intercom_article_single_author).put("author_first_name", (CharSequence) ((Author) C6565s.o0(list)).getName()).format();
        } else if (size != 2) {
            charSequence = Phrase.from(context, R.string.intercom_article_multiple_authors).put("author_first_name1", (CharSequence) ((Author) C6565s.o0(list)).getName()).put("number_of_other_authors", list.size() - 1).format();
        } else {
            charSequence = Phrase.from(context, R.string.intercom_article_double_author).put("author_first_name1", (CharSequence) ((Author) C6565s.o0(list)).getName()).put("author_first_name2", (CharSequence) ((Author) C6565s.z0(list)).getName()).format();
        }
        return charSequence.toString();
    }
}
