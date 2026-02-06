package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.format.InputAccessor;
import java.io.InputStream;
import java.util.Collection;

public class DataFormatDetector {
    public static final int DEFAULT_MAX_INPUT_LOOKAHEAD = 64;
    protected final JsonFactory[] _detectors;
    protected final int _maxInputLookahead;
    protected final MatchStrength _minimalMatch;
    protected final MatchStrength _optimalMatch;

    public DataFormatDetector(JsonFactory... jsonFactoryArr) {
        this(jsonFactoryArr, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
    }

    private DataFormatMatcher _findFormat(InputAccessor.Std std) {
        JsonFactory[] jsonFactoryArr = this._detectors;
        int length = jsonFactoryArr.length;
        JsonFactory jsonFactory = null;
        int i10 = 0;
        MatchStrength matchStrength = null;
        while (true) {
            if (i10 >= length) {
                break;
            }
            JsonFactory jsonFactory2 = jsonFactoryArr[i10];
            std.reset();
            MatchStrength hasFormat = jsonFactory2.hasFormat(std);
            if (hasFormat != null && hasFormat.ordinal() >= this._minimalMatch.ordinal() && (jsonFactory == null || matchStrength.ordinal() < hasFormat.ordinal())) {
                if (hasFormat.ordinal() >= this._optimalMatch.ordinal()) {
                    jsonFactory = jsonFactory2;
                    matchStrength = hasFormat;
                    break;
                }
                jsonFactory = jsonFactory2;
                matchStrength = hasFormat;
            }
            i10++;
        }
        return std.createMatcher(jsonFactory, matchStrength);
    }

    public DataFormatMatcher findFormat(InputStream inputStream) {
        return _findFormat(new InputAccessor.Std(inputStream, new byte[this._maxInputLookahead]));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        JsonFactory[] jsonFactoryArr = this._detectors;
        int length = jsonFactoryArr.length;
        if (length > 0) {
            sb2.append(jsonFactoryArr[0].getFormatName());
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(this._detectors[i10].getFormatName());
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    public DataFormatDetector withMaxInputLookahead(int i10) {
        if (i10 == this._maxInputLookahead) {
            return this;
        }
        return new DataFormatDetector(this._detectors, this._optimalMatch, this._minimalMatch, i10);
    }

    public DataFormatDetector withMinimalMatch(MatchStrength matchStrength) {
        if (matchStrength == this._minimalMatch) {
            return this;
        }
        return new DataFormatDetector(this._detectors, this._optimalMatch, matchStrength, this._maxInputLookahead);
    }

    public DataFormatDetector withOptimalMatch(MatchStrength matchStrength) {
        if (matchStrength == this._optimalMatch) {
            return this;
        }
        return new DataFormatDetector(this._detectors, matchStrength, this._minimalMatch, this._maxInputLookahead);
    }

    public DataFormatDetector(Collection<JsonFactory> collection) {
        this((JsonFactory[]) collection.toArray(new JsonFactory[collection.size()]));
    }

    public DataFormatMatcher findFormat(byte[] bArr) {
        return _findFormat(new InputAccessor.Std(bArr));
    }

    private DataFormatDetector(JsonFactory[] jsonFactoryArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i10) {
        this._detectors = jsonFactoryArr;
        this._optimalMatch = matchStrength;
        this._minimalMatch = matchStrength2;
        this._maxInputLookahead = i10;
    }

    public DataFormatMatcher findFormat(byte[] bArr, int i10, int i11) {
        return _findFormat(new InputAccessor.Std(bArr, i10, i11));
    }
}
