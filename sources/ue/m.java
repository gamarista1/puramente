package Ue;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class m {
    public static void a(Object obj, WritableArray writableArray) {
        if (obj == null || obj == JSONObject.NULL) {
            writableArray.pushNull();
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.lang.Integer")) {
            writableArray.pushInt(((Integer) obj).intValue());
        } else if (name.equals("java.lang.Float")) {
            writableArray.pushDouble((double) ((Float) obj).floatValue());
        } else if (name.equals("org.json.JSONArray$1")) {
            try {
                writableArray.pushArray(e((JSONArray) obj));
            } catch (JSONException unused) {
                writableArray.pushNull();
            }
        } else if (name.equals("java.lang.Boolean")) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
        } else if (name.equals("java.lang.Long")) {
            writableArray.pushDouble((double) ((Long) obj).longValue());
        } else if (name.equals("java.lang.Double")) {
            writableArray.pushDouble(((Double) obj).doubleValue());
        } else if (name.equals("java.lang.String")) {
            writableArray.pushString((String) obj);
        } else if (!name.equals("org.json.JSONObject$1")) {
            if (List.class.isAssignableFrom(obj.getClass())) {
                writableArray.pushArray(g((List) obj));
                return;
            }
            if (Map.class.isAssignableFrom(obj.getClass())) {
                writableArray.pushMap(i((Map) obj));
                return;
            }
            Log.d("Utils", "utils:arrayPushValue:unknownType:" + name);
            writableArray.pushNull();
        } else {
            try {
                writableArray.pushMap(f((JSONObject) obj));
            } catch (JSONException unused2) {
                writableArray.pushNull();
            }
        }
    }

    public static WritableMap b(Exception exc) {
        WritableMap createMap = Arguments.createMap();
        String message = exc.getMessage();
        createMap.putString("code", "unknown");
        createMap.putString("nativeErrorCode", "unknown");
        createMap.putString(MetricTracker.Object.MESSAGE, message);
        createMap.putString("nativeErrorMessage", message);
        return createMap;
    }

    public static Uri c(String str) {
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null || parse.getScheme().isEmpty()) {
            return Uri.fromFile(new File(str));
        }
        return parse;
    }

    public static boolean d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        i g10 = i.g();
        if (g10.a("android_background_activity_names")) {
            ArrayList c10 = g10.c("android_background_activity_names");
            if (c10.size() != 0) {
                List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
                if (appTasks.size() > 0) {
                    str = appTasks.get(0).getTaskInfo().baseActivity.getShortClassName();
                } else {
                    str = "";
                }
                if (!"".equals(str) && c10.contains(str)) {
                    return false;
                }
            }
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && next.processName.equals(packageName)) {
                try {
                    if (((ReactContext) context).getLifecycleState() == LifecycleState.RESUMED) {
                        return true;
                    }
                    return false;
                } catch (ClassCastException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public static WritableArray e(JSONArray jSONArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createArray.pushDouble(jSONArray.getDouble(i10));
            } else if (obj instanceof Number) {
                createArray.pushInt(jSONArray.getInt(i10));
            } else if (obj instanceof String) {
                createArray.pushString(jSONArray.getString(i10));
            } else if (obj instanceof JSONObject) {
                createArray.pushMap(f(jSONArray.getJSONObject(i10)));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(e(jSONArray.getJSONArray(i10)));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    public static WritableMap f(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        WritableMap createMap = Arguments.createMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createMap.putDouble(next, jSONObject.getDouble(next));
            } else if (obj instanceof Number) {
                createMap.putInt(next, jSONObject.getInt(next));
            } else if (obj instanceof String) {
                createMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                createMap.putMap(next, f(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, e(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(next);
            }
        }
        return createMap;
    }

    private static WritableArray g(List list) {
        WritableArray createArray = Arguments.createArray();
        for (Object a10 : list) {
            a(a10, createArray);
        }
        return createArray;
    }

    public static void h(String str, Object obj, WritableMap writableMap) {
        if (obj == null || obj == JSONObject.NULL) {
            writableMap.putNull(str);
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.lang.Integer")) {
            writableMap.putInt(str, ((Integer) obj).intValue());
        } else if (name.equals("java.lang.Float")) {
            writableMap.putDouble(str, (double) ((Float) obj).floatValue());
        } else if (name.equals("org.json.JSONArray$1")) {
            try {
                writableMap.putArray(str, e((JSONArray) obj));
            } catch (JSONException unused) {
                writableMap.putNull(str);
            }
        } else if (name.equals("java.lang.Boolean")) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (name.equals("java.lang.Long")) {
            writableMap.putDouble(str, (double) ((Long) obj).longValue());
        } else if (name.equals("java.lang.Double")) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
        } else if (name.equals("java.lang.String")) {
            writableMap.putString(str, (String) obj);
        } else if (!name.equals("org.json.JSONObject$1")) {
            if (List.class.isAssignableFrom(obj.getClass())) {
                writableMap.putArray(str, g((List) obj));
                return;
            }
            if (Map.class.isAssignableFrom(obj.getClass())) {
                writableMap.putMap(str, i((Map) obj));
                return;
            }
            Log.d("Utils", "utils:mapPutValue:unknownType:" + name);
            writableMap.putNull(str);
        } else {
            try {
                writableMap.putMap(str, f((JSONObject) obj));
            } catch (JSONException unused2) {
                writableMap.putNull(str);
            }
        }
    }

    public static WritableMap i(Map map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry entry : map.entrySet()) {
            h((String) entry.getKey(), entry.getValue(), createMap);
        }
        return createMap;
    }

    public static String j(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j10 * 1000));
    }
}
