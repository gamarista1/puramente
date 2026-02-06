package com.revenuecat.purchases.common;

import com.revenuecat.purchases.common.events.BackendEvent;
import gh.C5978b;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.O;
import lf.C6514M;
import lh.e;
import nh.C6621b;
import nh.f;
import yf.C6798l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llh/e;", "Llf/M;", "invoke", "(Llh/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class JsonProvider$Companion$defaultJson$1 extends C6498u implements C6798l {
    public static final JsonProvider$Companion$defaultJson$1 INSTANCE = new JsonProvider$Companion$defaultJson$1();

    JsonProvider$Companion$defaultJson$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e) obj);
        return C6514M.f71813a;
    }

    public final void invoke(e eVar) {
        C6496s.h(eVar, "$this$Json");
        f fVar = new f();
        C6621b bVar = new C6621b(O.b(BackendEvent.class), (C5978b) null);
        bVar.b(O.b(BackendEvent.CustomerCenter.class), BackendEvent.CustomerCenter.Companion.serializer());
        bVar.b(O.b(BackendEvent.Paywalls.class), BackendEvent.Paywalls.Companion.serializer());
        bVar.a(fVar);
        eVar.h(fVar.f());
        eVar.c("discriminator");
        eVar.d(false);
        eVar.f(true);
    }
}
