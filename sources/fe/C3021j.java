package Fe;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Fe.j  reason: case insensitive filesystem */
public class C3021j {

    /* renamed from: b  reason: collision with root package name */
    private static C3021j f31099b;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f31100a = null;

    /* renamed from: Fe.j$a */
    public enum a {
        branchKey,
        testKey,
        liveKey,
        useTestInstance,
        enableLogging,
        deferInitForPluginRuntime,
        apiUrl,
        fbAppId,
        cppLevel
    }

    private C3021j(Context context) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("branch.json")));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine);
                    } else {
                        this.f31100a = new JSONObject(sb2.toString());
                        return;
                    }
                }
            } catch (IOException e10) {
                Log.e("BranchJsonConfig", "Error loading branch.json: " + e10.getMessage());
            } catch (JSONException e11) {
                Log.e("BranchJsonConfig", "Error parsing branch.json: " + e11.getMessage());
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static C3021j g(Context context) {
        if (f31099b == null) {
            f31099b = new C3021j(context);
        }
        return f31099b;
    }

    private String h() {
        a aVar = a.liveKey;
        if (!l(aVar)) {
            return null;
        }
        try {
            return this.f31100a.getString(aVar.toString());
        } catch (JSONException e10) {
            Log.e("BranchJsonConfig", "Error parsing branch.json: " + e10.getMessage());
            return null;
        }
    }

    private String i() {
        JSONObject jSONObject = this.f31100a;
        if (jSONObject == null) {
            return null;
        }
        try {
            a aVar = a.testKey;
            if (!jSONObject.has(aVar.toString())) {
                return null;
            }
            return this.f31100a.getString(aVar.toString());
        } catch (JSONException e10) {
            Log.e("BranchJsonConfig", "Error parsing branch.json: " + e10.getMessage());
            return null;
        }
    }

    public String a() {
        JSONObject jSONObject = this.f31100a;
        if (jSONObject == null) {
            return null;
        }
        try {
            a aVar = a.apiUrl;
            if (!jSONObject.has(aVar.toString())) {
                return null;
            }
            return this.f31100a.getString(aVar.toString());
        } catch (JSONException e10) {
            Log.e("BranchJsonConfig", "Error parsing branch.json: " + e10.getMessage());
            return null;
        }
    }

    public String b() {
        a aVar = a.branchKey;
        if (!l(aVar) && (!l(a.liveKey) || !l(a.testKey) || !l(a.useTestInstance))) {
            return null;
        }
        try {
            if (l(aVar)) {
                return this.f31100a.getString(aVar.toString());
            }
            if (j().booleanValue()) {
                return i();
            }
            return h();
        } catch (JSONException e10) {
            Log.e("BranchJsonConfig", "Error parsing branch.json: " + e10.getMessage());
            return null;
        }
    }

    public String c() {
        JSONObject jSONObject = this.f31100a;
        if (jSONObject == null) {
            return null;
        }
        try {
            a aVar = a.cppLevel;
            if (!jSONObject.has(aVar.toString())) {
                return null;
            }
            return this.f31100a.getString(aVar.toString());
        } catch (JSONException e10) {
            Log.e("BranchJsonConfig", "Error parsing branch.json: " + e10.getMessage());
            return null;
        }
    }

    public Boolean d() {
        a aVar = a.deferInitForPluginRuntime;
        if (!l(aVar)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.f31100a.getBoolean(aVar.toString()));
        } catch (JSONException e10) {
            Log.e("BranchJsonConfig", "Error parsing branch.json: " + e10.getMessage());
            return Boolean.FALSE;
        }
    }

    public Boolean e() {
        a aVar = a.enableLogging;
        if (!l(aVar)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.f31100a.getBoolean(aVar.toString()));
        } catch (JSONException e10) {
            Log.e("BranchJsonConfig", "Error parsing branch.json: " + e10.getMessage());
            return Boolean.FALSE;
        }
    }

    public String f() {
        JSONObject jSONObject = this.f31100a;
        if (jSONObject == null) {
            return null;
        }
        try {
            a aVar = a.fbAppId;
            if (!jSONObject.has(aVar.toString())) {
                return null;
            }
            return this.f31100a.getString(aVar.toString());
        } catch (JSONException e10) {
            Log.e("BranchJsonConfig", "Error parsing branch.json: " + e10.getMessage());
            return null;
        }
    }

    public Boolean j() {
        a aVar = a.useTestInstance;
        if (!l(aVar)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.f31100a.getBoolean(aVar.toString()));
        } catch (JSONException e10) {
            Log.e("BranchJsonConfig", "Error parsing branch.json: " + e10.getMessage());
            return Boolean.FALSE;
        }
    }

    public boolean k() {
        if (this.f31100a != null) {
            return true;
        }
        return false;
    }

    public boolean l(a aVar) {
        JSONObject jSONObject = this.f31100a;
        if (jSONObject == null || !jSONObject.has(aVar.toString())) {
            return false;
        }
        return true;
    }
}
