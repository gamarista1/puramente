package Bg;

import Fg.C5366d0;
import Fg.S;
import ig.q;
import kotlin.jvm.internal.C6496s;

/* renamed from: Bg.x  reason: case insensitive filesystem */
public interface C5337x {

    /* renamed from: Bg.x$a */
    public static final class a implements C5337x {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62588a = new a();

        private a() {
        }

        public S a(q qVar, String str, C5366d0 d0Var, C5366d0 d0Var2) {
            C6496s.h(qVar, "proto");
            C6496s.h(str, "flexibleId");
            C6496s.h(d0Var, "lowerBound");
            C6496s.h(d0Var2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    S a(q qVar, String str, C5366d0 d0Var, C5366d0 d0Var2);
}
