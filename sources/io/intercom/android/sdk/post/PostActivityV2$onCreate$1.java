package io.intercom.android.sdk.post;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.N;
import C.a0;
import C.f0;
import H0.F;
import J0.C1241g;
import Ug.K;
import V.B0;
import V.C1415x0;
import V.D;
import V0.p;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.P;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.j;
import g0.C2005a;
import g0.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.survey.block.SuffixText;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.List;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import r0.C2544x0;
import r0.C2550z0;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PostActivityV2$onCreate$1 implements p {
    final /* synthetic */ PostActivityV2 this$0;

    PostActivityV2$onCreate$1(PostActivityV2 postActivityV2) {
        this.this$0 = postActivityV2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            final o a10 = m.a(0, mVar, 0, 1);
            final PostActivityV2 postActivityV2 = this.this$0;
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(1349674692, true, new p() {

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
                @f(c = "io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$1", f = "PostActivityV2.kt", l = {}, m = "invokeSuspend")
                /* renamed from: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$1  reason: invalid class name */
                static final class AnonymousClass1 extends l implements p {
                    int label;

                    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
                        return new AnonymousClass1(postActivityV2, dVar);
                    }

                    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
                        return ((AnonymousClass1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        C6680b.f();
                        if (this.label == 0) {
                            w.b(obj);
                            postActivityV2.sendPostAsRead();
                            return C6514M.f71813a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    C1500m mVar2 = mVar;
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        final PostActivityV2 postActivityV2 = postActivityV2;
                        P.g("", new AnonymousClass1((C6658d<? super AnonymousClass1>) null), mVar2, 70);
                        final Part access$getPart = postActivityV2.getPart();
                        long a10 = C2544x0.f25560b.a();
                        final PostActivityV2 postActivityV22 = postActivityV2;
                        C2005a e10 = c.e(-1416328832, true, new p() {
                            /* access modifiers changed from: private */
                            public static final C6514M invoke$lambda$0(PostActivityV2 postActivityV2) {
                                C6496s.h(postActivityV2, "this$0");
                                postActivityV2.finish();
                                return C6514M.f71813a;
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C1500m) obj, ((Number) obj2).intValue());
                                return C6514M.f71813a;
                            }

                            public final void invoke(C1500m mVar, int i10) {
                                if ((i10 & 11) != 2 || !mVar.i()) {
                                    CharSequence format = Phrase.from((Context) mVar.m(AndroidCompositionLocals_androidKt.g()), R.string.intercom_teammate_from_company).put("name", (CharSequence) access$getPart.getParticipant().getForename()).put("company", (CharSequence) ((AppConfig) postActivityV22.getAppConfigProvider().get()).getName()).format();
                                    i.a aVar = i.f23074a;
                                    Avatar avatar = access$getPart.getParticipant().getAvatar();
                                    C6496s.g(avatar, "getAvatar(...)");
                                    PostActivityV2Kt.TopBar(aVar, avatar, format.toString(), postActivityV22.getUserStatus(), new d(postActivityV22), mVar, 70);
                                    return;
                                }
                                mVar.I();
                            }
                        }, mVar2, 54);
                        final PostActivityV2 postActivityV23 = postActivityV2;
                        C2005a e11 = c.e(294322015, true, new p() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((C1500m) obj, ((Number) obj2).intValue());
                                return C6514M.f71813a;
                            }

                            public final void invoke(C1500m mVar, int i10) {
                                if ((i10 & 11) == 2 && mVar.i()) {
                                    mVar.I();
                                } else if (postActivityV23.isPreview()) {
                                    Part part = access$getPart;
                                    PostActivityV2 postActivityV2 = postActivityV23;
                                    i.a aVar = i.f23074a;
                                    F a10 = C1090h.a(C1085c.f882a.g(), k0.c.f23044a.k(), mVar, 0);
                                    int a11 = C1494j.a(mVar, 0);
                                    C1523y p10 = mVar.p();
                                    i e10 = h.e(mVar, aVar);
                                    C1241g.a aVar2 = C1241g.f3853J;
                                    C6787a a12 = aVar2.a();
                                    if (mVar.j() == null) {
                                        C1494j.c();
                                    }
                                    mVar.F();
                                    if (mVar.f()) {
                                        mVar.U(a12);
                                    } else {
                                        mVar.q();
                                    }
                                    C1500m a13 = F1.a(mVar);
                                    F1.b(a13, a10, aVar2.c());
                                    F1.b(a13, p10, aVar2.e());
                                    p b10 = aVar2.b();
                                    if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                                        a13.r(Integer.valueOf(a11));
                                        a13.V(Integer.valueOf(a11), b10);
                                    }
                                    F1.b(a13, e10, aVar2.d());
                                    C1093k kVar = C1093k.f978a;
                                    D.a((i) null, c1.h.j((float) 0.65d), C2550z0.d(2594086558L), mVar, 432, 1);
                                    PostActivityV2Kt.BottomBarContent(aVar, c.e(-391111001, true, new PostActivityV2$onCreate$1$1$3$1$1(part, postActivityV2), mVar, 54), mVar, 54);
                                    mVar.u();
                                }
                            }
                        }, mVar2, 54);
                        final o oVar = a10;
                        C1415x0.a((i) null, e10, e11, (p) null, (p) null, 0, a10, 0, (f0) null, c.e(-1777074859, true, new q() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((N) obj, (C1500m) obj2, ((Number) obj3).intValue());
                                return C6514M.f71813a;
                            }

                            public final void invoke(N n10, C1500m mVar, int i10) {
                                int i11;
                                float f10;
                                List<Block> list;
                                int i12;
                                int i13;
                                N n11 = n10;
                                C1500m mVar2 = mVar;
                                int i14 = 1;
                                C6496s.h(n11, "contentPadding");
                                if ((i10 & 14) == 0) {
                                    i11 = i10 | (mVar2.S(n11) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 91) != 18 || !mVar.i()) {
                                    i.a aVar = i.f23074a;
                                    int i15 = 16;
                                    float f11 = (float) 16;
                                    i m10 = n.m(n.h(m.d(aVar, oVar, true, (z.n) null, false, 12, (Object) null), n11), c1.h.j(f11), 0.0f, c1.h.j(f11), c1.h.j(f11), 2, (Object) null);
                                    Part part = access$getPart;
                                    F a10 = C1090h.a(C1085c.f882a.g(), k0.c.f23044a.k(), mVar2, 0);
                                    int a11 = C1494j.a(mVar2, 0);
                                    C1523y p10 = mVar.p();
                                    i e10 = h.e(mVar2, m10);
                                    C1241g.a aVar2 = C1241g.f3853J;
                                    C6787a a12 = aVar2.a();
                                    if (mVar.j() == null) {
                                        C1494j.c();
                                    }
                                    mVar.F();
                                    if (mVar.f()) {
                                        mVar2.U(a12);
                                    } else {
                                        mVar.q();
                                    }
                                    C1500m a13 = F1.a(mVar);
                                    F1.b(a13, a10, aVar2.c());
                                    F1.b(a13, p10, aVar2.e());
                                    p b10 = aVar2.b();
                                    if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                                        a13.r(Integer.valueOf(a11));
                                        a13.V(Integer.valueOf(a11), b10);
                                    }
                                    F1.b(a13, e10, aVar2.d());
                                    C1093k kVar = C1093k.f978a;
                                    a0.a(androidx.compose.foundation.layout.q.i(aVar, c1.h.j((float) 8)), mVar2, 6);
                                    List<Block> blocks = part.getBlocks();
                                    if (blocks == null) {
                                        blocks = C6565s.n();
                                    }
                                    List<Block> list2 = blocks;
                                    mVar2.T(-1177115545);
                                    int i16 = 0;
                                    for (Object next : list2) {
                                        int i17 = i16 + 1;
                                        if (i16 < 0) {
                                            C6565s.x();
                                        }
                                        Block block = (Block) next;
                                        i.a aVar3 = i.f23074a;
                                        i h10 = androidx.compose.foundation.layout.q.h(aVar3, 0.0f, i14, (Object) null);
                                        C6496s.e(block);
                                        C2544x0.a aVar4 = C2544x0.f25560b;
                                        C2544x0 k10 = C2544x0.k(aVar4.i());
                                        long i18 = aVar4.i();
                                        p.a aVar5 = V0.p.f8210b;
                                        BlockRenderTextStyle blockRenderTextStyle = new BlockRenderTextStyle(c1.w.f(24), aVar5.a(), c1.w.f(36), C2544x0.k(i18), (C2544x0) null, (j) null, 48, (DefaultConstructorMarker) null);
                                        BlockRenderTextStyle blockRenderTextStyle2 = new BlockRenderTextStyle(c1.w.f(i15), aVar5.c(), c1.w.f(36), C2544x0.k(aVar4.i()), (C2544x0) null, (j) null, 48, (DefaultConstructorMarker) null);
                                        long i19 = aVar4.i();
                                        V0.p c10 = aVar5.c();
                                        i.a aVar6 = aVar3;
                                        int i20 = i17;
                                        List<Block> list3 = list2;
                                        float f12 = f11;
                                        int i21 = i15;
                                        BlockViewKt.BlockView(h10, new BlockRenderData(block, k10, blockRenderTextStyle, blockRenderTextStyle2, new BlockRenderTextStyle(c1.w.f(i15), c10, c1.w.f(24), C2544x0.k(i19), (C2544x0) null, j.h(j.f19110b.c()), 16, (DefaultConstructorMarker) null), (DefaultConstructorMarker) null), false, (SuffixText) null, false, (String) null, ImageRenderType.FULL, (C6787a) null, (C6798l) null, (C6798l) null, mVar, 1572934, 956);
                                        if (i16 == C6565s.p(list3)) {
                                            list = list3;
                                            f10 = c1.h.j((float) 56);
                                            i13 = i20;
                                            i12 = 0;
                                        } else {
                                            BlockType type = block.getType();
                                            BlockType blockType = BlockType.PARAGRAPH;
                                            list = list3;
                                            if (type == blockType) {
                                                i13 = i20;
                                                Block block2 = (Block) C6565s.r0(list, i13);
                                                if ((block2 != null ? block2.getType() : null) == blockType) {
                                                    i12 = 0;
                                                    f10 = c1.h.j((float) 0);
                                                }
                                            } else {
                                                i13 = i20;
                                            }
                                            i12 = 0;
                                            f10 = c1.h.j(f12);
                                        }
                                        a0.a(androidx.compose.foundation.layout.q.i(aVar6, f10), mVar2, i12);
                                        i16 = i13;
                                        int i22 = i12;
                                        list2 = list;
                                        f11 = f12;
                                        i15 = i21;
                                        i14 = 1;
                                    }
                                    mVar.M();
                                    mVar.u();
                                    return;
                                }
                                mVar.I();
                            }
                        }, mVar2, 54), mVar, 806879664, 441);
                        return;
                    }
                    mVar.I();
                }
            }, mVar, 54), mVar, 3072, 7);
            return;
        }
        mVar.I();
    }
}
