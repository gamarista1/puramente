package l8;

import android.util.JsonWriter;
import com.facebook.react.bridge.JsonWriterHelper;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: l8.a  reason: case insensitive filesystem */
public final class C3745a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3745a f46142a = new C3745a();

    private C3745a() {
    }

    public static final String a(ReadableMap readableMap) {
        if (!(readableMap == null || readableMap.getType("extraData") == ReadableType.Null)) {
            try {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                JsonWriterHelper.value(jsonWriter, readableMap.getDynamic("extraData"));
                jsonWriter.close();
                stringWriter.close();
                return stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
