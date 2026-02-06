package com.facebook.react.devsupport;

import C7.j;
import I7.b;
import I7.c;
import I7.e;
import I7.h;
import I7.i;
import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.facebook.react.devsupport.i  reason: case insensitive filesystem */
public final class C3342i implements I {

    /* renamed from: a  reason: collision with root package name */
    private static final a f40816a = new a((DefaultConstructorMarker) null);

    /* renamed from: com.facebook.react.devsupport.i$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e a(Context context, e0 e0Var, String str, boolean z10, i iVar, b bVar, int i10, Map map, j jVar, c cVar, h hVar) {
        Context context2 = context;
        C6496s.h(context2, "applicationContext");
        C6496s.h(e0Var, "reactInstanceManagerHelper");
        if (!z10) {
            return new k0();
        }
        try {
            String str2 = "com.facebook.react.devsupport" + "." + "BridgeDevSupportManager";
            C6496s.g(str2, "toString(...)");
            Object newInstance = Class.forName(str2).getConstructor(new Class[]{Context.class, e0.class, String.class, Boolean.TYPE, i.class, b.class, Integer.TYPE, Map.class, j.class, c.class, h.class}).newInstance(new Object[]{context, e0Var, str, Boolean.TRUE, iVar, bVar, Integer.valueOf(i10), map, jVar, cVar, hVar});
            C6496s.f(newInstance, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.DevSupportManager");
            return (e) newInstance;
        } catch (Exception unused) {
            return new d0(context2);
        }
    }

    public e b(Context context, e0 e0Var, String str, boolean z10, i iVar, b bVar, int i10, Map map, j jVar, c cVar, h hVar, boolean z11) {
        Context context2 = context;
        C6496s.h(context, "applicationContext");
        e0 e0Var2 = e0Var;
        C6496s.h(e0Var, "reactInstanceManagerHelper");
        if (!z11) {
            return new k0();
        }
        return new C3334a(context, e0Var, str, z10, iVar, bVar, i10, map, jVar, cVar, hVar);
    }
}
