package wc;

import Ac.b;
import Bc.m;
import java.util.Map;
import uc.C5233a;

final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    private static final C5233a f62083b = C5233a.e();

    /* renamed from: a  reason: collision with root package name */
    private final m f62084a;

    d(m mVar) {
        this.f62084a = mVar;
    }

    private boolean g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                e.d((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e10) {
                f62083b.j(e10.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean h(m mVar) {
        return i(mVar, 0);
    }

    private boolean i(m mVar, int i10) {
        if (mVar == null) {
            return false;
        }
        if (i10 > 1) {
            f62083b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry entry : mVar.l0().entrySet()) {
            if (!l((String) entry.getKey())) {
                C5233a aVar = f62083b;
                aVar.j("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            } else if (!m((Long) entry.getValue())) {
                C5233a aVar2 = f62083b;
                aVar2.j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (m i11 : mVar.t0()) {
            if (!i(i11, i10 + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(m mVar) {
        if (mVar.k0() > 0) {
            return true;
        }
        for (m k02 : mVar.t0()) {
            if (k02.k0() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean k(m mVar) {
        return mVar.r0().startsWith("_st_");
    }

    private boolean l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f62083b.j("counterId is empty");
            return false;
        } else if (trim.length() <= 100) {
            return true;
        } else {
            f62083b.j("counterId exceeded max length 100");
            return false;
        }
    }

    private boolean m(Long l10) {
        if (l10 != null) {
            return true;
        }
        return false;
    }

    private boolean n(m mVar) {
        Long l10 = (Long) mVar.l0().get(b.FRAMES_TOTAL.toString());
        if (l10 == null || l10.compareTo(0L) <= 0) {
            return false;
        }
        return true;
    }

    private boolean o(m mVar, int i10) {
        if (mVar == null) {
            f62083b.j("TraceMetric is null");
            return false;
        } else if (i10 > 1) {
            f62083b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!q(mVar.r0())) {
            C5233a aVar = f62083b;
            aVar.j("invalid TraceId:" + mVar.r0());
            return false;
        } else if (!p(mVar)) {
            C5233a aVar2 = f62083b;
            aVar2.j("invalid TraceDuration:" + mVar.o0());
            return false;
        } else if (!mVar.u0()) {
            f62083b.j("clientStartTimeUs is null.");
            return false;
        } else if (!k(mVar) || n(mVar)) {
            for (m o10 : mVar.t0()) {
                if (!o(o10, i10 + 1)) {
                    return false;
                }
            }
            if (!g(mVar.m0())) {
                return false;
            }
            return true;
        } else {
            C5233a aVar3 = f62083b;
            aVar3.j("non-positive totalFrames in screen trace " + mVar.r0());
            return false;
        }
    }

    private boolean p(m mVar) {
        if (mVar == null || mVar.o0() <= 0) {
            return false;
        }
        return true;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty() || trim.length() > 100) {
            return false;
        }
        return true;
    }

    public boolean c() {
        if (!o(this.f62084a, 0)) {
            C5233a aVar = f62083b;
            aVar.j("Invalid Trace:" + this.f62084a.r0());
            return false;
        } else if (!j(this.f62084a) || h(this.f62084a)) {
            return true;
        } else {
            C5233a aVar2 = f62083b;
            aVar2.j("Invalid Counters for Trace:" + this.f62084a.r0());
            return false;
        }
    }
}
