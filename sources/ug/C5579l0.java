package Ug;

import java.io.Closeable;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.C6656b;
import qf.g;
import yf.C6798l;

/* renamed from: Ug.l0  reason: case insensitive filesystem */
public abstract class C5579l0 extends G implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public static final a f65393c = new a((DefaultConstructorMarker) null);

    /* renamed from: Ug.l0$a */
    public static final class a extends C6656b {

        /* renamed from: Ug.l0$a$a  reason: collision with other inner class name */
        static final class C0959a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0959a f65394a = new C0959a();

            C0959a() {
                super(1);
            }

            /* renamed from: a */
            public final C5579l0 invoke(g.b bVar) {
                if (bVar instanceof C5579l0) {
                    return (C5579l0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(G.f65311b, C0959a.f65394a);
        }
    }
}
