package h0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.V;
import yf.C6798l;
import yf.p;

/* renamed from: h0.a  reason: case insensitive filesystem */
public abstract class C2017a {

    /* renamed from: h0.a$a  reason: collision with other inner class name */
    static final class C0352a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f21096a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0352a(p pVar) {
            super(2);
            this.f21096a = pVar;
        }

        /* renamed from: a */
        public final Object invoke(C2028l lVar, Object obj) {
            List list = (List) this.f21096a.invoke(lVar, obj);
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = list.get(i10);
                if (obj2 == null || lVar.a(obj2)) {
                    i10++;
                } else {
                    throw new IllegalArgumentException("item can't be saved");
                }
            }
            Collection collection = list;
            if (!collection.isEmpty()) {
                return new ArrayList(collection);
            }
            return null;
        }
    }

    public static final C2026j a(p pVar, C6798l lVar) {
        C0352a aVar = new C0352a(pVar);
        C6496s.f(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return C2027k.a(aVar, (C6798l) V.f(lVar, 1));
    }
}
