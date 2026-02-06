package io.intercom.android.sdk.tickets;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import I.g;
import J0.C1241g;
import M0.e;
import Q0.C;
import Q0.C1321d;
import Q0.T;
import Q0.z;
import V.T0;
import V.V;
import V0.o;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import b1.C1869a;
import b1.j;
import b1.k;
import c1.h;
import c1.w;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.util.Map;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import o0.C2342e;
import r0.C2550z0;
import r0.e2;
import r0.g2;
import t0.C2606g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketDetailContentKt$TicketDetailContent$3$2 implements p {
    final /* synthetic */ TicketDetailState.TicketDetailContentState $ticketDetailContentState;

    TicketDetailContentKt$TicketDetailContent$3$2(TicketDetailState.TicketDetailContentState ticketDetailContentState) {
        this.$ticketDetailContentState = ticketDetailContentState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    /* JADX INFO: finally extract failed */
    public final void invoke(C1500m mVar, int i10) {
        i.a aVar;
        Object obj;
        boolean z10;
        boolean z11;
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            i.a aVar2 = i.f23074a;
            float f10 = (float) 16;
            i i11 = n.i(aVar2, h.j(f10));
            TicketDetailState.TicketDetailContentState ticketDetailContentState = this.$ticketDetailContentState;
            C1085c cVar = C1085c.f882a;
            C1085c.m g10 = cVar.g();
            c.a aVar3 = c.f23044a;
            F a10 = C1090h.a(g10, aVar3.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar2, i11);
            C1241g.a aVar4 = C1241g.f3853J;
            C6787a a12 = aVar4.a();
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
            F1.b(a13, a10, aVar4.c());
            F1.b(a13, p10, aVar4.e());
            p b10 = aVar4.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar4.d());
            C1093k kVar = C1093k.f978a;
            c.C0368c i12 = aVar3.i();
            float f11 = (float) 12;
            i i13 = n.i(q.h(b.d(C2342e.a(aVar2, g.c(h.j((float) 8))), C2550z0.d(4294309365L), (g2) null, 2, (Object) null), 0.0f, 1, (Object) null), h.j(f11));
            F b11 = W.b(cVar.f(), i12, mVar2, 48);
            int a14 = C1494j.a(mVar2, 0);
            C1523y p11 = mVar.p();
            i e11 = k0.h.e(mVar2, i13);
            C6787a a15 = aVar4.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a15);
            } else {
                mVar.q();
            }
            C1500m a16 = F1.a(mVar);
            F1.b(a16, b11, aVar4.c());
            F1.b(a16, p11, aVar4.e());
            p b12 = aVar4.b();
            if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
                a16.r(Integer.valueOf(a14));
                a16.V(Integer.valueOf(a14), b12);
            }
            F1.b(a16, e11, aVar4.d());
            Z z12 = Z.f873a;
            float f12 = f11;
            V.a(e.c(R.drawable.intercom_ticket_notification, mVar2, 0), (String) null, q.n(n.m(aVar2, 0.0f, h.j((float) 4), 0.0f, 0.0f, 13, (Object) null), h.j(f10)), C2550z0.d(4280427042L), mVar, 3512, 0);
            a0.a(q.r(aVar2, h.j(f10)), mVar2, 6);
            T type04 = IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType04();
            mVar2.T(1807109550);
            C1321d.a aVar5 = new C1321d.a(0, 1, (DefaultConstructorMarker) null);
            mVar2.T(1807111034);
            int m10 = aVar5.m(new C(0, 0, V0.p.f8210b.d(), (V0.n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (X0.e) null, 0, (k) null, (e2) null, (z) null, (C2606g) null, 65531, (DefaultConstructorMarker) null));
            try {
                aVar5.h(M0.i.a(R.string.intercom_youll_be_notified_here_and_by_email, mVar2, 0));
                aVar5.h(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                C6514M m11 = C6514M.f71813a;
                aVar5.j(m10);
                mVar.M();
                aVar5.h(ticketDetailContentState.getUserEmail());
                C1321d n10 = aVar5.n();
                mVar.M();
                TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
                float f13 = f10;
                T0.c(n10, (i) null, C2550z0.d(4280427042L), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, w.f(22), 0, false, 0, 0, (Map) null, (C6798l) null, type04, mVar, 384, 6, 130042);
                mVar.u();
                i.a aVar6 = aVar2;
                a0.a(q.i(aVar6, h.j((float) 24)), mVar2, 6);
                mVar2.T(-711352393);
                if (!ticketDetailContentState2.getTicketAttributes().isEmpty()) {
                    i f14 = q.f(n.k(aVar6, h.j(f12), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null);
                    F a17 = C1090h.a(cVar.g(), aVar3.k(), mVar2, 0);
                    int a18 = C1494j.a(mVar2, 0);
                    C1523y p12 = mVar.p();
                    i e12 = k0.h.e(mVar2, f14);
                    C6787a a19 = aVar4.a();
                    if (mVar.j() == null) {
                        C1494j.c();
                    }
                    mVar.F();
                    if (mVar.f()) {
                        mVar2.U(a19);
                    } else {
                        mVar.q();
                    }
                    C1500m a20 = F1.a(mVar);
                    F1.b(a20, a17, aVar4.c());
                    F1.b(a20, p12, aVar4.e());
                    p b13 = aVar4.b();
                    if (a20.f() || !C6496s.c(a20.A(), Integer.valueOf(a18))) {
                        a20.r(Integer.valueOf(a18));
                        a20.V(Integer.valueOf(a18), b13);
                    }
                    F1.b(a20, e12, aVar4.d());
                    mVar2.T(1807141865);
                    for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState2.getTicketAttributes()) {
                        String name = ticketAttribute.getName();
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i14 = IntercomTheme.$stable;
                        int i15 = i14;
                        IntercomTheme intercomTheme2 = intercomTheme;
                        T0.b(name, (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar2, i14).getType04SemiBold(), mVar, 0, 0, 65534);
                        i.a aVar7 = i.f23074a;
                        a0.a(q.i(aVar7, h.j((float) 2)), mVar2, 6);
                        Ticket.TicketAttribute ticketAttribute2 = ticketAttribute;
                        if (ticketAttribute2 instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                            mVar2.T(2134666313);
                            aVar = aVar7;
                            z11 = true;
                            T0.b(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute2).getValue(), (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme2.getTypography(mVar2, i15).getType04(), mVar, 0, 0, 65534);
                            mVar.M();
                        } else {
                            aVar = aVar7;
                            z11 = true;
                            int i16 = i15;
                            IntercomTheme intercomTheme3 = intercomTheme2;
                            if (ticketAttribute2 instanceof Ticket.TicketAttribute.ListAttribute) {
                                mVar2.T(2134970857);
                                T0.b(((Ticket.TicketAttribute.ListAttribute) ticketAttribute2).getValue(), (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme3.getTypography(mVar2, i16).getType04(), mVar, 0, 0, 65534);
                                mVar.M();
                            } else if (ticketAttribute2 instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                mVar2.T(2135285786);
                                String formatTimeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute2).getValue()) * ((long) 1000), "dd-MM-yyy, HH:mm");
                                C6496s.g(formatTimeInMillisAsDate, "formatTimeInMillisAsDate(...)");
                                T0.b(formatTimeInMillisAsDate, (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme3.getTypography(mVar2, i16).getType04(), mVar, 0, 0, 65534);
                                mVar.M();
                            } else {
                                if (ticketAttribute2 instanceof Ticket.TicketAttribute.FilesAttribute) {
                                    mVar2.T(2135785754);
                                    FIleAttachmentListKt.FileAttachmentList((i) null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute2).getValue(), mVar2, 64, 1);
                                    mVar.M();
                                    z10 = true;
                                    obj = null;
                                } else if (ticketAttribute2 instanceof Ticket.TicketAttribute.UnSupported) {
                                    mVar2.T(2135970390);
                                    z10 = true;
                                    obj = null;
                                    T0.b(((Ticket.TicketAttribute.UnSupported) ticketAttribute2).getValue().toString(), (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme3.getTypography(mVar2, i16).getType04(), mVar, 0, 0, 65534);
                                    mVar.M();
                                } else {
                                    mVar2.T(1592880732);
                                    mVar.M();
                                    throw new C6535s();
                                }
                                a0.a(q.i(aVar, h.j(f13)), mVar2, 6);
                                boolean z13 = z11;
                                boolean z14 = z10;
                                Object obj2 = obj;
                            }
                        }
                        z10 = true;
                        obj = null;
                        a0.a(q.i(aVar, h.j(f13)), mVar2, 6);
                        boolean z132 = z11;
                        boolean z142 = z10;
                        Object obj22 = obj;
                    }
                    mVar.M();
                    mVar.u();
                }
                mVar.M();
                mVar.u();
            } catch (Throwable th2) {
                aVar5.j(m10);
                throw th2;
            }
        } else {
            mVar.I();
        }
    }
}
