package inc.numisoft.test.app;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Kukolka on 28.12.13.
 */
public class RobotoView extends TextView {

    public RobotoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public RobotoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RobotoView(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/roboto.ttf");
            setTypeface(tf);
        }
    }
}