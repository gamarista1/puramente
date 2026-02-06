package Cc;

import Eb.C4282c;
import Eb.q;
import android.content.Context;

public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static C4282c b(String str, String str2) {
        return C4282c.l(f.a(str, str2), f.class);
    }

    public static C4282c c(String str, a aVar) {
        return C4282c.m(f.class).b(q.l(Context.class)).f(new g(str, aVar)).d();
    }
}
