package Fe;

import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import org.json.JSONObject;

public class Q {

    /* renamed from: a  reason: collision with root package name */
    private int f30940a;

    /* renamed from: b  reason: collision with root package name */
    private String f30941b;

    /* renamed from: c  reason: collision with root package name */
    private Object f30942c;

    /* renamed from: d  reason: collision with root package name */
    private String f30943d;

    /* renamed from: e  reason: collision with root package name */
    private String f30944e;

    public Q(String str, int i10, String str2, String str3) {
        this.f30941b = str;
        this.f30940a = i10;
        this.f30943d = str2;
        this.f30944e = str3;
    }

    public String a() {
        try {
            JSONObject c10 = c();
            if (c10 == null || !c10.has(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR) || !c10.getJSONObject(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR).has(MetricTracker.Object.MESSAGE)) {
                return "";
            }
            String string = c10.getJSONObject(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR).getString(MetricTracker.Object.MESSAGE);
            if (string == null || string.trim().length() <= 0) {
                return string;
            }
            return string + ".";
        } catch (Exception e10) {
            C3023l.m("Caught Exception ServerResponse getFailReason: " + e10.getMessage());
            return "";
        }
    }

    public String b() {
        return this.f30944e;
    }

    public JSONObject c() {
        Object obj = this.f30942c;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return new JSONObject();
    }

    public int d() {
        return this.f30940a;
    }

    public void e(Object obj) {
        this.f30942c = obj;
    }
}
