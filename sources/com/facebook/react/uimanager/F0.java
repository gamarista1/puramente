package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.jvm.internal.C6496s;

public final class F0 {

    /* renamed from: a  reason: collision with root package name */
    public static final F0 f41410a = new F0();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f41411b = {8, 4, 5, 1, 3, 0, 2};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f41412c = {8, 7, 6, 4, 5, 1, 3, 0, 2};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f41413d = {4, 5, 1, 3};

    /* renamed from: e  reason: collision with root package name */
    private static final HashSet f41414e = new HashSet(Arrays.asList(new String[]{"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "rowGap", "columnGap", "gap", "flexShrink", "flexWrap", "justifyContent", "alignContent", "display", "position", BlockAlignment.RIGHT, VerticalAlignment.TOP, VerticalAlignment.BOTTOM, BlockAlignment.LEFT, OpsMetricTracker.START, "end", Snapshot.WIDTH, Snapshot.HEIGHT, "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"}));

    private F0() {
    }

    public static final boolean a(ReadableMap readableMap, String str) {
        ReadableType type;
        C6496s.h(readableMap, "map");
        C6496s.h(str, "prop");
        if (f41414e.contains(str)) {
            return true;
        }
        if (C6496s.c("pointerEvents", str)) {
            String string = readableMap.getString(str);
            if (C6496s.c("auto", string) || C6496s.c("box-none", string)) {
                return true;
            }
            return false;
        }
        switch (str.hashCode()) {
            case -1989576717:
                if (str.equals("borderRightColor") && readableMap.getType("borderRightColor") == ReadableType.Number && readableMap.getInt("borderRightColor") == 0) {
                    return true;
                }
            case -1971292586:
                if (str.equals("borderRightWidth") && (readableMap.isNull("borderRightWidth") || readableMap.getDouble("borderRightWidth") == 0.0d)) {
                    return true;
                }
            case -1470826662:
                if (str.equals("borderTopColor") && readableMap.getType("borderTopColor") == ReadableType.Number && readableMap.getInt("borderTopColor") == 0) {
                    return true;
                }
            case -1452542531:
                if (str.equals("borderTopWidth") && (readableMap.isNull("borderTopWidth") || readableMap.getDouble("borderTopWidth") == 0.0d)) {
                    return true;
                }
            case -1308858324:
                if (str.equals("borderBottomColor") && readableMap.getType("borderBottomColor") == ReadableType.Number && readableMap.getInt("borderBottomColor") == 0) {
                    return true;
                }
            case -1290574193:
                if (str.equals("borderBottomWidth") && (readableMap.isNull("borderBottomWidth") || readableMap.getDouble("borderBottomWidth") == 0.0d)) {
                    return true;
                }
            case -1267206133:
                if (str.equals("opacity") && (readableMap.isNull("opacity") || readableMap.getDouble("opacity") == 1.0d)) {
                    return true;
                }
            case -242276144:
                if (str.equals("borderLeftColor") && readableMap.getType("borderLeftColor") == ReadableType.Number && readableMap.getInt("borderLeftColor") == 0) {
                    return true;
                }
            case -223992013:
                if (str.equals("borderLeftWidth") && (readableMap.isNull("borderLeftWidth") || readableMap.getDouble("borderLeftWidth") == 0.0d)) {
                    return true;
                }
            case 306963138:
                if (str.equals("borderBlockStartColor") && readableMap.getType("borderBlockStartColor") == ReadableType.Number && readableMap.getInt("borderBlockStartColor") == 0) {
                    return true;
                }
            case 529642498:
                if (str.equals("overflow") && (readableMap.isNull("overflow") || C6496s.c("visible", readableMap.getString("overflow")))) {
                    return true;
                }
            case 684610594:
                if (str.equals("borderBlockColor") && readableMap.getType("borderBlockColor") == ReadableType.Number && readableMap.getInt("borderBlockColor") == 0) {
                    return true;
                }
            case 741115130:
                if (str.equals("borderWidth") && (readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d)) {
                    return true;
                }
            case 762983977:
                if (str.equals("borderBlockEndColor") && readableMap.getType("borderBlockEndColor") == ReadableType.Number && readableMap.getInt("borderBlockEndColor") == 0) {
                    return true;
                }
            case 1349188574:
                if (str.equals(Snapshot.BORDER_RADIUS)) {
                    if (readableMap.hasKey("backgroundColor") && (((type = readableMap.getType("backgroundColor")) == ReadableType.Number && readableMap.getInt("backgroundColor") != 0) || type != ReadableType.Null)) {
                        return false;
                    }
                    if (!readableMap.hasKey("borderWidth") || readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d) {
                        return true;
                    }
                    return false;
                }
                break;
        }
        return false;
    }
}
