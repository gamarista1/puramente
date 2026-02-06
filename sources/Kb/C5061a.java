package kb;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import java.util.Locale;
import mb.C5100a;

/* renamed from: kb.a  reason: case insensitive filesystem */
public class C5061a extends b {
    public C5061a(int i10) {
        super(new Status(i10, String.format(Locale.getDefault(), "Review Error(%d): %s", new Object[]{Integer.valueOf(i10), C5100a.a(i10)})));
    }
}
