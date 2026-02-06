package Sg;

import Ef.i;
import Ef.m;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

public abstract class n {
    /* access modifiers changed from: private */
    public static final k e(Matcher matcher, int i10, CharSequence charSequence) {
        if (!matcher.find(i10)) {
            return null;
        }
        return new l(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    public static final k f(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new l(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    public static final i g(MatchResult matchResult) {
        return m.u(matchResult.start(), matchResult.end());
    }

    /* access modifiers changed from: private */
    public static final i h(MatchResult matchResult, int i10) {
        return m.u(matchResult.start(i10), matchResult.end(i10));
    }
}
