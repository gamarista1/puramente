package com.google.firebase.perf.application;

import Ac.a;
import Ac.g;
import Ac.j;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.J;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;
import uc.C5233a;
import vc.C5253f;
import zc.C5313k;

public class c extends J.k {

    /* renamed from: f  reason: collision with root package name */
    private static final C5233a f57629f = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap f57630a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final a f57631b;

    /* renamed from: c  reason: collision with root package name */
    private final C5313k f57632c;

    /* renamed from: d  reason: collision with root package name */
    private final a f57633d;

    /* renamed from: e  reason: collision with root package name */
    private final d f57634e;

    public c(a aVar, C5313k kVar, a aVar2, d dVar) {
        this.f57631b = aVar;
        this.f57632c = kVar;
        this.f57633d = aVar2;
        this.f57634e = dVar;
    }

    public String a(C1769q qVar) {
        return "_st_" + qVar.getClass().getSimpleName();
    }

    public void onFragmentPaused(J j10, C1769q qVar) {
        super.onFragmentPaused(j10, qVar);
        C5233a aVar = f57629f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", qVar.getClass().getSimpleName());
        if (!this.f57630a.containsKey(qVar)) {
            aVar.k("FragmentMonitor: missed a fragment trace from %s", qVar.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) this.f57630a.get(qVar);
        this.f57630a.remove(qVar);
        g f10 = this.f57634e.f(qVar);
        if (!f10.d()) {
            aVar.k("onFragmentPaused: recorder failed to trace %s", qVar.getClass().getSimpleName());
            return;
        }
        j.a(trace, (C5253f.a) f10.c());
        trace.stop();
    }

    public void onFragmentResumed(J j10, C1769q qVar) {
        String str;
        super.onFragmentResumed(j10, qVar);
        f57629f.b("FragmentMonitor %s.onFragmentResumed", qVar.getClass().getSimpleName());
        Trace trace = new Trace(a(qVar), this.f57632c, this.f57631b, this.f57633d);
        trace.start();
        if (qVar.getParentFragment() == null) {
            str = "No parent";
        } else {
            str = qVar.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", str);
        if (qVar.getActivity() != null) {
            trace.putAttribute("Hosting_activity", qVar.getActivity().getClass().getSimpleName());
        }
        this.f57630a.put(qVar, trace);
        this.f57634e.d(qVar);
    }
}
