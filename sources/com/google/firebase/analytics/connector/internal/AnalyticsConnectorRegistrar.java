package com.google.firebase.analytics.connector.internal;

import Cc.h;
import Eb.C4282c;
import Eb.q;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import dc.C4945d;
import java.util.Arrays;
import java.util.List;
import ub.C5230g;
import xb.C5276a;

@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<C4282c> getComponents() {
        return Arrays.asList(new C4282c[]{C4282c.e(C5276a.class).b(q.l(C5230g.class)).b(q.l(Context.class)).b(q.l(C4945d.class)).f(new a()).e().d(), h.b("fire-analytics", "22.0.2")});
    }
}
