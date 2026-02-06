package com.google.firebase.functions;

import android.util.SparseArray;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import org.json.JSONException;
import org.json.JSONObject;
import ub.m;

public class o extends m {

    /* renamed from: a  reason: collision with root package name */
    private final a f57233a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f57234b;

    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        

        /* renamed from: s  reason: collision with root package name */
        private static final SparseArray f57252s = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f57254a;

        static {
            f57252s = b();
        }

        private a(int i10) {
            this.f57254a = i10;
        }

        private static SparseArray b() {
            SparseArray sparseArray = new SparseArray();
            a[] values = values();
            int length = values.length;
            int i10 = 0;
            while (i10 < length) {
                a aVar = values[i10];
                a aVar2 = (a) sparseArray.get(aVar.ordinal());
                if (aVar2 == null) {
                    sparseArray.put(aVar.ordinal(), aVar);
                    i10++;
                } else {
                    throw new IllegalStateException("Code value duplication between " + aVar2 + "&" + aVar.name());
                }
            }
            return sparseArray;
        }

        static a c(int i10) {
            if (i10 == 200) {
                return OK;
            }
            if (i10 == 409) {
                return ABORTED;
            }
            if (i10 == 429) {
                return RESOURCE_EXHAUSTED;
            }
            if (i10 == 400) {
                return INVALID_ARGUMENT;
            }
            if (i10 == 401) {
                return UNAUTHENTICATED;
            }
            if (i10 == 403) {
                return PERMISSION_DENIED;
            }
            if (i10 == 404) {
                return NOT_FOUND;
            }
            if (i10 == 503) {
                return UNAVAILABLE;
            }
            if (i10 == 504) {
                return DEADLINE_EXCEEDED;
            }
            switch (i10) {
                case 499:
                    return CANCELLED;
                case 500:
                    return INTERNAL;
                case 501:
                    return UNIMPLEMENTED;
                default:
                    return UNKNOWN;
            }
        }
    }

    o(String str, a aVar, Object obj) {
        super(str);
        this.f57233a = aVar;
        this.f57234b = obj;
    }

    static o a(a aVar, String str, z zVar) {
        Object obj;
        String name = aVar.name();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            if (jSONObject.opt("status") instanceof String) {
                aVar = a.valueOf(jSONObject.getString("status"));
                name = aVar.name();
            }
            if ((jSONObject.opt(MetricTracker.Object.MESSAGE) instanceof String) && !jSONObject.getString(MetricTracker.Object.MESSAGE).isEmpty()) {
                name = jSONObject.getString(MetricTracker.Object.MESSAGE);
            }
            obj = jSONObject.opt("details");
            if (obj != null) {
                try {
                    obj = zVar.a(obj);
                } catch (IllegalArgumentException unused) {
                    aVar = a.INTERNAL;
                    name = aVar.name();
                } catch (JSONException unused2) {
                }
            }
        } catch (IllegalArgumentException unused3) {
            obj = null;
            aVar = a.INTERNAL;
            name = aVar.name();
        } catch (JSONException unused4) {
            obj = null;
        }
        if (aVar == a.OK) {
            return null;
        }
        return new o(name, aVar, obj);
    }

    public a b() {
        return this.f57233a;
    }

    public Object c() {
        return this.f57234b;
    }

    o(String str, a aVar, Object obj, Throwable th2) {
        super(str, th2);
        this.f57233a = aVar;
        this.f57234b = obj;
    }
}
