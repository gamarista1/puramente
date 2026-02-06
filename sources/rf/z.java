package Rf;

import Fg.E0;
import Gg.g;
import Of.C5487e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.C6812k;

public abstract class z implements C5487e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f64964a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6812k a(C5487e eVar, E0 e02, g gVar) {
            z zVar;
            C6812k i02;
            C6496s.h(eVar, "<this>");
            C6496s.h(e02, "typeSubstitution");
            C6496s.h(gVar, "kotlinTypeRefiner");
            if (eVar instanceof z) {
                zVar = (z) eVar;
            } else {
                zVar = null;
            }
            if (zVar != null && (i02 = zVar.i0(e02, gVar)) != null) {
                return i02;
            }
            C6812k I10 = eVar.I(e02);
            C6496s.g(I10, "getMemberScope(...)");
            return I10;
        }

        public final C6812k b(C5487e eVar, g gVar) {
            z zVar;
            C6812k m02;
            C6496s.h(eVar, "<this>");
            C6496s.h(gVar, "kotlinTypeRefiner");
            if (eVar instanceof z) {
                zVar = (z) eVar;
            } else {
                zVar = null;
            }
            if (zVar != null && (m02 = zVar.m0(gVar)) != null) {
                return m02;
            }
            C6812k Y10 = eVar.Y();
            C6496s.g(Y10, "getUnsubstitutedMemberScope(...)");
            return Y10;
        }

        private a() {
        }
    }

    /* access modifiers changed from: protected */
    public abstract C6812k i0(E0 e02, g gVar);

    /* access modifiers changed from: protected */
    public abstract C6812k m0(g gVar);
}
