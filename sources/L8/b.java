package l8;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.revenuecat.purchases.common.Constants;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C6496s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f46143a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f46144b = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    private b() {
    }

    public static final String a(String str, ReadableArray readableArray) {
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(readableArray, "stack");
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(", stack:\n");
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = readableArray.getMap(i10);
            if (map != null) {
                sb2.append(map.getString("methodName"));
                sb2.append("@");
                sb2.append(f46143a.b(map));
                if (!map.hasKey("lineNumber") || map.isNull("lineNumber") || map.getType("lineNumber") != ReadableType.Number) {
                    sb2.append(-1);
                } else {
                    sb2.append(map.getInt("lineNumber"));
                }
                if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                    sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                    sb2.append(map.getInt("column"));
                }
                sb2.append("\n");
            }
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    private final String b(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String || (string = readableMap.getString("file")) == null) {
            return "";
        }
        Matcher matcher = f46144b.matcher(string);
        if (!matcher.find()) {
            return "";
        }
        String group = matcher.group(1);
        return group + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
    }
}
