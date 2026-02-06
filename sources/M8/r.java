package m8;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

public interface r {
    void blur(View view);

    void focus(View view);

    void setColor(View view, Integer num);

    void setDropdownIconColor(View view, int i10);

    void setDropdownIconRippleColor(View view, int i10);

    void setEnabled(View view, boolean z10);

    void setItems(View view, ReadableArray readableArray);

    void setNativeSelected(View view, int i10);

    void setNumberOfLines(View view, int i10);

    void setPrompt(View view, String str);

    void setSelected(View view, int i10);
}
