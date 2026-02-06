package expo.modules.av;

import Id.d;
import Pd.c;
import android.content.Context;
import expo.modules.core.BasePackage;
import java.util.Arrays;
import java.util.List;

public class AVPackage extends BasePackage {
    public List f(Context context) {
        return Arrays.asList(new c[]{new AVManager(context), new d()});
    }
}
